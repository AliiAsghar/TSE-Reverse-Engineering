package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbh {
    public final long a;
    public final long b;

    public mbh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static final long a(long j) {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbh)) {
            return false;
        }
        mbh mbhVar = (mbh) obj;
        if (this.a == mbhVar.a && this.b == mbhVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        return "ClearcutLogTimestamp(millis=" + this.a + ", elapsedMillis=" + this.b + ")";
    }
}
