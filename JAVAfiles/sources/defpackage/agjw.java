package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agjw extends andx implements aneo {
    @Override // defpackage.andx
    protected /* bridge */ /* synthetic */ anen d() {
        throw null;
    }

    protected abstract aneo e();

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final anem schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return e().schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: h */
    public final anem schedule(Callable callable, long j, TimeUnit timeUnit) {
        return e().schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: i */
    public final anem scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return e().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: j */
    public final anem scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return e().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }
}
