package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yem {
    public final String a;
    public final String b;

    public yem() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yem) {
            yem yemVar = (yem) obj;
            if (this.a.equals(yemVar.a) && this.b.equals(yemVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TenorRegisterShareRequest{gifObjectId=" + this.a + ", query=" + this.b + "}";
    }

    public yem(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null gifObjectId");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null query");
    }
}
