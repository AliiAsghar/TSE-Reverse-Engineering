package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzu extends andv {
    final /* synthetic */ ahiy a;
    private final ListenableFuture b;

    public ajzu(ahiy ahiyVar, ListenableFuture listenableFuture) {
        this.a = ahiyVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.andv
    protected final ListenableFuture b() {
        return this.b;
    }

    @Override // defpackage.andv, com.google.common.util.concurrent.ListenableFuture
    public final void c(Runnable runnable, Executor executor) {
        if (isDone()) {
            this.b.c(runnable, executor);
        }
        this.b.c(runnable, new ajzt((Object) this.a, executor, 0));
    }

    @Override // defpackage.andv
    protected final /* synthetic */ Future d() {
        return this.b;
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        return this.b;
    }
}
