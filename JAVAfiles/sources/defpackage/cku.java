package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cku {
    public static final long a = ckw.d(4278190080L);
    public static final long b = ckw.d(4282664004L);
    public static final long c = ckw.d(4287137928L);
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public final long i;

    static {
        ckw.d(4291611852L);
        d = ckw.d(4294967295L);
        e = ckw.d(4294901760L);
        ckw.d(4278255360L);
        f = ckw.d(4278190335L);
        ckw.d(4294967040L);
        ckw.d(4278255615L);
        ckw.d(4294902015L);
        g = ckw.c(0);
        float[] fArr = cms.a;
        h = ckw.f(brg.a, brg.a, brg.a, brg.a, cms.u);
    }

    public /* synthetic */ cku(long j) {
        this.i = j;
    }

    public static final float a(long j) {
        float N;
        float f2;
        if ((63 & j) == 0) {
            N = (float) aqil.N(j >>> 56);
            f2 = 255.0f;
        } else {
            N = (float) aqil.N((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return N / f2;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) aqil.N((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 == 0) {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - clb.a;
                if (i5 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) aqil.N((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 == 0) {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - clb.a;
                if (i5 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) aqil.N(j3 & 255)) / 255.0f;
        }
        short s = (short) j3;
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 == 0) {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - clb.a;
                if (i5 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final long e(long j, cmk cmkVar) {
        cmu cmuVar;
        cmk f2 = f(j);
        int i = f2.c;
        int i2 = cmkVar.c;
        if ((i | i2) < 0) {
            cmuVar = cml.j(f2, cmkVar);
        } else {
            int i3 = i | (i2 << 6);
            tx txVar = cmv.a;
            Object a2 = txVar.a(i3);
            if (a2 == null) {
                a2 = cml.j(f2, cmkVar);
                txVar.f(i3, a2);
            }
            cmuVar = (cmu) a2;
        }
        return cmuVar.a(j);
    }

    public static final cmk f(long j) {
        float[] fArr = cms.a;
        return cms.y[(int) (j & 63)];
    }

    public static String g(long j) {
        return "Color(" + d(j) + ", " + c(j) + ", " + b(j) + ", " + a(j) + ", " + f(j).a + ')';
    }

    public static /* synthetic */ long h(long j, float f2) {
        return ckw.f(d(j), c(j), b(j), f2, f(j));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cku) && this.i == ((cku) obj).i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.i);
    }

    public final String toString() {
        return g(this.i);
    }
}
