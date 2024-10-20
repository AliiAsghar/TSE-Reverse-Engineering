package defpackage;

import defpackage.cxt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhq {
    private boolean b;
    private boolean c;
    private final dhp a = new dhp();
    private final ux e = new ux((byte[]) null);
    private final cjl d = new cjl();

    private final void f(cxn cxnVar, long j, boolean z) {
        int i;
        cyn y = cxnVar.y();
        cxt.b w = cxnVar.w();
        int u = w.u();
        int t = w.t();
        int a = dre.a(j) + u;
        int b = dre.b(j) + t;
        int b2 = dre.b(j);
        int a2 = dre.a(j);
        cjl cjlVar = this.d;
        cjlVar.b(a2, b2, a, b);
        while (y != null) {
            cyz cyzVar = y.C;
            long j2 = y.x;
            int a3 = dre.a(j2);
            int b3 = dre.b(j2);
            long floatToRawIntBits = (Float.floatToRawIntBits(a3) << 32) | (Float.floatToRawIntBits(b3) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            cjlVar.a += intBitsToFloat;
            cjlVar.b += intBitsToFloat2;
            cjlVar.c += intBitsToFloat;
            cjlVar.d += intBitsToFloat2;
            y = y.v;
            if (cyzVar != null) {
                float[] m = cyzVar.m();
                if (!clm.a(m)) {
                    cll.b(m, cjlVar);
                }
            }
        }
        int i2 = (int) cjlVar.a;
        int i3 = (int) cjlVar.b;
        int i4 = (int) cjlVar.c;
        int i5 = (int) cjlVar.d;
        int i6 = cxnVar.d;
        if (!z) {
            dhp dhpVar = this.a;
            int i7 = i6 & 67108863;
            long[] jArr = dhpVar.a;
            int i8 = dhpVar.c;
            for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
                if ((((int) jArr[i9 + 2]) & 67108863) == i7) {
                    jArr[i9] = (i2 << 32) | (i3 & 4294967295L);
                    jArr[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
                    break;
                }
            }
        }
        cxn t2 = cxnVar.t();
        if (t2 != null) {
            i = t2.d;
        } else {
            i = -1;
        }
        dhp.a(this.a, i6, i2, i3, i4, i5, i);
        b();
    }

    private final void g(cxn cxnVar) {
        cbh o = cxnVar.o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar2 = (cxn) objArr[i2];
                f(cxnVar2, cxnVar2.y().x, false);
                g(cxnVar2);
                i2++;
            } while (i2 < i);
        }
    }

    private static final long h(cxn cxnVar) {
        float[] m;
        int a;
        cyn y = cxnVar.y();
        cyn x = cxnVar.x();
        long j = 0;
        while (x != null && x != y) {
            cyz cyzVar = x.C;
            j = drf.b(j, x.x);
            x = x.v;
            if (cyzVar != null && (a = dhr.a((m = cyzVar.m()))) != 3) {
                if ((a & 2) == 0) {
                    return 9223372034707292159L;
                }
                j = cll.a(m, j);
            }
        }
        return drf.c(j);
    }

    public final void a() {
        if (this.b) {
            this.b = false;
            if (this.c) {
                this.c = false;
                dhp dhpVar = this.a;
                long[] jArr = dhpVar.a;
                int i = dhpVar.c;
                long[] jArr2 = dhpVar.b;
                int i2 = 0;
                for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
                    int i4 = i3 + 2;
                    if (jArr[i4] != 4611686018427387903L) {
                        jArr2[i2] = jArr[i3];
                        jArr2[i2 + 1] = jArr[i3 + 1];
                        jArr2[i2 + 2] = jArr[i4];
                        i2 += 3;
                    }
                }
                dhpVar.c = i2;
                dhpVar.a = jArr2;
                dhpVar.b = jArr;
            }
            ux uxVar = this.e;
            Object[] objArr = uxVar.a;
            int i5 = uxVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                ((arqg) objArr[i6]).a();
            }
        }
    }

    public final void b() {
        this.b = true;
    }

    public final void c(cxn cxnVar) {
        long h = h(cxnVar);
        if (dhr.b(h)) {
            cxnVar.g = h;
            cxnVar.ay();
            cbh o = cxnVar.o();
            int i = o.b;
            if (i > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar2 = (cxn) objArr[i2];
                    d(cxnVar2, cxnVar2.y().x, false);
                    i2++;
                } while (i2 < i);
                return;
            }
            return;
        }
        g(cxnVar);
    }

    public final void d(cxn cxnVar, long j, boolean z) {
        long j2;
        long j3;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        char c;
        int i4;
        long[] jArr;
        long j4;
        float[] m;
        int a;
        cxt.b w = cxnVar.w();
        int u = w.u();
        int t = w.t();
        cxn t2 = cxnVar.t();
        long j5 = cxnVar.e;
        long j6 = cxnVar.f;
        long j7 = j6 >> 32;
        long j8 = j6 & 4294967295L;
        int i5 = 1;
        if (t2 != null) {
            boolean z5 = t2.h;
            long j9 = t2.e;
            boolean b = dhr.b(j9);
            j2 = j7;
            long j10 = t2.g;
            if (b) {
                if (z5) {
                    j10 = h(t2);
                    t2.g = j10;
                    t2.ay();
                }
                z2 = !dhr.b(j10);
                j3 = dre.d(dre.d(j9, j10), j);
                if (z2 && dhr.b(j3)) {
                    cxnVar.e = j3;
                    cxnVar.f = (u << 32) | (t & 4294967295L);
                    int a2 = dre.a(j3);
                    int b2 = dre.b(j3);
                    int i6 = a2 + u;
                    int i7 = b2 + t;
                    if (!z && a.bB(j3, j5) && ((int) j2) == u && ((int) j8) == t) {
                        return;
                    }
                    int i8 = cxnVar.d;
                    if (!z) {
                        dhp dhpVar = this.a;
                        int i9 = 67108863;
                        int i10 = i8 & 67108863;
                        long[] jArr2 = dhpVar.a;
                        int i11 = dhpVar.c;
                        int i12 = 0;
                        while (i12 < jArr2.length - 2 && i12 < i11) {
                            long j11 = jArr2[i12 + 2];
                            if ((((int) j11) & i9) == i10) {
                                long j12 = jArr2[i12];
                                int i13 = i12;
                                jArr2[i13] = (a2 << 32) | (b2 & 4294967295L);
                                jArr2[i13 + 1] = (i6 << 32) | (i7 & 4294967295L);
                                int i14 = b2 - ((int) j12);
                                if (a2 - ((int) (j12 >> 32)) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i14 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z3 | z4) {
                                    long j13 = -4503599560261633L;
                                    int i15 = (i13 + 3) & 67108863;
                                    long[] jArr3 = dhpVar.a;
                                    long[] jArr4 = dhpVar.b;
                                    int i16 = dhpVar.c / 3;
                                    char c2 = 26;
                                    jArr4[0] = (j11 & (-4503599560261633L)) | (i15 << 26);
                                    while (i5 > 0) {
                                        i5--;
                                        long j14 = jArr4[i5];
                                        int i17 = ((int) j14) & 67108863;
                                        int i18 = ((int) (j14 >> c2)) & 67108863;
                                        int i19 = ((int) (j14 >> 52)) & 1023;
                                        if (i19 == 1023) {
                                            i2 = i16;
                                        } else {
                                            i2 = i19 + i18;
                                        }
                                        while (i18 < jArr3.length - 2 && i18 < i2) {
                                            int i20 = i18 + 3;
                                            long j15 = jArr3[i18 + 2];
                                            if ((((int) (j15 >> c2)) & 67108863) == i17) {
                                                long j16 = jArr3[i18];
                                                int i21 = i18 + 1;
                                                i4 = i2;
                                                long j17 = jArr3[i21];
                                                jArr = jArr3;
                                                jArr[i18] = ((((int) j16) + i14) & 4294967295L) | ((((int) (j16 >> 32)) + r4) << 32);
                                                jArr[i21] = ((((int) j17) + i14) & 4294967295L) | ((((int) (j17 >> 32)) + r4) << 32);
                                                if ((((int) (j15 >> 52)) & 1023) > 0) {
                                                    j4 = -4503599560261633L;
                                                    i3 = i16;
                                                    c = 26;
                                                    jArr4[i5] = ((i20 & 67108863) << 26) | (j15 & (-4503599560261633L));
                                                    i5++;
                                                } else {
                                                    i3 = i16;
                                                    j4 = -4503599560261633L;
                                                    c = 26;
                                                }
                                            } else {
                                                i3 = i16;
                                                c = c2;
                                                i4 = i2;
                                                jArr = jArr3;
                                                j4 = -4503599560261633L;
                                            }
                                            i16 = i3;
                                            j13 = j4;
                                            c2 = c;
                                            i18 = i20;
                                            i2 = i4;
                                            jArr3 = jArr;
                                        }
                                        i16 = i16;
                                        j13 = j13;
                                        c2 = c2;
                                        jArr3 = jArr3;
                                    }
                                }
                                b();
                                return;
                            }
                            i12 += 3;
                            i9 = i9;
                        }
                    }
                    cxn t3 = cxnVar.t();
                    if (t3 != null) {
                        i = t3.d;
                    } else {
                        i = -1;
                    }
                    dhp.a(this.a, i8, a2, b2, i6, i7, i);
                    b();
                    return;
                }
                f(cxnVar, j, z);
            }
            cyn y = cxnVar.y();
            long j18 = 0;
            while (true) {
                if (y != null) {
                    cyz cyzVar = y.C;
                    j18 = drf.b(j18, y.x);
                    y = y.v;
                    if (cyzVar != null && (a = dhr.a((m = cyzVar.m()))) != 3) {
                        if ((a & 2) == 0) {
                            j3 = 9223372034707292159L;
                            break;
                        }
                        j18 = cll.a(m, j18);
                    }
                } else {
                    j3 = drf.c(j18);
                    break;
                }
            }
        } else {
            j2 = j7;
            j3 = j;
        }
        z2 = false;
        if (z2) {
        }
        f(cxnVar, j, z);
    }

    public final void e(cxn cxnVar) {
        int i = cxnVar.d & 67108863;
        dhp dhpVar = this.a;
        long[] jArr = dhpVar.a;
        int i2 = dhpVar.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 4611686018427387903L;
                break;
            }
            i3 += 3;
        }
        b();
        this.c = true;
    }
}
