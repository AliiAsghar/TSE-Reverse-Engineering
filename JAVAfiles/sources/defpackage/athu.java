package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class athu extends aths {
    final int a;
    final atgd c;
    final atgd d;
    private final int e;
    private final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public athu(atfw atfwVar, atfy atfyVar) {
        super(atfwVar, atfyVar);
        int i;
        int i2;
        atgd s = atfwVar.s();
        atgd q = atfwVar.q();
        if (q == null) {
            this.c = null;
        } else {
            this.c = new atid(q, ((atfx) atfyVar).a);
        }
        this.d = s;
        this.a = 100;
        int d = atfwVar.d();
        if (d >= 0) {
            i = d / 100;
        } else {
            i = ((d + 1) / 100) - 1;
        }
        int c = atfwVar.c();
        if (c >= 0) {
            i2 = c / 100;
        } else {
            i2 = ((c + 1) / 100) - 1;
        }
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int a(long j) {
        int a = this.b.a(j);
        if (a >= 0) {
            return a / 100;
        }
        return ((a + 1) / 100) - 1;
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int c() {
        return this.f;
    }

    @Override // defpackage.aths, defpackage.atfw
    public final int d() {
        return this.e;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final long g(long j) {
        int a = a(j) * 100;
        atfw atfwVar = this.b;
        return atfwVar.g(atfwVar.h(j, a));
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        int i2;
        atow.q(this, i, this.e, this.f);
        int a = this.b.a(j);
        if (a >= 0) {
            i2 = a % 100;
        } else {
            i2 = ((a + 1) % 100) + 99;
        }
        return this.b.h(j, (i * 100) + i2);
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final atgd q() {
        return this.c;
    }

    @Override // defpackage.aths, defpackage.atfw
    public final atgd s() {
        atgd atgdVar = this.d;
        if (atgdVar != null) {
            return atgdVar;
        }
        return super.s();
    }
}
