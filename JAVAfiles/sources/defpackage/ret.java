package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ret {
    public final MessageCoreData a;
    public final ParticipantsTable.BindData b;
    public final MessageIdType c;
    public final ConversationIdType d;
    public final xhv e;
    public final boolean f;
    public final long g;
    public final int h;
    public final rev i;

    public ret() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ret) {
            ret retVar = (ret) obj;
            MessageCoreData messageCoreData = this.a;
            if (messageCoreData != null ? messageCoreData.equals(retVar.a) : retVar.a == null) {
                if (this.b.equals(retVar.b) && this.c.equals(retVar.c) && this.d.equals(retVar.d) && this.e.equals(retVar.e) && this.f == retVar.f && this.g == retVar.g && this.h == retVar.h && this.i.equals(retVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        MessageCoreData messageCoreData = this.a;
        if (messageCoreData == null) {
            hashCode = 0;
        } else {
            hashCode = messageCoreData.hashCode();
        }
        int hashCode2 = ((((((((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        if (true != this.f) {
            i = 1237;
        } else {
            i = 1231;
        }
        long j = this.g;
        return (((((((hashCode2 * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        rev revVar = this.i;
        xhv xhvVar = this.e;
        ConversationIdType conversationIdType = this.d;
        MessageIdType messageIdType = this.c;
        ParticipantsTable.BindData bindData = this.b;
        return "LaunchCriticalActionsParams{message=" + String.valueOf(this.a) + ", sender=" + bindData.toString() + ", messageId=" + messageIdType.toString() + ", conversationId=" + conversationIdType.toString() + ", threadId=" + xhvVar.toString() + ", newConversation=" + this.f + ", receivedTime=" + this.g + ", subId=" + this.h + ", rawMessagingAddress=" + String.valueOf(revVar) + "}";
    }

    public ret(MessageCoreData messageCoreData, ParticipantsTable.BindData bindData, MessageIdType messageIdType, ConversationIdType conversationIdType, xhv xhvVar, boolean z, long j, int i, rev revVar) {
        this.a = messageCoreData;
        this.b = bindData;
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.c = messageIdType;
        if (conversationIdType != null) {
            this.d = conversationIdType;
            this.e = xhvVar;
            this.f = z;
            this.g = j;
            this.h = i;
            this.i = revVar;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }
}
