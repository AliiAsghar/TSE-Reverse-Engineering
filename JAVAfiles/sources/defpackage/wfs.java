package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfs {
    public final long a;
    public final long b;

    public wfs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wfs) {
            wfs wfsVar = (wfs) obj;
            if (this.a == wfsVar.a && this.b == wfsVar.b) {
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
        return "GoogleTosImpressionsCountHolder{repromptCount=" + this.a + ", impressionsCount=" + this.b + "}";
    }

    public wfs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
