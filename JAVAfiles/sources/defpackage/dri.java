package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dri {
    public final long a;

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return (int) (j >> 32);
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static boolean d(long j, Object obj) {
        if (!(obj instanceof dri) || j != ((dri) obj).a) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
