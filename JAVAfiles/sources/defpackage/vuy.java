package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vuy {
    public final ConversationIdType a;
    public final String b;
    public final String c;

    public vuy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vuy) {
            vuy vuyVar = (vuy) obj;
            if (this.a.equals(vuyVar.a) && this.b.equals(vuyVar.b) && this.c.equals(vuyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Identifiers{conversationId=" + String.valueOf(this.a) + ", groupId=" + this.b + ", telephonyRecipientId=" + this.c + "}";
    }

    public vuy(ConversationIdType conversationIdType, String str, String str2) {
        this.a = conversationIdType;
        this.b = str;
        this.c = str2;
    }
}
