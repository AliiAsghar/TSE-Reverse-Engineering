package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agst {
    public final String a;
    public final long b;

    public agst() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agst) {
            agst agstVar = (agst) obj;
            if (this.a.equals(agstVar.a) && this.b == agstVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        algv aj = albo.aj(this);
        aj.b("OS", this.a);
        if (true != ahax.a) {
            str = "";
        } else {
            str = " (.apk's timestamp is used as versionCode for DEV flavor)";
        }
        aj.b("versionCode", this.b + str);
        return aj.toString();
    }

    public agst(String str, long j) {
        if (str == null) {
            throw new NullPointerException("Null osVersion");
        }
        this.a = str;
        this.b = j;
    }
}
