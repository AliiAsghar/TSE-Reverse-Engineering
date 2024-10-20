package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arut implements Comparable {
    public static final long a;
    public static final long b;
    public final long c;

    static {
        int i = aruu.a;
        a = arsd.l(4611686018427387903L);
        b = arsd.l(-4611686018427387903L);
    }

    public /* synthetic */ arut(long j) {
        this.c = j;
    }

    public static int a(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (o(j)) {
                return -i;
            }
            return i;
        }
        return d.x(j, j2);
    }

    public static final int b(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (j(j, aruv.f) % 24);
    }

    public static final int c(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (j(j, aruv.e) % 60);
    }

    public static final int d(long j) {
        long j2;
        if (n(j)) {
            return 0;
        }
        boolean q = q(j);
        long p = p(j);
        if (q) {
            j2 = arsd.m(p % 1000);
        } else {
            j2 = p % 1000000000;
        }
        return (int) j2;
    }

    public static final int e(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (h(j) % 60);
    }

    public static final long f(long j) {
        return j(j, aruv.g);
    }

    public static final long g(long j) {
        if (q(j) && m(j)) {
            return p(j);
        }
        return j(j, aruv.c);
    }

    public static final long h(long j) {
        return j(j, aruv.d);
    }

    public static final long i(long j, long j2) {
        long l;
        if (n(j)) {
            if (!m(j2) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        }
        if (n(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long p = p(j) + p(j2);
            if (r(j)) {
                if (new artd(-4611686018426999999L, 4611686018426999999L).b(p)) {
                    int i = aruu.a;
                    return p + p;
                }
                return arsd.l(arsd.n(p));
            }
            if (new artd(-4611686018426L, 4611686018426L).b(p)) {
                long m = arsd.m(p);
                int i2 = aruu.a;
                l = m + m;
            } else {
                l = arsd.l(arrn.x(p, -4611686018427387903L, 4611686018427387903L));
            }
            return l;
        }
        if (q(j)) {
            return s(p(j), p(j2));
        }
        return s(p(j2), p(j));
    }

    public static final long j(long j, aruv aruvVar) {
        aruv aruvVar2;
        aruvVar.getClass();
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        if (r(j)) {
            aruvVar2 = aruv.a;
        } else {
            aruvVar2 = aruv.c;
        }
        return arrj.n(p(j), aruvVar2, aruvVar);
    }

    public static final long k(long j) {
        int i = aruu.a;
        int i2 = ((int) j) & 1;
        long j2 = -p(j);
        return j2 + j2 + i2;
    }

    public static String l(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == a) {
            return "Infinity";
        }
        if (j == b) {
            return "-Infinity";
        }
        StringBuilder sb = new StringBuilder();
        boolean o = o(j);
        if (o) {
            sb.append('-');
        }
        if (o(j)) {
            j = k(j);
        }
        long f = f(j);
        int i2 = 0;
        if (f != 0) {
            z = true;
        } else {
            z = false;
        }
        int b2 = b(j);
        if (b2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int c = c(j);
        if (c != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int e = e(j);
        int d = d(j);
        if (e == 0) {
            if (d != 0) {
                z4 = true;
                e = 0;
            } else {
                d = 0;
                z4 = false;
                e = 0;
            }
        } else {
            z4 = true;
        }
        if (z) {
            sb.append(f);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z2 || (z && (z3 || z4))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(b2);
            sb.append('h');
            i = i3;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(c);
            sb.append('m');
            i = i4;
        }
        if (z4) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (e == 0) {
                if (!z && !z2 && !z3) {
                    if (d >= 1000000) {
                        t(sb, d / 1000000, d % 1000000, 6, "ms");
                    } else if (d >= 1000) {
                        t(sb, d / 1000, d % 1000, 3, "us");
                    } else {
                        sb.append(d);
                        sb.append("ns");
                    }
                    i = i5;
                }
            } else {
                i2 = e;
            }
            t(sb, i2, d, 9, "s");
            i = i5;
        }
        if (o && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final boolean m(long j) {
        if (!n(j)) {
            return true;
        }
        return false;
    }

    public static final boolean n(long j) {
        if (j != a && j != b) {
            return false;
        }
        return true;
    }

    public static final boolean o(long j) {
        if (j < 0) {
            return true;
        }
        return false;
    }

    private static final long p(long j) {
        return j >> 1;
    }

    private static final boolean q(long j) {
        if ((((int) j) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean r(long j) {
        if ((((int) j) & 1) == 0) {
            return true;
        }
        return false;
    }

    private static final long s(long j, long j2) {
        artd artdVar = new artd(-4611686018426L, 4611686018426L);
        long n = arsd.n(j2);
        long j3 = j + n;
        if (artdVar.b(j3)) {
            long m = j2 - arsd.m(n);
            long m2 = arsd.m(j3);
            int i = aruu.a;
            long j4 = m2 + m;
            return j4 + j4;
        }
        return arsd.l(arrn.x(j3, -4611686018427387903L, 4611686018427387903L));
    }

    private static final void t(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String V = arsd.V(String.valueOf(i2), i3);
            int i4 = -1;
            int length = V.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (V.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) V, 0, i6);
            } else {
                sb.append((CharSequence) V, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a(this.c, ((arut) obj).c);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof arut) && this.c == ((arut) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.c);
    }

    public final String toString() {
        return l(this.c);
    }
}
