package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kim {
    public final String a;
    public final String b;
    public final arqg c;

    public kim(String str, String str2, arqg arqgVar) {
        this.a = str;
        this.b = str2;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kim)) {
            return false;
        }
        kim kimVar = (kim) obj;
        if (d.F(this.a, kimVar.a) && d.F(this.b, kimVar.b) && d.F(this.c, kimVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RadioButtonsListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", onClick=" + this.c + ")";
    }
}
