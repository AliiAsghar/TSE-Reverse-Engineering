package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnn extends cmk {
    private static final cmw q = new cmw() { // from class: cnc
        @Override // defpackage.cmw
        public final double a(double d) {
            return d;
        }
    };
    public final cnp d;
    public final float e;
    public final float f;
    public final cno g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final cmw k;
    public final arqr l;
    public final cmw m;
    public final cmw n;
    public final arqr o;
    public final cmw p;
    private final boolean r;

    /* compiled from: PG */
    /* renamed from: cnn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Double, Double> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            return Double.valueOf(cnn.this.n.a(arrn.n(doubleValue, r8.e, r8.f)));
        }
    }

    /* compiled from: PG */
    /* renamed from: cnn$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Double, Double> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            double a = cnn.this.k.a(((Number) obj).doubleValue());
            cnn cnnVar = cnn.this;
            return Double.valueOf(arrn.n(a, cnnVar.e, cnnVar.f));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final float a(float[] fArr) {
            int length = fArr.length;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < brg.a) {
                return -f7;
            }
            return f7;
        }

        public static final boolean b(double d, cmw cmwVar, cmw cmwVar2) {
            if (Math.abs(cmwVar.a(d) - cmwVar2.a(d)) <= 0.001d) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cnn(java.lang.String r16, float[] r17, defpackage.cnp r18, final double r19, float r21, float r22, int r23) {
        /*
            r15 = this;
            r1 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lb
            cmw r3 = defpackage.cnn.q
            goto L10
        Lb:
            cnd r3 = new cnd
            r3.<init>()
        L10:
            r11 = r3
            if (r0 != 0) goto L16
            cmw r0 = defpackage.cnn.q
            goto L1b
        L16:
            cne r0 = new cne
            r0.<init>()
        L1b:
            r12 = r0
            cno r13 = new cno
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r13
            r1 = r19
            r0.<init>(r1, r3, r5, r7, r9)
            r8 = 0
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r11
            r10 = r12
            r11 = r21
            r12 = r22
            r14 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnn.<init>(java.lang.String, float[], cnp, double, float, float, int):void");
    }

    @Override // defpackage.cmk
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.cmk
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.cmk
    public final float c(float f, float f2, float f3) {
        float a2 = (float) this.p.a(f);
        float a3 = (float) this.p.a(f2);
        float a4 = (float) this.p.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * a2) + (fArr[5] * a3) + (fArr[8] * a4);
    }

    @Override // defpackage.cmk
    public final long d(float f, float f2, float f3) {
        float a2 = (float) this.p.a(f);
        float a3 = (float) this.p.a(f2);
        float a4 = (float) this.p.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * a2;
        float f5 = fArr[3] * a3;
        float f6 = fArr[6] * a4;
        float f7 = fArr[1] * a2;
        float f8 = fArr[4] * a3;
        float f9 = fArr[7] * a4;
        return (Float.floatToRawIntBits(f7 + f8 + f9) & 4294967295L) | (Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.cmk
    public final long e(float f, float f2, float f3, float f4, cmk cmkVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        return ckw.f((float) this.m.a(f5 + f6 + f7), (float) this.m.a(f8 + f9 + f10), (float) this.m.a(f11 + f12 + (fArr[8] * f3)), f4, cmkVar);
    }

    @Override // defpackage.cmk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        cnn cnnVar = (cnn) obj;
        if (Float.compare(cnnVar.e, this.e) != 0 || Float.compare(cnnVar.f, this.f) != 0 || !d.F(this.d, cnnVar.d) || !Arrays.equals(this.h, cnnVar.h)) {
            return false;
        }
        cno cnoVar = this.g;
        if (cnoVar != null) {
            return d.F(cnoVar, cnnVar.g);
        }
        if (cnnVar.g == null) {
            return true;
        }
        if (!d.F(this.k, cnnVar.k)) {
            return false;
        }
        return d.F(this.n, cnnVar.n);
    }

    @Override // defpackage.cmk
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.cmk
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int i = 0;
        if (f == brg.a) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = ((hashCode * 31) + floatToIntBits) * 31;
        float f2 = this.f;
        if (f2 == brg.a) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        cno cnoVar = this.g;
        if (cnoVar != null) {
            i = cnoVar.hashCode();
        }
        int i4 = i3 + i;
        if (this.g == null) {
            return (((i4 * 31) + this.k.hashCode()) * 31) + this.n.hashCode();
        }
        return i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cnn(java.lang.String r12, float[] r13, defpackage.cnp r14, final defpackage.cno r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            boolean r0 = r15.a()
            r1 = 0
            if (r0 == 0) goto L10
            cnj r0 = new cnj
            r0.<init>()
        Le:
            r5 = r0
            goto L34
        L10:
            boolean r0 = r15.b()
            if (r0 == 0) goto L1c
            cnk r0 = new cnk
            r0.<init>()
            goto Le
        L1c:
            double r3 = r9.f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            double r3 = r9.g
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
            cnl r0 = new cnl
            r0.<init>()
            goto Le
        L2e:
            cnm r0 = new cnm
            r0.<init>()
            goto Le
        L34:
            boolean r0 = r15.a()
            if (r0 == 0) goto L41
            cnf r0 = new cnf
            r0.<init>()
        L3f:
            r6 = r0
            goto L65
        L41:
            boolean r0 = r15.b()
            if (r0 == 0) goto L4d
            cng r0 = new cng
            r0.<init>()
            goto L3f
        L4d:
            double r3 = r9.f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5f
            double r3 = r9.g
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5f
            cnh r0 = new cnh
            r0.<init>()
            goto L3f
        L5f:
            cni r0 = new cni
            r0.<init>()
            goto L3f
        L65:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnn.<init>(java.lang.String, float[], cnp, cno, int):void");
    }

    public cnn(String str, float[] fArr, cnp cnpVar, float[] fArr2, cmw cmwVar, cmw cmwVar2, float f, float f2, cno cnoVar, int i) {
        super(str, 12884901888L, i);
        this.d = cnpVar;
        this.e = f;
        this.f = f2;
        this.g = cnoVar;
        this.k = cmwVar;
        this.l = new AnonymousClass2();
        this.m = new cmw() { // from class: cna
            @Override // defpackage.cmw
            public final double a(double d) {
                return arrn.n(cnn.this.k.a(d), r0.e, r0.f);
            }
        };
        this.n = cmwVar2;
        this.o = new AnonymousClass1();
        this.p = new cmw() { // from class: cnb
            @Override // defpackage.cmw
            public final double a(double d) {
                return cnn.this.n.a(arrn.n(d, r0.e, r0.f));
            }
        };
        int length = fArr.length;
        if (f < f2) {
            float[] fArr3 = new float[6];
            aqil.w(fArr, fArr3, 6);
            this.h = fArr3;
            boolean z = true;
            if (fArr2 == null) {
                float f3 = fArr3[0];
                float f4 = fArr3[1];
                float f5 = fArr3[2];
                float f6 = fArr3[3];
                float f7 = fArr3[4];
                float f8 = fArr3[5];
                float f9 = cnpVar.a;
                float f10 = cnpVar.b;
                float f11 = 1.0f - f3;
                float f12 = f11 / f4;
                float f13 = 1.0f - f5;
                float f14 = 1.0f - f7;
                float f15 = (1.0f - f9) / f10;
                float f16 = f3 / f4;
                float f17 = (f7 / f8) - f16;
                float f18 = (f5 / f6) - f16;
                float f19 = (f9 / f10) - f16;
                float f20 = (f13 / f6) - f12;
                float f21 = (((f15 - f12) * f18) - (f20 * f19)) / ((((f14 / f8) - f12) * f18) - (f17 * f20));
                float f22 = (f19 - (f17 * f21)) / f18;
                float f23 = (1.0f - f22) - f21;
                float f24 = f23 / f4;
                float f25 = f22 / f6;
                float f26 = f21 / f8;
                this.i = new float[]{f3 * f24, f23, f24 * (f11 - f4), f5 * f25, f22, f25 * (f13 - f6), f7 * f26, f21, f26 * (f14 - f8)};
            } else {
                this.i = fArr2;
            }
            this.j = cml.e(this.i);
            float a2 = a.a(fArr3);
            float[] fArr4 = cms.a;
            if (a2 / a.a(cms.b) > 0.9f) {
                float f27 = fArr3[0];
                float f28 = fArr3[1];
                float f29 = fArr3[2];
                float f30 = fArr3[3];
                float f31 = fArr3[4];
                float f32 = fArr3[5];
            }
            if (i != 0) {
                float[] fArr5 = cms.a;
                if (fArr3 != fArr5) {
                    for (int i2 = 0; i2 < 6; i2++) {
                        if (Float.compare(fArr3[i2], fArr5[i2]) != 0 && Math.abs(fArr3[i2] - fArr5[i2]) > 0.001f) {
                            break;
                        }
                    }
                }
                cnp cnpVar2 = cmx.a;
                if (cml.c(cnpVar, cmx.d) && f == brg.a && f2 == 1.0f) {
                    cnn cnnVar = cms.e;
                    for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (a.b(d, cmwVar, cnnVar.k) && a.b(d, cmwVar2, cnnVar.n)) {
                        }
                    }
                }
                z = false;
            }
            this.r = z;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }
}
