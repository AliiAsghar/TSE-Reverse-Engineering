package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzx {
    public final int a;
    public final Object b;

    public afzx(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzx)) {
            return false;
        }
        afzx afzxVar = (afzx) obj;
        if (this.a == afzxVar.a && d.F(this.b, afzxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MenuItemAssociation(menuId=" + this.a + ", value=" + this.b + ")";
    }
}
