package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afiu {
    public final long a;

    public afiu(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afiu) && this.a == ((afiu) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return "UserContext(conversationId=" + this.a + ")";
    }
}
