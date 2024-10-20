package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arwt implements arwu {
    private final Future a;

    public arwt(Future future) {
        this.a = future;
    }

    @Override // defpackage.arwu
    public final void hd() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}
