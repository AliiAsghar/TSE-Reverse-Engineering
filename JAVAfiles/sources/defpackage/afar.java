package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afar implements afat {
    public final String a;
    public final String b;
    public final boolean c;
    public final arqr d;
    public final arqg e;

    public afar(String str, String str2, boolean z, arqr arqrVar, arqg arqgVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = arqrVar;
        this.e = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afar)) {
            return false;
        }
        afar afarVar = (afar) obj;
        if (d.F(this.a, afarVar.a) && d.F(this.b, afarVar.b) && this.c == afarVar.c && d.F(this.d, afarVar.d) && d.F(this.e, afarVar.e)) {
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
        return ((((((hashCode2 + hashCode) * 31) + a.v(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "SearchBox(initialQuery=" + this.a + ", hintText=" + this.b + ", useBodyMedium=" + this.c + ", onTextChange=" + this.d + ", onSearch=" + this.e + ")";
    }
}
