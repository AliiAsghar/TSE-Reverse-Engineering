package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aken extends akec {
    public final Object a;
    public final akeo b;

    public aken(Object obj, akeo akeoVar) {
        this.a = obj;
        this.b = akeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aken)) {
            return false;
        }
        aken akenVar = (aken) obj;
        if (d.F(this.a, akenVar.a) && d.F(this.b, akenVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "StaleRead(staleResponse=" + this.a + ", cause=" + this.b + ")";
    }
}
