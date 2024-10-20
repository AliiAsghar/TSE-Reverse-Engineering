package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czs extends bvz<cxn> {
    public czs(cxn cxnVar) {
        super(cxnVar);
    }

    @Override // defpackage.bvz
    protected final void e() {
        ((cxn) this.a).X();
    }

    @Override // defpackage.bvz, defpackage.bwc
    public final void f() {
        czb czbVar = ((cxn) this.a).l;
        if (czbVar != null) {
            czbVar.s();
        }
    }

    @Override // defpackage.bvz, defpackage.bwc
    public final void g() {
        ((cxn) this.b).d();
    }

    @Override // defpackage.bwc
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
        ((cxn) this.b).M(i, (cxn) obj);
    }

    @Override // defpackage.bwc
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
    }

    @Override // defpackage.bwc
    public final void k(int i, int i2, int i3) {
        ((cxn) this.b).V(i, i2, i3);
    }

    @Override // defpackage.bwc
    public final void l(int i, int i2) {
        ((cxn) this.b).Y(i, i2);
    }
}
