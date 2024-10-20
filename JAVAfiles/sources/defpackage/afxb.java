package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxb {
    public final int a;
    public final afxa b;

    public afxb(int i, afxa afxaVar) {
        this.a = i;
        this.b = afxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afxb)) {
            return false;
        }
        afxb afxbVar = (afxb) obj;
        if (this.a == afxbVar.a && d.F(this.b, afxbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", tints=" + this.b + ")";
    }
}
