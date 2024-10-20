package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anel extends FutureTask implements ListenableFuture {
    private final andm a;

    public anel(Runnable runnable) {
        super(runnable, null);
        this.a = new andm();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void c(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        andm andmVar = this.a;
        synchronized (andmVar) {
            if (!andmVar.b) {
                andmVar.a = new andl(runnable, executor, andmVar.a);
            } else {
                andm.a(runnable, executor);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        andm andmVar = this.a;
        synchronized (andmVar) {
            if (andmVar.b) {
                return;
            }
            andmVar.b = true;
            andl andlVar = andmVar.a;
            andl andlVar2 = null;
            andmVar.a = null;
            while (andlVar != null) {
                andl andlVar3 = andlVar.c;
                andlVar.c = andlVar2;
                andlVar2 = andlVar;
                andlVar = andlVar3;
            }
            while (andlVar2 != null) {
                andm.a(andlVar2.a, andlVar2.b);
                andlVar2 = andlVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return super.get(j, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public anel(Callable callable) {
        super(callable);
        this.a = new andm();
    }
}
