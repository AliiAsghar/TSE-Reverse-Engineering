package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class emw {
    static final emw a = new emw();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, emv emvVar, enf enfVar, Class cls) {
        enf enfVar2 = (enf) map.get(emvVar);
        if (enfVar2 != null && enfVar != enfVar2) {
            throw new IllegalArgumentException("Method " + emvVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enfVar2 + ", new value " + enfVar);
        }
        if (enfVar2 == null) {
            map.put(emvVar, enfVar);
        }
    }

    public final emu a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(hashMap, (emv) entry.getKey(), (enf) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length > 0) {
                    if (enm.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                enf a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (enf.class.isAssignableFrom(parameterTypes[1])) {
                        if (a2 == enf.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (length <= 2) {
                    d(hashMap, new emv(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        emu emuVar = new emu(hashMap);
        this.c.put(cls, emuVar);
        this.b.put(cls, Boolean.valueOf(z));
        return emuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final emu b(Class cls) {
        emu emuVar = (emu) this.c.get(cls);
        if (emuVar != null) {
            return emuVar;
        }
        return a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
