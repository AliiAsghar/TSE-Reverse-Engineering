package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andr {
    private final AtomicReference b = new AtomicReference(aneh.a);
    public arbj a = new arbj();

    public final ListenableFuture a(Callable callable, Executor executor) {
        executor.getClass();
        return b(new ando(callable), executor);
    }

    public final ListenableFuture b(ancr ancrVar, Executor executor) {
        executor.getClass();
        final andq andqVar = new andq(executor, this);
        aktk aktkVar = new aktk(andqVar, ancrVar, 4);
        AtomicReference atomicReference = this.b;
        final SettableFuture create = SettableFuture.create();
        final ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(create);
        final anfd anfdVar = new anfd(aktkVar);
        listenableFuture.c(anfdVar, andqVar);
        final ListenableFuture bJ = albo.bJ(anfdVar);
        Runnable runnable = new Runnable() { // from class: andn
            @Override // java.lang.Runnable
            public final void run() {
                anfd anfdVar2 = anfd.this;
                if (anfdVar2.isDone()) {
                    create.m(listenableFuture);
                } else if (bJ.isCancelled() && andqVar.compareAndSet(andp.NOT_RUN, andp.CANCELLED)) {
                    anfdVar2.cancel(false);
                }
            }
        };
        bJ.c(runnable, andi.a);
        anfdVar.c(runnable, andi.a);
        return bJ;
    }
}
