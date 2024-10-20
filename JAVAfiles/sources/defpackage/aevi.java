package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevi implements aevl {
    public final arqg a;

    public aevi(arqg arqgVar) {
        this.a = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aevi) && d.F(this.a, ((aevi) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoConnection(onCancelButtonClicked=" + this.a + ")";
    }

    public aevi() {
        this(aewh.b);
    }
}
