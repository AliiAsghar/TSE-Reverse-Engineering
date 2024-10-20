package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rut {
    public final ConversationIdType a;
    public final boolean b;

    public rut() {
        throw null;
    }

    public static rut a(ConversationIdType conversationIdType) {
        aibf aibfVar = new aibf();
        aibfVar.j(conversationIdType);
        aibfVar.k(false);
        return aibfVar.i();
    }

    public static rut b(ConversationIdType conversationIdType) {
        aibf aibfVar = new aibf();
        aibfVar.j(conversationIdType);
        aibfVar.k(true);
        return aibfVar.i();
    }

    public final ConversationIdType c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rut) {
            rut rutVar = (rut) obj;
            if (this.a.equals(rutVar.a) && this.b == rutVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "CreateConversationResult{conversationId=" + String.valueOf(this.a) + ", newlyCreated=" + this.b + "}";
    }

    public rut(ConversationIdType conversationIdType, boolean z) {
        this.a = conversationIdType;
        this.b = z;
    }
}
