package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rty {
    public final int a;
    public final boolean b;

    public rty() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rty) {
            rty rtyVar = (rty) obj;
            if (this.a == rtyVar.a && this.b == rtyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ConversationTypeInfo{type=" + this.a + ", hasRbmRecipient=" + this.b + "}";
    }

    public rty(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
