package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class reg {
    public final MessageIdType a;
    public final ConversationIdType b;

    public reg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof reg) {
            reg regVar = (reg) obj;
            if (this.a.equals(regVar.a) && this.b.equals(regVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ConversationIdType conversationIdType = this.b;
        return "MessageSuggestionIds{lastMessageId=" + String.valueOf(this.a) + ", conversationId=" + String.valueOf(conversationIdType) + "}";
    }

    public reg(MessageIdType messageIdType, ConversationIdType conversationIdType) {
        this.a = messageIdType;
        this.b = conversationIdType;
    }
}
