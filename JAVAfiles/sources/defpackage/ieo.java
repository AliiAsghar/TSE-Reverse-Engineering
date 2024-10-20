package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ieo implements idz {
    public final aelr a;
    public final arqg b;

    public ieo(aelr aelrVar, arqg arqgVar) {
        this.a = aelrVar;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieo)) {
            return false;
        }
        ieo ieoVar = (ieo) obj;
        if (d.F(this.a, ieoVar.a) && d.F(this.b, ieoVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FullBannerUiData(bannerUiData=" + this.a + ", onShownCallback=" + this.b + ")";
    }
}
