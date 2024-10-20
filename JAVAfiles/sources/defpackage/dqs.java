package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqs {
    public final long a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final long a(int i, int i2, int i3, int i4) {
            int min;
            int i5;
            int i6 = 262142;
            int min2 = Math.min(i3, 262142);
            int i7 = Integer.MAX_VALUE;
            if (i4 == Integer.MAX_VALUE) {
                min = Integer.MAX_VALUE;
            } else {
                min = Math.min(i4, 262142);
            }
            if (min == Integer.MAX_VALUE) {
                i5 = min2;
            } else {
                i5 = min;
            }
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i5 + 1);
            if (numberOfLeadingZeros > 13) {
                if (numberOfLeadingZeros < 19) {
                    if (numberOfLeadingZeros >= 17) {
                        i6 = 65534;
                    } else if (numberOfLeadingZeros >= 16) {
                        i6 = 32766;
                    } else {
                        i6 = 8190;
                    }
                }
                if (i2 != Integer.MAX_VALUE) {
                    i7 = Math.min(i6, i2);
                }
                return dqt.d(Math.min(i6, i), i7, min2, min);
            }
            dqt.i(i5);
            throw new armj();
        }

        public static final long b(int i, int i2, int i3, int i4) {
            int min;
            int i5;
            int i6 = 262142;
            int min2 = Math.min(i, 262142);
            int i7 = Integer.MAX_VALUE;
            if (i2 == Integer.MAX_VALUE) {
                min = Integer.MAX_VALUE;
            } else {
                min = Math.min(i2, 262142);
            }
            if (min == Integer.MAX_VALUE) {
                i5 = min2;
            } else {
                i5 = min;
            }
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i5 + 1);
            if (numberOfLeadingZeros > 13) {
                if (numberOfLeadingZeros < 19) {
                    if (numberOfLeadingZeros >= 17) {
                        i6 = 65534;
                    } else if (numberOfLeadingZeros >= 16) {
                        i6 = 32766;
                    } else {
                        i6 = 8190;
                    }
                }
                if (i4 != Integer.MAX_VALUE) {
                    i7 = Math.min(i6, i4);
                }
                return dqt.d(min2, min, Math.min(i6, i3), i7);
            }
            dqt.i(i5);
            throw new armj();
        }

        public static final long c(int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 < 0) {
                z2 = false;
            }
            if (!(z2 & z)) {
                drd.a("width and height must be >= 0");
            }
            return dqt.g(i, i, i2, i2);
        }

        public static final long d(int i) {
            if (i < 0) {
                drd.a("width must be >= 0");
            }
            return dqt.g(i, i, 0, Integer.MAX_VALUE);
        }
    }

    public static final int a(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = ((int) (j >> (((i3 + i3) + (i2 * 3)) + 46))) & ((1 << (18 - r0)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int b(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = ((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int c(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return ((int) (j >> (((i3 + i3) + (i2 * 3)) + 15))) & ((1 << (18 - r0)) - 1);
    }

    public static final int d(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return ((int) (j >> 2)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
    }

    public static String e(long j) {
        String valueOf;
        int b = b(j);
        String str = "Infinity";
        if (b == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(b);
        }
        int a2 = a(j);
        if (a2 != Integer.MAX_VALUE) {
            str = String.valueOf(a2);
        }
        return "Constraints(minWidth = " + d(j) + ", maxWidth = " + valueOf + ", minHeight = " + c(j) + ", maxHeight = " + str + ')';
    }

    public static boolean f(long j, Object obj) {
        if (!(obj instanceof dqs) || j != ((dqs) obj).a) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        if ((((int) (j >> (((i3 + i3) + (i2 * 3)) + 46))) & ((1 << (18 - r0)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        if ((((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(long j) {
        int i;
        int i2 = (int) (3 & j);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = i4 + i4 + (i3 * 3);
        int i6 = i5 + 15;
        int i7 = (1 << (18 - i5)) - 1;
        int i8 = ((int) (j >> (i5 + 46))) & i7;
        if (i8 == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = i8 - 1;
        }
        if ((((int) (j >> i6)) & i7) == i) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j) {
        int i;
        int i2 = (int) (3 & j);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = (1 << (((i4 + i4) + (i3 * 3)) + 13)) - 1;
        int i6 = ((int) (j >> 33)) & i5;
        if (i6 == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = i6 - 1;
        }
        if ((((int) (j >> 2)) & i5) == i) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ long k(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = d(j);
        }
        if ((i5 & 2) != 0) {
            i2 = b(j);
        }
        if ((i5 & 4) != 0) {
            i3 = c(j);
        }
        if ((i5 & 8) != 0) {
            i4 = a(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            drd.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return dqt.g(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public final int hashCode() {
        return defpackage.a.A(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
