package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class reu {
    public final MessageIdType a;
    public final ConversationIdType b;
    public final ParticipantsTable.BindData c;
    public final xhv d;
    public final boolean e;
    public final long f;
    public final int g;
    public final rev h;
    private final MessageCoreData i;

    public reu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof reu) {
            reu reuVar = (reu) obj;
            MessageCoreData messageCoreData = this.i;
            if (messageCoreData != null ? messageCoreData.equals(reuVar.i) : reuVar.i == null) {
                if (this.a.equals(reuVar.a) && this.b.equals(reuVar.b) && this.c.equals(reuVar.c) && this.d.equals(reuVar.d) && this.e == reuVar.e && this.f == reuVar.f && this.g == reuVar.g && this.h.equals(reuVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        MessageCoreData messageCoreData = this.i;
        if (messageCoreData == null) {
            hashCode = 0;
        } else {
            hashCode = messageCoreData.hashCode();
        }
        int hashCode2 = ((((((((hashCode ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        long j = this.f;
        return (((((((hashCode2 * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        rev revVar = this.h;
        xhv xhvVar = this.d;
        ParticipantsTable.BindData bindData = this.c;
        ConversationIdType conversationIdType = this.b;
        MessageIdType messageIdType = this.a;
        return "LaunchNonCriticalActionsParams{message=" + String.valueOf(this.i) + ", messageId=" + messageIdType.toString() + ", conversationId=" + conversationIdType.toString() + ", sender=" + bindData.toString() + ", threadId=" + xhvVar.toString() + ", newConversation=" + this.e + ", receivedTime=" + this.f + ", subId=" + this.g + ", rawMessagingAddress=" + String.valueOf(revVar) + "}";
    }

    public reu(MessageCoreData messageCoreData, MessageIdType messageIdType, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, xhv xhvVar, boolean z, long j, int i, rev revVar) {
        this.i = messageCoreData;
        this.a = messageIdType;
        this.b = conversationIdType;
        this.c = bindData;
        this.d = xhvVar;
        this.e = z;
        this.f = j;
        this.g = i;
        if (revVar == null) {
            throw new NullPointerException("Null rawMessagingAddress");
        }
        this.h = revVar;
    }
}
