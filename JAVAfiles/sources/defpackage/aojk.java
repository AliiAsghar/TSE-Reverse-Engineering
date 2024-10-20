package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aojk {
    public final String a;
    public final String b;

    public aojk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aojk) {
            aojk aojkVar = (aojk) obj;
            if (this.a.equals(aojkVar.a) && this.b.equals(aojkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }

    public aojk(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }
}
