package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aest implements aesg {
    public final String a;
    public final String b;
    public final boolean c;
    public final arqg d;

    public aest(String str, String str2, boolean z, arqg arqgVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aest)) {
            return false;
        }
        aest aestVar = (aest) obj;
        if (d.F(this.a, aestVar.a) && d.F(this.b, aestVar.b) && this.c == aestVar.c && d.F(this.d, aestVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RadioButtonListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", isSelected=" + this.c + ", onClick=" + this.d + ")";
    }
}
