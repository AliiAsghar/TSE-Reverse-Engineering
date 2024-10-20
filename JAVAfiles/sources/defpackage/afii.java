package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afii extends no implements emx {
    public final arwe c;
    public final cg d;
    public final afgo e;
    public afgs f;
    private final afgq g;
    private final afhv h;
    private final arqr i;
    private final arqr j;

    public afii(arwe arweVar, cg cgVar, afgq afgqVar, afhv afhvVar, afgo afgoVar, arqr arqrVar, arqr arqrVar2) {
        this.c = arweVar;
        this.d = cgVar;
        this.g = afgqVar;
        this.h = afhvVar;
        this.e = afgoVar;
        this.i = arqrVar;
        this.j = arqrVar2;
        cgVar.N().c(this);
    }

    private final void F(afgs afgsVar) {
        aeke aekeVar;
        afhv afhvVar = this.h;
        afgo afgoVar = afhvVar.c.d;
        if (afgoVar != null && afgoVar.c != null && (aekeVar = afhvVar.f) != null) {
            d.F(aekeVar, afhs.a);
        }
        afgsVar.t.d(afgs.s[0], this.h.a(2));
    }

    @Override // defpackage.no
    public final int b() {
        return 1;
    }

    @Override // defpackage.no
    public final int c(int i) {
        return 2;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return this.g.a(viewGroup, this.e, this.i);
    }

    @Override // defpackage.emx
    public final void f(enm enmVar) {
        arrn.J(this.c, null, null, new aely(this, (arpe) null, 13, (byte[]) null), 3);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        afgs afgsVar = (afgs) ooVar;
        afgsVar.getClass();
        F(afgsVar);
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        afgs afgsVar = this.f;
        if (afgsVar != null) {
            m(afgsVar);
        }
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void gH(oo ooVar) {
        afgs afgsVar = (afgs) ooVar;
        afgsVar.getClass();
        m(afgsVar);
        this.j.a(true);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void j(oo ooVar) {
        ((afgs) ooVar).getClass();
        this.j.a(false);
    }

    public final void m(afgs afgsVar) {
        this.f = afgsVar;
        F(afgsVar);
        arrn.J(this.c, null, null, new aely(afgsVar, (arpe) null, 11), 3);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
