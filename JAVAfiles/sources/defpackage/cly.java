package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cly implements cle {
    public int a;
    public float e;
    public float f;
    public float g;
    public float j;
    public float k;
    public float l;
    public boolean p;
    public clx u;
    public cln v;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public long h = clf.a;
    public long i = clf.a;
    public float m = 8.0f;
    public long n = cmg.a;
    public cmb o = clw.a;
    public int q = 0;
    public long r = 9205357640488583168L;
    public dqv s = new dqw(1.0f);
    public drk t = drk.a;

    @Override // defpackage.cle
    public final void A(cmb cmbVar) {
        if (!d.F(this.o, cmbVar)) {
            this.a |= 8192;
            this.o = cmbVar;
        }
    }

    @Override // defpackage.cle
    public final void B(long j) {
        if (!a.bB(this.i, j)) {
            this.a |= 128;
            this.i = j;
        }
    }

    @Override // defpackage.cle
    public final void C(long j) {
        if (!a.bB(this.n, j)) {
            this.a |= 4096;
            this.n = j;
        }
    }

    @Override // defpackage.cle
    public final void D(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    @Override // defpackage.cle
    public final void E(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // defpackage.cle
    public final long a() {
        return this.r;
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.s.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.s.ed();
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

    @Override // defpackage.cle
    public final void o(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    @Override // defpackage.cle
    public final void p(long j) {
        if (!a.bB(this.h, j)) {
            this.a |= 64;
            this.h = j;
        }
    }

    @Override // defpackage.cle
    public final void q(float f) {
        if (this.m == f) {
            return;
        }
        this.a |= 2048;
        this.m = f;
    }

    @Override // defpackage.cle
    public final void r(boolean z) {
        if (this.p != z) {
            this.a |= 16384;
            this.p = z;
        }
    }

    @Override // defpackage.cle
    public final void s(int i) {
        if (!a.bA(this.q, i)) {
            this.a |= 32768;
            this.q = i;
        }
    }

    @Override // defpackage.cle
    public final void t(clx clxVar) {
        if (!d.F(this.u, clxVar)) {
            this.a |= 131072;
            this.u = clxVar;
        }
    }

    @Override // defpackage.cle
    public final void u(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 256;
        this.j = f;
    }

    @Override // defpackage.cle
    public final void v(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= 512;
        this.k = f;
    }

    @Override // defpackage.cle
    public final void w(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= 1024;
        this.l = f;
    }

    @Override // defpackage.cle
    public final void x(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    @Override // defpackage.cle
    public final void y(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    @Override // defpackage.cle
    public final void z(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }
}
