package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvq {
    public final ahka a;
    public final ashu b;
    public final long c;
    public final long d;
    public final boolean e;
    public final asis f;
    public final asjw g;

    public akvq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        ashu ashuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akvq) {
            akvq akvqVar = (akvq) obj;
            if (this.a.equals(akvqVar.a) && ((ashuVar = this.b) != null ? ashuVar.equals(akvqVar.b) : akvqVar.b == null) && this.c == akvqVar.c && this.d == akvqVar.d && this.e == akvqVar.e && this.f.equals(akvqVar.f) && this.g.equals(akvqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        ashu ashuVar = this.b;
        if (ashuVar == null) {
            hashCode = 0;
        } else {
            hashCode = ashuVar.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        long j = this.c;
        int i3 = (i2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((i4 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "TraceData{eventName=" + this.a.a + ", metricExtension=" + String.valueOf(this.b) + ", startTime=" + this.c + ", endTime=" + this.d + ", empty=" + this.e + ", trace=" + this.f.toString() + ", traceMetadata=" + this.g.toString() + "}";
    }

    public akvq(ahka ahkaVar, ashu ashuVar, long j, long j2, boolean z, asis asisVar, asjw asjwVar) {
        this.a = ahkaVar;
        this.b = ashuVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        if (asisVar == null) {
            throw new NullPointerException("Null trace");
        }
        this.f = asisVar;
        if (asjwVar != null) {
            this.g = asjwVar;
            return;
        }
        throw new NullPointerException("Null traceMetadata");
    }
}
