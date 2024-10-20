package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xua {
    public final ConversationIdType a;
    public final int b;
    public final boolean c;

    public xua() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xua) {
            xua xuaVar = (xua) obj;
            if (this.a.equals(xuaVar.a) && this.b == xuaVar.b && this.c == xuaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ this.b) * 1000003) ^ i;
    }

    public final String toString() {
        return "ConversationSettingsInput{conversationId=" + this.a.toString() + ", joinState=" + this.b + ", hasRbmBotRecipient=" + this.c + "}";
    }

    public xua(ConversationIdType conversationIdType, int i, boolean z) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = i;
        this.c = z;
    }
}
