package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swv extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59460) {
            agnc.t("conversation_id", intValue);
        }
        U(new agmd("message_spam.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void c(MessageIdType messageIdType) {
        U(new agmd("message_spam.message_id", 1, Long.valueOf(rvc.a(messageIdType))));
    }
}
