package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvb {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(arvb.class, "b");
    public volatile int b;
    public final arrj c;

    public arvb(boolean z, arrj arrjVar) {
        this.c = arrjVar;
        this.b = z ? 1 : 0;
    }

    public final boolean a(boolean z, boolean z2) {
        boolean compareAndSet = a.compareAndSet(this, z ? 1 : 0, z2 ? 1 : 0);
        if (compareAndSet && this.c != arvf.a) {
            return true;
        }
        return compareAndSet;
    }

    public final boolean b() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
