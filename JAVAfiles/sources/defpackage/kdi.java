package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdi {
    public final arqr a;
    public final String b;

    public kdi(arqr arqrVar) {
        this.a = arqrVar;
        this.b = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdi)) {
            return false;
        }
        kdi kdiVar = (kdi) obj;
        if (d.F(this.a, kdiVar.a) && d.F(this.b, kdiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DoubleTapUiData(onDoubleTap=" + this.a + ", label=" + this.b + ")";
    }

    public kdi() {
        this(jyp.c);
    }
}
