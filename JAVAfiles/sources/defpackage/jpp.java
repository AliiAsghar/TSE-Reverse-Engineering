package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpp {
    public final jhc a;
    public final jhc b;

    public jpp(jhc jhcVar, jhc jhcVar2) {
        jhcVar.getClass();
        this.a = jhcVar;
        this.b = jhcVar2;
    }

    public final boolean a(arqr arqrVar) {
        if (!d.F(arqrVar.a(this.a), arqrVar.a(this.b))) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpp)) {
            return false;
        }
        jpp jppVar = (jpp) obj;
        if (d.F(this.a, jppVar.a) && d.F(this.b, jppVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftDiff(curr=" + this.a + ", prev=" + this.b + ")";
    }
}
