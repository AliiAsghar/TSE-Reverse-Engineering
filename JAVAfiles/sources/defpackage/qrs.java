package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrs {
    public final String a;
    public final String b;

    public qrs(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrs)) {
            return false;
        }
        qrs qrsVar = (qrs) obj;
        if (d.F(this.a, qrsVar.a) && d.F(this.b, qrsVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AppCapability(key=" + this.a + ", value=" + this.b + ")";
    }
}
