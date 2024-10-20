package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwa {
    public final ConversationIdType a;
    public final apwt b;

    public xwa() {
        throw null;
    }

    public static xwa b(ConversationIdType conversationIdType, xhv xhvVar) {
        return new xwa(conversationIdType, new mrr(xhvVar, 3));
    }

    public final xhv a() {
        return (xhv) this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xwa) {
            xwa xwaVar = (xwa) obj;
            if (this.a.equals(xwaVar.a) && this.b.equals(xwaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        apwt apwtVar = this.b;
        return "ConversationIdAndThreadId{conversationId=" + this.a.toString() + ", threadIdLazy=" + apwtVar.toString() + "}";
    }

    public xwa(ConversationIdType conversationIdType, apwt apwtVar) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = apwtVar;
    }
}
