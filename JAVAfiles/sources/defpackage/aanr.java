package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanr {
    public final int a;
    public final String b;
    public final String c;
    public final arqg d;

    public aanr(int i, String str, String str2, arqg arqgVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aanr)) {
            return false;
        }
        aanr aanrVar = (aanr) obj;
        if (this.a == aanrVar.a && d.F(this.b, aanrVar.b) && d.F(this.c, aanrVar.c) && d.F(this.d, aanrVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DBTool(key=" + this.a + ", descriptionText=" + this.b + ", buttonText=" + this.c + ", handler=" + this.d + ")";
    }
}
