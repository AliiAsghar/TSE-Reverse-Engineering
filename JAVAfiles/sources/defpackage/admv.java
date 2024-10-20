package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admv {
    public final apkn a;
    public final String b;
    public final String c;
    public final apia d;
    public final int e;

    public admv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof admv) {
            admv admvVar = (admv) obj;
            if (this.a.equals(admvVar.a)) {
                int i = this.e;
                int i2 = admvVar.e;
                if (i != 0) {
                    if (i == i2 && this.b.equals(admvVar.b) && this.c.equals(admvVar.c) && this.d.equals(admvVar.d)) {
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
        return "ProvisioningHttpFailure{requestState=" + valueOf + ", provisioningEngineWorker=" + str + ", requestId=" + this.b + ", provisioningSessionId=" + this.c + ", httpFailureEvent=" + String.valueOf(this.d) + "}";
    }

    public admv(apkn apknVar, int i, String str, String str2, apia apiaVar) {
        this.a = apknVar;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = apiaVar;
    }
}
