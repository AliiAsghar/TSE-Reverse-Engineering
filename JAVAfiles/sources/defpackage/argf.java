package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argf extends apzj {
    final /* synthetic */ argg d;
    private final apzj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public argf(argg arggVar, apzj apzjVar) {
        super(null);
        this.d = arggVar;
        this.e = apzjVar;
    }

    @Override // defpackage.apzj
    public final Status k(aqvb aqvbVar) {
        Status k = this.e.k(aqvbVar);
        if (k.f()) {
            this.d.b.a();
        } else {
            argg arggVar = this.d;
            arer arerVar = new arer(arggVar, 11);
            aqzt aqztVar = (aqzt) arggVar.b;
            aqztVar.c.c();
            if (aqztVar.d == null) {
                aqztVar.d = new arbp();
            }
            asmb asmbVar = aqztVar.e;
            if (asmbVar == null || !asmbVar.n()) {
                long a = aqztVar.d.a();
                aqztVar.e = aqztVar.c.d(arerVar, a, TimeUnit.NANOSECONDS, aqztVar.b);
                aqzt.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a));
            }
        }
        return k;
    }
}
