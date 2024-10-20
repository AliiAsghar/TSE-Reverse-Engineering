package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atgx extends atia {
    private final atgv b;

    public atgx(atgv atgvVar, atgd atgdVar) {
        super(atfy.g, atgdVar);
        this.b = atgvVar;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        atgv atgvVar = this.b;
        return atgvVar.P(j, atgvVar.Y(j));
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return 366;
    }

    @Override // defpackage.atia, defpackage.atfw
    public final int d() {
        return 1;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return this.b.g;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.athq
    public final int w(long j) {
        atgv atgvVar = this.b;
        if (atgvVar.ag(atgvVar.Y(j))) {
            return 366;
        }
        return 365;
    }

    @Override // defpackage.atia
    protected final int x(long j, int i) {
        if (i <= 365 && i > 0) {
            return 365;
        }
        return w(j);
    }
}
