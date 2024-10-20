package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class athc extends athw {
    protected final atgv a;

    public athc(atgv atgvVar) {
        super(atfy.f, 31556952000L);
        this.a = atgvVar;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        return this.a.Y(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.atfw
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        int a = a(j);
        int i2 = a + i;
        if ((a ^ i2) < 0 && (a ^ i) >= 0) {
            throw new ArithmeticException(a.bU(i, a, "The calculation caused an overflow: ", " + "));
        }
        return h(j, i2);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long g(long j) {
        return this.a.ac(a(j));
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        atow.q(this, i, -292275054, 292278993);
        return this.a.ae(j, i);
    }

    @Override // defpackage.atfw
    public final long j(long j, int i) {
        atow.q(this, i, -292275055, 292278994);
        return this.a.ae(j, i);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd r() {
        return this.a.c;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return null;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        return this.a.ag(a(j));
    }

    @Override // defpackage.athw
    public final long x(long j, long j2) {
        return e(j, atow.o(j2));
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
