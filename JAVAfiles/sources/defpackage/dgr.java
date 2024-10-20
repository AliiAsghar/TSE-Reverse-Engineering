package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgr {
    public final String a;
    public final arqg b;

    public dgr(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgr)) {
            return false;
        }
        dgr dgrVar = (dgr) obj;
        if (d.F(this.a, dgrVar.a) && this.b == dgrVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
