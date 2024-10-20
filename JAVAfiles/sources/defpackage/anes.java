package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anes extends anep implements aneo {
    final ScheduledExecutorService a;

    public anes(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final anem schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        anfd d = anfd.d(runnable, null);
        return new aneq(d, scheduledExecutorService.schedule(d, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: h */
    public final anem schedule(Callable callable, long j, TimeUnit timeUnit) {
        anfd anfdVar = new anfd(callable);
        return new aneq(anfdVar, this.a.schedule(anfdVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: i */
    public final anem scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aner anerVar = new aner(runnable);
        return new aneq(anerVar, this.a.scheduleAtFixedRate(anerVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: j */
    public final anem scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aner anerVar = new aner(runnable);
        return new aneq(anerVar, this.a.scheduleWithFixedDelay(anerVar, j, j2, timeUnit));
    }
}
