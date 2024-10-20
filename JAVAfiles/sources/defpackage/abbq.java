package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbq implements emx {
    public static final xze a = xze.g("Bugle", "RecyclerViewPreInflationManager");
    public static final ahka b = new ahka("pre_inflation_latency");
    public final armf c;
    public final armf d;
    public final armf e;
    private Future f;
    private final anen g;

    public abbq(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.g = anenVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    public final void a(abbp abbpVar) {
        if (((ohk) this.c.b()).a() && abbpVar.f == 2) {
            ((ahqr) this.d.b()).e(b);
        }
        this.f = this.g.submit(akto.j(new aanh(this, abbpVar, 13, null)));
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        this.f.cancel(true);
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        this.f.cancel(true);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }
}
