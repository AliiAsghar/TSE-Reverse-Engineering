package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmz {
    protected final fmq a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public long[] j;
    public int[] k;
    private final long l;
    private final int m;

    public fmz(int i, int i2, long j, int i3, fmq fmqVar) {
        int i4;
        int i5;
        i2 = i2 != 1 ? 2 : i2;
        d.s(true);
        this.l = j;
        this.m = i3;
        this.a = fmqVar;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        this.b = d(i, i4);
        if (i2 == 2) {
            i5 = d(i, 1650720768);
        } else {
            i5 = -1;
        }
        this.c = i5;
        this.i = -1L;
        this.j = new long[512];
        this.k = new int[512];
    }

    private static int d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final fml e(int i) {
        return new fml(this.k[i] * b(), this.j[i]);
    }

    public final long a(int i) {
        return (this.l * i) / this.m;
    }

    public final long b() {
        return a(1);
    }

    public final fmi c(long j) {
        if (this.h == 0) {
            fml fmlVar = new fml(0L, this.i);
            return new fmi(fmlVar, fmlVar);
        }
        int b = (int) (j / b());
        int b2 = eul.b(this.k, b, true, true);
        if (this.k[b2] == b) {
            fml e = e(b2);
            return new fmi(e, e);
        }
        fml e2 = e(b2);
        int i = b2 + 1;
        if (i < this.j.length) {
            return new fmi(e2, e(i));
        }
        return new fmi(e2, e2);
    }
}
