package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeyn {
    public final aeyo a;
    public final String b;
    public final arqg c;

    public aeyn(aeyo aeyoVar, String str, arqg arqgVar) {
        this.a = aeyoVar;
        this.b = str;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeyn)) {
            return false;
        }
        aeyn aeynVar = (aeyn) obj;
        if (d.F(this.a, aeynVar.a) && d.F(this.b, aeynVar.b) && d.F(this.c, aeynVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SimChipUiData(simIconUiData=" + this.a + ", carrierName=" + this.b + ", onClick=" + this.c + ")";
    }
}
