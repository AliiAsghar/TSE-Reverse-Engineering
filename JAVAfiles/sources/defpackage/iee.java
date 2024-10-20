package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iee {
    public final String a;
    public final arqg b;

    public iee(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iee)) {
            return false;
        }
        iee ieeVar = (iee) obj;
        if (d.F(this.a, ieeVar.a) && d.F(this.b, ieeVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FullBannerButton(text=" + this.a + ", callback=" + this.b + ")";
    }
}
