package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ance;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aned extends ance.i implements Runnable {
    private ListenableFuture a;

    public aned(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            return a.bX(listenableFuture, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.ance
    protected final void gt() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            m(listenableFuture);
        }
    }
}
