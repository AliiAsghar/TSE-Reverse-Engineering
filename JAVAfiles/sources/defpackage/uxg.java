package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxg {
    private final ConversationIdType a;
    private final List b;
    private final boolean c;

    public uxg(ConversationIdType conversationIdType, List list, boolean z) {
        conversationIdType.getClass();
        list.getClass();
        this.a = conversationIdType;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxg)) {
            return false;
        }
        uxg uxgVar = (uxg) obj;
        if (d.F(this.a, uxgVar.a) && d.F(this.b, uxgVar.b) && this.c == uxgVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "ConversationAllowedStateQueryParameter(conversationId=" + this.a + ", participants=" + this.b + ", isNewConversation=" + this.c + ")";
    }
}
