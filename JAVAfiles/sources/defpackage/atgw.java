package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atgw extends atia {
    private final atgv b;

    public atgw(atgv atgvVar, atgd atgdVar) {
        super(atfy.i, atgdVar);
        this.b = atgvVar;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        atgv atgvVar = this.b;
        int Y = atgvVar.Y(j);
        return atgvVar.N(j, Y, atgvVar.T(j, Y));
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return 31;
    }

    @Override // defpackage.atia, defpackage.atfw
    public final int d() {
        return 1;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return this.b.f;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.athq
    public final int w(long j) {
        return this.b.Q(j);
    }

    @Override // defpackage.atia
    protected final int x(long j, int i) {
        if (i <= 28 && i > 0) {
            return 28;
        }
        return this.b.Q(j);
    }
}
