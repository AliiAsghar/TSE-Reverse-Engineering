package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dds implements cyz {
    private static final arqv a = AnonymousClass1.a;
    private final dai b;
    private arqv c;
    private arqg d;
    private boolean e;
    private boolean g;
    private boolean h;
    private clp i;
    private final dck m;
    private int n;
    private final ddk f = new ddk();
    private final dde j = new dde(a);
    private final cks k = new cks();
    private long l = cmg.a;

    /* compiled from: PG */
    /* renamed from: dds$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<dck, Matrix, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((dck) obj).k((Matrix) obj2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dds$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<ckr, arnb> {
        final /* synthetic */ arqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqv arqvVar) {
            super(1);
            this.a = arqvVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.a((ckr) obj, null);
            return arnb.a;
        }
    }

    public dds(dai daiVar, arqv arqvVar, arqg arqgVar) {
        dck ddqVar;
        this.b = daiVar;
        this.c = arqvVar;
        this.d = arqgVar;
        if (Build.VERSION.SDK_INT >= 29) {
            ddqVar = new ddr();
        } else {
            ddqVar = new ddq(daiVar);
        }
        ddqVar.L();
        ddqVar.r(false);
        this.m = ddqVar;
    }

    private final void n(boolean z) {
        if (z != this.e) {
            this.e = z;
            this.b.F(this, z);
        }
    }

    private final void o() {
        dfj.a(this.b);
    }

    @Override // defpackage.cyz
    public final long a(long j, boolean z) {
        if (z) {
            return this.j.b(this.m, j);
        }
        return this.j.a(this.m, j);
    }

    @Override // defpackage.cyz
    public final void b() {
        if (this.m.J()) {
            this.m.i();
        }
        this.c = null;
        this.d = null;
        this.g = true;
        n(false);
        this.b.I();
        this.b.N(this);
    }

    @Override // defpackage.cyz
    public final void c(ckr ckrVar, cof cofVar) {
        Canvas a2 = cjx.a(ckrVar);
        boolean z = false;
        if (a2.isHardwareAccelerated()) {
            j();
            if (this.m.b() > brg.a) {
                z = true;
            }
            this.h = z;
            if (z) {
                ckrVar.i();
            }
            this.m.j(a2);
            if (this.h) {
                ckrVar.c();
                return;
            }
            return;
        }
        float e = this.m.e();
        float g = this.m.g();
        float f = this.m.f();
        float c = this.m.c();
        if (this.m.a() < 1.0f) {
            clp clpVar = this.i;
            if (clpVar == null) {
                clpVar = new ckc();
                this.i = clpVar;
            }
            clpVar.i(this.m.a());
            a2.saveLayer(e, g, f, c, ((ckc) clpVar).a);
        } else {
            ckrVar.l();
        }
        ckrVar.o(e, g);
        ckrVar.b(this.j.h(this.m));
        if (this.m.I() || this.m.H()) {
            this.f.c(ckrVar);
        }
        arqv arqvVar = this.c;
        if (arqvVar != null) {
            arqvVar.a(ckrVar, null);
        }
        ckrVar.j();
        n(false);
    }

    @Override // defpackage.cyz
    public final void d(float[] fArr) {
        float[] g = this.j.g(this.m);
        if (g != null) {
            cll.d(fArr, g);
        }
    }

    @Override // defpackage.cyz
    public final void e(cjl cjlVar, boolean z) {
        if (z) {
            this.j.e(this.m, cjlVar);
        } else {
            this.j.d(this.m, cjlVar);
        }
    }

    @Override // defpackage.cyz
    public final void f(long j) {
        dck dckVar = this.m;
        int e = dckVar.e();
        int g = dckVar.g();
        int b = dre.b(j);
        int a2 = dre.a(j);
        if (e == a2 && g == b) {
            return;
        }
        if (e != a2) {
            this.m.l(a2 - e);
        }
        if (g != b) {
            this.m.m(b - g);
        }
        o();
        this.j.c();
    }

    @Override // defpackage.cyz
    public final void g(long j) {
        int i = (int) (j >> 32);
        this.m.w(cmg.a(this.l) * i);
        int i2 = (int) (j & 4294967295L);
        this.m.x(cmg.b(this.l) * i2);
        dck dckVar = this.m;
        if (this.m.K(dckVar.e(), dckVar.g(), dckVar.e() + i, this.m.g() + i2)) {
            this.m.v(this.f.a());
            invalidate();
            this.j.c();
        }
    }

    @Override // defpackage.cyz
    public final void h(arqv arqvVar, arqg arqgVar) {
        this.j.f();
        n(false);
        this.g = false;
        this.h = false;
        this.l = cmg.a;
        this.c = arqvVar;
        this.d = arqgVar;
    }

    @Override // defpackage.cyz
    public final void i(float[] fArr) {
        cll.d(fArr, this.j.h(this.m));
    }

    @Override // defpackage.cyz
    public final void invalidate() {
        if (!this.e && !this.g) {
            this.b.invalidate();
            n(true);
        }
    }

    @Override // defpackage.cyz
    public final void j() {
        if (!this.e && this.m.J()) {
            return;
        }
        clr clrVar = null;
        if (this.m.I()) {
            ddk ddkVar = this.f;
            if (!ddkVar.d()) {
                clrVar = ddkVar.b();
            }
        }
        arqv arqvVar = this.c;
        if (arqvVar != null) {
            this.m.n(this.k, clrVar, new AnonymousClass2(arqvVar));
        }
        n(false);
    }

    @Override // defpackage.cyz
    public final void k(cly clyVar) {
        boolean z;
        boolean z2;
        arqg arqgVar;
        boolean z3;
        int i = clyVar.a | this.n;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.l = clyVar.n;
        }
        boolean z4 = true;
        if (this.m.I() && !this.f.d()) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 1) != 0) {
            this.m.C(clyVar.b);
        }
        if ((i & 2) != 0) {
            this.m.D(clyVar.c);
        }
        if ((i & 4) != 0) {
            this.m.o(clyVar.d);
        }
        if ((i & 8) != 0) {
            this.m.F(clyVar.e);
        }
        if ((i & 16) != 0) {
            this.m.G(clyVar.f);
        }
        if ((i & 32) != 0) {
            this.m.u(clyVar.g);
        }
        if ((i & 64) != 0) {
            this.m.p(ckw.b(clyVar.h));
        }
        if ((i & 128) != 0) {
            this.m.E(ckw.b(clyVar.i));
        }
        if ((i & 1024) != 0) {
            this.m.B(clyVar.l);
        }
        if ((i & 256) != 0) {
            this.m.z(clyVar.j);
        }
        if ((i & 512) != 0) {
            this.m.A(clyVar.k);
        }
        if ((i & 2048) != 0) {
            this.m.q(clyVar.m);
        }
        if (i2 != 0) {
            this.m.w(cmg.a(this.l) * this.m.h());
            this.m.x(cmg.b(this.l) * this.m.d());
        }
        if (clyVar.p && clyVar.o != clw.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 24576) != 0) {
            this.m.s(z2);
            dck dckVar = this.m;
            if (clyVar.p && clyVar.o == clw.a) {
                z3 = true;
            } else {
                z3 = false;
            }
            dckVar.r(z3);
        }
        if ((131072 & i) != 0) {
            this.m.y(clyVar.u);
        }
        if ((32768 & i) != 0) {
            this.m.t(clyVar.q);
        }
        boolean f = this.f.f(clyVar.v, clyVar.d, z2, clyVar.g, clyVar.r);
        ddk ddkVar = this.f;
        if (ddkVar.a) {
            this.m.v(ddkVar.a());
        }
        if (!z2 || this.f.d()) {
            z4 = false;
        }
        if (z == z4 && (!z4 || !f)) {
            o();
        } else {
            invalidate();
        }
        if (!this.h && this.m.b() > brg.a && (arqgVar = this.d) != null) {
            arqgVar.a();
        }
        if ((i & 7963) != 0) {
            this.j.c();
        }
        this.n = clyVar.a;
    }

    @Override // defpackage.cyz
    public final boolean l(long j) {
        dck dckVar = this.m;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (dckVar.H()) {
            if (intBitsToFloat >= brg.a && intBitsToFloat < this.m.h() && intBitsToFloat2 >= brg.a && intBitsToFloat2 < this.m.d()) {
                return true;
            }
            return false;
        }
        if (!this.m.I()) {
            return true;
        }
        return this.f.e(j);
    }

    @Override // defpackage.cyz
    public final float[] m() {
        return this.j.h(this.m);
    }
}
