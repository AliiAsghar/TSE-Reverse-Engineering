package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpm extends flm implements fpq {
    public final long a;
    public final int b;
    public final int c;
    private final long d;

    public fpm(long j, long j2, int i, int i2) {
        super(j, j2, i, i2);
        this.a = j2;
        this.b = i;
        this.c = i2;
        this.d = j == -1 ? -1L : j;
    }

    @Override // defpackage.fpq
    public final int d() {
        return this.b;
    }

    @Override // defpackage.fpq
    public final long e() {
        return this.d;
    }

    @Override // defpackage.fpq
    public final long f(long j) {
        return v(j);
    }
}
