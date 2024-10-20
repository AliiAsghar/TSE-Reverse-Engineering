package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advf {
    private static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    public static ScheduledFuture a(Runnable runnable, long j, TimeUnit timeUnit) {
        return a.schedule(runnable, j, timeUnit);
    }
}
