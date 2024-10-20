package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atha extends atia {
    private final atgv b;

    public atha(atgv atgvVar, atgd atgdVar) {
        super(atfy.l, atgdVar);
        this.b = atgvVar;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        return this.b.U(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return 53;
    }

    @Override // defpackage.atia, defpackage.atfw
    public final int d() {
        return 1;
    }

    @Override // defpackage.atia, defpackage.athq, defpackage.atfw
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.atia, defpackage.athq, defpackage.atfw
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return this.b.e;
    }

    @Override // defpackage.athq
    public final int w(long j) {
        atgv atgvVar = this.b;
        return atgvVar.W(atgvVar.X(j));
    }

    @Override // defpackage.atia
    protected final int x(long j, int i) {
        if (i <= 52) {
            return 52;
        }
        return w(j);
    }
}
