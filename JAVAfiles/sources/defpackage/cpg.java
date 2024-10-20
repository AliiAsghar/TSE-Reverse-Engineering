package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpg extends cor {
    public final byn a;
    public final byn b;
    public final cpc c;
    public final byk d;
    public int e;
    private float f;
    private ckv g;

    /* compiled from: PG */
    /* renamed from: cpg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cpg cpgVar = cpg.this;
            if (cpgVar.e == cpgVar.g()) {
                cpg cpgVar2 = cpg.this;
                cpgVar2.d.d(cpgVar2.g() + 1);
            }
            return arnb.a;
        }
    }

    public cpg() {
        this(new cou());
    }

    @Override // defpackage.cor
    public final long a() {
        return ((cjt) this.a.a()).a;
    }

    @Override // defpackage.cor
    protected final void b(cny cnyVar) {
        cpc cpcVar = this.c;
        ckv ckvVar = this.g;
        if (ckvVar == null) {
            ckvVar = cpcVar.d();
        }
        if (((Boolean) this.b.a()).booleanValue() && cnyVar.r() == drk.b) {
            long a = cnyVar.a();
            cnu q = cnyVar.q();
            long a2 = q.a();
            q.b().l();
            try {
                ((cnr.AnonymousClass1) q).a.d(-1.0f, 1.0f, a);
                cpcVar.g(cnyVar, this.f, ckvVar);
            } finally {
                q.b().j();
                q.h(a2);
            }
        } else {
            cpcVar.g(cnyVar, this.f, ckvVar);
        }
        this.e = g();
    }

    @Override // defpackage.cor
    protected final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.cor
    protected final void d(ckv ckvVar) {
        this.g = ckvVar;
    }

    public final int g() {
        return this.d.b();
    }

    public cpg(cou couVar) {
        this.a = new byu(new cjt(0L), cav.a);
        this.b = new byu(false, cav.a);
        cpc cpcVar = new cpc(couVar);
        cpcVar.d = new AnonymousClass1();
        this.c = cpcVar;
        this.d = new bys(0);
        this.f = 1.0f;
        this.e = -1;
    }
}
