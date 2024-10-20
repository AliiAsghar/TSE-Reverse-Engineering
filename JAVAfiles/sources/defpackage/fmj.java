package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmj implements fmk, fpq {
    private final long a;
    private final fmi b;

    public fmj(long j) {
        this(j, 0L);
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        return this.b;
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return false;
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
        return 0L;
    }

    public fmj(long j, long j2) {
        this.a = j;
        fml fmlVar = j2 == 0 ? fml.a : new fml(0L, j2);
        this.b = new fmi(fmlVar, fmlVar);
    }

    public fmj() {
        this(-9223372036854775807L);
    }
}
