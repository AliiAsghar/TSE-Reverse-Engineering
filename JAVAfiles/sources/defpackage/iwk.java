package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwk extends ijy<alog<nfw>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwk(ixd ixdVar) {
        super("SelfIdentity");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        alog alogVar = (alog) obj;
        if (!((Boolean) ryf.a.e()).booleanValue()) {
            return;
        }
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$24", "onNewData", 2996, "ConversationFragmentPeer.java")).r("onNewData: SelfIdentity NumberOfActiveSelfIdentities: %d", alogVar.size());
        rrl rrlVar = (rrl) this.a.ca.a();
        rrlVar.h = rrlVar.o.q(alogVar);
        this.a.ao();
    }
}
