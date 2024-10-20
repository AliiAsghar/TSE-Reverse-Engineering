package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arxf extends arxe implements arwm {
    private final Executor a;

    public arxf(Executor executor) {
        this.a = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    private static final void i(arpi arpiVar, RejectedExecutionException rejectedExecutionException) {
        arwi.w(arpiVar, arsd.ao("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture j(ScheduledExecutorService scheduledExecutorService, Runnable runnable, arpi arpiVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            i(arpiVar, e);
            return null;
        }
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            i(arpiVar, e);
            arwb arwbVar = arws.a;
            asfx.a.a(arpiVar, runnable);
        }
    }

    @Override // defpackage.arwm
    public final arwu c(long j, Runnable runnable, arpi arpiVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.a;
        ScheduledFuture scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = j(scheduledExecutorService, runnable, arpiVar, j);
        }
        if (scheduledFuture != null) {
            return new arwt(scheduledFuture);
        }
        return arwj.a.v(j, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.a;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.arwm
    public final void d(long j, arvo arvoVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.a;
        ScheduledFuture scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = j(scheduledExecutorService, new gul(this, arvoVar, 7, (byte[]) null), ((arvp) arvoVar).b, j);
        }
        if (scheduledFuture != null) {
            ((arvp) arvoVar).B(new arvm(scheduledFuture, 1));
        } else {
            arwj.a.d(j, arvoVar);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof arxf) && ((arxf) obj).a == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arxe
    public final Executor g() {
        return this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.arwb
    public final String toString() {
        return this.a.toString();
    }
}
