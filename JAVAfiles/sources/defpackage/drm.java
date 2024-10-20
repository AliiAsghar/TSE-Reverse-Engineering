package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drm {
    public final long b;
    private static final dro[] c = {new dro(0), new dro(4294967296L), new dro(8589934592L)};
    public static final long a = drn.d(0, Float.NaN);

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return j & 1095216660480L;
    }

    public static final long c(long j) {
        return c[(int) (b(j) >>> 32)].a;
    }

    public static String d(long j) {
        long c2 = c(j);
        if (a.bB(c2, 0L)) {
            return "Unspecified";
        }
        if (a.bB(c2, 4294967296L)) {
            return a(j) + ".sp";
        }
        if (a.bB(c2, 8589934592L)) {
            return a(j) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof drm) && this.b == ((drm) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.b);
    }

    public final String toString() {
        return d(this.b);
    }
}
