package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accq {
    public final algw a;
    public final algw b;

    public accq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof accq) {
            accq accqVar = (accq) obj;
            if (this.a.equals(accqVar.a) && this.b.equals(accqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "Identifiers{androidId=" + this.a.toString() + ", ssaidDerivative=Optional.absent()}";
    }

    public accq(algw algwVar, algw algwVar2) {
        this.a = algwVar;
        this.b = algwVar2;
    }
}
