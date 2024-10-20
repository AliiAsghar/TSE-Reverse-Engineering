package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abii {
    public final Object a;
    private final abij b;

    public abii() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abii) {
            abii abiiVar = (abii) obj;
            if (this.a.equals(abiiVar.a) && this.b.equals(abiiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ (-721379959);
        a.aS(1);
        return ((((hashCode * 1000003) ^ 1) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a.toString() + ", priority=DEFAULT, productData=" + this.b.toString() + ", eventContext=null}";
    }

    public abii(Object obj, abij abijVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = abijVar;
    }
}
