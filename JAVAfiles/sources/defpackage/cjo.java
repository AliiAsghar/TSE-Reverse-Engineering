package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjo {
    public static final long a(long j, long j2, float f) {
        float b = drv.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float b2 = drv.b(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(b2) & 4294967295L);
    }
}
