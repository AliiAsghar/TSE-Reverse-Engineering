package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsm {
    public final String a;
    public final boolean b;

    public zsm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zsm) {
            zsm zsmVar = (zsm) obj;
            if (this.a.equals(zsmVar.a) && this.b == zsmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "EnabledState{key=" + this.a + ", enabled=" + this.b + "}";
    }

    public zsm(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
