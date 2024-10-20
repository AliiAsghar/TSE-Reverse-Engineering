package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhg implements jhi {
    public final jhd a;
    public final String b;

    public jhg() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhg)) {
            return false;
        }
        jhg jhgVar = (jhg) obj;
        if (this.a != jhgVar.a) {
            return false;
        }
        String str = jhgVar.b;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Emotive(screen=" + this.a + ", initialSearchTerm=null)";
    }

    public /* synthetic */ jhg(jhd jhdVar, int i) {
        jhdVar = (i & 1) != 0 ? jhk.a : jhdVar;
        jhdVar.getClass();
        this.a = jhdVar;
        this.b = null;
    }
}
