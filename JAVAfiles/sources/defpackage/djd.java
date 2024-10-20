package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djd {
    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            doz.b("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long b(long j, int i) {
        int a = djc.a(j);
        int i2 = 0;
        if (a < 0) {
            a = 0;
        }
        if (a > i) {
            a = i;
        }
        int e = djc.e(j);
        if (e >= 0) {
            i2 = e;
        }
        if (i2 <= i) {
            i = i2;
        }
        if (i == djc.e(j) && a == djc.a(j)) {
            return j;
        }
        return a(i, a);
    }
}
