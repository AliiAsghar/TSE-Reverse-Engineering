package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqro {
    public final aram a;
    public final aqux b;
    public final aqut c;
    public final aqrr d;
    public final aqsm e;
    public final aqrx[] f;
    public final Object g;
    public araj h;
    public boolean i;
    public arbi j;
    private final asqc k;

    public aqro() {
        throw null;
    }

    public final void a(Status status) {
        d.t(!status.f(), "Cannot fail with OK status");
        albo.U(!this.i, "apply() or fail() already called");
        b(new arbq(arcb.b(status), this.f));
    }

    public final void b(araj arajVar) {
        boolean z;
        boolean z2 = true;
        albo.U(!this.i, "already finalized");
        this.i = true;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = arajVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.k.b();
            return;
        }
        if (this.j == null) {
            z2 = false;
        }
        albo.U(z2, "delayedStream is null");
        Runnable q = this.j.q(arajVar);
        if (q != null) {
            q.run();
        }
        this.k.b();
    }

    public aqro(aram aramVar, aqux aquxVar, aqut aqutVar, aqrr aqrrVar, asqc asqcVar, aqrx[] aqrxVarArr) {
        this.g = new Object();
        this.a = aramVar;
        this.b = aquxVar;
        this.c = aqutVar;
        this.d = aqrrVar;
        this.e = aqsm.k();
        this.k = asqcVar;
        this.f = aqrxVarArr;
    }
}
