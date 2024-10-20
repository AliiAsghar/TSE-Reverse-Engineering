package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevh implements aevl {
    public final String a;
    public final arqg b;

    public aevh(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevh)) {
            return false;
        }
        aevh aevhVar = (aevh) obj;
        if (d.F(this.a, aevhVar.a) && d.F(this.b, aevhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Downloadable(label=" + this.a + ", onDownloadButtonClicked=" + this.b + ")";
    }
}
