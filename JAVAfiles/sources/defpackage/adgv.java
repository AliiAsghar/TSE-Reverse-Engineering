package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgv {
    public int a = 0;
    private final long b;
    private final long c;
    private final long d;
    private int e;
    private int f;
    private final advp g;
    private final adef h;

    public adgv(long j, long j2, long j3, adef adefVar, advp advpVar) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.h = adefVar;
        this.g = advpVar;
        this.e = ((Integer) ((abja) adefVar.e).d()).intValue();
        this.f = ((Integer) ((abja) adefVar.c).d()).intValue();
    }

    public final long a() {
        long j;
        int i;
        advr.d(this.g, "retries=%d throttleCounter=%d retryAfter=%d", Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.a));
        int i2 = this.e;
        if (i2 > 0) {
            if (i2 > 3) {
                i = i2 - 3;
            } else {
                i = 0;
            }
            long nextInt = new Random().nextInt(32);
            long j2 = this.b;
            j = Math.max(Math.min((j2 * (1 << i)) + ((nextInt * j2) / 64), this.c), this.a);
        } else {
            j = 0;
        }
        if (this.f >= this.d) {
            advr.d(this.g, "Reached at throttling threshold. returning min delay at minimum.", new Object[0]);
            return Math.max(j, this.b);
        }
        return j;
    }

    public final synchronized void b() {
        this.e++;
        if (agkx.W().longValue() - this.h.b() > TimeUnit.DAYS.toMillis(1L)) {
            advr.d(this.g, "Reset throttleCounter.", new Object[0]);
            this.f = 0;
            this.h.d(0);
            adef adefVar = this.h;
            Long W = agkx.W();
            W.longValue();
            ((abja) adefVar.b).e(W);
        }
        this.f++;
        this.h.c(this.e);
        this.h.d(this.f);
    }

    public final synchronized void c() {
        this.e = 0;
        this.h.c(0);
    }

    public final String toString() {
        adef adefVar = this.h;
        return "[RetryDelayCalculator - retries=" + this.e + ", throttleCounter=" + this.f + ", lastThrottleTimerResetTimestamp=" + adefVar.b() + "]";
    }
}
