package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arlb {
    public final aqrs a;
    public final aqrr b;

    /* JADX INFO: Access modifiers changed from: protected */
    public arlb(aqrs aqrsVar, aqrr aqrrVar) {
        aqrsVar.getClass();
        this.a = aqrsVar;
        this.b = aqrrVar;
    }

    public abstract arlb a(aqrs aqrsVar, aqrr aqrrVar);

    public final arlb h(long j, TimeUnit timeUnit) {
        return a(this.a, this.b.b(aqsn.c(j, timeUnit)));
    }

    public final arlb i(aqrv... aqrvVarArr) {
        return a(apsd.r(this.a, aqrvVarArr), this.b);
    }

    public final arlb j(aqrq aqrqVar, Object obj) {
        return a(this.a, this.b.e(aqrqVar, obj));
    }

    public final arlb k(appn appnVar) {
        aqrp a = aqrr.a(this.b);
        a.i = appnVar;
        return a(this.a, new aqrr(a));
    }
}
