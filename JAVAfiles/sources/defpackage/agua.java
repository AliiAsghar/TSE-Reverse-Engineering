package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agua extends FutureTask implements RunnableScheduledFuture {
    private final agtr a;
    private final aegu b;
    private final long c;
    private final long d;

    public agua(aegu aeguVar, Runnable runnable, agtr agtrVar, long j, long j2) {
        super(runnable, null);
        this.a = agtrVar;
        this.b = aeguVar;
        this.c = System.nanoTime() + j;
        this.d = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (delayed2 instanceof agua) {
            agua aguaVar = (agua) delayed2;
            long j = this.c - aguaVar.c;
            if (j < 0) {
                return -1;
            }
            if (j <= 0 && this.d < aguaVar.d) {
                return -1;
            }
            return 1;
        }
        return Long.signum(getDelay(TimeUnit.NANOSECONDS) - delayed2.getDelay(TimeUnit.NANOSECONDS));
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        if (timeUnit != null) {
            return timeUnit.convert(this.c - System.nanoTime(), TimeUnit.NANOSECONDS);
        }
        return 0L;
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        long epochMilli = this.b.f().toEpochMilli();
        super.run();
        agtr agtrVar = this.a;
        if (agtrVar != null) {
            agtrVar.b = this.b.f().toEpochMilli();
            agtr agtrVar2 = this.a;
            agtrVar2.c = agtrVar2.b - epochMilli;
        }
    }
}
