package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxm {
    public final String a;
    public final String b;
    public final String c;

    public vxm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxm) {
            vxm vxmVar = (vxm) obj;
            if (this.a.equals(vxmVar.a) && this.b.equals(vxmVar.b) && this.c.equals(vxmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "RcsGroupTelephonyData{groupName=" + this.a + ", selfRcsMsisdn=" + this.b + ", rcsGroupId=" + this.c + "}";
    }

    public vxm(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
