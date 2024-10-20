package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevk implements aevl {
    public final Float a;
    public final arqg b;

    public aevk(Float f, arqg arqgVar) {
        this.a = f;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevk)) {
            return false;
        }
        aevk aevkVar = (aevk) obj;
        if (d.F(this.a, aevkVar.a) && d.F(this.b, aevkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Float f = this.a;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Transferring(progressPercentage=" + this.a + ", onCancelButtonClicked=" + this.b + ")";
    }
}
