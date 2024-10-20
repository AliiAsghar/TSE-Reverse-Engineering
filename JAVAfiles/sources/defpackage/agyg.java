package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agyg {
    public final Object a;
    public final int b;

    public agyg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agyg) {
            agyg agygVar = (agyg) obj;
            if (this.a.equals(agygVar.a) && this.b == agygVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "FlagValue{value=" + this.a.toString() + ", priority=" + this.b + "}";
    }

    public agyg(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }
}
