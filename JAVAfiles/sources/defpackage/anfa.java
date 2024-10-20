package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anfa extends ands {
    public ListenableFuture a;
    public ScheduledFuture b;

    public anfa(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.a = listenableFuture;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        ListenableFuture listenableFuture = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (listenableFuture != null) {
            String bX = a.bX(listenableFuture, "inputFuture=[", "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return bX + ", remaining delay=[" + delay + " ms]";
                }
                return bX;
            }
            return bX;
        }
        return null;
    }

    @Override // defpackage.ance
    protected final void gt() {
        l(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
