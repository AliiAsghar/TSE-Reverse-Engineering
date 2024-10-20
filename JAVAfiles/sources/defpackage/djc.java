package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djc {
    public static final long a = djd.a(0, 0);
    public final long b;

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return c(j) - d(j);
    }

    public static final int c(long j) {
        return Math.max(e(j), a(j));
    }

    public static final int d(long j) {
        return Math.min(e(j), a(j));
    }

    public static final int e(long j) {
        return (int) (j >> 32);
    }

    public static String f(long j) {
        return "TextRange(" + e(j) + ", " + a(j) + ')';
    }

    public static final boolean g(long j, long j2) {
        boolean z;
        int d = d(j);
        int d2 = d(j2);
        int c = c(j2);
        int c2 = c(j);
        boolean z2 = true;
        if (d <= d2) {
            z = true;
        } else {
            z = false;
        }
        if (c > c2) {
            z2 = false;
        }
        return z & z2;
    }

    public static final boolean h(long j) {
        if (e(j) == a(j)) {
            return true;
        }
        return false;
    }

    public static final boolean i(long j) {
        if (e(j) > a(j)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof djc) && this.b == ((djc) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.b);
    }

    public final String toString() {
        return f(this.b);
    }
}
