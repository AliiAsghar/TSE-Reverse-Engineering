package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjp {
    public static final cjp a = new cjp(brg.a, brg.a, brg.a, brg.a);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public cjp(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public static /* synthetic */ cjp i(cjp cjpVar, float f, float f2, float f3, int i) {
        float f4;
        if ((i & 1) != 0) {
            f = cjpVar.b;
        }
        if ((i & 2) != 0) {
            f4 = cjpVar.c;
        } else {
            f4 = brg.a;
        }
        if ((i & 4) != 0) {
            f2 = cjpVar.d;
        }
        if ((i & 8) != 0) {
            f3 = cjpVar.e;
        }
        return new cjp(f, f4, f2, f3);
    }

    public final long a() {
        float f = this.d;
        float f2 = this.b;
        long floatToRawIntBits = Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (floatToRawIntBits << 32) | (Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f)) & 4294967295L);
    }

    public final long b() {
        return (Float.floatToRawIntBits(this.d - this.b) << 32) | (Float.floatToRawIntBits(this.e - this.c) & 4294967295L);
    }

    public final long c() {
        return (Float.floatToRawIntBits(this.b) << 32) | (Float.floatToRawIntBits(this.c) & 4294967295L);
    }

    public final cjp d(cjp cjpVar) {
        return new cjp(Math.max(this.b, cjpVar.b), Math.max(this.c, cjpVar.c), Math.min(this.d, cjpVar.d), Math.min(this.e, cjpVar.e));
    }

    public final cjp e(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new cjp(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjp)) {
            return false;
        }
        cjp cjpVar = (cjp) obj;
        if (Float.compare(this.b, cjpVar.b) == 0 && Float.compare(this.c, cjpVar.c) == 0 && Float.compare(this.d, cjpVar.d) == 0 && Float.compare(this.e, cjpVar.e) == 0) {
            return true;
        }
        return false;
    }

    public final cjp f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new cjp(this.b + Float.intBitsToFloat(i), this.c + Float.intBitsToFloat(i2), this.d + Float.intBitsToFloat(i), this.e + Float.intBitsToFloat(i2));
    }

    public final boolean g(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float f = this.b;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = true;
        if (intBitsToFloat >= f) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat < this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 & z;
        if (intBitsToFloat2 >= this.c) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (intBitsToFloat2 >= this.e) {
            z4 = false;
        }
        return z6 & z4;
    }

    public final boolean h(cjp cjpVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.b < cjpVar.d) {
            z = true;
        } else {
            z = false;
        }
        if (cjpVar.b < this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.c < cjpVar.e) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (cjpVar.c >= this.e) {
            z4 = false;
        }
        return z6 & z4;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + cjk.a(this.b) + ", " + cjk.a(this.c) + ", " + cjk.a(this.d) + ", " + cjk.a(this.e) + ')';
    }
}
