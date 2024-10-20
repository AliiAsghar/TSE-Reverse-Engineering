package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesm implements aesp {
    public final aewe a;
    public final String b;
    public final String c;
    public final List d;
    public final arqg e;

    public aesm(aewe aeweVar, String str, String str2, List list, arqg arqgVar) {
        this.a = aeweVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesm)) {
            return false;
        }
        aesm aesmVar = (aesm) obj;
        if (d.F(this.a, aesmVar.a) && d.F(this.b, aesmVar.b) && d.F(this.c, aesmVar.c) && d.F(this.d, aesmVar.d) && d.F(this.e, aesmVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Redirecting(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", annotations=" + this.d + ", onClick=" + this.e + ")";
    }
}
