package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesj implements aesp {
    public final aewe a;
    public final String b;
    public final List c;
    public final String d;
    public final List e;
    public final String f;
    private final arqg g;

    public aesj(aewe aeweVar, String str, List list, String str2, List list2, String str3) {
        list.getClass();
        this.a = aeweVar;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = list2;
        this.f = str3;
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesj)) {
            return false;
        }
        aesj aesjVar = (aesj) obj;
        if (!d.F(this.a, aesjVar.a) || !d.F(this.b, aesjVar.b) || !d.F(this.c, aesjVar.c) || !d.F(this.d, aesjVar.d) || !d.F(this.e, aesjVar.e) || !d.F(this.f, aesjVar.f)) {
            return false;
        }
        arqg arqgVar = aesjVar.g;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((((hashCode2 * 31) + hashCode) * 31) + 1) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (i2 + i) * 31;
    }

    public final String toString() {
        return "Actionable(monogram=" + this.a + ", title=" + this.b + ", actions=" + this.c + ", subtitle=" + this.d + ", annotations=" + this.e + ", tertiaryText=" + this.f + ", onClick=null)";
    }
}
