package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atot implements ator {
    private final CompletableFuture a;
    private final /* synthetic */ int b;

    public atot(CompletableFuture completableFuture, int i) {
        this.b = i;
        this.a = completableFuture;
    }

    @Override // defpackage.ator
    public final void a(atoo atooVar, atqo atqoVar) {
        if (this.b != 0) {
            if (atqoVar.c()) {
                this.a.complete(atqoVar.b);
                return;
            } else {
                this.a.completeExceptionally(new atpc(atqoVar));
                return;
            }
        }
        this.a.complete(atqoVar);
    }

    @Override // defpackage.ator
    public final void b(Throwable th) {
        if (this.b != 0) {
            this.a.completeExceptionally(th);
        } else {
            this.a.completeExceptionally(th);
        }
    }
}
