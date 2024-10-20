package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhl {
    private static final arhl c = new arhl();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(arhk arhkVar) {
        return c.b(arhkVar);
    }

    public static void d(arhk arhkVar, Object obj) {
        c.e(arhkVar, obj);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    final synchronized Object b(arhk arhkVar) {
        arhj arhjVar;
        arhjVar = (arhj) this.a.get(arhkVar);
        if (arhjVar == null) {
            arhjVar = new arhj(arhkVar.a());
            this.a.put(arhkVar, arhjVar);
        }
        ?? r3 = arhjVar.c;
        if (r3 != 0) {
            r3.cancel(false);
            arhjVar.c = null;
        }
        arhjVar.b++;
        return arhjVar.a;
    }

    final synchronized void e(arhk arhkVar, Object obj) {
        boolean z;
        boolean z2;
        arhj arhjVar = (arhj) this.a.get(arhkVar);
        if (arhjVar != null) {
            boolean z3 = true;
            if (obj == arhjVar.a) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "Releasing the wrong instance");
            if (arhjVar.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            albo.U(z2, "Refcount has already reached zero");
            int i = arhjVar.b - 1;
            arhjVar.b = i;
            if (i == 0) {
                if (arhjVar.c != null) {
                    z3 = false;
                }
                albo.U(z3, "Destroy task already scheduled");
                if (this.b == null) {
                    this.b = Executors.newSingleThreadScheduledExecutor(arcb.k("grpc-shared-destroyer-%d"));
                }
                arhjVar.c = this.b.schedule(new arcv(new uju(this, arhjVar, arhkVar, obj, 15)), 1L, TimeUnit.SECONDS);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(arhkVar))));
    }
}
