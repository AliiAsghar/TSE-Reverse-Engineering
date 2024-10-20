package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yob extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        U(new agmd("spam_logging_ids_table.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void c() {
        U(new agmg("spam_logging_ids_table.conversation_logging_id", 6));
    }

    public final void d() {
        U(new agmd("spam_logging_ids_table.conversation_logging_id", 2, ""));
    }
}
