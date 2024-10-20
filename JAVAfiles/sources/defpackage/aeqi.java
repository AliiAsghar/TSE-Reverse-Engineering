package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqi {
    public final String a;
    public final boolean b;
    public final arqg c;

    public aeqi(String str, boolean z, arqg arqgVar) {
        this.a = str;
        this.b = z;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqi)) {
            return false;
        }
        aeqi aeqiVar = (aeqi) obj;
        if (d.F(this.a, aeqiVar.a) && this.b == aeqiVar.b && d.F(this.c, aeqiVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ExpandableListButtonUiData(text=" + this.a + ", isListExpanded=" + this.b + ", onClick=" + this.c + ")";
    }
}
