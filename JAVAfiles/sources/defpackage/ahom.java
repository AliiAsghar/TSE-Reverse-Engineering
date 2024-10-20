package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahom {
    public final String a;
    public final ahka b;
    public final algw c;
    public final algw d;

    public ahom() {
        throw null;
    }

    public static anjm a() {
        anjm anjmVar = new anjm(null, null);
        anjmVar.a = (byte) 1;
        return anjmVar;
    }

    public final boolean equals(Object obj) {
        ahka ahkaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahom) {
            ahom ahomVar = (ahom) obj;
            if (this.a.equals(ahomVar.a) && ((ahkaVar = this.b) != null ? ahkaVar.equals(ahomVar.b) : ahomVar.b == null) && this.c.equals(ahomVar.c) && this.d.equals(ahomVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        ahka ahkaVar = this.b;
        if (ahkaVar == null) {
            hashCode = 0;
        } else {
            hashCode = ahkaVar.hashCode();
        }
        return (((((((hashCode2 * 1000003) ^ hashCode) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        algw algwVar = this.d;
        algw algwVar2 = this.c;
        return "JankEventCollectionParameters{eventName=" + this.a + ", noPiiEventName=" + String.valueOf(this.b) + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=" + String.valueOf(algwVar2) + ", perfettoBucketOverride=" + String.valueOf(algwVar) + "}";
    }

    public ahom(String str, ahka ahkaVar, algw algwVar, algw algwVar2) {
        this.a = str;
        this.b = ahkaVar;
        this.c = algwVar;
        this.d = algwVar2;
    }
}
