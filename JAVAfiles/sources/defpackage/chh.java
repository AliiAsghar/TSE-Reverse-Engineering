package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chh extends cga.c implements chf, cyu, che {
    public arqr a;
    private final chj b;
    private boolean c;

    public chh(chj chjVar, arqr arqrVar) {
        this.b = chjVar;
        this.a = arqrVar;
        chjVar.a = this;
    }

    @Override // defpackage.cyu
    public final void a() {
        b();
    }

    @Override // defpackage.chf
    public final void b() {
        this.c = false;
        this.b.q();
        cwy.a(this);
    }

    @Override // defpackage.che
    public final long h() {
        return drj.c(cwp.f(this, 128).c);
    }

    @Override // defpackage.che
    public final dqv n() {
        return cwp.h(this);
    }

    @Override // defpackage.che
    public final drk o() {
        return cwp.i(this);
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        if (!this.c) {
            chj chjVar = this.b;
            chjVar.q();
            cyv.a(this, new chg(this, chjVar));
            if (chjVar.b != null) {
                this.c = true;
            } else {
                csg.a("DrawResult not defined, did you forget to call onDraw?");
                throw new armj();
            }
        }
        chp chpVar = this.b.b;
        chpVar.getClass();
        chpVar.a.a(cntVar);
    }

    @Override // defpackage.cwx
    public final void t() {
        b();
    }

    @Override // cga.c
    public final void s() {
    }
}
