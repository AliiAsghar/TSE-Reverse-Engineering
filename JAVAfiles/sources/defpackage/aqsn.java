package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsn implements Comparable {
    public static final arrj c = new arrj(null, null);
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final arrj b;
    private volatile boolean g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    private aqsn(arrj arrjVar, long j, long j2) {
        boolean z;
        this.b = arrjVar;
        long min = Math.min(d, Math.max(e, j2));
        this.a = j + min;
        if (min <= 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
    }

    public static aqsn c(long j, TimeUnit timeUnit) {
        return g(j, timeUnit, c);
    }

    public static aqsn g(long j, TimeUnit timeUnit, arrj arrjVar) {
        d.aC(timeUnit, "units");
        return new aqsn(arrjVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aqsn aqsnVar) {
        d(aqsnVar);
        long j = this.a - aqsnVar.a;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    public final long b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.g && this.a - nanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final void d(aqsn aqsnVar) {
        arrj arrjVar = this.b;
        if (arrjVar == aqsnVar.b) {
            return;
        }
        throw new AssertionError("Tickers (" + arrjVar.toString() + " and " + aqsnVar.b.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean e(aqsn aqsnVar) {
        d(aqsnVar);
        if (this.a - aqsnVar.a < 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aqsn)) {
            return false;
        }
        aqsn aqsnVar = (aqsn) obj;
        if (this.b == aqsnVar.b && this.a == aqsnVar.a) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (!this.g) {
            if (this.a - System.nanoTime() <= 0) {
                this.g = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.asList(this.b, Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        long b = b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b);
        long j = f;
        long j2 = abs / j;
        long abs2 = Math.abs(b) % j;
        StringBuilder sb = new StringBuilder();
        if (b < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        arrj arrjVar = this.b;
        if (arrjVar != c) {
            sb.append(a.bX(arrjVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
