package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agke extends ancg implements aneo {
    public static final /* synthetic */ int c = 0;
    public final aegu a;
    public final Handler b;

    public agke(aegu aeguVar, Handler handler) {
        this.a = aeguVar;
        this.b = handler;
    }

    public static int d(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        if (delay == delay2) {
            return 0;
        }
        return 1;
    }

    private final anem e(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        agkc agkcVar = new agkc(this, runnable, millis + this.a.a(), timeUnit.toMillis(j2), z);
        this.b.postDelayed(agkcVar, millis);
        f(agkcVar, agkcVar);
        return agkcVar;
    }

    private final void f(ListenableFuture listenableFuture, Runnable runnable) {
        listenableFuture.c(new adhc(this, runnable, 9, null), andi.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ancg, defpackage.anen
    /* renamed from: b */
    public final ListenableFuture submit(final Callable callable) {
        final SettableFuture create = SettableFuture.create();
        this.b.post(new Runnable() { // from class: agkb
            @Override // java.lang.Runnable
            public final void run() {
                int i = agke.c;
                SettableFuture settableFuture = SettableFuture.this;
                try {
                    settableFuture.set(callable.call());
                } catch (Exception e) {
                    settableFuture.setException(e);
                    throw new RuntimeException(e);
                }
            }
        });
        return create;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final anem schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: h */
    public final anem schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        agkd agkdVar = new agkd(this, callable, this.a.a() + millis);
        this.b.postDelayed(agkdVar, millis);
        f(agkdVar, agkdVar);
        return agkdVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: i */
    public final anem scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return e(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: j */
    public final anem scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return e(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ancg, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
