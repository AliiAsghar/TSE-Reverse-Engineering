package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegx implements aegu {
    @Override // defpackage.aegu
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.aegu
    public final long b() {
        if (aegw.a) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }

    @Override // defpackage.aegu
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.aegu
    public final Duration d() {
        return Duration.ofMillis(SystemClock.currentThreadTimeMillis());
    }

    @Override // defpackage.aegu
    public final Duration e() {
        return Duration.ofMillis(SystemClock.uptimeMillis());
    }

    @Override // defpackage.aegu
    public final Instant f() {
        return Instant.now().truncatedTo(ChronoUnit.MILLIS);
    }
}
