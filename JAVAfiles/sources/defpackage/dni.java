package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dni {
    public static final long a(long j, long j2) {
        boolean z;
        int b;
        int d = djc.d(j);
        int c = djc.c(j);
        int d2 = djc.d(j2);
        int c2 = djc.c(j);
        int d3 = djc.d(j);
        int c3 = djc.c(j2);
        boolean z2 = true;
        if (d2 < c2) {
            z = true;
        } else {
            z = false;
        }
        if (d3 >= c3) {
            z2 = false;
        }
        if (z & z2) {
            if (djc.g(j2, j)) {
                d = djc.d(j2);
                c = d;
            } else {
                if (djc.g(j, j2)) {
                    b = djc.b(j2);
                } else {
                    int d4 = djc.d(j2);
                    if (d < djc.c(j2) && d4 <= d) {
                        d = djc.d(j2);
                        b = djc.b(j2);
                    } else {
                        c = djc.d(j2);
                    }
                }
                c -= b;
            }
        } else if (c > djc.d(j2)) {
            d -= djc.b(j2);
            b = djc.b(j2);
            c -= b;
        }
        return djd.a(d, c);
    }
}
