package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvd {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(arvd.class, "b");
    public volatile long b;
    public final arrj c;

    public arvd(long j, arrj arrjVar) {
        this.c = arrjVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean compareAndSet = a.compareAndSet(this, j, j2);
        if (compareAndSet && this.c != arvf.a) {
            return true;
        }
        return compareAndSet;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
