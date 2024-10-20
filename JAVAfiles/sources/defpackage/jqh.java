package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqh implements jpv {
    public final arqv a;
    public final arqr b;
    private final arpi c;
    private final arqr d;
    private final arqv e;
    private final arqv f;

    public jqh(arpi arpiVar, arqr arqrVar, arqv arqvVar, arqr arqrVar2, arqv arqvVar2, arqv arqvVar3) {
        this.c = arpiVar;
        this.d = arqrVar;
        this.a = arqvVar;
        this.b = arqrVar2;
        this.e = arqvVar2;
        this.f = arqvVar3;
    }

    @Override // defpackage.jpv
    public final Object a(jhb jhbVar, spa spaVar, arpe arpeVar) {
        Object q = arro.q(this.c, new gci(this, jhbVar, spaVar, (arpe) null, 10), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    @Override // defpackage.jpv
    public final void c(spb spbVar, jhc jhcVar) {
        jhcVar.getClass();
        this.e.a(spbVar, this.d.a(jhcVar));
    }

    @Override // defpackage.jpv
    public final void d(sph sphVar, jhc jhcVar) {
        this.f.a(sphVar, this.d.a(jhcVar));
    }

    @Override // defpackage.jpv
    public final boolean e(jpp jppVar) {
        return jppVar.a(this.d);
    }
}
