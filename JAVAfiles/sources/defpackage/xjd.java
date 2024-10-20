package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjd {
    private final int a;
    private final double b;

    public xjd(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjd)) {
            return false;
        }
        xjd xjdVar = (xjd) obj;
        if (this.a == xjdVar.a && Double.compare(this.b, xjdVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + d.aI(this.b);
    }

    public final String toString() {
        return "ActiveSyncUpdate(messagesSyncedSinceLastUpdateCount=" + this.a + ", estimatedPercentComplete=" + this.b + ")";
    }
}
