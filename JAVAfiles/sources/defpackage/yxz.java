package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxz {
    public final String a;
    private final int b;

    public yxz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yxz) {
            yxz yxzVar = (yxz) obj;
            if (this.a.equals(yxzVar.a) && this.b == yxzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "SignatureData{signature=" + this.a + ", bannerText=" + this.b + "}";
    }

    public yxz(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
