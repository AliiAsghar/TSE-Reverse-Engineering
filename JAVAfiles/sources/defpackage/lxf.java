package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxf {
    public final Object a;
    public final Exception b;

    public lxf(Object obj, Exception exc) {
        this.a = obj;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxf)) {
            return false;
        }
        lxf lxfVar = (lxf) obj;
        if (d.F(this.a, lxfVar.a) && d.F(this.b, lxfVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Exception exc = this.b;
        if (exc == null) {
            hashCode = 0;
        } else {
            hashCode = exc.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "D2DTargetApiResult(response=" + this.a + ", exception=" + this.b + ")";
    }

    public /* synthetic */ lxf(Object obj) {
        this(obj, null);
    }
}
