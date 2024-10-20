package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apyj extends ance implements Runnable {
    private ListenableFuture a;

    public apyj(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    public final boolean d() {
        return super.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            return a.cc(listenableFuture, "delegate=[", "]");
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
