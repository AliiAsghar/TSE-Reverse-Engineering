package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhw {
    public final String a;
    public final arqg b;

    public lhw(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhw)) {
            return false;
        }
        lhw lhwVar = (lhw) obj;
        if (d.F(this.a, lhwVar.a) && d.F(this.b, lhwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ClickableText(text=" + this.a + ", onToggle=" + this.b + ")";
    }
}
