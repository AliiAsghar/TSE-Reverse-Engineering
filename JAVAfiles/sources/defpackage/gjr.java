package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjr {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public gjr(String str, String str2, boolean z, int i, String str3, int i2) {
        int i3;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (arsd.O(upperCase, "INT")) {
            i3 = 3;
        } else {
            int i4 = 2;
            if (!arsd.O(upperCase, "CHAR") && !arsd.O(upperCase, "CLOB") && !arsd.O(upperCase, "TEXT")) {
                if (arsd.O(upperCase, "BLOB")) {
                    i3 = 5;
                } else {
                    i4 = 4;
                    if (!arsd.O(upperCase, "REAL") && !arsd.O(upperCase, "FLOA") && !arsd.O(upperCase, "DOUB")) {
                        i3 = 1;
                    }
                }
            }
            i3 = i4;
        }
        this.g = i3;
    }

    public final boolean a() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof gjr) {
            gjr gjrVar = (gjr) obj;
            if (a() == gjrVar.a() && d.F(this.a, gjrVar.a) && this.c == gjrVar.c && ((this.f != 1 || gjrVar.f != 2 || (str3 = this.e) == null || gvf.bt(str3, gjrVar.e)) && ((this.f != 2 || gjrVar.f != 1 || (str2 = gjrVar.e) == null || gvf.bt(str2, this.e)) && ((this.f != gjrVar.f || ((str = this.e) == null ? gjrVar.e == null : gvf.bt(str, gjrVar.e))) && this.g == gjrVar.g)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((hashCode + this.g) * 31) + i) * 31) + this.d;
    }

    public final String toString() {
        String l;
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        l = arrn.l(arrn.i(arsd.L(arsd.s(sb.toString())), new arnd(4, (byte[]) null)), "\n");
        return l;
    }
}
