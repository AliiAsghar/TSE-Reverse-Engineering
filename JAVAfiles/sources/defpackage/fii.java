package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fii implements fig {
    private final ArrayList a = new ArrayList();

    private final int g(long j) {
        for (int i = 0; i < this.a.size(); i++) {
            if (j < ((xab) this.a.get(i)).c) {
                return i;
            }
        }
        return this.a.size();
    }

    @Override // defpackage.fig
    public final long a(long j) {
        if (!this.a.isEmpty()) {
            if (j >= ((xab) this.a.get(0)).c) {
                for (int i = 1; i < this.a.size(); i++) {
                    xab xabVar = (xab) this.a.get(i);
                    if (j < xabVar.c) {
                        long j2 = ((xab) this.a.get(i - 1)).a;
                        if (j2 != -9223372036854775807L && j2 > j && j2 < xabVar.c) {
                            return j2;
                        }
                        return xabVar.c;
                    }
                }
                long j3 = ((xab) alzz.aO(this.a)).a;
                if (j3 != -9223372036854775807L && j < j3) {
                    return j3;
                }
                return Long.MIN_VALUE;
            }
            return ((xab) this.a.get(0)).c;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.fig
    public final long b(long j) {
        if (this.a.isEmpty() || j < ((xab) this.a.get(0)).c) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.a.size(); i++) {
            long j2 = ((xab) this.a.get(i)).c;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                xab xabVar = (xab) this.a.get(i - 1);
                long j3 = xabVar.a;
                if (j3 != -9223372036854775807L && j3 <= j) {
                    return j3;
                }
                return xabVar.c;
            }
        }
        xab xabVar2 = (xab) alzz.aO(this.a);
        long j4 = xabVar2.a;
        if (j4 != -9223372036854775807L && j >= j4) {
            return j4;
        }
        return xabVar2.c;
    }

    @Override // defpackage.fig
    public final alog c(long j) {
        Object obj;
        int g = g(j);
        if (g == 0) {
            int i = alog.d;
            return alsx.a;
        }
        xab xabVar = (xab) this.a.get(g - 1);
        long j2 = xabVar.a;
        if (j2 != -9223372036854775807L && j >= j2) {
            int i2 = alog.d;
            obj = alsx.a;
        } else {
            obj = xabVar.d;
        }
        return (alog) obj;
    }

    @Override // defpackage.fig
    public final void d() {
        this.a.clear();
    }

    @Override // defpackage.fig
    public final void e(long j) {
        int g = g(j);
        if (g > 0) {
            this.a.subList(0, g).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    @Override // defpackage.fig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.xab r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r4
        L10:
            defpackage.d.s(r0)
            long r5 = r10.c
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.a
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r1
            goto L26
        L25:
            r0 = r4
        L26:
            java.util.ArrayList r2 = r9.a
            int r2 = r2.size()
        L2c:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L5a
            long r5 = r10.c
            java.util.ArrayList r3 = r9.a
            java.lang.Object r3 = r3.get(r2)
            xab r3 = (defpackage.xab) r3
            long r7 = r3.c
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L47
            java.util.ArrayList r11 = r9.a
            int r2 = r2 + r1
            r11.add(r2, r10)
            return r0
        L47:
            java.util.ArrayList r3 = r9.a
            java.lang.Object r3 = r3.get(r2)
            xab r3 = (defpackage.xab) r3
            long r5 = r3.c
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L57
            r3 = r4
            goto L58
        L57:
            r3 = r1
        L58:
            r0 = r0 & r3
            goto L2c
        L5a:
            java.util.ArrayList r11 = r9.a
            r11.add(r4, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fii.f(xab, long):boolean");
    }
}
