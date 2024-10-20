package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewr {
    public final String a;
    public final boolean b;
    public final arqg c;

    public aewr(String str, boolean z, arqg arqgVar) {
        str.getClass();
        arqgVar.getClass();
        this.a = str;
        this.b = z;
        this.c = arqgVar;
    }

    public static /* synthetic */ aewr a(aewr aewrVar, arqg arqgVar) {
        return new aewr(aewrVar.a, aewrVar.b, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewr)) {
            return false;
        }
        aewr aewrVar = (aewr) obj;
        if (d.F(this.a, aewrVar.a) && this.b == aewrVar.b && d.F(this.c, aewrVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PopupButton(text=" + this.a + ", enabled=" + this.b + ", onClick=" + this.c + ")";
    }

    public /* synthetic */ aewr(String str, arqg arqgVar) {
        this(str, true, arqgVar);
    }
}
