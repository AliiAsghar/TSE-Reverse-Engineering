package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesk implements aesp {
    public final aewe a;
    public final String b;
    public final String c;
    public final List d;
    public final arqg e;
    private final String f;

    public /* synthetic */ aesk(aewe aeweVar, String str, String str2, List list, arqg arqgVar, int i) {
        list = (i & 16) != 0 ? arnv.a : list;
        arqgVar = (i & 32) != 0 ? aepz.o : arqgVar;
        str2 = (i & 4) != 0 ? null : str2;
        list.getClass();
        arqgVar.getClass();
        this.a = aeweVar;
        this.b = str;
        this.c = str2;
        this.f = null;
        this.d = list;
        this.e = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesk)) {
            return false;
        }
        aesk aeskVar = (aesk) obj;
        if (!d.F(this.a, aeskVar.a) || !d.F(this.b, aeskVar.b) || !d.F(this.c, aeskVar.c)) {
            return false;
        }
        String str = aeskVar.f;
        if (d.F(null, null) && d.F(this.d, aeskVar.d) && d.F(this.e, aeskVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((hashCode2 * 31) + hashCode) * 961) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Basic(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", tertiaryText=null, annotations=" + this.d + ", onClick=" + this.e + ")";
    }
}
