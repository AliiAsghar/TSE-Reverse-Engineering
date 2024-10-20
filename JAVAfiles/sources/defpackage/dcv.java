package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import defpackage.cln;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcv implements cyz {
    public arqv a;
    private cof b;
    private final clc c;
    private final dai d;
    private arqg e;
    private boolean g;
    private float[] i;
    private boolean j;
    private int n;
    private cln p;
    private clr q;
    private clp r;
    private boolean s;
    private boolean t;
    private boolean v;
    private long f = 9223372034707292159L;
    private final float[] h = cll.e();
    private dqv k = new dqw(1.0f);
    private drk l = drk.a;
    private final cnr m = new cnr();
    private long o = cmg.a;
    private boolean u = true;
    private final arqr w = new AnonymousClass1();

    /* compiled from: PG */
    /* renamed from: dcv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cny, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            cny cnyVar = (cny) obj;
            ckr b = cnyVar.q().b();
            arqv arqvVar = dcv.this.a;
            if (arqvVar != null) {
                arqvVar.a(b, ((cnr.AnonymousClass1) cnyVar.q()).b);
            }
            return arnb.a;
        }
    }

    public dcv(cof cofVar, clc clcVar, dai daiVar, arqv arqvVar, arqg arqgVar) {
        this.b = cofVar;
        this.c = clcVar;
        this.d = daiVar;
        this.a = arqvVar;
        this.e = arqgVar;
    }

    private final void n(boolean z) {
        if (z != this.j) {
            this.j = z;
            this.d.F(this, z);
        }
    }

    private final void o() {
        dfj.a(this.d);
    }

    private final float[] p() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = cll.e();
            this.i = fArr;
        }
        if (!this.t) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
            return fArr;
        }
        this.t = false;
        float[] q = q();
        if (this.u) {
            return q;
        }
        if (!ddc.a(q, fArr)) {
            fArr[0] = Float.NaN;
            return null;
        }
        return fArr;
    }

    private final float[] q() {
        dcv dcvVar = this;
        if (dcvVar.s) {
            cof cofVar = dcvVar.b;
            long j = cofVar.m;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = cju.a(drj.c(dcvVar.f));
            }
            float[] fArr = dcvVar.h;
            cog cogVar = cofVar.a;
            int i = (int) (4294967295L & j);
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            float i2 = cogVar.i();
            float j2 = cogVar.j();
            float c = cogVar.c();
            float d = cogVar.d();
            float e = cogVar.e();
            float f = cogVar.f();
            float g = cogVar.g();
            float f2 = c * 0.0027777778f;
            float floor = f2 - ((float) Math.floor(f2 + 0.5f));
            float abs = Math.abs(floor);
            float f3 = abs + abs;
            float floor2 = (f2 + 0.25f) - ((float) Math.floor(r7 + 0.5f));
            float abs2 = Math.abs(floor2);
            float f4 = abs2 + abs2;
            float f5 = 1.0f - f4;
            float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (f4 * f5));
            float f7 = j2 * f6;
            float f8 = 1.0f - f3;
            float f9 = ((floor * 8.0f) * f8) / (1.25f - (f3 * f8));
            float f10 = j2 * f9;
            float f11 = d * 0.0027777778f;
            float floor3 = f11 - ((float) Math.floor(f11 + 0.5f));
            float abs3 = Math.abs(floor3);
            float f12 = abs3 + abs3;
            float floor4 = (f11 + 0.25f) - ((float) Math.floor(r8 + 0.5f));
            float abs4 = Math.abs(floor4);
            float f13 = abs4 + abs4;
            float f14 = 1.0f - f13;
            float f15 = ((floor4 * 8.0f) * f14) / (1.25f - (f13 * f14));
            float f16 = i2 * f15;
            float f17 = -i2;
            float f18 = e * 0.0027777778f;
            float f19 = 1.0f - f12;
            float f20 = -f9;
            float f21 = f6 * f15;
            float f22 = ((floor3 * 8.0f) * f19) / (1.25f - (f12 * f19));
            float f23 = f6 * f22;
            float f24 = f9 * f15;
            float f25 = f9 * f22;
            float f26 = f10 + f6;
            float floor5 = f18 - ((float) Math.floor(f18 + 0.5f));
            float abs5 = Math.abs(floor5);
            float f27 = abs5 + abs5;
            float f28 = 1.0f - f27;
            float floor6 = (f18 + 0.25f) - ((float) Math.floor(0.5f + r9));
            float abs6 = Math.abs(floor6);
            float f29 = abs6 + abs6;
            float f30 = 1.0f - f29;
            float f31 = ((floor5 * 8.0f) * f28) / (1.25f - (f27 * f28));
            float f32 = ((floor6 * 8.0f) * f30) / (1.25f - (f29 * f30));
            float f33 = ((f32 * f15) + (f31 * f25)) * f;
            float f34 = f31 * f6 * f;
            float f35 = -f22;
            float f36 = ((f32 * f35) + (f31 * f24)) * f;
            float f37 = -f31;
            float f38 = ((f37 * f15) + (f25 * f32)) * g;
            float f39 = f6 * f32 * g;
            float f40 = ((f37 * f35) + (f32 * f24)) * g;
            fArr[0] = f33;
            fArr[1] = f34;
            fArr[2] = f36;
            fArr[3] = 0.0f;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = 0.0f;
            fArr[8] = f23;
            fArr[9] = f20;
            fArr[10] = f21;
            fArr[11] = 0.0f;
            float f41 = -intBitsToFloat;
            fArr[12] = ((f33 * f41) - (f38 * intBitsToFloat2)) + f16 + (f26 * f22) + intBitsToFloat;
            fArr[13] = ((f34 * f41) - (intBitsToFloat2 * f39)) + (f7 - f9) + intBitsToFloat2;
            fArr[14] = ((f41 * f36) - (intBitsToFloat2 * f40)) + (f17 * f22) + (f26 * f15);
            fArr[15] = 1.0f;
            dcvVar = this;
            dcvVar.s = false;
            dcvVar.u = clm.a(dcvVar.h);
        }
        return dcvVar.h;
    }

    @Override // defpackage.cyz
    public final long a(long j, boolean z) {
        float[] q;
        if (z) {
            q = p();
            if (q == null) {
                return 9187343241974906880L;
            }
        } else {
            q = q();
        }
        if (this.u) {
            return j;
        }
        return cll.a(q, j);
    }

    @Override // defpackage.cyz
    public final void b() {
        this.a = null;
        this.e = null;
        this.g = true;
        n(false);
        clc clcVar = this.c;
        if (clcVar != null) {
            clcVar.b(this.b);
            this.d.N(this);
        }
    }

    @Override // defpackage.cyz
    public final void c(ckr ckrVar, cof cofVar) {
        boolean z;
        Canvas a = cjx.a(ckrVar);
        if (a.isHardwareAccelerated()) {
            j();
            if (this.b.b() > brg.a) {
                z = true;
            } else {
                z = false;
            }
            this.v = z;
            cnu cnuVar = this.m.b;
            cnuVar.e(ckrVar);
            ((cnr.AnonymousClass1) cnuVar).b = cofVar;
            coh.a(this.m, this.b);
            return;
        }
        cof cofVar2 = this.b;
        long j = cofVar2.k;
        int a2 = dre.a(j);
        int b = dre.b(j);
        long j2 = this.f;
        long j3 = j2 >> 32;
        long j4 = j2 & 4294967295L;
        float f = a2;
        float f2 = b;
        if (cofVar2.a() < 1.0f) {
            clp clpVar = this.r;
            if (clpVar == null) {
                clpVar = new ckc();
                this.r = clpVar;
            }
            clpVar.i(this.b.a());
            a.saveLayer(f, f2, f + ((int) j3), f2 + ((int) j4), ((ckc) clpVar).a);
        } else {
            ckrVar.l();
        }
        ckrVar.o(f, f2);
        ckrVar.b(q());
        cof cofVar3 = this.b;
        if (cofVar3.n) {
            cln c = cofVar3.c();
            if (c instanceof cln.b) {
                ckrVar.s(((cln.b) c).a);
            } else if (c instanceof cln.c) {
                clr clrVar = this.q;
                if (clrVar == null) {
                    clrVar = new cke((byte[]) null);
                    this.q = clrVar;
                }
                clrVar.k();
                clq.c(clrVar, ((cln.c) c).a);
                ckrVar.r(clrVar);
            } else if (c instanceof cln.a) {
                ckrVar.r(((cln.a) c).a);
            }
        }
        arqv arqvVar = this.a;
        if (arqvVar != null) {
            arqvVar.a(ckrVar, null);
        }
        ckrVar.j();
    }

    @Override // defpackage.cyz
    public final void d(float[] fArr) {
        float[] p = p();
        if (p != null) {
            cll.d(fArr, p);
        }
    }

    @Override // defpackage.cyz
    public final void e(cjl cjlVar, boolean z) {
        float[] q;
        if (z) {
            q = p();
        } else {
            q = q();
        }
        if (!this.u) {
            if (q == null) {
                cjlVar.b(brg.a, brg.a, brg.a, brg.a);
            } else {
                cll.b(q, cjlVar);
            }
        }
    }

    @Override // defpackage.cyz
    public final void f(long j) {
        cof cofVar = this.b;
        if (!a.bB(cofVar.k, j)) {
            cofVar.k = j;
            cofVar.k(j, cofVar.l);
        }
        o();
    }

    @Override // defpackage.cyz
    public final void g(long j) {
        if (!a.bB(j, this.f)) {
            this.f = j;
            invalidate();
        }
    }

    @Override // defpackage.cyz
    public final void h(arqv arqvVar, arqg arqgVar) {
        clc clcVar = this.c;
        if (clcVar != null) {
            if (!this.b.j) {
                csg.b("layer should have been released before reuse");
            }
            this.b = clcVar.a();
            this.g = false;
            this.a = arqvVar;
            this.e = arqgVar;
            this.s = false;
            this.t = false;
            this.u = true;
            cll.c(this.h);
            float[] fArr = this.i;
            if (fArr != null) {
                cll.c(fArr);
            }
            this.o = cmg.a;
            this.v = false;
            this.f = 9223372034707292159L;
            this.p = null;
            this.n = 0;
            return;
        }
        csg.a("currently reuse is only supported when we manage the layer lifecycle");
        throw new armj();
    }

    @Override // defpackage.cyz
    public final void i(float[] fArr) {
        cll.d(fArr, q());
    }

    @Override // defpackage.cyz
    public final void invalidate() {
        if (!this.j && !this.g) {
            this.d.invalidate();
            n(true);
        }
    }

    @Override // defpackage.cyz
    public final void j() {
        if (this.j) {
            if (!a.bB(this.o, cmg.a)) {
                cof cofVar = this.b;
                if (!a.bB(cofVar.l, this.f)) {
                    float a = cmg.a(this.o) * ((int) (this.f >> 32));
                    float b = cmg.b(this.o) * ((int) (this.f & 4294967295L));
                    cofVar.j((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(a) << 32));
                }
            }
            this.b.f(this.k, this.l, this.f, this.w);
            n(false);
        }
    }

    @Override // defpackage.cyz
    public final void k(cly clyVar) {
        int i;
        cln clnVar;
        arqg arqgVar;
        int i2;
        arqg arqgVar2;
        cly clyVar2 = clyVar;
        int i3 = clyVar2.a | this.n;
        this.l = clyVar2.t;
        this.k = clyVar2.s;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            this.o = clyVar2.n;
        }
        if ((i3 & 1) != 0) {
            cof cofVar = this.b;
            float f = clyVar2.b;
            cog cogVar = cofVar.a;
            if (cogVar.f() != f) {
                cogVar.E(f);
            }
        }
        if ((i3 & 2) != 0) {
            cof cofVar2 = this.b;
            float f2 = clyVar2.c;
            cog cogVar2 = cofVar2.a;
            if (cogVar2.g() != f2) {
                cogVar2.F(f2);
            }
        }
        if ((i3 & 4) != 0) {
            this.b.h(clyVar2.d);
        }
        if ((i3 & 8) != 0) {
            cof cofVar3 = this.b;
            float f3 = clyVar2.e;
            cog cogVar3 = cofVar3.a;
            if (cogVar3.i() != f3) {
                cogVar3.I(f3);
            }
        }
        if ((i3 & 16) != 0) {
            cof cofVar4 = this.b;
            float f4 = clyVar2.f;
            cog cogVar4 = cofVar4.a;
            if (cogVar4.j() != f4) {
                cogVar4.J(f4);
            }
        }
        boolean z = true;
        if ((i3 & 32) != 0) {
            cof cofVar5 = this.b;
            float f5 = clyVar2.g;
            cog cogVar5 = cofVar5.a;
            if (cogVar5.h() != f5) {
                cogVar5.G(f5);
                cofVar5.c = true;
                cofVar5.d();
            }
            if (clyVar2.g > brg.a && !this.v && (arqgVar2 = this.e) != null) {
                arqgVar2.a();
            }
        }
        if ((i3 & 64) != 0) {
            cof cofVar6 = this.b;
            long j = clyVar2.h;
            if (!a.bB(j, cofVar6.a.l())) {
                cofVar6.a.t(j);
            }
        }
        if ((i3 & 128) != 0) {
            cof cofVar7 = this.b;
            long j2 = clyVar2.i;
            if (!a.bB(j2, cofVar7.a.m())) {
                cofVar7.a.H(j2);
            }
        }
        if ((i3 & 1024) != 0) {
            cof cofVar8 = this.b;
            float f6 = clyVar2.l;
            cog cogVar6 = cofVar8.a;
            if (cogVar6.e() != f6) {
                cogVar6.D(f6);
            }
        }
        if ((i3 & 256) != 0) {
            cof cofVar9 = this.b;
            float f7 = clyVar2.j;
            cog cogVar7 = cofVar9.a;
            if (cogVar7.c() != f7) {
                cogVar7.B(f7);
            }
        }
        if ((i3 & 512) != 0) {
            cof cofVar10 = this.b;
            float f8 = clyVar2.k;
            cog cogVar8 = cofVar10.a;
            if (cogVar8.d() != f8) {
                cogVar8.C(f8);
            }
        }
        if ((i3 & 2048) != 0) {
            cof cofVar11 = this.b;
            float f9 = clyVar2.m;
            if (cofVar11.a.b() != f9) {
                cofVar11.a.u(f9);
            }
        }
        if (i4 != 0) {
            if (a.bB(this.o, cmg.a)) {
                this.b.j(9205357640488583168L);
            } else {
                cof cofVar12 = this.b;
                float a = cmg.a(this.o) * ((int) (this.f >> 32));
                cofVar12.j((Float.floatToRawIntBits(cmg.b(this.o) * ((int) (this.f & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(a) << 32));
            }
        }
        if ((i3 & 16384) != 0) {
            cof cofVar13 = this.b;
            boolean z2 = clyVar2.p;
            if (cofVar13.n != z2) {
                cofVar13.n = z2;
                cofVar13.c = true;
                cofVar13.d();
            }
        }
        if ((131072 & i3) != 0) {
            cof cofVar14 = this.b;
            clx clxVar = clyVar2.u;
            if (!d.F(cofVar14.a.o(), clxVar)) {
                cofVar14.a.A(clxVar);
            }
        }
        if ((32768 & i3) != 0) {
            cof cofVar15 = this.b;
            int i5 = clyVar2.q;
            if (a.bA(i5, 0)) {
                i2 = 0;
            } else if (a.bA(i5, 1)) {
                i2 = 1;
            } else {
                i2 = 2;
                if (!a.bA(i5, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            cog cogVar9 = cofVar15.a;
            if (!a.bA(cogVar9.k(), i2)) {
                cogVar9.w(i2);
            }
        }
        if ((i3 & 7963) != 0) {
            this.s = true;
            this.t = true;
        }
        if (!d.F(this.p, clyVar2.v)) {
            cln clnVar2 = clyVar2.v;
            this.p = clnVar2;
            if (clnVar2 == null) {
                i = i3;
            } else {
                cof cofVar16 = this.b;
                if (clnVar2 instanceof cln.b) {
                    cln.b bVar = (cln.b) clnVar2;
                    cjp cjpVar = bVar.a;
                    long floatToRawIntBits = Float.floatToRawIntBits(cjpVar.b);
                    long floatToRawIntBits2 = Float.floatToRawIntBits(cjpVar.c);
                    cjp cjpVar2 = bVar.a;
                    i = i3;
                    cofVar16.l((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(cjpVar2.d - cjpVar2.b) << 32) | (Float.floatToRawIntBits(cjpVar2.e - cjpVar2.c) & 4294967295L), brg.a);
                } else {
                    i = i3;
                    if (clnVar2 instanceof cln.a) {
                        cofVar16.i(((cln.a) clnVar2).a);
                    } else if (clnVar2 instanceof cln.c) {
                        cln.c cVar = (cln.c) clnVar2;
                        clr clrVar = cVar.b;
                        if (clrVar != null) {
                            cofVar16.i(clrVar);
                        } else {
                            cjr cjrVar = cVar.a;
                            long floatToRawIntBits3 = Float.floatToRawIntBits(cjrVar.a);
                            float b = cjrVar.b();
                            float a2 = cjrVar.a();
                            long floatToRawIntBits4 = Float.floatToRawIntBits(b);
                            int floatToRawIntBits5 = Float.floatToRawIntBits(a2);
                            clnVar = clnVar2;
                            cofVar16.l((floatToRawIntBits3 << 32) | (Float.floatToRawIntBits(cjrVar.b) & 4294967295L), (floatToRawIntBits4 << 32) | (floatToRawIntBits5 & 4294967295L), Float.intBitsToFloat((int) (cjrVar.h >> 32)));
                            if ((clnVar instanceof cln.a) && Build.VERSION.SDK_INT < 33 && (arqgVar = this.e) != null) {
                                arqgVar.a();
                            }
                            clyVar2 = clyVar;
                            z = true;
                        }
                    }
                }
                clnVar = clnVar2;
                if (clnVar instanceof cln.a) {
                    arqgVar.a();
                }
                clyVar2 = clyVar;
                z = true;
            }
        } else {
            i = i3;
            clyVar2 = clyVar;
            z = false;
        }
        this.n = clyVar2.a;
        if (i == 0 && !z) {
            return;
        }
        o();
    }

    @Override // defpackage.cyz
    public final boolean l(long j) {
        int i = (int) (4294967295L & j);
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        cof cofVar = this.b;
        if (cofVar.n) {
            return ddy.a(cofVar.c(), intBitsToFloat, intBitsToFloat2);
        }
        return true;
    }

    @Override // defpackage.cyz
    public final float[] m() {
        return q();
    }
}
