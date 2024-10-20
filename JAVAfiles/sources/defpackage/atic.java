package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atic extends aths {
    final atgd a;
    final atgd c;

    public atic(atfw atfwVar, atgd atgdVar, atfy atfyVar) {
        super(atfwVar, atfyVar);
        this.c = atgdVar;
        this.a = atfwVar.q();
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int a(long j) {
        int a = this.b.a(j);
        if (a >= 0) {
            return a % 100;
        }
        return ((a + 1) % 100) + 99;
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final int c() {
        return 99;
    }

    @Override // defpackage.aths, defpackage.atfw
    public final int d() {
        return 0;
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
        int i2;
        atow.q(this, i, 0, 99);
        int a = this.b.a(j);
        if (a >= 0) {
            i2 = a / 100;
        } else {
            i2 = ((a + 1) / 100) - 1;
        }
        return this.b.h(j, (i2 * 100) + i);
    }

    @Override // defpackage.aths, defpackage.athq, defpackage.atfw
    public final atgd q() {
        return this.a;
    }

    @Override // defpackage.aths, defpackage.atfw
    public final atgd s() {
        return this.c;
    }

    public atic(athu athuVar, atfy atfyVar) {
        this(athuVar, athuVar.b.q(), atfyVar);
    }

    public atic(athu athuVar, atgd atgdVar, atfy atfyVar) {
        super(athuVar.b, atfyVar);
        int i = athuVar.a;
        this.a = atgdVar;
        this.c = athuVar.c;
    }
}
