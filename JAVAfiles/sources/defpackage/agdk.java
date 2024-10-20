package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdk {
    public final arqg a;
    public final arqr b;

    public agdk(arqg arqgVar, arqr arqrVar) {
        this.a = arqgVar;
        this.b = arqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdk)) {
            return false;
        }
        agdk agdkVar = (agdk) obj;
        if (d.F(this.a, agdkVar.a) && d.F(this.b, agdkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RenderingHeightController(get=" + this.a + ", set=" + this.b + ")";
    }
}
