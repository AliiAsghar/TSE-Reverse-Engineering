package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ike implements emx {
    final /* synthetic */ puj a;
    final /* synthetic */ ikf b;

    public ike(ikf ikfVar, puj pujVar) {
        this.a = pujVar;
        this.b = ikfVar;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        ikf ikfVar = this.b;
        ikfVar.e.i(ikfVar.l);
        this.b.q.h(this.a);
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        ikf ikfVar = this.b;
        ikfVar.e.j(ikfVar.l);
        this.b.q.i(this.a);
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        xyo a = ikf.a.a();
        a.b(this.b.j);
        a.H("Lifecycle resumed, fetching possible new RCS state for conversation.");
        a.q();
        this.b.e();
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        xyo a = ikf.a.a();
        a.b(this.b.j);
        a.H("Lifecycle stopped.");
        a.q();
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }
}
