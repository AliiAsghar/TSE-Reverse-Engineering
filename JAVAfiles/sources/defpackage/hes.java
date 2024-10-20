package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hes {
    public Object a;
    public Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ece)) {
            return false;
        }
        ece eceVar = (ece) obj;
        if (!d.B(eceVar.a, this.a) || !d.B(eceVar.b, this.b)) {
            return false;
        }
        return true;
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
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
