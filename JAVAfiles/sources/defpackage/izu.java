package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izu extends izw {
    private final ConversationIdType a;
    private final msz b;

    public izu(ConversationIdType conversationIdType, msz mszVar) {
        this.a = conversationIdType;
        if (mszVar != null) {
            this.b = mszVar;
            return;
        }
        throw new NullPointerException("Null messagingIdentity");
    }

    @Override // defpackage.izw
    public final msz a() {
        return this.b;
    }

    @Override // defpackage.izw
    public final ConversationIdType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof izw) {
            izw izwVar = (izw) obj;
            if (this.a.equals(izwVar.b()) && this.b.equals(izwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        msz mszVar = this.b;
        return "RemoveUserConfirmedEvent{conversationId=" + this.a.toString() + ", messagingIdentity=" + mszVar.toString() + "}";
    }
}
