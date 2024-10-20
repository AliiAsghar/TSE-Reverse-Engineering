package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelr {
    public final aeln a;
    public final arqg b;
    public final aelk c;

    public aelr(aelk aelkVar, aeln aelnVar, arqg arqgVar) {
        aelnVar.getClass();
        this.c = aelkVar;
        this.a = aelnVar;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aelr)) {
            return false;
        }
        aelr aelrVar = (aelr) obj;
        if (d.F(this.c, aelrVar.c) && this.a == aelrVar.a && d.F(this.b, aelrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BannerUiData(content=" + this.c + ", state=" + this.a + ", onExpandClicked=" + this.b + ")";
    }
}
