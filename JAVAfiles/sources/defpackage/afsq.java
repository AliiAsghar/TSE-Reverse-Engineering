package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsq {
    private final String a;
    private final String b;

    public afsq(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afsq)) {
            return false;
        }
        afsq afsqVar = (afsq) obj;
        if (d.F(this.a, afsqVar.a) && d.F(this.b, afsqVar.b)) {
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
        String str = this.b;
        if (str == null) {
            return this.a;
        }
        return this.a + "=" + str;
    }
}
