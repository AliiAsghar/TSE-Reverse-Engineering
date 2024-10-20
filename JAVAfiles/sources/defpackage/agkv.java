package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agkv {
    public static final int a(long j) {
        return j(j, 0);
    }

    public static final int b(long j) {
        return j(j, 1);
    }

    public static final int c(long j) {
        return j(j, 2);
    }

    public static final int d(long j) {
        int b = b(j);
        if (b == -21) {
            b = c(j);
        }
        int a = a(j);
        if (a != -21) {
            b = arrn.s(a, b);
        }
        if (!h(j)) {
            int a2 = agkm.a(b);
            if (a2 > 0 && a2 <= 10) {
                return agkm.a[a2 - 1];
            }
            throw new IllegalArgumentException(a.bV(a2, "Invalid java priority: "));
        }
        return b;
    }

    public static final long e(long j) {
        return j & 8796093022207L;
    }

    public static final boolean f(long j) {
        if (((j >>> 61) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j) {
        if (((j >>> 62) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j) {
        if ((j >>> 63) == 1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ long i(long j, boolean z, boolean z2, boolean z3, int i, int i2, long j2, int i3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        long j3;
        if ((i3 & 1) != 0) {
            z4 = h(j);
        } else {
            z4 = z;
        }
        if ((i3 & 2) != 0) {
            z5 = g(j);
        } else {
            z5 = z2;
        }
        if ((i3 & 4) != 0) {
            z6 = f(j);
        } else {
            z6 = z3;
        }
        if ((i3 & 8) != 0) {
            i4 = c(j);
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            i5 = b(j);
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            i6 = a(j);
        } else {
            i6 = i2;
        }
        if ((i3 & 64) != 0) {
            j3 = e(j);
        } else {
            j3 = j2;
        }
        return aglo.m(z4, z5, z6, i4, i5, i6, j3);
    }

    private static final int j(long j, int i) {
        return (((int) (j >>> ((i * 6) + 43))) & 63) - 21;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
