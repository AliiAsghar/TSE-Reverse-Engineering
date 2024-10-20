package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldl {
    public final int a;
    public final int b;

    public ldl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ldl) {
            ldl ldlVar = (ldl) obj;
            if (this.a == ldlVar.a && this.b == ldlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "DeleteConversationDialogInfo{title=" + this.a + ", body=" + this.b + "}";
    }

    public ldl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
