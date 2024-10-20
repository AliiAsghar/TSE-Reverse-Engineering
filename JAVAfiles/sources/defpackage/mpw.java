package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpw implements yfx {
    final /* synthetic */ mpx a;
    private yga b;

    public mpw(mpx mpxVar) {
        this.a = mpxVar;
    }

    @Override // defpackage.yfx
    public final void fs() {
        mpx mpxVar = this.a;
        sge a = sgh.a();
        mpx mpxVar2 = this.a;
        a.c(new moh(mpxVar2, 7));
        this.b = yyb.aK(mpxVar.a.l().a(new mlq(mpxVar, 4)), mpxVar2.c.m(a.b(), "RbmConversationPropertiesObservableSupplier#businessConversationsMetadataQuery").f(new kzq(mpxVar2, 8), "RbmConversationPropertiesObservableSupplier::register", "RbmConversationPropertiesObservableSupplier::callback", "RbmConversationPropertiesObservableSupplier::unregister"));
    }

    @Override // defpackage.yfx
    public final void ft() {
        yga ygaVar = this.b;
        if (ygaVar != null) {
            ygaVar.a();
        }
        this.b = null;
    }
}
