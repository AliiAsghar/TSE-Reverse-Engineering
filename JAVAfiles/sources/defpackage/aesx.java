package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesx implements aesg {
    public final aevy a;
    public final String b;
    public final aetn d;
    public final String c = null;
    private final arqg e = null;

    public aesx(aevy aevyVar, String str, aetn aetnVar) {
        this.a = aevyVar;
        this.b = str;
        this.d = aetnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesx)) {
            return false;
        }
        aesx aesxVar = (aesx) obj;
        if (!d.F(this.a, aesxVar.a) || !d.F(this.b, aesxVar.b) || !d.F(this.d, aesxVar.d)) {
            return false;
        }
        String str = aesxVar.c;
        if (!d.F(null, null)) {
            return false;
        }
        arqg arqgVar = aesxVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 961;
    }

    public final String toString() {
        return "ReactionListItemUiData(monogram=" + this.a + ", title=" + this.b + ", reaction=" + this.d + ", subtitle=null, onClick=null)";
    }
}
