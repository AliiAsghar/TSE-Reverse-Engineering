package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xas {
    public final Object a;
    public final xar b;

    public xas() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xas) {
            xas xasVar = (xas) obj;
            if (this.a.equals(xasVar.a) && this.b.equals(xasVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        xar xarVar = this.b;
        return "CarrierConfigValueInfo{value=" + this.a.toString() + ", carrierConfigSource=" + xarVar.toString() + "}";
    }

    public xas(Object obj, xar xarVar) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.a = obj;
        if (xarVar != null) {
            this.b = xarVar;
            return;
        }
        throw new NullPointerException("Null carrierConfigSource");
    }
}
