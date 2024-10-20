package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqz {
    public final long a;

    public /* synthetic */ dqz(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        if (j != 9205357640488583168L) {
            return "(" + ((Object) dqy.a(a(j))) + ", " + ((Object) dqy.a(b(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dqz) && this.a == ((dqz) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
