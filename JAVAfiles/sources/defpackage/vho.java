package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vho extends ancg {
    public static final uuf a = uuh.i(uuh.b, "enable_silent_feedback_on_traffic_executor_failure", false);
    public final armf b;
    private final anen c;
    private boolean d = false;
    private final int e;

    public vho(armf armfVar, int i, anen anenVar) {
        this.b = armfVar;
        this.e = i;
        this.c = anenVar;
    }

    public final int a() {
        int i = this.e;
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.d;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = 8;
        akul ah = aktp.ah(new ung(this, runnable, i), this.c);
        if (((Boolean) a.e()).booleanValue()) {
            ah.f(Throwable.class, new vek(this, i), andi.a);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d = true;
    }

    @Override // java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ List shutdownNow() {
        shutdown();
        int i = alog.d;
        return alsx.a;
    }
}
