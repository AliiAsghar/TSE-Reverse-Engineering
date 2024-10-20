package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class flm implements fmk {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public flm(long j, long j2, int i, int i2) {
        long e;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            e = -9223372036854775807L;
        } else {
            this.d = j - j2;
            e = e(j, j2, i);
        }
        this.f = e;
    }

    private static long e(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        long j2 = this.d;
        if (j2 != -1) {
            long j3 = this.c;
            long j4 = (((this.e * j) / 8000000) / j3) * j3;
            if (j2 != -1) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.b + Math.max(j4, 0L);
            long v = v(max);
            fml fmlVar = new fml(v, max);
            if (this.d != -1 && v < j) {
                long j5 = max + this.c;
                if (j5 < this.a) {
                    return new fmi(fmlVar, new fml(v(j5), j5));
                }
            }
            return new fmi(fmlVar, fmlVar);
        }
        fml fmlVar2 = new fml(0L, this.b);
        return new fmi(fmlVar2, fmlVar2);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        if (this.d == -1) {
            return false;
        }
        return true;
    }

    public final long v(long j) {
        return e(j, this.b, this.e);
    }
}
