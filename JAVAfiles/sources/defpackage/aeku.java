package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeku {
    public final List a;
    public final arqg b;
    public final arqg c;
    private final String d;

    public aeku() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeku)) {
            return false;
        }
        aeku aekuVar = (aeku) obj;
        if (!d.F(this.a, aekuVar.a)) {
            return false;
        }
        String str = aekuVar.d;
        if (d.F(null, null) && d.F(this.b, aekuVar.b) && d.F(this.c, aekuVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BadgeGroupUiData(items=" + this.a + ", contentDescription=null, onClick=" + this.b + ", onShown=" + this.c + ")";
    }

    public /* synthetic */ aeku(List list, arqg arqgVar, arqg arqgVar2, int i) {
        list = (i & 1) != 0 ? arnv.a : list;
        arqgVar = (i & 4) != 0 ? accd.l : arqgVar;
        arqgVar2 = (i & 8) != 0 ? accd.m : arqgVar2;
        list.getClass();
        arqgVar.getClass();
        arqgVar2.getClass();
        this.a = list;
        this.d = null;
        this.b = arqgVar;
        this.c = arqgVar2;
    }
}
