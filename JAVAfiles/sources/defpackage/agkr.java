package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agkr extends AtomicInteger {
    public final agkw a;
    public final long b;
    public final AtomicReference c;
    private final ListenableFuture d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agkr(long j, agkw agkwVar, ListenableFuture listenableFuture) {
        super(agks.a(agku.a(j), false, false));
        agkwVar.getClass();
        this.a = agkwVar;
        this.d = listenableFuture;
        this.b = agku.c(j);
        this.c = new AtomicReference();
    }

    public final void a() {
        int i;
        do {
            i = get();
        } while (!compareAndSet(i, agks.e(i, 0, false, true, 3)));
        if (agks.d(i)) {
            agkw agkwVar = this.a;
            if (agkwVar.d) {
                agkwVar.e = agkwVar.c;
            } else {
                throw new IllegalStateException("Could not have been boosted while not holding a lock.");
            }
        }
        for (agkq agkqVar = (agkq) this.c.getAndSet(agkp.a); agkqVar != null; agkqVar = agkqVar.b) {
            LockSupport.unpark(agkqVar.a.a);
        }
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return "Booster[Thread=[" + this.a.a + ", future=[" + this.d + "]]";
    }
}
