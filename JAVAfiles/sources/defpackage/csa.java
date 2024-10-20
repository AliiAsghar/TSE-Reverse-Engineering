package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csa {
    private final a a;
    private final int b;
    private final cry[] c;
    private int d;
    private final float[] e;
    private final float[] f;
    private final float[] g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final a a;
        public static final a b;
        private static final /* synthetic */ a[] c;

        static {
            a aVar = new a("Lsq2", 0);
            a = aVar;
            a aVar2 = new a("Impulse", 1);
            b = aVar2;
            a[] aVarArr = {aVar, aVar2};
            c = aVarArr;
            arhi.f(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public csa() {
        this(null, 3);
    }

    public final float a(float f) {
        float f2;
        float f3;
        float a2;
        float f4 = brg.a;
        if (f <= brg.a) {
            csg.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float[] fArr = this.e;
        float[] fArr2 = this.f;
        int i = this.d;
        cry cryVar = this.c[i];
        if (cryVar == null) {
            f2 = 0.0f;
        } else {
            cry cryVar2 = cryVar;
            int i2 = 0;
            do {
                cry cryVar3 = this.c[i];
                if (cryVar3 == null) {
                    break;
                }
                long j = cryVar.a;
                long j2 = cryVar3.a;
                long j3 = j - j2;
                float abs = (float) Math.abs(j2 - cryVar2.a);
                if (this.a != a.a) {
                    cryVar2 = cryVar;
                } else {
                    cryVar2 = cryVar3;
                }
                float f5 = (float) j3;
                if (f5 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = cryVar3.b;
                fArr2[i2] = -f5;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
            } while (i2 < 20);
            if (i2 >= this.b) {
                a aVar = this.a;
                a aVar2 = a.a;
                int ordinal = aVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        int i3 = i2 - 1;
                        float f6 = fArr2[i3];
                        float f7 = 0.0f;
                        int i4 = i3;
                        while (i4 > 0) {
                            int i5 = i4 - 1;
                            float f8 = fArr2[i5];
                            if (f6 != f8) {
                                float signum = Math.signum(f7);
                                float abs2 = Math.abs(f7);
                                float f9 = (fArr[i4] - fArr[i5]) / (f6 - f8);
                                f7 += (f9 - (signum * ((float) Math.sqrt(abs2 + abs2)))) * Math.abs(f9);
                                if (i4 == i3) {
                                    f7 *= 0.5f;
                                }
                            }
                            i4 = i5;
                            f6 = f8;
                        }
                        float signum2 = Math.signum(f7);
                        float abs3 = Math.abs(f7);
                        f3 = signum2 * ((float) Math.sqrt(abs3 + abs3));
                    } else {
                        throw new armm();
                    }
                } else {
                    try {
                        float[] fArr3 = this.g;
                        int i6 = 2;
                        if (i2 <= 2) {
                            i6 = 1;
                        }
                        int i7 = i6 + 1;
                        float[][] fArr4 = new float[i7];
                        for (int i8 = 0; i8 < i7; i8++) {
                            fArr4[i8] = new float[i2];
                        }
                        for (int i9 = 0; i9 < i2; i9++) {
                            fArr4[0][i9] = 1.0f;
                            for (int i10 = 1; i10 < i7; i10++) {
                                fArr4[i10][i9] = fArr4[i10 - 1][i9] * fArr2[i9];
                            }
                        }
                        float[][] fArr5 = new float[i7];
                        for (int i11 = 0; i11 < i7; i11++) {
                            fArr5[i11] = new float[i2];
                        }
                        float[][] fArr6 = new float[i7];
                        for (int i12 = 0; i12 < i7; i12++) {
                            fArr6[i12] = new float[i7];
                        }
                        for (int i13 = 0; i13 < i7; i13++) {
                            float[] fArr7 = fArr5[i13];
                            aqil.w(fArr4[i13], fArr7, i2);
                            for (int i14 = 0; i14 < i13; i14++) {
                                float[] fArr8 = fArr5[i14];
                                float a3 = csc.a(fArr7, fArr8);
                                for (int i15 = 0; i15 < i2; i15++) {
                                    fArr7[i15] = fArr7[i15] - (fArr8[i15] * a3);
                                }
                            }
                            float sqrt = (float) Math.sqrt(csc.a(fArr7, fArr7));
                            if (sqrt < 1.0E-6f) {
                                sqrt = 1.0E-6f;
                            }
                            float f10 = 1.0f / sqrt;
                            for (int i16 = 0; i16 < i2; i16++) {
                                fArr7[i16] = fArr7[i16] * f10;
                            }
                            float[] fArr9 = fArr6[i13];
                            for (int i17 = 0; i17 < i7; i17++) {
                                if (i17 < i13) {
                                    a2 = brg.a;
                                } else {
                                    a2 = csc.a(fArr7, fArr4[i17]);
                                }
                                fArr9[i17] = a2;
                            }
                        }
                        for (int i18 = i6; i18 >= 0; i18--) {
                            float a4 = csc.a(fArr5[i18], fArr);
                            float[] fArr10 = fArr6[i18];
                            int i19 = i18 + 1;
                            if (i19 <= i6) {
                                int i20 = i6;
                                while (true) {
                                    a4 -= fArr10[i20] * fArr3[i20];
                                    if (i20 != i19) {
                                        i20--;
                                    }
                                }
                            }
                            fArr3[i18] = a4 / fArr10[i18];
                        }
                        f3 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f3 = brg.a;
                    }
                }
                f2 = f3 * 1000.0f;
                f4 = brg.a;
            } else {
                f4 = brg.a;
                f2 = brg.a;
            }
        }
        if (f2 != f4 && !Float.isNaN(f2)) {
            if (f2 > f4) {
                return arrn.p(f2, f);
            }
            return arrn.o(f2, -f);
        }
        return f4;
    }

    public final void b(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        cry[] cryVarArr = this.c;
        cry cryVar = cryVarArr[i];
        if (cryVar == null) {
            cryVarArr[i] = new cry(j, f);
        } else {
            cryVar.a = j;
            cryVar.b = f;
        }
    }

    public final void c() {
        aqil.d(r0, null, 0, this.c.length);
        this.d = 0;
    }

    public /* synthetic */ csa(a aVar, int i) {
        int i2 = 2;
        aVar = (i & 2) != 0 ? a.a : aVar;
        this.a = aVar;
        a aVar2 = a.a;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            i2 = 3;
        } else if (ordinal != 1) {
            throw new armm();
        }
        this.b = i2;
        this.c = new cry[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }
}
