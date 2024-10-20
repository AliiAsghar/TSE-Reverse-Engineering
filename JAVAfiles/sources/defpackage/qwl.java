package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwl {
    public final int a;
    private final String b;

    public qwl(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwl)) {
            return false;
        }
        qwl qwlVar = (qwl) obj;
        if (this.a == qwlVar.a && d.F(this.b, qwlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SubIdIccIdPair(subId=" + this.a + ", iccId=" + this.b + ")";
    }
}
