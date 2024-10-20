package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbl implements ExecutorService {
    private static final alvi c = alvi.m("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    private final Executor d;
    private final boolean e;
    private final boolean f;
    private boolean g;
    private ListenableFuture h;
    private akbk i;
    public final Deque a = new ArrayDeque();
    public int b = 1;
    private final anev j = new anev(this, 1);

    public akbl(Executor executor, boolean z, boolean z2) {
        this.d = executor;
        this.f = z2;
        this.e = z;
    }

    public static /* synthetic */ void d(ListenableFuture listenableFuture) {
        try {
            albo.bQ(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((alvg) ((alvg) ((alvg) c.h()).g(e.getCause())).h("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", (char) 412, "SuspendableUiThreadExecutor.java")).q("Silently ignored exception in SuspendableUiThreadExecutor.");
        }
    }

    public final Queue a() {
        ArrayDeque arrayDeque;
        synchronized (this.a) {
            albo.U(this.g, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(this.a);
            this.a.clear();
        }
        return arrayDeque;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        aiut.c();
        synchronized (this.a) {
            this.g = false;
        }
        execute(anet.a);
    }

    public final void c() {
        aiut.c();
        synchronized (this.a) {
            this.g = true;
            this.b = 1;
            if (this.f) {
                akbk akbkVar = this.i;
                if (akbkVar != null) {
                    akbkVar.a();
                    this.i = null;
                }
            } else {
                ListenableFuture listenableFuture = this.h;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    this.h = null;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        synchronized (this.a) {
            if (!this.g && (i = this.b) != 3 && i != 2) {
                this.a.add(runnable);
                if (this.f) {
                    akbk akbkVar = new akbk(this.j);
                    this.i = akbkVar;
                    this.d.execute(akto.j(akbkVar));
                } else {
                    ListenableFuture bL = albo.bL(akto.j(this.j), this.d);
                    this.h = bL;
                    bL.c(akto.j(new ajir(bL, 18, null)), andi.a);
                }
                this.b = 2;
            }
            this.a.add(runnable);
        }
        synchronized (this.a) {
            z = false;
            if (aiut.g() && this.e && !this.g && this.b != 3) {
                if (this.f) {
                    akbk akbkVar2 = this.i;
                    akbkVar2.getClass();
                    akbkVar2.a();
                    this.i = null;
                } else {
                    ListenableFuture listenableFuture = this.h;
                    listenableFuture.getClass();
                    listenableFuture.cancel(false);
                    this.h = null;
                }
                this.b = 2;
                z = true;
            }
        }
        if (z) {
            this.j.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return albo.bL(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return albo.bM(new ahes(runnable, obj, 14, null), this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return albo.bM(callable, this);
    }
}
