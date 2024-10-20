package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amdj extends AbstractExecutorService {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public boolean g;
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final amdh[] m;
    public final amdh[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final amdi[] t;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean();

    public amdj(int i, ThreadFactory threadFactory, Runnable runnable, Runnable runnable2) {
        if (i > 0) {
            this.q = Integer.MAX_VALUE;
            this.i = threadFactory;
            this.j = true;
            this.k = runnable;
            this.l = runnable2;
            this.s = true;
            this.o = new CountDownLatch(i);
            int i2 = i + 1;
            amdh[] amdhVarArr = new amdh[i2];
            amdh[] amdhVarArr2 = new amdh[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                amdhVarArr[i4] = new amdh(b, i4);
                amdhVarArr2[i4] = new amdh(a, i4);
            }
            this.m = amdhVarArr;
            this.n = amdhVarArr2;
            amdi[] amdiVarArr = new amdi[i];
            amdh amdhVar = amdhVarArr[0];
            while (i3 < i) {
                amdh amdhVar2 = new amdh(amdhVar, i3);
                amdiVarArr[i3] = new amdi(this, i3);
                i3++;
                amdhVar = amdhVar2;
            }
            this.t = amdiVarArr;
            this.p = new AtomicReference(amdhVar);
            return;
        }
        throw new IllegalArgumentException(a.bV(i, "numThreads must be positive: "));
    }

    private final void b(boolean z) {
        amdh amdhVar;
        this.r = true;
        while (true) {
            amdh amdhVar2 = (amdh) this.p.get();
            Object obj = amdhVar2.a;
            if (obj == a) {
                return;
            }
            if (obj == b && !z) {
                amdhVar = this.n[amdhVar2.b];
            } else {
                amdhVar = this.n[0];
            }
            if (a.bC(this.p, amdhVar2, amdhVar)) {
                while (amdhVar2.a != b) {
                    amdi amdiVar = this.t[amdhVar2.b];
                    Thread thread = amdiVar.b;
                    amdiVar.i = 3;
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    } else {
                        amdiVar.a();
                    }
                    amdhVar2 = (amdh) amdhVar2.a;
                }
            }
        }
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.o.await(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i;
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                if (this.q == Integer.MAX_VALUE) {
                    this.d.incrementAndGet();
                }
                do {
                    AtomicInteger atomicInteger = this.d;
                    int i2 = this.q;
                    i = atomicInteger.get();
                    if (i != i2) {
                    }
                } while (!this.d.compareAndSet(i, i + 1));
            }
            amdh amdhVar = new amdh(runnable, -1);
            this.c.add(amdhVar);
            while (true) {
                amdh amdhVar2 = (amdh) this.p.get();
                Object obj = amdhVar2.a;
                if (obj == b) {
                    int i3 = amdhVar2.b;
                    int min = Math.min(i3 + 1, this.t.length);
                    if (min == i3 || a.bC(this.p, amdhVar2, this.m[min])) {
                        return;
                    }
                } else {
                    if (obj == a) {
                        if (!this.c.remove(amdhVar)) {
                            return;
                        }
                        a();
                        throw new RejectedExecutionException();
                    }
                    int i4 = amdhVar2.b;
                    if (a.bC(this.p, amdhVar2, (amdh) obj)) {
                        amdi amdiVar = this.t[i4];
                        Thread thread = amdiVar.b;
                        amdiVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        } else {
                            amdiVar.h.e.incrementAndGet();
                            amdiVar.b();
                            return;
                        }
                    }
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        if (((amdh) this.p.get()).a == a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        if (this.o.getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.h.compareAndSet(false, true)) {
            while (true) {
                amdh amdhVar = (amdh) this.c.poll();
                if (amdhVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) amdhVar.a);
            }
            this.g = true;
            for (amdi amdiVar : this.t) {
                Thread thread = amdiVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
