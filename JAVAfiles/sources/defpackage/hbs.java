package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbs extends FutureTask {
    final /* synthetic */ hbt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbs(hbt hbtVar, Callable callable) {
        super(callable);
        this.a = hbtVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((hbr) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new hbr(e));
        }
    }
}
