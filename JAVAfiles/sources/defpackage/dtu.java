package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtu implements ListenableFuture {
    final WeakReference a;
    public final dtp b = new dtt(this);

    public dtu(dtq dtqVar) {
        this.a = new WeakReference(dtqVar);
    }

    public final boolean a(Throwable th) {
        return this.b.g(th);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        dtq dtqVar = (dtq) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && dtqVar != null) {
            dtqVar.a = null;
            dtqVar.b = null;
            dtqVar.c.f(null);
            return true;
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
