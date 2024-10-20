package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hra extends Thread {
    public hra(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
