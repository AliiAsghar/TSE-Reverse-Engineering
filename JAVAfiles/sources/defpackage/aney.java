package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aney implements Runnable {
    anfa a;

    public aney(anfa anfaVar) {
        this.a = anfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        anfa anfaVar = this.a;
        if (anfaVar != null && (listenableFuture = anfaVar.a) != null) {
            this.a = null;
            if (!listenableFuture.isDone()) {
                try {
                    ScheduledFuture scheduledFuture = anfaVar.b;
                    anfaVar.b = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th) {
                            anfaVar.setException(new anez(str));
                            throw th;
                        }
                    }
                    anfaVar.setException(new anez(str + ": " + listenableFuture.toString()));
                    return;
                } finally {
                    listenableFuture.cancel(true);
                }
            }
            anfaVar.m(listenableFuture);
        }
    }
}
