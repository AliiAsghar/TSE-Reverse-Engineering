package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelj {
    public final String a;
    public final arqg b;

    public aelj(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aelj)) {
            return false;
        }
        aelj aeljVar = (aelj) obj;
        if (d.F(this.a, aeljVar.a) && d.F(this.b, aeljVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BannerButtonData(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
