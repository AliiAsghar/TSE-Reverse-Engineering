package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjt {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public gjt(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gjt) {
            gjt gjtVar = (gjt) obj;
            if (this.b == gjtVar.b && d.F(this.c, gjtVar.c) && d.F(this.d, gjtVar.d)) {
                if (arsd.z(this.a, "index_", false)) {
                    return arsd.z(gjtVar.a, "index_", false);
                }
                return d.F(this.a, gjtVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (arsd.z(this.a, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = this.a.hashCode();
        }
        return (((((hashCode * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String l;
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        gvf.bs(this.c);
        sb.append(arnb.a);
        sb.append("\n            |   orders = {");
        gvf.br(this.d);
        sb.append(arnb.a);
        sb.append("\n            |}\n        ");
        l = arrn.l(arrn.i(arsd.L(arsd.s(sb.toString())), new arnd(4, (byte[]) null)), "\n");
        return l;
    }
}
