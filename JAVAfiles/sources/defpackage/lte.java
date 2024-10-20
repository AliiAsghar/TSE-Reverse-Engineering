package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lte {
    private final rve a;
    private final apwq b;

    public lte(rve rveVar, apwq apwqVar) {
        this.a = rveVar;
        this.b = apwqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lte)) {
            return false;
        }
        lte lteVar = (lte) obj;
        if (d.F(this.a, lteVar.a) && d.F(this.b, lteVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        apwq apwqVar = this.b;
        if (apwqVar == null) {
            hashCode = 0;
        } else {
            hashCode = apwqVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ReplyQueuedInfo(rcsMessageId=" + this.a + ", customCpimHeaders=" + this.b + ")";
    }
}
