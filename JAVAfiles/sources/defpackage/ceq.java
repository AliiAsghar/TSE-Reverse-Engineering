package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceq extends ces {
    private final arqr a;
    private int b;

    public ceq(int i, cev cevVar, arqr arqrVar) {
        super(i, cevVar);
        this.a = arqrVar;
        this.b = 1;
    }

    @Override // defpackage.ces
    public final ces b(arqr arqrVar) {
        arqr p;
        cex.w(this);
        arqr arqrVar2 = this.a;
        int i = this.h;
        cev cevVar = this.g;
        p = cex.p(arqrVar, arqrVar2, true);
        return new ceo(i, cevVar, p, this);
    }

    @Override // defpackage.ces
    public final void d() {
        if (!this.i) {
            g();
            super.d();
        }
    }

    @Override // defpackage.ces
    public final void f() {
        this.b++;
    }

    @Override // defpackage.ces
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
    public final void n(cfg cfgVar) {
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
