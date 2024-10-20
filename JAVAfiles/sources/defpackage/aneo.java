package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface aneo extends ScheduledExecutorService, anen {
    anem g(Runnable runnable, long j, TimeUnit timeUnit);

    anem h(Callable callable, long j, TimeUnit timeUnit);

    anem i(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    anem j(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
