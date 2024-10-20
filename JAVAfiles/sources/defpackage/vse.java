package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vse {
    public final Optional a;
    public final boolean b;

    public vse() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vse) {
            vse vseVar = (vse) obj;
            if (this.a.equals(vseVar.a) && this.b == vseVar.b) {
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
        return "ConversationIdAndThreadIdAndConversationCreationMetadata{conversationIdAndThreadId=" + String.valueOf(this.a) + ", conversationExistsByThreadId=" + this.b + "}";
    }

    public vse(Optional optional, boolean z) {
        this.a = optional;
        this.b = z;
    }
}
