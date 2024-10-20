package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwt implements akgh<zxk> {
    final /* synthetic */ ixd a;

    public iwt(ixd ixdVar) {
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        alvw i = ixd.a.i();
        i.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) i;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$3", "onError", 1934, "ConversationFragmentPeer.java")).q("ConversationFragment: Unable to load scale factor from data store: loading default scale factor");
        this.a.O.c("Bugle.ConversationScale.ConversationScaleLoadFailed.Count");
        ((Optional) this.a.aK.b()).ifPresent(new ivn(19));
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zxk zxkVar = (zxk) obj;
        if (((Boolean) ((utz) zxn.a.get()).e()).booleanValue()) {
            ((Optional) this.a.aK.b()).ifPresent(new ivp(zxkVar, 18));
        } else {
            ((Optional) this.a.aK.b()).ifPresent(new ivp(zxkVar, 19));
        }
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
