package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhp {
    public boolean a;
    private final alhz b;
    private long c;
    private long d;

    public alhp() {
        this.b = alhz.b;
    }

    public static alhp b(alhz alhzVar) {
        alhp alhpVar = new alhp(alhzVar);
        alhpVar.e();
        return alhpVar;
    }

    private final long g() {
        if (this.a) {
            return (this.b.a() - this.d) + this.c;
        }
        return this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(g(), TimeUnit.NANOSECONDS);
    }

    public final Duration c() {
        return Duration.ofNanos(g());
    }

    public final void d() {
        this.c = 0L;
        this.a = false;
    }

    public final void e() {
        albo.U(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void f() {
        long a = this.b.a();
        albo.U(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += a - this.d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long g = g();
        if (TimeUnit.DAYS.convert(g, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(g, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(g, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(g, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(g, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(g, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(g / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (alho.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.co(str, format, " ");
    }

    public alhp(alhz alhzVar) {
        alhzVar.getClass();
        this.b = alhzVar;
    }
}
