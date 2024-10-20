package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accp {
    private final String a;
    private final algw b;

    public accp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof accp) {
            accp accpVar = (accp) obj;
            if (this.a.equals(accpVar.a) && this.b.equals(accpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CallerInfo{appPackage=" + this.a + ", appVersionCode=" + this.b.toString() + "}";
    }

    public accp(String str, algw algwVar) {
        if (str == null) {
            throw new NullPointerException("Null appPackage");
        }
        this.a = str;
        this.b = algwVar;
    }
}
