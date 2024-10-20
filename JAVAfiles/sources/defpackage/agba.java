package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agba extends agbk {
    public final cj a;
    public final agar b;

    public agba(cj cjVar, agar agarVar) {
        this.a = cjVar;
        this.b = agarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agba)) {
            return false;
        }
        agba agbaVar = (agba) obj;
        if (d.F(this.a, agbaVar.a) && d.F(this.b, agbaVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Attached(activity=" + this.a + ", listener=" + this.b + ")";
    }
}
