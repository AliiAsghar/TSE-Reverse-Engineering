package defpackage;

import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agtn extends ScheduledThreadPoolExecutor {
    private final aegu a;
    private final AtomicLong b;
    private final agts c;

    public agtn(aegu aeguVar, agts agtsVar, agtl agtlVar) {
        super(1, agtlVar);
        this.b = new AtomicLong(0L);
        this.a = aeguVar;
        this.c = agtsVar;
        setKeepAliveTime(2L, TimeUnit.MINUTES);
        allowCoreThreadTimeOut(false);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return new agua(this.a, runnable, this.c.a(runnable), runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS), this.b.getAndIncrement());
    }
}
