package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akhi {
    public final akgs a;
    public final akho b;

    public akhi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akhi) {
            akhi akhiVar = (akhi) obj;
            if (this.a.equals(akhiVar.a) && this.b.equals(akhiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        akho akhoVar = this.b;
        return "CallbackResult{callbacks=" + this.a.toString() + ", result=" + akhoVar.toString() + "}";
    }

    public akhi(akgs akgsVar, akho akhoVar) {
        if (akgsVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.a = akgsVar;
        this.b = akhoVar;
    }
}
