package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agkd extends ance implements Runnable, anem {
    final /* synthetic */ agke a;
    private Callable b;
    private final long c;

    public agkd(agke agkeVar, Callable callable, long j) {
        this.a = agkeVar;
        this.b = callable;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return agke.d(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.c - this.a.a.a(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            Callable callable = this.b;
            this.b = null;
            set(callable.call());
        } catch (Throwable th) {
            setException(th);
            throw new RuntimeException(th);
        }
    }
}
