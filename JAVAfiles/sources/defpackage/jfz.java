package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfz {
    public final ascv a;
    public final ascv b;
    public final kjp c;

    public jfz(ascv ascvVar, kjp kjpVar, ascv ascvVar2) {
        ascvVar.getClass();
        this.a = ascvVar;
        this.c = kjpVar;
        this.b = ascvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfz)) {
            return false;
        }
        jfz jfzVar = (jfz) obj;
        if (d.F(this.a, jfzVar.a) && d.F(this.c, jfzVar.c) && d.F(this.b, jfzVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BottomContentUiData(composeRowHolderUiData=" + this.a + ", messageListInsets=" + this.c + ", toolstoneUiData=" + this.b + ")";
    }
}
