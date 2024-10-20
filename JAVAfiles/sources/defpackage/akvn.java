package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akvn {
    public final long a;
    public final long b;

    public akvn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akvn) {
            akvn akvnVar = (akvn) obj;
            if (this.a == akvnVar.a && this.b == akvnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "AsyncInfo{dispatchMarkId=" + this.a + ", dispatchMarkTimeNanos=" + this.b + "}";
    }

    public akvn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
