package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnr implements cny {
    public final a a = new a(cnv.a, drk.a, cob.a);
    public final cnu b = new AnonymousClass1();
    private clp c;
    private clp d;

    /* compiled from: PG */
    /* renamed from: cnr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 implements cnu {
        public final coa a = new cns(this);
        public cof b;

        public AnonymousClass1() {
        }

        @Override // defpackage.cnu
        public final long a() {
            return cnr.this.a.d;
        }

        @Override // defpackage.cnu
        public final ckr b() {
            return cnr.this.a.c;
        }

        @Override // defpackage.cnu
        public final dqv c() {
            return cnr.this.a.a;
        }

        @Override // defpackage.cnu
        public final drk d() {
            return cnr.this.a.b;
        }

        @Override // defpackage.cnu
        public final void e(ckr ckrVar) {
            cnr.this.a.c = ckrVar;
        }

        @Override // defpackage.cnu
        public final void f(dqv dqvVar) {
            cnr.this.a.a = dqvVar;
        }

        @Override // defpackage.cnu
        public final void g(drk drkVar) {
            cnr.this.a.b = drkVar;
        }

        @Override // defpackage.cnu
        public final void h(long j) {
            cnr.this.a.d = j;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public dqv a;
        public drk b;
        public ckr c;
        public long d = 0;

        public a(dqv dqvVar, drk drkVar, ckr ckrVar) {
            this.a = dqvVar;
            this.b = drkVar;
            this.c = ckrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(this.a, aVar.a) && this.b == aVar.b && d.F(this.c, aVar.c) && defpackage.a.bB(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + defpackage.a.A(this.d);
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) cjt.d(this.d)) + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final clp G(cko ckoVar, cnz cnzVar, float f, ckv ckvVar, int i, int i2) {
        clp H = H(cnzVar);
        if (ckoVar != null) {
            ckoVar.a(cnw.b(this), H, f);
        } else {
            if (((ckc) H).c != null) {
                H.n(null);
            }
            long g = H.g();
            long j = cku.a;
            if (!defpackage.a.bB(g, j)) {
                H.k(j);
            }
            if (H.a() != f) {
                H.i(f);
            }
        }
        ckc ckcVar = (ckc) H;
        if (!d.F(ckcVar.d, ckvVar)) {
            H.l(ckvVar);
        }
        if (!defpackage.a.bA(ckcVar.b, i)) {
            H.j(i);
        }
        if (!defpackage.a.bA(H.d(), i2)) {
            H.m(i2);
        }
        return H;
    }

    private final clp H(cnz cnzVar) {
        if (d.F(cnzVar, coc.a)) {
            clp clpVar = this.c;
            if (clpVar == null) {
                ckc ckcVar = new ckc();
                ckcVar.s(0);
                this.c = ckcVar;
                return ckcVar;
            }
            return clpVar;
        }
        if (cnzVar instanceof cod) {
            clp p = p();
            float c = p.c();
            cod codVar = (cod) cnzVar;
            float f = codVar.a;
            if (c != f) {
                p.r(f);
            }
            int e = p.e();
            int i = codVar.c;
            if (!defpackage.a.bA(e, i)) {
                p.o(i);
            }
            float b = p.b();
            float f2 = codVar.b;
            if (b != f2) {
                p.q(f2);
            }
            int f3 = p.f();
            int i2 = codVar.d;
            if (!defpackage.a.bA(f3, i2)) {
                p.p(i2);
            }
            if (!d.F(null, null)) {
                p.t();
                return p;
            }
            return p;
        }
        throw new armm();
    }

    private static final long I(long j, float f) {
        long f2;
        if (f == 1.0f) {
            return j;
        }
        f2 = ckw.f(cku.d(j), cku.c(j), cku.b(j), cku.a(j) * f, cku.f(j));
        return f2;
    }

    static /* synthetic */ clp t(cnr cnrVar, long j, cnz cnzVar, float f, ckv ckvVar, int i) {
        clp H = cnrVar.H(cnzVar);
        long I = I(j, f);
        if (!defpackage.a.bB(H.g(), I)) {
            H.k(I);
        }
        ckc ckcVar = (ckc) H;
        if (ckcVar.c != null) {
            H.n(null);
        }
        if (!d.F(ckcVar.d, ckvVar)) {
            H.l(ckvVar);
        }
        if (!defpackage.a.bA(ckcVar.b, i)) {
            H.j(i);
        }
        if (!defpackage.a.bA(H.d(), 1)) {
            H.m(1);
        }
        return H;
    }

    @Override // defpackage.cny
    public final void A(cko ckoVar, long j, long j2, float f, float f2) {
        throw null;
    }

    @Override // defpackage.cny
    public final void B(clr clrVar, long j, float f, cnz cnzVar) {
        this.a.c.f(clrVar, t(this, j, cnzVar, f, null, 3));
    }

    @Override // defpackage.cny
    public final void C(cko ckoVar, long j, long j2, long j3, float f, cnz cnzVar) {
        throw null;
    }

    @Override // defpackage.cny
    public final void D(long j, long j2, long j3, long j4, cnz cnzVar, float f) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), t(this, j, cnzVar, f, null, 3));
    }

    @Override // defpackage.cny
    public final void E(long j, long j2, long j3, float f, int i) {
        ckr ckrVar = this.a.c;
        clp p = p();
        long I = I(j, 1.0f);
        if (!defpackage.a.bB(p.g(), I)) {
            p.k(I);
        }
        ckc ckcVar = (ckc) p;
        if (ckcVar.c != null) {
            p.n(null);
        }
        if (!d.F(ckcVar.d, null)) {
            p.l(null);
        }
        if (!defpackage.a.bA(ckcVar.b, 3)) {
            p.j(3);
        }
        if (p.c() != f) {
            p.r(f);
        }
        if (p.b() != 4.0f) {
            p.q(4.0f);
        }
        if (!defpackage.a.bA(p.e(), i)) {
            p.o(i);
        }
        if (!defpackage.a.bA(p.f(), 0)) {
            p.p(0);
        }
        if (!d.F(null, null)) {
            p.t();
        }
        if (!defpackage.a.bA(p.d(), 1)) {
            p.m(1);
        }
        ckrVar.e(j2, j3, p);
    }

    @Override // defpackage.cny
    public final void F(cko ckoVar, long j, long j2, float f, cnz cnzVar) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        this.a.c.g(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i), G(ckoVar, cnzVar, f, null, 3, 1));
    }

    @Override // defpackage.cny
    public final /* synthetic */ long a() {
        return cnw.a(this);
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.a.a.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.a.a.ed();
    }

    @Override // defpackage.drc
    public final /* synthetic */ float ef(long j) {
        return drb.a(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float eg(float f) {
        return dqu.a(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float eh(int i) {
        return dqu.b(this, i);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float el(long j) {
        return dqu.c(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float em(float f) {
        return dqu.d(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ int en(long j) {
        return dqu.e(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ int eo(float f) {
        return dqu.f(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long ep(long j) {
        return dqu.g(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long eq(long j) {
        return dqu.h(this, j);
    }

    @Override // defpackage.drc
    public final /* synthetic */ long er(float f) {
        return drb.b(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long es(float f) {
        return dqu.i(this, f);
    }

    @Override // defpackage.cny
    public final /* synthetic */ long o() {
        return cnw.b(this);
    }

    public final clp p() {
        clp clpVar = this.d;
        if (clpVar == null) {
            ckc ckcVar = new ckc();
            ckcVar.s(1);
            this.d = ckcVar;
            return ckcVar;
        }
        return clpVar;
    }

    @Override // defpackage.cny
    public final cnu q() {
        return this.b;
    }

    @Override // defpackage.cny
    public final drk r() {
        return this.a.b;
    }

    @Override // defpackage.cny
    public final void s(long j, long j2, long j3, float f, cnz cnzVar, ckv ckvVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.g(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), t(this, j, cnzVar, f, ckvVar, i));
    }

    @Override // defpackage.cny
    public final void v(long j, float f, long j2, float f2, cnz cnzVar, int i) {
        this.a.c.d(j2, f, t(this, j, cnzVar, f2, null, i));
    }

    @Override // defpackage.cny
    public final void w(clr clrVar, cko ckoVar, float f, cnz cnzVar, int i) {
        this.a.c.f(clrVar, G(ckoVar, cnzVar, f, null, i, 1));
    }

    @Override // defpackage.cny
    public final void x(long j, float f, float f2, long j2, long j3, cnz cnzVar) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, t(this, j, cnzVar, 1.0f, null, 3));
    }

    @Override // defpackage.cny
    public final void y(clg clgVar, long j, long j2, float f, cnz cnzVar, ckv ckvVar, int i, int i2) {
        this.a.c.u(clgVar, j, j2, G(null, cnzVar, f, ckvVar, i, i2));
    }

    @Override // defpackage.cny
    public final void z(clg clgVar, cnz cnzVar, ckv ckvVar) {
        throw null;
    }
}
