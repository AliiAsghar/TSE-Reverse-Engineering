package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agtz extends agsz {
    public static final agtz a = new agtz(false);
    public static final agtz b = new agtz(true);
    private final Handler c = new Handler(Looper.getMainLooper());
    private final boolean d;

    private agtz(boolean z) {
        this.d = z;
    }

    @Override // defpackage.agsz
    protected final void d(Runnable runnable, long j, TimeUnit timeUnit) {
        this.c.postDelayed(runnable, timeUnit.toMillis(j));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.d && a.y()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.agsz, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }

    @Override // defpackage.agsz, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }
}
