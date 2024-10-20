package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfk extends cem {
    public arqr k;
    public arqr l;
    public final long m;
    private final cem n;
    private final boolean o;
    private final boolean p;

    public cfk(cem cemVar, arqr arqrVar, arqr arqrVar2, boolean z, boolean z2) {
        super(0, cev.a, cex.p(arqrVar, (cemVar == null || (r1 = cemVar.i()) == null) ? ((cel) cex.i.get()).a : r1, z), cex.q(arqrVar2, (cemVar == null || (r1 = cemVar.k()) == null) ? ((cel) cex.i.get()).b : r1));
        arqr k;
        arqr i;
        this.n = cemVar;
        this.o = z;
        this.p = z2;
        this.k = this.a;
        this.l = this.b;
        this.m = cdu.a();
    }

    private final cem F() {
        cem cemVar = this.n;
        if (cemVar == null) {
            return (cem) cex.i.get();
        }
        return cemVar;
    }

    @Override // defpackage.ces
    public final void A(int i) {
        cfb.a();
        throw new armj();
    }

    @Override // defpackage.ces
    public final void B(cev cevVar) {
        cfb.a();
        throw new armj();
    }

    @Override // defpackage.cem
    public final cem a(arqr arqrVar, arqr arqrVar2) {
        arqr p;
        p = cex.p(arqrVar, this.k, true);
        arqr q = cex.q(arqrVar2, this.l);
        if (!this.o) {
            return new cfk(F().a(null, q), p, q, false, true);
        }
        return F().a(p, q);
    }

    @Override // defpackage.cem, defpackage.ces
    public final ces b(arqr arqrVar) {
        arqr p;
        ces a;
        p = cex.p(arqrVar, this.k, true);
        if (!this.o) {
            a = cex.a(F().b(null), p, true);
            return a;
        }
        return F().b(p);
    }

    @Override // defpackage.cem
    public final cet c() {
        return F().c();
    }

    @Override // defpackage.cem, defpackage.ces
    public final void d() {
        cem cemVar;
        D();
        if (this.p && (cemVar = this.n) != null) {
            cemVar.d();
        }
    }

    @Override // defpackage.cem, defpackage.ces
    public final void e() {
        F().e();
    }

    @Override // defpackage.cem, defpackage.ces
    public final /* synthetic */ void f() {
        d.aL();
    }

    @Override // defpackage.cem, defpackage.ces
    public final /* synthetic */ void g() {
        d.aL();
    }

    @Override // defpackage.cem, defpackage.ces
    public final int h() {
        return F().h();
    }

    @Override // defpackage.cem, defpackage.ces
    public final /* synthetic */ arqr i() {
        return this.k;
    }

    @Override // defpackage.cem
    /* renamed from: j */
    public final arqr i() {
        return this.k;
    }

    @Override // defpackage.cem, defpackage.ces
    public final arqr k() {
        return this.l;
    }

    @Override // defpackage.cem, defpackage.ces
    public final void n(cfg cfgVar) {
        F().n(cfgVar);
    }

    @Override // defpackage.cem, defpackage.ces
    public final void q(int i) {
        F().q(i);
    }

    @Override // defpackage.cem, defpackage.ces
    public final boolean r() {
        F().r();
        return false;
    }

    @Override // defpackage.cem
    public final vh s() {
        return F().s();
    }

    @Override // defpackage.cem
    public final void u(vh vhVar) {
        cfb.a();
        throw new armj();
    }

    @Override // defpackage.ces
    public final int v() {
        return F().v();
    }

    @Override // defpackage.ces
    public final cev x() {
        return F().x();
    }
}
