package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvm {
    public final String a;
    public final String b;

    public uvm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uvm) {
            uvm uvmVar = (uvm) obj;
            if (this.a.equals(uvmVar.a) && this.b.equals(uvmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PsdData{psdKey=" + this.a + ", psdValue=" + this.b + "}";
    }

    public uvm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
