package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeew {
    public final int a;

    public aeew(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aeew) && this.a == ((aeew) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.bm(i);
        return i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Verdict(policyViolation=");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                str = "SUSPICIOUS";
            } else {
                str = "NONE";
            }
        } else {
            str = "UNKNOWN";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
