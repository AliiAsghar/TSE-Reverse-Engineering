package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llj implements lkf {
    public final msh a;
    public final mdg b;

    public llj(msh mshVar, mdg mdgVar) {
        this.a = mshVar;
        this.b = mdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llj)) {
            return false;
        }
        llj lljVar = (llj) obj;
        if (d.F(this.a, lljVar.a) && d.F(this.b, lljVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        mdg mdgVar = this.b;
        if (mdgVar == null) {
            hashCode = 0;
        } else {
            hashCode = mdgVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return yyb.bh(super.toString()).toString();
    }
}
