package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvc {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(arvc.class, "b");
    public volatile int b;
    public final arrj c;

    public arvc(int i, arrj arrjVar) {
        this.c = arrjVar;
        this.b = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        boolean compareAndSet = a.compareAndSet(this, i, i2);
        if (compareAndSet && this.c != arvf.a) {
            return true;
        }
        return compareAndSet;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
