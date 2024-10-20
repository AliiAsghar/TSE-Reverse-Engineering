package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asek implements Runnable {
    private final ListenableFuture a;
    private final arvo b;

    public asek(ListenableFuture listenableFuture, arvo arvoVar) {
        this.a = listenableFuture;
        this.b = arvoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isCancelled()) {
            this.b.h(null);
            return;
        }
        try {
            this.b.w(d.p(this.a));
        } catch (ExecutionException e) {
            this.b.w(aqil.O(arro.G(e)));
        }
    }
}
