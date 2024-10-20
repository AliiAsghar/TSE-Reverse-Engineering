package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpv extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        U(new agmd("conversation_matcher_cache.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void c(long j) {
        U(new agoi("conversation_matcher_cache.matcher_version", 1, Long.valueOf(j)));
    }
}
