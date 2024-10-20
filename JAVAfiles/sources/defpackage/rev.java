package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rev {
    public final String a;
    public final String b;
    public final boolean c;

    public rev() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rev) {
            rev revVar = (rev) obj;
            if (this.a.equals(revVar.a) && this.b.equals(revVar.b) && this.c == revVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "RawMessagingAddress{originatingAddress=" + this.a + ", displayOriginatingAddress=" + this.b + ", isEmail=" + this.c + "}";
    }

    public rev(String str, String str2, boolean z) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null displayOriginatingAddress");
        }
        this.b = str2;
        this.c = z;
    }
}
