package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmg {
    public static final long a = cmh.a(0.5f, 0.5f);
    public final long b;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cmg) && this.b == ((cmg) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.b);
    }

    public final String toString() {
        return c(this.b);
    }
}
