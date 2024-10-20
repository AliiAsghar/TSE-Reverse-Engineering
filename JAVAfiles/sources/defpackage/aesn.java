package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesn implements aesp {
    public final aewe a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final arqg f;

    public aesn(aewe aeweVar, String str, String str2, boolean z, List list, arqg arqgVar) {
        str2.getClass();
        this.a = aeweVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
        this.f = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesn)) {
            return false;
        }
        aesn aesnVar = (aesn) obj;
        if (d.F(this.a, aesnVar.a) && d.F(this.b, aesnVar.b) && d.F(this.c, aesnVar.c) && this.d == aesnVar.d && d.F(this.e, aesnVar.e) && d.F(this.f, aesnVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.v(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Selectable(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", isSelected=" + this.d + ", annotations=" + this.e + ", onToggle=" + this.f + ")";
    }

    public /* synthetic */ aesn(aewe aeweVar, String str, String str2, boolean z, arqg arqgVar) {
        this(aeweVar, str, str2, z, arnv.a, arqgVar);
    }
}
