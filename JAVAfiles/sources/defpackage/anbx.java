package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbx {
    static final Duration a;

    static {
        Duration ofSeconds = Duration.ofSeconds(Long.MIN_VALUE);
        a = ofSeconds;
        ofSeconds.getSeconds();
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
    }

    public static long a(Duration duration) {
        if (duration.getSeconds() < -9223372036854L) {
            return albo.cK(albo.cL(duration.getSeconds() + 1, 1000000L), (duration.getNano() / 1000) - 1000000);
        }
        return albo.cK(albo.cL(duration.getSeconds(), 1000000L), duration.getNano() / 1000);
    }

    public static boolean b(Duration duration) {
        if (!duration.isNegative() && !duration.isZero()) {
            return true;
        }
        return false;
    }

    public static void c(long j) {
        Duration.of(j, ChronoUnit.MICROS);
    }
}
