package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkb {
    public final wfo a;
    public final String b;

    public adkb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adkb) {
            adkb adkbVar = (adkb) obj;
            if (this.a.equals(adkbVar.a)) {
                String str = this.b;
                String str2 = adkbVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "GoogleToSConsent{googleToSConsentState=" + this.a.toString() + ", token=" + this.b + "}";
    }

    public adkb(wfo wfoVar, String str) {
        if (wfoVar == null) {
            throw new NullPointerException("Null googleToSConsentState");
        }
        this.a = wfoVar;
        this.b = str;
    }
}
