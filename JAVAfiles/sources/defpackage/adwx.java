package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adwx extends Thread {
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    final long a;
    private final PowerManager.WakeLock c;

    /* JADX INFO: Access modifiers changed from: protected */
    public adwx(String str, Context context, Runnable runnable, long j) {
        super(runnable, str);
        this.c = adwm.a(context).newWakeLock(1, str);
        this.a = j;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        try {
            advr.o("Releasing wake lock for %s", getName());
            this.c.release();
        } catch (RuntimeException e) {
            advr.s(e, "Exception thrown while releasing wakelock.", new Object[0]);
        }
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        advr.o("Acquiring wake lock for %s", getName());
        long j = this.a;
        if (j == 0) {
            j = b;
        }
        this.c.acquire(j);
        super.start();
    }
}
