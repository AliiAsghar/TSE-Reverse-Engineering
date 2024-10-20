package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ivv extends ijy<Optional<SuggestionData>> {
    final /* synthetic */ ixd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivv(ixd ixdVar) {
        super("Conversation suggestions to accept");
        this.a = ixdVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        alvw d = ixd.a.d();
        d.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, this.a.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$12", "onNewData", 2416, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Pending conversation suggestions");
        if (optional.isPresent()) {
            ixd ixdVar = this.a;
            ixdVar.cW.g.put(ixdVar.L, (SuggestionData) optional.get());
            this.a.ab();
        }
    }
}
