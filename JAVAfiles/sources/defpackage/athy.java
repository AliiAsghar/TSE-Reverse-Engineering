package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class athy extends aths {
    private final int a;
    private final int c;
    private final int d;

    public athy(atfw atfwVar, atfy atfyVar) {
        this(atfwVar, atfyVar, 1);
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int c() {
        return this.d;
    }

    @Override // defpackage.aths, defpackage.atfw
    public final int d() {
        return this.c;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long e(long j, int i) {
        long e = super.e(j, i);
        atow.q(this, a(e), this.c, this.d);
        return e;
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
        atow.q(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd r() {
        return this.b.r();
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        return this.b.t(j);
    }

    public athy(atfw atfwVar, atfy atfyVar, int i) {
        super(atfwVar, atfyVar);
        this.a = i;
        if (atfwVar.d() + i > Integer.MIN_VALUE) {
            this.c = atfwVar.d() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (atfwVar.c() + i < Integer.MAX_VALUE) {
            this.d = atfwVar.c() + i;
        } else {
            this.d = Integer.MAX_VALUE;
        }
    }
}
