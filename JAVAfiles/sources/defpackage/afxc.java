package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxc {
    public final int a;
    public final afxb b;
    public final List c;
    public final arqr d;
    private final afxb e;

    public /* synthetic */ afxc(int i, afxb afxbVar, List list, arqr arqrVar, int i2) {
        list = (i2 & 8) != 0 ? arnv.a : list;
        afxbVar.getClass();
        list.getClass();
        this.a = i;
        this.b = afxbVar;
        this.e = null;
        this.c = list;
        this.d = arqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afxc)) {
            return false;
        }
        afxc afxcVar = (afxc) obj;
        if (this.a != afxcVar.a || !d.F(this.b, afxcVar.b)) {
            return false;
        }
        afxb afxbVar = afxcVar.e;
        if (d.F(null, null) && d.F(this.c, afxcVar.c) && d.F(this.d, afxcVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 961) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "HugoShortcut(title=" + this.a + ", icon=" + this.b + ", badgeIcon=null, permissions=" + this.c + ")";
    }
}
