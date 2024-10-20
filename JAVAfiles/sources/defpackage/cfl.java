package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfl extends ces {
    public arqr a;
    public final long b;
    private final ces c;
    private final boolean d;

    public cfl(ces cesVar, arqr arqrVar, boolean z) {
        super(0, cev.a);
        arqr i;
        this.c = cesVar;
        this.d = z;
        this.a = cex.p(arqrVar, (cesVar == null || (i = cesVar.i()) == null) ? ((cel) cex.i.get()).a : i, false);
        this.b = cdu.a();
    }

    private final ces a() {
        ces cesVar = this.c;
        if (cesVar == null) {
            return (ces) cex.i.get();
        }
        return cesVar;
    }

    @Override // defpackage.ces
    public final ces b(arqr arqrVar) {
        arqr p;
        ces a;
        p = cex.p(arqrVar, this.a, true);
        a = cex.a(a().b(null), p, true);
        return a;
    }

    @Override // defpackage.ces
    public final void d() {
        ces cesVar;
        D();
        if (this.d && (cesVar = this.c) != null) {
            cesVar.d();
        }
    }

    @Override // defpackage.ces
    public final void e() {
        a().e();
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
    public final void n(cfg cfgVar) {
        a().n(cfgVar);
    }

    @Override // defpackage.ces
    public final boolean r() {
        return a().r();
    }

    @Override // defpackage.ces
    public final int v() {
        return a().v();
    }

    @Override // defpackage.ces
    public final cev x() {
        return a().x();
    }
}
