package defpackage;

import defpackage.dqs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbr {
    public static final int a(boolean z, int i, int i2) {
        if (!z && a.bw(i)) {
            return 1;
        }
        return arrn.r(i2, 1);
    }

    public static final long b(long j, boolean z, int i, float f) {
        int i2 = Integer.MAX_VALUE;
        if ((z || a.bw(i)) && dqs.h(j)) {
            i2 = dqs.b(j);
        }
        if (dqs.d(j) != i2) {
            i2 = arrn.u(ayr.a(f), dqs.d(j), i2);
        }
        return dqs.a.b(0, i2, 0, dqs.a(j));
    }
}
