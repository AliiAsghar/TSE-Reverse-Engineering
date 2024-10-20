package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcu {
    public static final long a = TimeUnit.SECONDS.toNanos(10);
    public static final long b = TimeUnit.MILLISECONDS.toNanos(10);
    public final ScheduledExecutorService c;
    public final alhp d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    public final Runnable g;
    public final Runnable h;
    public final long i;
    public final long j;
    public int k;
    public final atoi l;

    public arcu(atoi atoiVar, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        alhp alhpVar = new alhp();
        this.k = 1;
        this.g = new arcv(new arbg(this, 11));
        this.h = new arcv(new arbg(this, 12));
        this.l = atoiVar;
        scheduledExecutorService.getClass();
        this.c = scheduledExecutorService;
        this.d = alhpVar;
        this.i = j;
        this.j = j2;
        alhpVar.d();
        alhpVar.e();
    }

    public final synchronized void a() {
        alhp alhpVar = this.d;
        alhpVar.d();
        alhpVar.e();
        int i = this.k;
        if (i == 2) {
            this.k = 3;
            return;
        }
        if (i != 4 && i != 5) {
            return;
        }
        ScheduledFuture scheduledFuture = this.e;
        boolean z = false;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (this.k == 5) {
            this.k = 1;
            return;
        }
        this.k = 2;
        if (this.f == null) {
            z = true;
        }
        albo.U(z, "There should be no outstanding pingFuture");
        this.f = this.c.schedule(this.h, this.i, TimeUnit.NANOSECONDS);
    }

    public final synchronized void b() {
        int i = this.k;
        if (i == 1) {
            this.k = 2;
            if (this.f == null) {
                this.f = this.c.schedule(this.h, this.i - this.d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i == 5) {
            this.k = 4;
        }
    }

    public final synchronized void c() {
        int i = this.k;
        if (i != 2 && i != 3) {
            if (i == 4) {
                this.k = 5;
                return;
            }
            return;
        }
        this.k = 1;
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
        if (this.k != 6) {
            this.k = 6;
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture scheduledFuture2 = this.f;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f = null;
            }
        }
    }
}
