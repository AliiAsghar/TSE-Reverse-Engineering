package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agzy implements aguc {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter");
    public static final agzv b = new agzv() { // from class: agzy.1
        @Override // defpackage.agzu
        public final /* synthetic */ void a() {
        }
    };
    private static volatile agzy e;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public agzy() {
        agub.a.a(this);
    }

    public static agzy a() {
        agzy agzyVar = e;
        if (agzyVar == null) {
            synchronized (agzy.class) {
                agzyVar = e;
                if (agzyVar == null) {
                    agzyVar = new agzy();
                    e = agzyVar;
                }
            }
        }
        return agzyVar;
    }

    public static ahbe b(String str) {
        return new ahbe(ahji.aM(str));
    }

    public static String c(Class cls) {
        return ahji.aM(ahji.aL(cls));
    }

    public static void d(WeakHashMap weakHashMap, Class cls, agzu agzuVar) {
        int size = weakHashMap.size();
        agzz[] agzzVarArr = new agzz[size];
        agrk[] agrkVarArr = new agrk[size];
        int i = 0;
        for (Map.Entry entry : weakHashMap.entrySet()) {
            agzzVarArr[i] = (agzz) entry.getKey();
            agrkVarArr[i] = (agrk) entry.getValue();
            i++;
        }
        for (int i2 = 0; i2 < i; i2++) {
            agrk agrkVar = agrkVarArr[i2];
            ((ahab) agrkVar.b).a((String) agrkVar.a, cls, agzuVar, agzzVarArr[i2]);
        }
        for (int i3 = 0; i3 < i; i3++) {
            ((ahab) agrkVarArr[i3].b).b();
        }
    }

    public final void e(Class cls, agzu agzuVar, agyl agylVar) {
        Class cls2 = cls;
        do {
            synchronized (cls2) {
                agylVar.a(cls2);
                WeakHashMap weakHashMap = (WeakHashMap) this.c.get(cls2);
                if (weakHashMap != null && !weakHashMap.isEmpty()) {
                    d(weakHashMap, cls, agzuVar);
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                return;
            }
        } while (agzv.class.isAssignableFrom(cls2));
    }

    public final void f(agzz agzzVar, Class cls, Executor executor) {
        agzv agzvVar;
        agrk agrkVar = new agrk(agzzVar, cls, executor);
        synchronized (cls) {
            synchronized (cls) {
                WeakHashMap weakHashMap = (WeakHashMap) this.c.get(cls);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    this.c.put(cls, weakHashMap);
                } else if (weakHashMap.get(agzzVar) != null) {
                    ((alvg) ((alvg) a.h()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter", "registerListenerInternal", 379, "NotificationCenter.java")).D("Listener %s is already registered for notification %s", agzzVar, cls);
                    agrkVar = null;
                }
                weakHashMap.put(agzzVar, agrkVar);
                WeakHashMap weakHashMap2 = (WeakHashMap) this.f.get(cls);
                if (weakHashMap2 != null) {
                    aluq listIterator = alor.j(weakHashMap2).entrySet().listIterator();
                    while (listIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        ((Executor) entry.getValue()).execute(new agqd(entry, 10));
                    }
                }
            }
        }
        if (agrkVar != null && (agzvVar = (agzv) this.d.get(cls)) != null) {
            Object obj = agrkVar.b;
            ((ahab) obj).a((String) agrkVar.a, cls, agzvVar, agzzVar);
            ((ahab) obj).b();
        }
    }
}
