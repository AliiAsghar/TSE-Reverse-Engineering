package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidn {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public aidn() {
        throw null;
    }

    public final String a() {
        return String.format("%s-%s-%s-%s", Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aidn) {
            aidn aidnVar = (aidn) obj;
            if (this.a == aidnVar.a && this.b == aidnVar.b && this.c == aidnVar.c && this.d == aidnVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        long j5 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((((i ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ ((int) j4)) * 1000003);
    }

    public final String toString() {
        return "ReportId{customerId=" + this.a + ", projectId=" + this.b + ", metricId=" + this.c + ", reportId=" + this.d + "}";
    }

    public aidn(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
