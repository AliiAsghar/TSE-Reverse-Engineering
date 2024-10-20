package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwi {
    public final tqk a;
    public final String b;

    public rwi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rwi) {
            rwi rwiVar = (rwi) obj;
            if (this.a.equals(rwiVar.a) && this.b.equals(rwiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RecipientInfo{recipientType=" + this.a.toString() + ", recipientValue=" + this.b + "}";
    }

    public rwi(tqk tqkVar, String str) {
        if (tqkVar == null) {
            throw new NullPointerException("Null recipientType");
        }
        this.a = tqkVar;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null recipientValue");
    }
}
