package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghy implements agih {
    public static final Duration a = albo.cb(2);
    public final aghp b;
    public final agip c;
    public final asgm d;
    private final arwe e;

    public aghy(aghp aghpVar, aghf aghfVar, arwe arweVar, ygv ygvVar) {
        aghfVar.getClass();
        this.b = aghpVar;
        this.e = arweVar;
        this.d = new asgm();
        ascv ascvVar = aghpVar.k;
        aghw aghwVar = new aghw(ascvVar, 2);
        int i = ascp.a;
        this.c = new agip(arrn.T(aghwVar, arweVar, asco.a, e((aghk) ascvVar.c())), new agef(aghfVar, 6), this, arrn.T(new aghw(aghpVar.k, 1), arweVar, asco.a, Duration.ZERO), aghpVar.l, arrn.T(new aghw(aghpVar.k, 0), arweVar, asco.a, null), arrn.T(new lhh(aghpVar.k, 20), arweVar, asco.a, null), null, ygvVar, false, 7808);
    }

    public static final agir e(aghk aghkVar) {
        if (!(aghkVar instanceof aghh) && !(aghkVar instanceof aghg)) {
            if (aghkVar instanceof aghi) {
                return agir.b;
            }
            if (aghkVar instanceof aghj) {
                return agir.c;
            }
            throw new armm();
        }
        return agir.a;
    }

    private final void f(arqv arqvVar) {
        arrn.J(this.e, null, null, new aghq(this, arqvVar, null), 3);
    }

    @Override // defpackage.agih
    public final void a(boolean z, boolean z2, aggp aggpVar) {
        f(new aghr(z, aggpVar, null));
    }

    @Override // defpackage.agih
    public final void b() {
        f(new aghs(null, 1, null));
    }

    @Override // defpackage.agih
    public final void c() {
        f(new aghs(null, 0));
    }

    @Override // defpackage.agih
    public final void d(aggp aggpVar) {
        f(new lfn(aggpVar, (arpe) null, 18));
    }
}
