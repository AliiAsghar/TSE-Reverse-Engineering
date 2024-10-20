package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ivy implements akgh<aagd> {
    final /* synthetic */ ixd a;

    public ivy(ixd ixdVar) {
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        alvw i = ixd.a.i();
        i.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) ((alvg) i).g(th);
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$16", "onError", 2547, "ConversationFragmentPeer.java")).q("ConversationFragment: Error on Magic Compose settings");
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        aagd aagdVar = (aagd) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$16", "onNewData", 2536, "ConversationFragmentPeer.java")).t("ConversationFragment: onNewData: Magic Compose settings result: %s", aagdVar);
        this.a.K.set(aagdVar);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
