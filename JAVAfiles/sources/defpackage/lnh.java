package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnh implements lkg {
    public final ConversationId a;
    public final List b;

    public lnh() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnh)) {
            return false;
        }
        lnh lnhVar = (lnh) obj;
        if (d.F(this.a, lnhVar.a) && d.F(this.b, lnhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ParentalApprovalDialog(conversationId=" + this.a + ", messagingIdentities=" + this.b + ")";
    }

    public /* synthetic */ lnh(ConversationId conversationId, List list, int i) {
        conversationId = (i & 1) != 0 ? InvalidConversationId.a : conversationId;
        list = (i & 2) != 0 ? arnv.a : list;
        conversationId.getClass();
        list.getClass();
        this.a = conversationId;
        this.b = list;
    }
}
