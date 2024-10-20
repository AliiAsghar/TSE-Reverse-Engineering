package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqn implements aeqk {
    public final aewe a;
    public final String b;
    public final arqg c;
    public final aehx d;
    public final aeqn e;

    public aeqn(aewe aeweVar, String str, arqg arqgVar, aehx aehxVar) {
        arqgVar.getClass();
        this.a = aeweVar;
        this.b = str;
        this.c = arqgVar;
        this.d = aehxVar;
        this.e = this;
    }

    @Override // defpackage.aeqk
    public final aeqn a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqn)) {
            return false;
        }
        aeqn aeqnVar = (aeqn) obj;
        if (d.F(this.a, aeqnVar.a) && d.F(this.b, aeqnVar.b) && d.F(this.c, aeqnVar.c) && d.F(this.d, aeqnVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        aehx aehxVar = this.d;
        if (aehxVar == null) {
            hashCode = 0;
        } else {
            hashCode = aehxVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "FavoriteUiData(monogram=" + this.a + ", text=" + this.b + ", onClick=" + this.c + ", onRemove=" + this.d + ")";
    }

    public /* synthetic */ aeqn(aewe aeweVar, String str, arqg arqgVar, aehx aehxVar, int i) {
        this(aeweVar, str, (i & 4) != 0 ? aepz.e : arqgVar, (i & 8) != 0 ? null : aehxVar);
    }
}
