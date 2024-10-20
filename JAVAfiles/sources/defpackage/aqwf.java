package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqwf extends aqsl {
    private static final Logger b = Logger.getLogger(aqwf.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.aqsl
    public final aqsm a() {
        aqsm aqsmVar = (aqsm) a.get();
        if (aqsmVar == null) {
            return aqsm.d;
        }
        return aqsmVar;
    }

    @Override // defpackage.aqsl
    public final aqsm b(aqsm aqsmVar) {
        aqsm a2 = a();
        a.set(aqsmVar);
        return a2;
    }

    @Override // defpackage.aqsl
    public final void c(aqsm aqsmVar, aqsm aqsmVar2) {
        if (a() != aqsmVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (aqsmVar2 != aqsm.d) {
            a.set(aqsmVar2);
        } else {
            a.set(null);
        }
    }
}
