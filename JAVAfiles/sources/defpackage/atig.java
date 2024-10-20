package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atig extends aths {
    public atig(atfw atfwVar, atfy atfyVar) {
        super(atfwVar, atfyVar);
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int a(long j) {
        int a = this.b.a(j);
        if (a == 0) {
            return c();
        }
        return a;
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int c() {
        return this.b.c() + 1;
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
        int c = c();
        atow.q(this, i, 1, c);
        if (i == c) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd r() {
        return this.b.r();
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        return this.b.t(j);
    }
}
