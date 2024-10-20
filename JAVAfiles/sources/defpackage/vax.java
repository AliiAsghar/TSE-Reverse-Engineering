package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vax extends vby {
    public static final xze a = xze.g("BugleNetwork", "AnonymousRegistrationProvider");
    public final armf b;
    public final apwt c;
    private final armf d;
    private final vcs e;
    private final anen f;
    private final vco g;

    public vax(anen anenVar, anen anenVar2, anen anenVar3, veo veoVar, wpp wppVar, armf armfVar, xnv xnvVar, vco vcoVar, Optional optional, apwt apwtVar, armf armfVar2, vcs vcsVar) {
        super(anenVar, anenVar2, veoVar, xnvVar, wppVar, optional);
        this.g = vcoVar;
        this.c = apwtVar;
        this.e = vcsVar;
        this.d = armfVar2;
        this.b = armfVar;
        this.f = anenVar3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    @Override // defpackage.vby
    protected final vfc a(long j) {
        a.l("Creating anonymous register refresh RPC handler");
        vcs vcsVar = this.e;
        Optional empty = Optional.empty();
        vcsVar.getClass();
        uvp uvpVar = new uvp(vcsVar, 10);
        akul h = ((vco) this.b.b()).b.h().h(new vdx(2), andi.a).h(new vbj(1), this.o);
        vco vcoVar = this.g;
        ?? r1 = vcoVar.b;
        vgp vgpVar = vgp.c;
        wpp wppVar = (wpp) r1.b();
        wppVar.getClass();
        anen anenVar = (anen) vcoVar.a.b();
        anenVar.getClass();
        return new vep(wppVar, anenVar, j, empty, uvpVar, h, vgpVar);
    }

    @Override // defpackage.vby
    protected final vgp b() {
        return vgp.c;
    }

    @Override // defpackage.vby
    public final synchronized akul c() {
        return ((vco) this.b.b()).c();
    }

    @Override // defpackage.vby
    public final akul d() {
        a.l("doing first time anonymous tachyon registration");
        vgq vgqVar = (vgq) this.d.b();
        return akul.g(vgqVar.c((aqgb) this.t.S("Bugle").s())).i(new twe(this, vgqVar, 19), this.f).i(new uwa(vgqVar, 15), this.o).i(new uwa(this, 16), andi.a);
    }

    @Override // defpackage.vby
    protected final akul e() {
        return ((vco) this.b.b()).d();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, wul] */
    @Override // defpackage.vby
    public final akul f() {
        return ((vco) this.b.b()).b.h().h(new vdx(6), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, wul] */
    @Override // defpackage.vby
    protected final akul g(byte[] bArr) {
        vco vcoVar = (vco) this.b.b();
        ((ykw) vcoVar.a).i("tachyon_registration_token", bArr);
        return vcoVar.b.j(new uzs(bArr, 18)).h(new vdx(4), andi.a);
    }

    @Override // defpackage.vby
    protected final akul h(long j) {
        return ((vco) this.b.b()).e(j);
    }

    @Override // defpackage.vby
    protected final akul i(aqer aqerVar) {
        aqfg aqfgVar = aqerVar.d;
        if (aqfgVar == null) {
            aqfgVar = aqfg.a;
        }
        return v(aqfgVar);
    }

    @Override // defpackage.vba
    public final String j() {
        return "Bugle";
    }
}
