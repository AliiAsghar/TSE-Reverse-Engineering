package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjt {
    public final long a;

    public /* synthetic */ cjt(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String d(long j) {
        if (j != 9205357640488583168L) {
            return "Size(" + cjk.a(Float.intBitsToFloat((int) (j >> 32))) + ", " + cjk.a(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public static boolean e(long j, Object obj) {
        if (!(obj instanceof cjt) || j != ((cjt) obj).a) {
            return false;
        }
        return true;
    }

    public static final boolean f(long j) {
        boolean z;
        long j2 = (~(-(((-9223372034707292160L) & j) >>> 31))) & j;
        boolean z2 = true;
        if ((j2 & 4294967295L & (j2 >>> 32)) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (j != 9205357640488583168L) {
            z2 = false;
        }
        return z | z2;
    }

    public final boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
