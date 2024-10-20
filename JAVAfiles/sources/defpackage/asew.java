package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asew {
    private static final int a = c(Throwable.class, -1);
    private static final aser b;

    static {
        aser aserVar;
        try {
            if (asex.a) {
                aserVar = asfu.a;
            } else {
                aserVar = asem.a;
            }
        } catch (Throwable unused) {
            aserVar = asfu.a;
        }
        b = aserVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object O;
        if (th instanceof arvz) {
            try {
                O = ((arvz) th).a();
            } catch (Throwable th2) {
                O = aqil.O(th2);
            }
            if (true == (O instanceof armp)) {
                O = null;
            }
            return (Throwable) O;
        }
        return (Throwable) b.a(th.getClass()).a(th);
    }

    public static final arqr b(Class cls) {
        Object obj;
        arqr arqrVar;
        int i;
        armo armoVar;
        arua aruaVar = arua.g;
        if (a == c(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            ArrayList arrayList = new ArrayList(length);
            int i2 = 0;
            while (true) {
                obj = null;
                if (i2 >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i2];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        if (length2 != 2) {
                            armoVar = new armo(null, -1);
                        } else if (d.F(parameterTypes[0], String.class) && d.F(parameterTypes[1], Throwable.class)) {
                            armoVar = new armo(new arnd(new arnd(constructor, 9), 13), 3);
                        } else {
                            armoVar = new armo(null, -1);
                        }
                    } else {
                        Class<?> cls2 = parameterTypes[0];
                        if (d.F(cls2, String.class)) {
                            armoVar = new armo(new arnd(new arnd(constructor, 10), 13), 2);
                        } else if (d.F(cls2, Throwable.class)) {
                            armoVar = new armo(new arnd(new arnd(constructor, 11), 13), 1);
                        } else {
                            armoVar = new armo(null, -1);
                        }
                    }
                } else {
                    armoVar = new armo(new arnd(new arnd(constructor, 12), 13), 0);
                }
                arrayList.add(armoVar);
                i2++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((armo) obj).b).intValue();
                    while (true) {
                        Object next = it.next();
                        int intValue2 = ((Number) ((armo) next).b).intValue();
                        if (intValue < intValue2) {
                            i = intValue2;
                        } else {
                            i = intValue;
                        }
                        if (intValue < intValue2) {
                            obj = next;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        intValue = i;
                    }
                }
            }
            armo armoVar2 = (armo) obj;
            if (armoVar2 != null && (arqrVar = (arqr) armoVar2.a) != null) {
                return arqrVar;
            }
        }
        return aruaVar;
    }

    private static final int c(Class cls, int i) {
        Object O;
        armd.f(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                O = aqil.O(th);
            }
        } while (cls != null);
        O = Integer.valueOf(i2);
        Object valueOf = Integer.valueOf(i);
        if (true == (O instanceof armp)) {
            O = valueOf;
        }
        return ((Number) O).intValue();
    }
}
