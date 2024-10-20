package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmr implements lkf {
    public final ConversationId a;
    public final String b;

    public lmr(ConversationId conversationId, String str) {
        str.getClass();
        this.a = conversationId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmr)) {
            return false;
        }
        lmr lmrVar = (lmr) obj;
        if (d.F(this.a, lmrVar.a) && d.F(this.b, lmrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InfoAndOptions(conversationId=" + this.a + ", rbmBotId=" + this.b + ")";
    }
}
