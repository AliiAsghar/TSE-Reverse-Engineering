package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drf {
    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long b(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + dre.a(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + dre.b(j2);
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long c(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }
}
