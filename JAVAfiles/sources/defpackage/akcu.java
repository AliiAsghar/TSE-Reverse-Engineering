package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akcu {
    public final akcv a;
    public final algw b;

    public akcu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcu) {
            akcu akcuVar = (akcu) obj;
            if (this.a.equals(akcuVar.a) && this.b.equals(akcuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "PeriodicWorkSpec{repeatInterval=" + this.a.toString() + ", flexInterval=Optional.absent()}";
    }

    public akcu(akcv akcvVar, algw algwVar) {
        if (akcvVar == null) {
            throw new NullPointerException("Null repeatInterval");
        }
        this.a = akcvVar;
        this.b = algwVar;
    }
}
