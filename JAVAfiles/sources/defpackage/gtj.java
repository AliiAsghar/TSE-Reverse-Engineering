package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtj {
    private final long a;
    private final long b;

    public gtj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.F(getClass(), obj.getClass())) {
            gtj gtjVar = (gtj) obj;
            if (gtjVar.a == this.a && gtjVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
