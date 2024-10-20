package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdw {
    public final ascv a;
    public final arqg b;

    public zdw(ascv ascvVar, arqg arqgVar) {
        this.a = ascvVar;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdw)) {
            return false;
        }
        zdw zdwVar = (zdw) obj;
        if (d.F(this.a, zdwVar.a) && d.F(this.b, zdwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ToastUiData(text=" + this.a + ", onToastShown=" + this.b + ")";
    }
}
