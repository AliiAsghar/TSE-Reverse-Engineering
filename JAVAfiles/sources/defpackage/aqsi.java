package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsi implements Runnable {
    final aqsg a;
    public final aqsm b;
    private final Executor c;

    public aqsi(Executor executor, aqsg aqsgVar, aqsm aqsmVar) {
        this.c = executor;
        this.a = aqsgVar;
        this.b = aqsmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            aqsm.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
