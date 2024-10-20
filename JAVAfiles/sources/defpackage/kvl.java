package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kvl extends nq {
    final /* synthetic */ ahqq a;
    final /* synthetic */ kvw b;

    public kvl(kvw kvwVar, ahqq ahqqVar) {
        this.a = ahqqVar;
        this.b = kvwVar;
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        if (this.b.a() > 0) {
            kvw kvwVar = this.b;
            kvwVar.O.f(this.a, new ahka("HomeRenderedFirstConversationLatency"), null, ahqp.SUCCESS);
            ((kxm) this.b.p.b()).E(this);
        }
    }
}
