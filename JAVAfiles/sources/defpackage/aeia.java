package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeia {
    public final String a;
    public final aerb b;
    public final arqg c;
    private final boolean d = false;

    public aeia(String str, aerb aerbVar, arqg arqgVar) {
        this.a = str;
        this.b = aerbVar;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeia)) {
            return false;
        }
        aeia aeiaVar = (aeia) obj;
        if (!d.F(this.a, aeiaVar.a) || this.b != aeiaVar.b) {
            return false;
        }
        boolean z = aeiaVar.d;
        if (d.F(this.c, aeiaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "IconActionUiData(title=" + this.a + ", icon=" + this.b + ", shouldTint=false, execute=" + this.c + ")";
    }
}
