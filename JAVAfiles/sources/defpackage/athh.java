package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class athh extends aths {
    private final atgv a;

    public athh(atfw atfwVar, atgv atgvVar) {
        super(atfwVar, atfy.c);
        this.a = atgvVar;
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int a(long j) {
        int a = this.b.a(j);
        if (a <= 0) {
            return 1 - a;
        }
        return a;
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.aths, defpackage.atfw
    public final int d() {
        return 1;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        atow.q(this, i, 1, c());
        if (this.a.Y(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.aths, defpackage.atfw
    public final atgd s() {
        return this.a.h;
    }
}
