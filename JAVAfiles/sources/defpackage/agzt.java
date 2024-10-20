package defpackage;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agzt {
    private static final alvi b = alvi.m("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager");
    private static final Map c = new ConcurrentHashMap();
    public static final Map a = new ConcurrentHashMap();

    static {
        ahbn.b();
    }

    private agzt() {
    }

    public static void a(agzr agzrVar) {
        if (ahaw.a) {
            agrk agrkVar = (agrk) a.get(agzrVar.getClass());
            if (agrkVar == null || agrkVar.b != agzrVar) {
                throw new IllegalArgumentException(String.valueOf(String.valueOf(agzrVar)).concat(" is not a valid component tag"));
            }
        }
    }

    public static void b(String str, boolean z) {
        if (ahaw.a && z) {
            throw new IllegalStateException(str);
        }
        ((alvg) ((alvg) b.i()).h("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager", "logErrorMessage", 573, "ComponentsReadinessManager.java")).t("%s", str);
    }

    public static void c(String str, agzr agzrVar) {
        synchronized (agzt.class) {
            Class<?> cls = agzrVar.getClass();
            Map map = c;
            agrk agrkVar = (agrk) map.get(str);
            Map map2 = a;
            agrk agrkVar2 = (agrk) map2.get(cls);
            if (agrkVar == null && agrkVar2 == null) {
                agrk agrkVar3 = new agrk(str, agzrVar);
                map.put(str, agrkVar3);
                map2.put(cls, agrkVar3);
            } else if (agrkVar != agrkVar2 || (agrkVar2 != null && agrkVar2.b != agzrVar)) {
                throw new IllegalArgumentException(hht.h(str, " component is already registered with a different value."));
            }
        }
    }

    public static void d(final agzr agzrVar) {
        a(agzrVar);
        final agzy a2 = agzy.a();
        final Class<?> cls = agzrVar.getClass();
        ahbe b2 = agzy.b(agzy.c(cls));
        try {
            synchronized (cls) {
                if (agzrVar instanceof agzv) {
                    if (!Objects.equals(a2.d.put(cls, agzrVar), agzrVar)) {
                        a2.e(cls, agzrVar, new agyl() { // from class: agzx
                            @Override // defpackage.agyl
                            public final void a(Object obj) {
                                Class cls2 = (Class) obj;
                                if (cls2 != cls) {
                                    agzy.this.d.put(cls2, agzrVar);
                                }
                            }
                        });
                    }
                } else {
                    Class<?> cls2 = cls;
                    do {
                        synchronized (cls2) {
                            WeakHashMap weakHashMap = (WeakHashMap) a2.c.get(cls2);
                            if (weakHashMap != null && !weakHashMap.isEmpty()) {
                                agzy.d(weakHashMap, cls, agzrVar);
                            }
                        }
                        cls2 = cls2.getSuperclass();
                        if (cls2 == null) {
                            break;
                        }
                    } while (agzu.class.isAssignableFrom(cls2));
                }
            }
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
