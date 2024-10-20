package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjy {
    public final String a;
    public final ConversationIdType b;
    public final ConversationId c;
    public final String d;
    public final boolean e;
    public final Optional f;
    public final int g;
    public final IconCompat h;
    public final Optional i;
    public final Optional j;
    public final Optional k;

    public vjy() {
        throw null;
    }

    public static vjx a() {
        vjx vjxVar = new vjx(null);
        vjxVar.e(Optional.empty());
        vjxVar.e = Optional.empty();
        vjxVar.d = Optional.empty();
        vjxVar.f = Optional.empty();
        return vjxVar;
    }

    public final boolean equals(Object obj) {
        IconCompat iconCompat;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vjy) {
            vjy vjyVar = (vjy) obj;
            if (this.a.equals(vjyVar.a) && this.b.equals(vjyVar.b) && this.c.equals(vjyVar.c) && this.d.equals(vjyVar.d) && this.e == vjyVar.e && this.f.equals(vjyVar.f) && this.g == vjyVar.g && ((iconCompat = this.h) != null ? iconCompat.equals(vjyVar.h) : vjyVar.h == null) && this.i.equals(vjyVar.i) && this.j.equals(vjyVar.j) && this.k.equals(vjyVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode3 = (((hashCode2 * 1000003) ^ i) * 1000003) ^ this.f.hashCode();
        IconCompat iconCompat = this.h;
        if (iconCompat == null) {
            hashCode = 0;
        } else {
            hashCode = iconCompat.hashCode();
        }
        return (((((((((hashCode3 * 1000003) ^ this.g) * 1000003) ^ hashCode) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        Optional optional = this.k;
        Optional optional2 = this.j;
        Optional optional3 = this.i;
        IconCompat iconCompat = this.h;
        Optional optional4 = this.f;
        ConversationId conversationId = this.c;
        return "ConversationSpecificNotificationInfo{shortcutId=" + this.a + ", conversationId=" + String.valueOf(this.b) + ", mapiConversationId=" + String.valueOf(conversationId) + ", conversationLabel=" + this.d + ", isGroup=" + this.e + ", otherParticipantMessagingIdentity=" + String.valueOf(optional4) + ", shortcutRank=" + this.g + ", conversationIcon=" + String.valueOf(iconCompat) + ", bubbleClickInteractionInfo=" + String.valueOf(optional3) + ", bubbleSwipeInteractionInfo=" + String.valueOf(optional2) + ", peopleInConversation=" + String.valueOf(optional) + "}";
    }

    public vjy(String str, ConversationIdType conversationIdType, ConversationId conversationId, String str2, boolean z, Optional optional, int i, IconCompat iconCompat, Optional optional2, Optional optional3, Optional optional4) {
        this.a = str;
        this.b = conversationIdType;
        this.c = conversationId;
        this.d = str2;
        this.e = z;
        this.f = optional;
        this.g = i;
        this.h = iconCompat;
        this.i = optional2;
        this.j = optional3;
        this.k = optional4;
    }
}
