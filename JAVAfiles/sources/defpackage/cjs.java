package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjs {
    public static final cjr a(cjp cjpVar, long j, long j2, long j3, long j4) {
        return new cjr(cjpVar.b, cjpVar.c, cjpVar.d, cjpVar.e, j, j2, j3, j4);
    }

    public static final cjr b(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new cjr(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final boolean c(cjr cjrVar) {
        long j = cjrVar.e;
        if ((j >>> 32) == (4294967295L & j) && j == cjrVar.f && j == cjrVar.g && j == cjrVar.h) {
            return true;
        }
        return false;
    }
}
