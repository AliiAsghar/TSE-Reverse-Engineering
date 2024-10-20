package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esv {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public short[] f;
    public int g;
    public short[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public double r;
    private final int s;
    private final int t;
    private final int u;
    private final short[] v;
    private short[] w;

    public esv(int i, int i2, float f, float f2, int i3) {
        this.s = i;
        this.a = i2;
        this.b = f;
        this.c = f2;
        this.d = i / i3;
        this.t = i / 400;
        int i4 = i / 65;
        this.u = i4;
        int i5 = i4 + i4;
        this.e = i5;
        this.v = new short[i5];
        int i6 = i5 * i2;
        this.f = new short[i6];
        this.h = new short[i6];
        this.w = new short[i6];
    }

    private final int e(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.a * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.p = i4 / i6;
        this.q = i7 / i5;
        return i6;
    }

    private final void f(short[] sArr, int i, int i2) {
        short[] d = d(this.h, this.i, i2);
        this.h = d;
        int i3 = this.i;
        int i4 = this.a;
        System.arraycopy(sArr, i * i4, d, i3 * i4, i2 * i4);
        this.i += i2;
    }

    private final void g(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.e / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.a;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.v[i4] = (short) (i6 / i3);
        }
    }

    private static void h(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int a() {
        int i = this.i * this.a;
        return i + i;
    }

    public final int b() {
        int i = this.g * this.a;
        return i + i;
    }

    public final void c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j;
        long j2;
        boolean z;
        double d = this.b / this.c;
        int i10 = this.i;
        int i11 = 0;
        int i12 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            f(this.f, 0, this.g);
            this.g = 0;
        } else {
            int i13 = this.g;
            if (i13 >= this.e) {
                int i14 = 0;
                while (true) {
                    int i15 = this.m;
                    if (i15 > 0) {
                        int min = Math.min(this.e, i15);
                        f(this.f, i14, min);
                        this.m -= min;
                        i14 += min;
                    } else {
                        short[] sArr = this.f;
                        int i16 = this.s;
                        if (i16 > 4000) {
                            i = i16 / 4000;
                        } else {
                            i = i12;
                        }
                        if (this.a == i12 && i == i12) {
                            i2 = e(sArr, i14, this.t, this.u);
                        } else {
                            g(sArr, i14, i);
                            int e = e(this.v, i11, this.t / i, this.u / i);
                            if (i != i12) {
                                int i17 = e * i;
                                int i18 = i * 4;
                                int i19 = this.t;
                                int i20 = i17 - i18;
                                if (i20 >= i19) {
                                    i19 = i20;
                                }
                                int i21 = i17 + i18;
                                int i22 = this.u;
                                if (i21 > i22) {
                                    i21 = i22;
                                }
                                if (this.a == i12) {
                                    i2 = e(sArr, i14, i19, i21);
                                } else {
                                    g(sArr, i14, i12);
                                    i2 = e(this.v, i11, i19, i21);
                                }
                            } else {
                                i2 = e;
                            }
                        }
                        int i23 = this.p;
                        int i24 = this.q;
                        if (i23 != 0 && (i6 = this.n) != 0 && i24 <= i23 * 3 && i23 + i23 > this.o * 3) {
                            i3 = i6;
                        } else {
                            i3 = i2;
                        }
                        int i25 = i14 + i3;
                        this.o = i23;
                        this.n = i2;
                        double d2 = i3;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f;
                            double d3 = (-1.0d) + d;
                            if (d >= 2.0d) {
                                double d4 = (d2 / d3) + this.r;
                                int round = (int) Math.round(d4);
                                this.r = d4 - round;
                                i5 = round;
                            } else {
                                double d5 = ((d2 * (2.0d - d)) / d3) + this.r;
                                int round2 = (int) Math.round(d5);
                                this.m = round2;
                                this.r = d5 - round2;
                                i5 = i3;
                            }
                            short[] d6 = d(this.h, this.i, i5);
                            this.h = d6;
                            h(i5, this.a, d6, this.i, sArr2, i14, sArr2, i25);
                            this.i += i5;
                            i14 += i3 + i5;
                        } else {
                            int i26 = i3;
                            short[] sArr3 = this.f;
                            double d7 = 1.0d - d;
                            if (d < 0.5d) {
                                double d8 = ((d2 * d) / d7) + this.r;
                                int round3 = (int) Math.round(d8);
                                this.r = d8 - round3;
                                i4 = round3;
                            } else {
                                double d9 = ((d2 * ((d + d) - 1.0d)) / d7) + this.r;
                                int round4 = (int) Math.round(d9);
                                this.m = round4;
                                this.r = d9 - round4;
                                i4 = i26;
                            }
                            int i27 = i26 + i4;
                            short[] d10 = d(this.h, this.i, i27);
                            this.h = d10;
                            int i28 = this.a;
                            System.arraycopy(sArr3, i14 * i28, d10, this.i * i28, i28 * i26);
                            h(i4, this.a, this.h, this.i + i26, sArr3, i25, sArr3, i14);
                            this.i += i27;
                            i14 += i4;
                        }
                    }
                    if (this.e + i14 > i13) {
                        break;
                    }
                    i11 = 0;
                    i12 = 1;
                }
                int i29 = this.g - i14;
                short[] sArr4 = this.f;
                int i30 = this.a;
                System.arraycopy(sArr4, i14 * i30, sArr4, 0, i30 * i29);
                this.g = i29;
            }
        }
        float f = this.d * this.c;
        if (f != 1.0f && this.i != i10) {
            int i31 = this.s;
            float f2 = i31 / f;
            long j3 = i31;
            long j4 = f2;
            while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                j4 /= 2;
                j3 /= 2;
            }
            int i32 = this.i - i10;
            short[] d11 = d(this.w, this.j, i32);
            this.w = d11;
            short[] sArr5 = this.h;
            int i33 = this.a;
            System.arraycopy(sArr5, i10 * i33, d11, this.j * i33, i33 * i32);
            this.i = i10;
            this.j += i32;
            int i34 = 0;
            while (true) {
                i7 = this.j;
                i8 = i7 - 1;
                if (i34 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.k + 1;
                    j = i9;
                    long j5 = j * j4;
                    j2 = this.l;
                    if (j5 <= j2 * j3) {
                        break;
                    }
                    this.h = d(this.h, this.i, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.a;
                        if (i35 < i36) {
                            short[] sArr6 = this.h;
                            int i37 = this.i * i36;
                            short[] sArr7 = this.w;
                            int i38 = (i34 * i36) + i35;
                            short s = sArr7[i38];
                            short s2 = sArr7[i38 + i36];
                            long j6 = this.l * j3;
                            long j7 = j3;
                            long j8 = (r13 + 1) * j4;
                            long j9 = j8 - (this.k * j4);
                            long j10 = j8 - j6;
                            sArr6[i37 + i35] = (short) (((j10 * s) + ((j9 - j10) * s2)) / j9);
                            i35++;
                            j3 = j7;
                            j4 = j4;
                        }
                    }
                    this.l++;
                    this.i++;
                    j3 = j3;
                    j4 = j4;
                }
                long j11 = j3;
                long j12 = j4;
                this.k = i9;
                if (j == j11) {
                    this.k = 0;
                    if (j2 == j12) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dzg.d(z);
                    this.l = 0;
                }
                i34++;
                j3 = j11;
                j4 = j12;
            }
            if (i8 != 0) {
                short[] sArr8 = this.w;
                int i39 = this.a;
                System.arraycopy(sArr8, i8 * i39, sArr8, 0, (i7 - i8) * i39);
                this.j -= i8;
            }
        }
    }

    public final short[] d(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.a;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
