package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxk {
    public final ConversationIdType a;
    public final long b;
    public final boolean c;
    public final Optional d;

    public kxk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxk) {
            kxk kxkVar = (kxk) obj;
            if (this.a.equals(kxkVar.a) && this.b == kxkVar.b && this.c == kxkVar.c && this.d.equals(kxkVar.d)) {
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
        long j = this.b;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        return "ConversationKey{conversationId=" + this.a.toString() + ", sortTimestamp=" + this.b + ", pinStatus=" + this.c + ", nudgeAdjustedTimestamp=" + optional.toString() + "}";
    }

    public kxk(ConversationIdType conversationIdType, long j, boolean z, Optional optional) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = j;
        this.c = z;
        if (optional != null) {
            this.d = optional;
            return;
        }
        throw new NullPointerException("Null nudgeAdjustedTimestamp");
    }
}
