package defpackage;

import java.util.concurrent.CompletableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atos extends CompletableFuture {
    private final atoo a;

    public atos(atoo atooVar) {
        this.a = atooVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.c();
        }
        return super.cancel(z);
    }
}
