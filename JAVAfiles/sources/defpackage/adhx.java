package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adhx implements adez {
    @Override // defpackage.adez
    public final void h(adey adeyVar) {
        apiu p = adcx.p(adeyVar.k);
        apit c = adeyVar.c();
        int a = adeyVar.a();
        boolean z = adeyVar.d;
        advr.o("Logging NIF selected: %s, %s, IPv%d, hasDns:%b", p, c, Integer.valueOf(a), Boolean.valueOf(z));
        acnx acnxVar = adeyVar.i;
        aozy r = acnxVar.r(3, p, c, a);
        if (!r.b.isMutable()) {
            r.u();
        }
        apiv apivVar = (apiv) r.b;
        apiv apivVar2 = apiv.a;
        apivVar.b |= 16;
        apivVar.g = z;
        acnxVar.m((apiv) r.s());
    }

    @Override // defpackage.adez
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.adez
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.adez
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.adez
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.adez
    public final /* synthetic */ void j(String str) {
    }

    @Override // defpackage.adez
    public final /* synthetic */ void k(String str) {
    }
}
