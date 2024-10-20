package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class veq {

    @Deprecated
    public final aqfn a;
    public String b = null;
    public aozb c = aozb.b;
    public final aozb d;
    public aqdq e;
    public boolean f;
    public aozb g;
    public Optional h;
    private final ves i;

    public veq(ves vesVar, lpg lpgVar, tro troVar) {
        aozb aozbVar = aozb.b;
        this.d = aozbVar;
        this.e = null;
        this.f = false;
        this.g = aozbVar;
        this.h = Optional.empty();
        this.i = vesVar;
        aqfn aqfnVar = troVar.a;
        this.a = aqfnVar;
        if (lpgVar.z()) {
            if (troVar.c.isPresent()) {
                this.g = (aozb) troVar.c.get();
            } else {
                asku b = asku.b(aqfnVar.b);
                if ((b == null ? asku.UNRECOGNIZED : b) == asku.EMAIL) {
                    xzb.g("BugleNetwork", "GDitto push is missing registration id. Type=".concat("GET_UPDATES"));
                }
            }
            this.h = Optional.of(troVar);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [apwt, java.lang.Object] */
    public final ver a() {
        ves vesVar = this.i;
        ((vbm) vesVar.a.b()).getClass();
        xnv xnvVar = (xnv) vesVar.b.b();
        xnvVar.getClass();
        ((ykw) vesVar.c.b()).getClass();
        trn trnVar = (trn) vesVar.d.b();
        trnVar.getClass();
        vcc vccVar = (vcc) vesVar.e.b();
        vccVar.getClass();
        anen anenVar = (anen) vesVar.f.b();
        anenVar.getClass();
        ?? b = vesVar.h.b();
        b.getClass();
        mbl mblVar = (mbl) vesVar.i.b();
        mblVar.getClass();
        yyt yytVar = (yyt) vesVar.j.b();
        yytVar.getClass();
        vfg vfgVar = (vfg) vesVar.l.b();
        vfgVar.getClass();
        vcy vcyVar = (vcy) vesVar.m.b();
        vcyVar.getClass();
        vcy vcyVar2 = (vcy) vesVar.n.b();
        vcyVar2.getClass();
        iew iewVar = (iew) vesVar.p.b();
        iewVar.getClass();
        armf armfVar = vesVar.o;
        return new ver(xnvVar, trnVar, vccVar, anenVar, vesVar.g, b, mblVar, yytVar, vesVar.k, vfgVar, vcyVar, vcyVar2, armfVar, iewVar, this);
    }

    public final void b(apbt apbtVar) {
        this.c = apbtVar.toByteString();
    }

    public final void c() {
        this.f = true;
    }

    @Deprecated
    public veq(ves vesVar, lpg lpgVar, aqfn aqfnVar, Optional optional) {
        aozb aozbVar = aozb.b;
        this.d = aozbVar;
        this.e = null;
        this.f = false;
        this.g = aozbVar;
        this.h = Optional.empty();
        this.i = vesVar;
        this.a = aqfnVar;
        if (lpgVar.z()) {
            if (optional.isPresent()) {
                this.g = (aozb) optional.get();
                return;
            }
            asku b = asku.b(aqfnVar.b);
            if ((b == null ? asku.UNRECOGNIZED : b) == asku.EMAIL) {
                xzb.g("BugleNetwork", "GDitto push is missing registration id. Type=".concat("GET_UPDATES"));
            }
        }
    }
}
