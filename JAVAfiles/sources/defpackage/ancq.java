package defpackage;

import defpackage.ance;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ancq extends ance.i {
    public static final ancn a;
    private static final anek b = new anek(ancq.class);
    public volatile int remaining;
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        ancn ancpVar;
        try {
            ancpVar = new anco(AtomicReferenceFieldUpdater.newUpdater(ancq.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(ancq.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            ancpVar = new ancp();
        }
        Throwable th3 = th;
        a = ancpVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public ancq(int i) {
        this.remaining = i;
    }

    public abstract void d(Set set);
}
