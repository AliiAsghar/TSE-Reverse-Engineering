package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class agsz extends ancg implements aneo {
    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    protected abstract void d(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final anem schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        anel anelVar = new anel(runnable);
        d(anelVar, j, timeUnit);
        return new agsy(anelVar, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final anem schedule(Callable callable, long j, TimeUnit timeUnit) {
        anel anelVar = new anel(callable);
        d(anelVar, j, timeUnit);
        return new agsy(anelVar, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final anem scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final anem scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
