package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahx extends aaia {
    private final ConversationIdType a;
    private final boolean b;

    public aahx(ConversationIdType conversationIdType, boolean z) {
        if (conversationIdType != null) {
            this.a = conversationIdType;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.aaia
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.aaia
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaia) {
            aaia aaiaVar = (aaia) obj;
            if (this.a.equals(aaiaVar.a()) && this.b == aaiaVar.b()) {
                aaiaVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        a.bm(3);
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ 3;
    }

    public final String toString() {
        int M = a.M(3);
        return "ConversationMarkAsReadOrUnreadEvent{conversationId=" + this.a.toString() + ", newReadStatus=" + this.b + ", origin=" + Integer.toString(M) + "}";
    }

    @Override // defpackage.aaia
    public final void c() {
    }
}
