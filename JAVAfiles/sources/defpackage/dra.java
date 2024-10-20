package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dra {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dra) && this.a == ((dra) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j != 9205357640488583168L) {
            return ((Object) dqy.a(b(j))) + " x " + ((Object) dqy.a(a(j)));
        }
        return "DpSize.Unspecified";
    }
}
