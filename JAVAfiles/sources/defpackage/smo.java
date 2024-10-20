package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smo extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        U(new agmd("conversation_to_participants.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void c(agpj agpjVar) {
        U(new agme("conversation_to_participants.conversation_id", 1, agpjVar));
    }

    public final void d(long j) {
        U(new agoi("conversation_to_participants.participant_id", 1, Long.valueOf(j)));
    }

    public final void e(Iterable iterable) {
        U(new agmf("conversation_to_participants.participant_id", 3, X(iterable), true));
    }
}
