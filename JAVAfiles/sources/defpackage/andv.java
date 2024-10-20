package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class andv<V> extends alna implements Future<V>, ListenableFuture {
    protected abstract ListenableFuture b();

    public void c(Runnable runnable, Executor executor) {
        b().c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return d().cancel(z);
    }

    protected /* bridge */ /* synthetic */ Future d() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return d().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return d().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return d().get(j, timeUnit);
    }
}
