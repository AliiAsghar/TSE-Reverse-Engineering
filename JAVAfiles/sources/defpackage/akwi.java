package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akwi implements Executor {
    private final Executor a;
    private final SettableFuture b;

    public akwi(Executor executor, SettableFuture settableFuture) {
        this.a = executor;
        this.b = settableFuture;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor = this.a;
        if (executor != andi.a) {
            try {
                executor.execute(runnable);
                return;
            } catch (RejectedExecutionException e) {
                this.b.setException(e);
                return;
            }
        }
        executor.execute(runnable);
    }
}
