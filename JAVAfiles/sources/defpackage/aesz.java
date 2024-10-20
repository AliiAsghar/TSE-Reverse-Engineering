package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesz implements aesg {
    public final char a;
    public final int b;
    public final String c;
    public final String d;
    public final arqg e;

    public aesz(char c, int i, String str, String str2, arqg arqgVar) {
        this.a = c;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesz)) {
            return false;
        }
        aesz aeszVar = (aesz) obj;
        if (this.a == aeszVar.a && this.b == aeszVar.b && d.F(this.c, aeszVar.c) && d.F(this.d, aeszVar.d) && d.F(this.e, aeszVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "SimListItemUiData(iconChar=" + this.a + ", iconTint=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", onClick=" + this.e + ")";
    }
}
