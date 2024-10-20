package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tu {
    public final long a;

    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static long c(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tu) && this.a == ((tu) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append(a(j));
        sb.append(", ");
        sb.append(b(j));
        sb.append(')');
        return sb.toString();
    }
}
