package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpo implements vvp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCacheClearer");
    private final arwe b;

    public qpo(arwe arweVar) {
        arweVar.getClass();
        this.b = arweVar;
    }

    @Override // defpackage.vvp
    public final akul a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return qjh.j(this.b, new pze(conversationIdType, (arpe) null, 4));
    }
}
