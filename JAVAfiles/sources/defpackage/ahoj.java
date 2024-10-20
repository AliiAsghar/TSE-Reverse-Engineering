package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahoj {
    public final ahos a;
    public final algw b;
    public final algw c;

    public ahoj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahoj) {
            ahoj ahojVar = (ahoj) obj;
            if (this.a.equals(ahojVar.a) && this.b.equals(ahojVar.b) && this.c.equals(ahojVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        algw algwVar = this.c;
        algw algwVar2 = this.b;
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=" + String.valueOf(algwVar2) + ", perfettoBucketOverride=" + String.valueOf(algwVar) + "}";
    }

    public ahoj(ahos ahosVar, algw algwVar, algw algwVar2) {
        this.a = ahosVar;
        if (algwVar == null) {
            throw new NullPointerException("Null perfettoTimeoutOverride");
        }
        this.b = algwVar;
        if (algwVar2 != null) {
            this.c = algwVar2;
            return;
        }
        throw new NullPointerException("Null perfettoBucketOverride");
    }
}
