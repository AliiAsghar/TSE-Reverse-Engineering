package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqz {
    public final amqz a;
    public final amrf b;

    public qqz() {
        throw null;
    }

    public static qqz a() {
        return new qqz(amqz.a, amrf.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qqz) {
            qqz qqzVar = (qqz) obj;
            if (this.a.equals(qqzVar.a) && this.b.equals(qqzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        amrf amrfVar = this.b;
        return "AnonymizedConversation{conversationInfo=" + this.a.toString() + ", conversationInfoForAnonymousLogger=" + amrfVar.toString() + "}";
    }

    public qqz(amqz amqzVar, amrf amrfVar) {
        if (amqzVar == null) {
            throw new NullPointerException("Null conversationInfo");
        }
        this.a = amqzVar;
        if (amrfVar != null) {
            this.b = amrfVar;
            return;
        }
        throw new NullPointerException("Null conversationInfoForAnonymousLogger");
    }
}
