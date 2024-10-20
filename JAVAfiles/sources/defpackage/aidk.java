package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidk {
    public final long a;
    public final alog b;

    public aidk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aidk) {
            aidk aidkVar = (aidk) obj;
            if (this.a == aidkVar.a && alzz.at(this.b, aidkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MetricAndReportIds{metricId=" + this.a + ", reportIds=" + String.valueOf(this.b) + "}";
    }

    public aidk(long j, alog alogVar) {
        this.a = j;
        if (alogVar == null) {
            throw new NullPointerException("Null reportIds");
        }
        this.b = alogVar;
    }
}
