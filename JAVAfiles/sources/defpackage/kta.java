package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kta {
    public static final uuf a = uuh.e(uuh.b, "default_max_conversation_count", 5);
    public static final uuf b = uuh.e(uuh.b, "default_max_message_count", 20);
    public final int c;
    public final int d;
    public final lga e;

    public kta() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kta) {
            kta ktaVar = (kta) obj;
            if (this.c == ktaVar.c && this.d == ktaVar.d && this.e.equals(ktaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "ProblematicConversationDataRequest{maxConversationCount=" + this.c + ", maxMessageCount=" + this.d + ", converter=" + String.valueOf(this.e) + "}";
    }

    public kta(int i, int i2, lga lgaVar) {
        this.c = i;
        this.d = i2;
        this.e = lgaVar;
    }
}
