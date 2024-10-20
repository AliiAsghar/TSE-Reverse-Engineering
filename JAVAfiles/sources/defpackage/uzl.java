package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzl {
    public final alog a;
    public final boolean b;
    private final int c;

    public uzl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzl) {
            uzl uzlVar = (uzl) obj;
            if (this.c == uzlVar.c && alzz.at(this.a, uzlVar.a) && this.b == uzlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.c ^ 1000003) * 1000003) ^ this.a.hashCode();
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "ConversationDeletionResult{numberOfDeletedMessages=" + this.c + ", messageUrisDeleted=" + String.valueOf(this.a) + ", isConversationDeleted=" + this.b + "}";
    }

    public uzl(int i, alog alogVar, boolean z) {
        this.c = i;
        this.a = alogVar;
        this.b = z;
    }
}
