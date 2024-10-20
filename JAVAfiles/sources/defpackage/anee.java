package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class anee extends ance {
    public static anee o(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof anee) {
            return (anee) listenableFuture;
        }
        return new andu(listenableFuture);
    }

    public final anee p(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (anee) albo.bP(this, j, timeUnit, scheduledExecutorService);
    }
}
