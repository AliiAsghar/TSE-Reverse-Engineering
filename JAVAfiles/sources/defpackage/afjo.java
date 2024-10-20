package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjo {
    public final Object a;
    public double b;

    public afjo(Object obj, double d) {
        this.a = obj;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afjo)) {
            return false;
        }
        afjo afjoVar = (afjo) obj;
        if (d.F(this.a, afjoVar.a) && Double.compare(this.b, afjoVar.b) == 0) {
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
        return (hashCode * 31) + d.aI(this.b);
    }

    public final String toString() {
        return "Frecency(entity=" + this.a + ", score=" + this.b + ")";
    }
}
