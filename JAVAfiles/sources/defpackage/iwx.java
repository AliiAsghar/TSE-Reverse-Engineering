package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class iwx extends ijy<Optional<rry>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwx(ixd ixdVar) {
        super("Latest message");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$7", "onNewData", 2299, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Latest message");
        ((Optional) obj).ifPresent(new iry(this.a, 19));
    }
}
