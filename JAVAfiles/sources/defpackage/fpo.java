package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpo implements fpq {
    private final long[] a;
    private final long[] b;
    private final long c;

    public fpo(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? eul.u(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair g(long j, long[] jArr, long[] jArr2) {
        double d;
        int ai = eul.ai(jArr, j, true);
        long j2 = jArr[ai];
        long j3 = jArr2[ai];
        int i = ai + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        Pair g = g(eul.z(eul.q(j, 0L, this.c)), this.b, this.a);
        fml fmlVar = new fml(eul.u(((Long) g.first).longValue()), ((Long) g.second).longValue());
        return new fmi(fmlVar, fmlVar);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fpq
    public final int d() {
        return -2147483647;
    }

    @Override // defpackage.fpq
    public final long e() {
        return -1L;
    }

    @Override // defpackage.fpq
    public final long f(long j) {
        return eul.u(((Long) g(j, this.a, this.b).second).longValue());
    }
}
