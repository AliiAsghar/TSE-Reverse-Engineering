package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cju {
    public static final long a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final cjp b(long j) {
        return cjq.a(0L, j);
    }
}
