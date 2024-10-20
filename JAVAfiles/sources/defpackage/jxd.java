package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxd {
    public final arqr a;
    public final arqg b;

    public jxd(arqr arqrVar, arqg arqgVar) {
        this.a = arqrVar;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxd)) {
            return false;
        }
        jxd jxdVar = (jxd) obj;
        if (d.F(this.a, jxdVar.a) && d.F(this.b, jxdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MenuButtonUiData(onClickConfirm=" + this.a + ", onClickCancel=" + this.b + ")";
    }
}
