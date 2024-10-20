package defpackage;

import j$.util.Collection;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agzs implements agzz {
    public final Runnable a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final Class c;

    public agzs(Runnable runnable, Class cls) {
        this.a = runnable;
        this.c = cls;
    }

    public final synchronized void a(Executor executor) {
        this.b.set(false);
        agzy.a().f(this, this.c, agtj.b(executor));
    }

    @Override // defpackage.agzz
    public final void b(Class cls) {
        if (!this.b.getAndSet(false)) {
            agzt.b(String.valueOf(String.valueOf(cls)).concat(" component was already not ready"), false);
        }
    }

    @Override // defpackage.agzz
    public final /* bridge */ /* synthetic */ void c(agzu agzuVar) {
        agzr agzrVar = (agzr) agzuVar;
        if (this.b.getAndSet(true)) {
            agzt.b(String.valueOf(String.valueOf(agzrVar.getClass())).concat(" component was already ready"), true);
        }
        d();
        this.a.run();
    }

    public final synchronized void d() {
        boolean z;
        Class cls = this.c;
        agzy a = agzy.a();
        synchronized (cls) {
            WeakHashMap weakHashMap = (WeakHashMap) a.c.get(cls);
            z = false;
            if (weakHashMap != null) {
                agrk agrkVar = (agrk) weakHashMap.remove(this);
                if (agrkVar != null) {
                    Object obj = agrkVar.b;
                    synchronized (((ahab) obj).d) {
                        if (((ahab) obj).c) {
                            Collection.EL.removeIf(((ahab) obj).d, new rhq(cls, this, 13, null));
                        } else {
                            ((ahab) obj).d.clear();
                        }
                    }
                    z = true;
                }
                if (weakHashMap.isEmpty()) {
                    a.c.remove(cls);
                }
            }
        }
        if (!z) {
            ((alvg) ((alvg) agzy.a.i()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter", "unregisterListener", 469, "NotificationCenter.java")).D("Listener %s was not registered for notification %s", this, cls);
        }
    }
}
