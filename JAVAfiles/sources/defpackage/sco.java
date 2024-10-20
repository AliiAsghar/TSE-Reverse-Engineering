package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sco extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        U(new agmd("conversations._id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }
}
