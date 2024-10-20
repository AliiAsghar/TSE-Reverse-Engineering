package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agjv implements Runnable {
    private static final Logger a = Logger.getLogger("ErrorLoggingExecutor");
    private final Runnable b;
    private final armf c;

    public agjv(Runnable runnable, armf armfVar) {
        this.b = runnable;
        this.c = armfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            if (((Boolean) ((algw) ((apxx) this.c).a).d(false)).booleanValue()) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            } else {
                a.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", th);
                Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
            }
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
