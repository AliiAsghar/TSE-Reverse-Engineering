package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admz {
    public final apkn a;
    public final String b;
    public final String c;
    public final apih d;
    public final int e;

    public admz() {
        throw null;
    }

    public static admy a(int i, String str, String str2) {
        admy admyVar = new admy();
        admyVar.d(apkn.RCS_PROVISIONING_UNKNOWN_STATE);
        admyVar.d = i;
        admyVar.c(str);
        admyVar.b(str2);
        return admyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof admz) {
            admz admzVar = (admz) obj;
            if (this.a.equals(admzVar.a)) {
                int i = this.e;
                int i2 = admzVar.e;
                if (i != 0) {
                    if (i == i2 && this.b.equals(admzVar.b) && this.c.equals(admzVar.c) && this.d.equals(admzVar.d)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.e;
        a.bm(i);
        return (((((((hashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        int i = this.e;
        if (i != 0) {
            str = appn.i(i);
        } else {
            str = "null";
        }
        return "ProvisioningHttpResponse{requestState=" + valueOf + ", provisioningEngineWorker=" + str + ", requestId=" + this.b + ", provisioningSessionId=" + this.c + ", httpResponseEvent=" + String.valueOf(this.d) + "}";
    }

    public admz(apkn apknVar, int i, String str, String str2, apih apihVar) {
        this.a = apknVar;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = apihVar;
    }
}
