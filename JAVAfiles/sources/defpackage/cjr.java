package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        cjs.b(brg.a, brg.a, brg.a, brg.a, 0L);
    }

    public cjr(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjr)) {
            return false;
        }
        cjr cjrVar = (cjr) obj;
        if (Float.compare(this.a, cjrVar.a) == 0 && Float.compare(this.b, cjrVar.b) == 0 && Float.compare(this.c, cjrVar.c) == 0 && Float.compare(this.d, cjrVar.d) == 0 && a.bB(this.e, cjrVar.e) && a.bB(this.f, cjrVar.f) && a.bB(this.g, cjrVar.g) && a.bB(this.h, cjrVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        long j = this.h;
        long j2 = this.g;
        return (((((((floatToIntBits * 31) + a.A(this.e)) * 31) + a.A(this.f)) * 31) + a.A(j2)) * 31) + a.A(j);
    }

    public final String toString() {
        String str = cjk.a(this.a) + ", " + cjk.a(this.b) + ", " + cjk.a(this.c) + ", " + cjk.a(this.d);
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.e;
        if (a.bB(j4, j) && a.bB(j, j2) && a.bB(j2, j3)) {
            int i = (int) (4294967295L & j4);
            int i2 = (int) (j4 >> 32);
            if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
                return "RoundRect(rect=" + str + ", radius=" + cjk.a(Float.intBitsToFloat(i2)) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + cjk.a(Float.intBitsToFloat(i2)) + ", y=" + cjk.a(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) cji.a(j4)) + ", topRight=" + ((Object) cji.a(j)) + ", bottomRight=" + ((Object) cji.a(j2)) + ", bottomLeft=" + ((Object) cji.a(j3)) + ')';
    }
}
