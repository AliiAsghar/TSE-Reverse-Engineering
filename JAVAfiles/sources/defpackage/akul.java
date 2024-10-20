package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akul<V> extends andw<V> {
    private akul(ListenableFuture listenableFuture) {
        super(listenableFuture);
    }

    public static akul g(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof akul) {
            return (akul) listenableFuture;
        }
        return new akul(listenableFuture);
    }

    public final akul e(Class cls, algk algkVar, Executor executor) {
        return new akul(aktp.T(this.b, cls, algkVar, executor));
    }

    public final akul f(Class cls, ancs ancsVar, Executor executor) {
        return new akul(aktp.U(this.b, cls, ancsVar, executor));
    }

    public final akul h(algk algkVar, Executor executor) {
        return new akul(aktp.Y(this.b, algkVar, executor));
    }

    public final akul i(ancs ancsVar, Executor executor) {
        return new akul(aktp.Z(this.b, ancsVar, executor));
    }

    public final akul j(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return new akul(albo.bP(this.b, j, timeUnit, scheduledExecutorService));
    }

    public final void k(andy andyVar, Executor executor) {
        aktp.aa(this.b, andyVar, executor);
    }
}
