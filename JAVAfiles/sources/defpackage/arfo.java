package defpackage;

import io.grpc.Status;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfo implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ int a;

    public arfo(int i) {
        this.a = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.a != 0) {
            advr.j(th, aihw.a, "unhandled exception executing DNS query", new Object[0]);
            return;
        }
        throw new aqwb(Status.c(th).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
