package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjs {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public gjs(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gjs) {
            gjs gjsVar = (gjs) obj;
            if (d.F(this.a, gjsVar.a) && d.F(this.b, gjsVar.b) && d.F(this.c, gjsVar.c) && d.F(this.d, gjsVar.d)) {
                return d.F(this.e, gjsVar.e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        String l;
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        gvf.bs(aqjn.at(this.d));
        sb.append(arnb.a);
        sb.append("\n            |   referenceColumnNames = {");
        gvf.br(aqjn.at(this.e));
        sb.append(arnb.a);
        sb.append("\n            |}\n        ");
        l = arrn.l(arrn.i(arsd.L(arsd.s(sb.toString())), new arnd(4, (byte[]) null)), "\n");
        return l;
    }
}
