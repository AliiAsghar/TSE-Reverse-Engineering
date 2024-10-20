package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyh {
    public final String a;
    public final String b;

    public zyh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyh)) {
            return false;
        }
        zyh zyhVar = (zyh) obj;
        if (d.F(this.a, zyhVar.a) && d.F(this.b, zyhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SelfIdentityNameAndDestination(name=" + this.a + ", destination=" + this.b + ")";
    }
}
