package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzu extends arbu {
    public final arau a;
    public final String b;
    final /* synthetic */ aqzv d;
    private volatile Status e;
    private Status f;
    public final AtomicInteger c = new AtomicInteger(-2147483647);
    private final asqc g = new asqc(this, null);

    public aqzu(aqzv aqzvVar, arau arauVar, String str) {
        this.d = aqzvVar;
        this.a = arauVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.arbu
    protected final arau a() {
        return this.a;
    }

    @Override // defpackage.arbu, defpackage.aram
    public final araj b(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqrx[] aqrxVarArr) {
        araj arajVar;
        Executor executor;
        appn appnVar = aqrrVar.h;
        if (appnVar == null) {
            appnVar = null;
        }
        if (appnVar != null) {
            aqro aqroVar = new aqro(this.a, aquxVar, aqutVar, aqrrVar, this.g, aqrxVarArr);
            if (this.c.incrementAndGet() <= 0) {
                try {
                    if (!((aqwm) appnVar).f || (executor = aqrrVar.c) == null) {
                        executor = this.d.a;
                    }
                    aqvp aqvpVar = (aqvp) albo.ak((aqvp) this.a.r().a(arbx.a), aqvp.NONE);
                    if (((aqwm) appnVar).b && aqvpVar != aqvp.PRIVACY_AND_INTEGRITY) {
                        aqroVar.a(Status.i.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(aqvpVar.toString())));
                    } else {
                        try {
                            aqwm.l((String) albo.ak(null, this.b), aquxVar);
                            ((aqwm) appnVar).c.b(executor, new atpk((aqwm) appnVar, aqroVar));
                        } catch (StatusException e) {
                            aqroVar.a(e.a);
                        }
                    }
                } catch (Throwable th) {
                    aqroVar.a(Status.i.withDescription("Credentials should use fail() instead of throwing exceptions").d(th));
                }
                synchronized (aqroVar.g) {
                    arajVar = aqroVar.h;
                    if (arajVar == null) {
                        aqroVar.j = new arbi();
                        arajVar = aqroVar.j;
                        aqroVar.h = arajVar;
                    }
                }
                return arajVar;
            }
            this.g.b();
            return new arbq(this.e, aqrxVarArr);
        }
        if (this.c.get() >= 0) {
            return new arbq(this.e, aqrxVarArr);
        }
        return this.a.b(aquxVar, aqutVar, aqrrVar, aqrxVarArr);
    }

    public final void e() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            Status status = this.f;
            this.f = null;
            if (status != null) {
                super.o(status);
            }
        }
    }

    @Override // defpackage.arbu, defpackage.aref
    public final void o(Status status) {
        status.getClass();
        synchronized (this) {
            if (this.c.get() < 0) {
                this.e = status;
                this.c.addAndGet(Integer.MAX_VALUE);
                if (this.c.get() != 0) {
                    this.f = status;
                } else {
                    super.o(status);
                }
            }
        }
    }
}
