package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmi extends cor implements bzt {
    public final hlp a;
    public final byn b;
    public final byn c;
    public final byn d;
    public final hld e;
    private final byn f;
    private final byn g;
    private final arwe h;
    private arxm i;

    public hmi(hlp hlpVar, hld hldVar, arwe arweVar) {
        hlpVar.getClass();
        arweVar.getClass();
        this.a = hlpVar;
        this.e = hldVar;
        this.b = new byu(hmv.a, cav.a);
        this.c = new byu(null, cav.a);
        this.f = new byu(Float.valueOf(1.0f), cav.a);
        this.g = new byu(null, cav.a);
        this.d = new byu(null, cav.a);
        arwe f = arwi.f(arweVar, new aryj(arwi.v(arweVar.b())));
        arwb arwbVar = arws.a;
        this.h = arwi.f(f, asfh.a.i());
    }

    @Override // defpackage.cor
    public final long a() {
        cor j = j();
        if (j != null) {
            return j.a();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.cor
    protected final void b(cny cnyVar) {
        cor j = j();
        if (j != null) {
            j.e(cnyVar, cnyVar.o(), ((Number) this.f.a()).floatValue(), (ckv) this.g.a());
        }
    }

    @Override // defpackage.cor
    protected final void c(float f) {
        this.f.h(Float.valueOf(f));
    }

    @Override // defpackage.cor
    protected final void d(ckv ckvVar) {
        this.g.h(ckvVar);
    }

    @Override // defpackage.bzt
    public final void g() {
        bzt bztVar;
        Object j = j();
        if (j instanceof bzt) {
            bztVar = (bzt) j;
        } else {
            bztVar = null;
        }
        if (bztVar != null) {
            bztVar.g();
        }
    }

    @Override // defpackage.bzt
    public final void h() {
        bzt bztVar;
        Object j = j();
        if (j instanceof bzt) {
            bztVar = (bzt) j;
        } else {
            bztVar = null;
        }
        if (bztVar != null) {
            bztVar.h();
        }
        arxm arxmVar = this.i;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.i = null;
    }

    @Override // defpackage.bzt
    public final void i() {
        bzt bztVar;
        Object j = j();
        if (j instanceof bzt) {
            bztVar = (bzt) j;
        } else {
            bztVar = null;
        }
        if (bztVar != null) {
            bztVar.i();
        }
        if (this.i == null) {
            this.i = arrn.J(this.h, null, null, new eie(this, (arpe) null, 17), 3);
        }
    }

    public final cor j() {
        return (cor) this.d.a();
    }
}
