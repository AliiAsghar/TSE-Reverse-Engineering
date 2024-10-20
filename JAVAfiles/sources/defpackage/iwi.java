package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwi extends ijy<hwr> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwi(ixd ixdVar) {
        super("Conversation recipients");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$22", "onNewData", 2959, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation recipients");
        ixd ixdVar = this.a;
        ixdVar.aX.b(ixdVar.bE, ixdVar.M.fe());
        ixd ixdVar2 = this.a;
        ixdVar2.cQ = (hwr) obj;
        ixdVar2.cQ.getClass();
        ixdVar2.ci = true;
    }
}
