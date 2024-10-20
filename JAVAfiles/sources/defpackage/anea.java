package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anea implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public anea(ListenableFuture listenableFuture, Future future, int i) {
        this.c = i;
        this.a = listenableFuture;
        this.b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            albo.bS(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public anea(ancr ancrVar, Executor executor, int i) {
        this.c = i;
        this.a = ancrVar;
        executor.getClass();
        this.b = executor;
    }
}
