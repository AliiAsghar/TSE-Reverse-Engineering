package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aept {
    public final List a;
    public final arqr b;
    public final arqg c;
    public final arqg d;
    public final cas e;

    public aept() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aept)) {
            return false;
        }
        aept aeptVar = (aept) obj;
        if (d.F(this.a, aeptVar.a) && d.F(this.b, aeptVar.b) && d.F(this.c, aeptVar.c) && d.F(this.d, aeptVar.d) && d.F(this.e, aeptVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ContactBarUiData(chips=" + this.a + ", onSearchTextChange=" + this.b + ", onBackspaceInput=" + this.c + ", onDoneInput=" + this.d + ", searchText=" + this.e + ")";
    }

    public aept(List list, arqr arqrVar, arqg arqgVar, arqg arqgVar2, cas casVar) {
        this.a = list;
        this.b = arqrVar;
        this.c = arqgVar;
        this.d = arqgVar2;
        this.e = casVar;
    }

    public /* synthetic */ aept(byte[] bArr) {
        this(arnv.a, aedh.n, accd.t, accd.u, new byu("", cav.a));
    }
}
