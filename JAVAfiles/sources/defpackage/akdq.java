package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdq extends arpa implements CoroutineExceptionHandler, ScheduledExecutorService {
    public static final /* synthetic */ int b = 0;
    public final ThreadLocal a;
    private final ScheduledExecutorService d;

    public akdq(ScheduledExecutorService scheduledExecutorService) {
        super(CoroutineExceptionHandler.c);
        this.d = scheduledExecutorService;
        this.a = new ThreadLocal();
    }

    private final Runnable b(Runnable runnable) {
        ajnt ajntVar = new ajnt(runnable, this, 12);
        long j = akto.a;
        if (akto.q()) {
            return akto.i(ajntVar);
        }
        return ajntVar;
    }

    public final Callable a(Callable callable) {
        ahes ahesVar = new ahes(callable, this, 16, null);
        long j = akto.a;
        if (akto.q()) {
            return akto.l(ahesVar);
        }
        return ahesVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.d.execute(b(runnable));
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(arpi arpiVar, Throwable th) {
        arpiVar.getClass();
        th.getClass();
        akdr.a.log(Level.SEVERE, "Uncaught exception from runnable", th);
        Log.e("TikTokExceptionHandler2", "Uncaught exception from runnable", th);
        this.a.set(th);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        collection.getClass();
        List invokeAll = this.d.invokeAll(new allu(collection, new ajyn(new afya(this, 5, (float[]) null), 20)));
        invokeAll.getClass();
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        collection.getClass();
        return this.d.invokeAny(new allu(collection, new ajyn(new afya(this, 7, (float[]) null), 18)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> schedule = this.d.schedule(b(runnable), j, timeUnit);
        schedule.getClass();
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduleAtFixedRate = this.d.scheduleAtFixedRate(b(runnable), j, j2, timeUnit);
        scheduleAtFixedRate.getClass();
        return scheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduleWithFixedDelay = this.d.scheduleWithFixedDelay(b(runnable), j, j2, timeUnit);
        scheduleWithFixedDelay.getClass();
        return scheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> shutdownNow = this.d.shutdownNow();
        shutdownNow.getClass();
        return shutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        Future<?> submit = this.d.submit(b(runnable));
        submit.getClass();
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        return this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        callable.getClass();
        timeUnit.getClass();
        ScheduledFuture schedule = this.d.schedule(a(callable), j, timeUnit);
        schedule.getClass();
        return schedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        Future submit = this.d.submit(b(runnable), obj);
        submit.getClass();
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        List invokeAll = this.d.invokeAll(new allu(collection, new ajyn(new afya(this, 6, (float[]) null), 19)), j, timeUnit);
        invokeAll.getClass();
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        Future submit = this.d.submit(a(callable));
        submit.getClass();
        return submit;
    }
}
