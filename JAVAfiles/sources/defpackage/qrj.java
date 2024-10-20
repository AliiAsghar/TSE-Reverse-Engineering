package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrj {
    public static final /* synthetic */ int b = 0;
    private final armf d;
    static final utz a = uuh.c(uuh.b, "shadow_launch_2_conversation_match_logging_sampling_percent", 1.0d);
    private static final xze c = xze.g("BugleDataModel", "ShadowLaunch2Logger");

    public qrj(armf armfVar) {
        this.d = armfVar;
    }

    public final akul a(ConversationIdType conversationIdType, boolean z, Optional optional, alog alogVar, amra amraVar) {
        ConversationIdType conversationIdType2;
        ConversationIdType conversationIdType3;
        if (!z && !conversationIdType.b()) {
            conversationIdType2 = conversationIdType;
        } else {
            conversationIdType2 = ruy.a;
        }
        if (!z) {
            conversationIdType = ruy.a;
        }
        ConversationIdType conversationIdType4 = conversationIdType;
        if (!((ConversationIdType) optional.map(new qqi(19)).orElse(ruy.a)).equals(conversationIdType2)) {
            if (optional.isPresent()) {
                conversationIdType3 = ((smr) optional.get()).x();
            } else {
                conversationIdType3 = ruy.a;
            }
            ConversationIdType conversationIdType5 = conversationIdType3;
            xyo c2 = c.c();
            c2.H("Telephony and BCM conversations mismatched.");
            c2.A("telephonyConversationIdIsNew", z);
            c2.z("telephonyConversationId", conversationIdType2.toString());
            c2.z("bcmMatchedConversation", conversationIdType5);
            c2.z("trigger", amraVar);
            c2.q();
            return ((qrb) this.d.b()).c(conversationIdType2, conversationIdType5, conversationIdType4, alogVar, amraVar);
        }
        xyo c3 = c.c();
        c3.H("Telephony and BCM conversations matched.");
        c3.z("trigger", amraVar);
        c3.A("telephonyConversationIdIsNew", z);
        c3.x("messageRecipients.size()", alogVar.size());
        c3.q();
        return ((qrb) this.d.b()).b(conversationIdType2, a, amraVar);
    }
}
