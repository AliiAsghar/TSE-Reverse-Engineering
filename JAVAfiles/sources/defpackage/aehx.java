package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehx {
    public final String a;
    public final arqg b;

    public aehx(String str, arqg arqgVar) {
        arqgVar.getClass();
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aehx)) {
            return false;
        }
        aehx aehxVar = (aehx) obj;
        if (d.F(this.a, aehxVar.a) && d.F(this.b, aehxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccessibleCallback(onClickDescription=" + this.a + ", onClick=" + this.b + ")";
    }
}
