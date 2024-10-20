package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admo {
    public final String a;
    public final adjl b;

    public admo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof admo) {
            admo admoVar = (admo) obj;
            if (this.a.equals(admoVar.a) && this.b.equals(admoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AvailabilityUpdate{simId=" + this.a + ", rcsAvailability=" + this.b.toString() + "}";
    }

    public admo(String str, adjl adjlVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        this.b = adjlVar;
    }
}
