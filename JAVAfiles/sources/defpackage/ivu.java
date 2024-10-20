package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ivu extends ijy<alog<SuggestionData>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivu(ixd ixdVar) {
        super("Conversation suggestions");
        this.a = ixdVar;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$11", "onNewData", 2392, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation suggestions");
        ixd ixdVar = this.a;
        ixdVar.aH.a = (alog) obj;
        ixdVar.ar();
    }
}
