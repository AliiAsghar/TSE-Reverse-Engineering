package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdp {
    public static final dhn a = new dhn("SelectionHandleInfo");

    public static final long a(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i) - 1.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final boolean b(dqh dqhVar, boolean z) {
        if (dqhVar == dqh.a) {
            if (!z) {
                return true;
            }
            z = true;
        }
        if (dqhVar == dqh.b && z) {
            return true;
        }
        return false;
    }
}
