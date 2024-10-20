package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icq {
    public final Object a;
    public final Exception b;

    public icq(Object obj, Exception exc) {
        this.a = obj;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icq)) {
            return false;
        }
        icq icqVar = (icq) obj;
        if (d.F(this.a, icqVar.a) && d.F(this.b, icqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Exception exc = this.b;
        if (exc != null) {
            i = exc.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "D2DSourceApiResult(response=" + this.a + ", exception=" + this.b + ")";
    }

    public /* synthetic */ icq(Object obj) {
        this(obj, null);
    }
}
