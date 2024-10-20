package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ivz extends ijy<Optional<ammc>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivz(ixd ixdVar) {
        super("RCS oneOnOne conditions");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        this.a.y = true;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$17", "onNewData", 2715, "ConversationFragmentPeer.java")).t("ConversationFragment: onNewData: RCS one-on-one conditions data: %s", optional);
        optional.ifPresent(new ivp(this.a, 15));
        optional.ifPresent(new ivp(this.a, 16));
    }
}
