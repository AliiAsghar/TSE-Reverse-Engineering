package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceo extends ces {
    private final arqr a;
    private final ces b;

    public ceo(int i, cev cevVar, arqr arqrVar, ces cesVar) {
        super(i, cevVar);
        this.a = arqrVar;
        this.b = cesVar;
        cesVar.f();
    }

    @Override // defpackage.ces
    public final /* bridge */ /* synthetic */ ces b(arqr arqrVar) {
        arqr p;
        arqr arqrVar2 = this.a;
        int i = this.h;
        cev cevVar = this.g;
        p = cex.p(arqrVar, arqrVar2, true);
        return new ceo(i, cevVar, p, this.b);
    }

    @Override // defpackage.ces
    public final void d() {
        if (!this.i) {
            if (this.h != this.b.v()) {
                y();
            }
            this.b.g();
            super.d();
        }
    }

    @Override // defpackage.ces
    public final /* synthetic */ void f() {
        d.aL();
    }

    @Override // defpackage.ces
    public final /* synthetic */ void g() {
        d.aL();
    }

    @Override // defpackage.ces
    public final /* synthetic */ arqr i() {
        return this.a;
    }

    @Override // defpackage.ces
    public final arqr k() {
        return null;
    }

    @Override // defpackage.ces
    public final /* bridge */ /* synthetic */ void n(cfg cfgVar) {
        cex.A();
        throw new armj();
    }

    @Override // defpackage.ces
    public final boolean r() {
        return true;
    }

    @Override // defpackage.ces
    public final void e() {
    }
}
