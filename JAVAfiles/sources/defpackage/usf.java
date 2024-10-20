package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usf {
    private final String a;
    private final long b;
    private final int c;
    private final int d;

    public usf(String str, long j, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usf)) {
            return false;
        }
        usf usfVar = (usf) obj;
        if (d.F(this.a, usfVar.a) && this.b == usfVar.b && this.c == usfVar.c && this.d == usfVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.d;
        a.bm(i);
        return ((((hashCode + a.A(this.b)) * 31) + this.c) * 31) + i;
    }

    public final String toString() {
        return "FinishedWorkerStats(queueName=" + this.a + ", startedAtTimeMillis=" + this.b + ", completedWorkItems=" + this.c + ", result=" + ((Object) ush.a(this.d)) + ")";
    }
}
