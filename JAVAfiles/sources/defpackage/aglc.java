package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aglc {
    public static final aglc a = new aglc(0, 0, 0);
    public final long b;
    public final long c;
    public final long d;

    public aglc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aglc) {
            aglc aglcVar = (aglc) obj;
            if (this.b == aglcVar.b && this.c == aglcVar.c && this.d == aglcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.b;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.c;
        return ((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        return "SchedStat{cpuTimeNs=" + this.b + ", runDelayNs=" + this.c + ", runCount=" + this.d + "}";
    }

    public aglc(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
