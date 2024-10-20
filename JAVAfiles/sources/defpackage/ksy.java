package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksy {
    public final alog a;
    public final SpannableString b;
    public final ConversationIdType c;

    public ksy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksy) {
            ksy ksyVar = (ksy) obj;
            if (alzz.at(this.a, ksyVar.a) && this.b.equals(ksyVar.b) && this.c.equals(ksyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ConversationIdType conversationIdType = this.c;
        SpannableString spannableString = this.b;
        return "ProblematicConversation{problematicMessages=" + String.valueOf(this.a) + ", conversationName=" + String.valueOf(spannableString) + ", conversationId=" + String.valueOf(conversationIdType) + "}";
    }

    public ksy(alog alogVar, SpannableString spannableString, ConversationIdType conversationIdType) {
        this.a = alogVar;
        this.b = spannableString;
        this.c = conversationIdType;
    }
}
