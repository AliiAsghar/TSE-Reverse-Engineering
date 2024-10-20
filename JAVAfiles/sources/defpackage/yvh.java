package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvh {
    public final String a;
    public final long b;

    public yvh(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvh)) {
            return false;
        }
        yvh yvhVar = (yvh) obj;
        if (d.F(this.a, yvhVar.a) && this.b == yvhVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.A(this.b);
    }

    public final String toString() {
        return "CallLogEntry(destination=" + this.a + ", timestampMillis=" + this.b + ")";
    }
}
