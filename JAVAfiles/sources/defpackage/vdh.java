package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdh {
    public final vdd a;
    public final vdd b;

    public vdh() {
        throw null;
    }

    public static vdh a(String str) {
        return new vdh(vdd.a(str.concat(".Response")), new vdd(null, null));
    }

    public static vdh b() {
        return new vdh(new vdd(null, "Bugle.Ditto.Response.Status"), new vdd(null, null));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vdh) {
            vdh vdhVar = (vdh) obj;
            if (this.a.equals(vdhVar.a) && this.b.equals(vdhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        vdd vddVar = this.b;
        return "RpcCounterName{responseCounterNames=" + this.a.toString() + ", resultCounterNames=" + vddVar.toString() + "}";
    }

    public vdh(vdd vddVar, vdd vddVar2) {
        this.a = vddVar;
        this.b = vddVar2;
    }
}
