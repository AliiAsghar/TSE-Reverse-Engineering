package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vii {
    public final ConversationIdType a;
    public final MessageIdType b;
    public final int c;
    public final int d;

    public vii() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vii) {
            vii viiVar = (vii) obj;
            if (this.a.equals(viiVar.a) && this.b.equals(viiVar.b) && this.c == viiVar.c && this.d == viiVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        a.aS(i);
        return (((hashCode * 1000003) ^ this.c) * 1000003) ^ i;
    }

    public final String toString() {
        MessageIdType messageIdType = this.b;
        return "FailedMessageInfo{conversationId=" + this.a.toString() + ", messageId=" + messageIdType.toString() + ", rawTelephonyStatus=" + this.c + ", failureType=" + vom.k(this.d) + "}";
    }

    public vii(ConversationIdType conversationIdType, MessageIdType messageIdType, int i, int i2) {
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = i;
        this.d = i2;
    }
}
