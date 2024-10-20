package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjn {
    public final long a;

    public static final float a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String f(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            return "Offset(" + cjk.a(Float.intBitsToFloat((int) (j >> 32))) + ", " + cjk.a(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
        }
        return "Offset.Unspecified";
    }

    public static final long g(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ long h(long j, float f, int i) {
        float f2;
        if ((i & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j >> 32));
        } else {
            f2 = brg.a;
        }
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return g(f2, f);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cjn) && this.a == ((cjn) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
