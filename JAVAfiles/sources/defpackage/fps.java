package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fps implements fpq {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    public fps(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    private final long g(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        double d;
        if (!c()) {
            fml fmlVar = new fml(0L, this.a + this.b);
            return new fmi(fmlVar, fmlVar);
        }
        long q = eul.q(j, 0L, this.c);
        double d2 = (q * 100.0d) / this.c;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.g;
                dzg.h(jArr);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = d4 + ((d2 - i) * (d - d4));
            }
        }
        long j2 = this.e;
        fml fmlVar2 = new fml(q, this.a + eul.q(Math.round((d3 / 256.0d) * j2), this.b, j2 - 1));
        return new fmi(fmlVar2, fmlVar2);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fpq
    public final int d() {
        return this.d;
    }

    @Override // defpackage.fpq
    public final long e() {
        return this.f;
    }

    @Override // defpackage.fpq
    public final long f(long j) {
        long j2;
        double d;
        if (c()) {
            long j3 = j - this.a;
            if (j3 > this.b) {
                long[] jArr = this.g;
                dzg.h(jArr);
                double d2 = (j3 * 256.0d) / this.e;
                int ai = eul.ai(jArr, (long) d2, true);
                long g = g(ai);
                long j4 = jArr[ai];
                int i = ai + 1;
                long g2 = g(i);
                if (ai == 99) {
                    j2 = 256;
                } else {
                    j2 = jArr[i];
                }
                if (j4 == j2) {
                    d = 0.0d;
                } else {
                    d = (d2 - j4) / (j2 - j4);
                }
                return g + Math.round(d * (g2 - g));
            }
            return 0L;
        }
        return 0L;
    }
}
