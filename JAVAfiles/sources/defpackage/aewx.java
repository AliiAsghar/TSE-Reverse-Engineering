package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewx {
    public final aewe a;
    public final String b;
    public final arqg c;
    private final String d;
    private final boolean e;

    public aewx(aewe aeweVar, String str, arqg arqgVar) {
        str.getClass();
        this.a = aeweVar;
        this.d = null;
        this.b = str;
        this.e = true;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewx)) {
            return false;
        }
        aewx aewxVar = (aewx) obj;
        if (!d.F(this.a, aewxVar.a)) {
            return false;
        }
        String str = aewxVar.d;
        if (!d.F(null, null) || !d.F(this.b, aewxVar.b)) {
            return false;
        }
        boolean z = aewxVar.e;
        if (d.F(this.c, aewxVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HeaderUiData(monogram=" + this.a + ", title=null, description=" + this.b + ", useLegacyStyle=true, onClick=" + this.c + ")";
    }
}
