package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqt {
    public static final int a(int i) {
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i + 1);
        if (numberOfLeadingZeros >= 19) {
            return 13;
        }
        if (numberOfLeadingZeros >= 17) {
            return 15;
        }
        if (numberOfLeadingZeros >= 16) {
            return 16;
        }
        if (numberOfLeadingZeros < 14) {
            return 255;
        }
        return 18;
    }

    public static final int b(long j, int i) {
        int c = dqs.c(j);
        if (i < c) {
            i = c;
        }
        int a = dqs.a(j);
        if (i > a) {
            return a;
        }
        return i;
    }

    public static final int c(long j, int i) {
        int d = dqs.d(j);
        if (i < d) {
            i = d;
        }
        int b = dqs.b(j);
        if (i > b) {
            return b;
        }
        return i;
    }

    public static final long d(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (i4 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (i3 < 0) {
            z4 = false;
        }
        if (!(z4 & z6)) {
            drd.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i2, i3, i4);
    }

    public static final long e(long j, long j2) {
        int i = (int) (j2 >> 32);
        int d = dqs.d(j);
        if (i < d) {
            i = d;
        }
        int b = dqs.b(j);
        if (i > b) {
            i = b;
        }
        long j3 = i << 32;
        int a = dqs.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int c = dqs.c(j);
        if (i2 < c) {
            i2 = c;
        }
        if (i2 <= a) {
            a = i2;
        }
        return a | j3;
    }

    public static final long f(long j, long j2) {
        int d = dqs.d(j2);
        int d2 = dqs.d(j);
        if (d < d2) {
            d = d2;
        }
        int b = dqs.b(j);
        if (d > b) {
            d = b;
        }
        int b2 = dqs.b(j2);
        if (b2 >= d2) {
            d2 = b2;
        }
        if (d2 <= b) {
            b = d2;
        }
        int c = dqs.c(j2);
        int c2 = dqs.c(j);
        if (c < c2) {
            c = c2;
        }
        int a = dqs.a(j);
        if (c > a) {
            c = a;
        }
        int a2 = dqs.a(j2);
        if (a2 >= c2) {
            c2 = a2;
        }
        if (c2 <= a) {
            a = c2;
        }
        return d(d, b, c, a);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        int a = a(i5);
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        } else {
            i6 = i2;
        }
        int a2 = a(i6);
        if (a + a2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = a2 - 13;
        int i10 = a2 + 2;
        long j = i;
        long j2 = i3;
        long j3 = (i9 >> 1) + (i9 & 1);
        return (((~(i7 >> 31)) & i7) << 33) | (j << 2) | j3 | (j2 << i10) | (((~(i8 >> 31)) & i8) << (a2 + 33));
    }

    public static final long h(long j, int i, int i2) {
        int b = dqs.b(j);
        int i3 = 0;
        if (b != Integer.MAX_VALUE && (b = b + i) < 0) {
            b = 0;
        }
        int c = dqs.c(j) + i2;
        if (c < 0) {
            c = 0;
        }
        int a = dqs.a(j);
        if (a != Integer.MAX_VALUE && (a = a + i2) < 0) {
            a = 0;
        }
        int d = dqs.d(j) + i;
        if (d >= 0) {
            i3 = d;
        }
        return d(i3, b, c, a);
    }

    public static final Void i(int i) {
        throw new IllegalArgumentException(a.cb(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(a.cl(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static /* synthetic */ long k(long j, int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return h(j, i, i2);
    }

    public static /* synthetic */ long l(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return d(0, i, 0, i2);
    }
}
