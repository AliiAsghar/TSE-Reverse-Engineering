package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aomy {
    private final alvr a;
    private final String b;

    public aomy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aomy) {
            aomy aomyVar = (aomy) obj;
            if (this.a.equals(aomyVar.a)) {
                String str = this.b;
                String str2 = aomyVar.b;
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
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + "}";
    }

    public aomy(alvr alvrVar, String str) {
        this.a = alvrVar;
        this.b = str;
    }
}
