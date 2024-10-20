package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rer {
    public final smr a;
    public final boolean b;

    public rer() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rer) {
            rer rerVar = (rer) obj;
            if (this.a.equals(rerVar.a) && this.b == rerVar.b) {
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
        return "ConversationMatchResult{conversation=" + this.a.toString() + ", isNewConversation=" + this.b + "}";
    }

    public rer(smr smrVar, boolean z) {
        if (smrVar == null) {
            throw new NullPointerException("Null conversation");
        }
        this.a = smrVar;
        this.b = z;
    }
}
