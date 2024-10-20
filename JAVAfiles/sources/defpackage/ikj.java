package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikj {
    public final int a;
    public final int b;

    public ikj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ikj) {
            ikj ikjVar = (ikj) obj;
            if (this.a == ikjVar.a && this.b == ikjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "ConversationMessagesUpdated{messageCount=" + this.a + ", unreadCount=" + this.b + "}";
    }

    public ikj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
