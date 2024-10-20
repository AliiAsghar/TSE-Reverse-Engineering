package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtn {
    public final adiw a;
    public final xtg b;

    public xtn(adiw adiwVar, xtg xtgVar) {
        adiwVar.getClass();
        xtgVar.getClass();
        this.a = adiwVar;
        this.b = xtgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtn)) {
            return false;
        }
        xtn xtnVar = (xtn) obj;
        if (d.F(this.a, xtnVar.a) && this.b == xtnVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NonTachygram(simId=" + this.a + ", transport=" + this.b + ")";
    }
}
