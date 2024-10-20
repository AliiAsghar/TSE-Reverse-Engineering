package defpackage;

import java.lang.Thread;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arda implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ ardr a;

    public arda(ardr ardrVar) {
        this.a = ardrVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        ardr.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(this.a.h) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        ardr ardrVar = this.a;
        if (ardrVar.v) {
            return;
        }
        ardrVar.v = true;
        ardrVar.h(true);
        ardrVar.m(false);
        ardrVar.n(new arcz(th));
        ardrVar.J.d(null);
        ardrVar.H.a(4, "PANIC! Entering TRANSIENT_FAILURE");
        ardrVar.p.a(aqsd.TRANSIENT_FAILURE);
    }
}
