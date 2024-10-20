package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asfw implements Executor, Closeable {
    public static final asfn a = new asfn("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final arvd f;
    public final asfj g;
    public final arvd h;
    public final asuo i;
    public final asuo j;
    private final arvb k;

    public asfw(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i > 0) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.i = new asuo(null, null, null);
                        this.j = new asuo(null, null, null);
                        this.f = new arvd(0L, arvf.a);
                        int i3 = i + 1;
                        this.g = new asfj(i3 + i3);
                        arvf arvfVar = arvf.a;
                        this.h = new arvd(i << 42, arvfVar);
                        this.k = new arvb(false, arvfVar);
                        return;
                    }
                    throw new IllegalArgumentException(a.cn(j, "Idle worker keep alive time ", " must be positive"));
                }
                throw new IllegalArgumentException(a.cb(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            }
            throw new IllegalArgumentException(a.bU(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        throw new IllegalArgumentException(a.cb(i, "Core pool size ", " should be at least 1"));
    }

    public static /* synthetic */ void e(asfw asfwVar, Runnable runnable, boolean z, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        asfwVar.a(runnable, false, z & z2);
    }

    public static final void f(asga asgaVar) {
        try {
            asgaVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private final int g() {
        synchronized (this.g) {
            if (d()) {
                return -1;
            }
            long j = this.h.b;
            int i = (int) (j & 2097151);
            int r = arrn.r(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (r >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (this.h.b & 2097151)) + 1;
            if (this.g.a(i2) == null) {
                asfv asfvVar = new asfv(this, i2);
                this.g.b(i2, asfvVar);
                if (i2 == ((int) (2097151 & arvd.a.incrementAndGet(this.h)))) {
                    int i3 = r + 1;
                    asfvVar.start();
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final asfv h() {
        asfv asfvVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof asfv) {
            asfvVar = (asfv) currentThread;
        } else {
            asfvVar = null;
        }
        if (asfvVar == null || !d.F(asfvVar.c, this)) {
            return null;
        }
        return asfvVar;
    }

    private final boolean i(long j) {
        if (arrn.r(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0) < this.b) {
            int g = g();
            if (g == 1) {
                if (this.b > 1) {
                    g();
                }
            } else if (g <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        asfv asfvVar;
        do {
            arvd arvdVar = this.f;
            while (true) {
                long j = arvdVar.b;
                asfvVar = (asfv) this.g.a((int) (2097151 & j));
                if (asfvVar == null) {
                    asfvVar = null;
                    break;
                }
                long j2 = 2097152 + j;
                int k = k(asfvVar);
                if (k >= 0 && this.f.c(j, (j2 & (-2097152)) | k)) {
                    asfvVar.nextParkedWorker = a;
                    break;
                }
            }
            if (asfvVar == null) {
                return false;
            }
        } while (!asfvVar.a.c(-1, 0));
        LockSupport.unpark(asfvVar);
        return true;
    }

    private static final int k(asfv asfvVar) {
        int i;
        do {
            Object obj = asfvVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            asfvVar = (asfv) obj;
            i = asfvVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        asga asgbVar;
        long j;
        boolean p;
        int i;
        String str = asgc.a;
        long nanoTime = System.nanoTime();
        if (runnable instanceof asga) {
            asgbVar = (asga) runnable;
            asgbVar.g = nanoTime;
            asgbVar.h = z;
        } else {
            asgbVar = new asgb(runnable, nanoTime, z);
        }
        boolean z3 = asgbVar.h;
        if (z3) {
            j = this.h.a(2097152L);
        } else {
            j = 0;
        }
        asfv h = h();
        boolean z4 = true;
        if (h != null && (i = h.d) != 5 && (asgbVar.h || i != 2)) {
            h.b = true;
            atqq atqqVar = h.e;
            if (z2) {
                asgbVar = atqqVar.e(asgbVar);
            } else {
                asga asgaVar = (asga) ((arve) atqqVar.c).a(asgbVar);
                if (asgaVar == null) {
                    asgbVar = null;
                } else {
                    asgbVar = atqqVar.e(asgaVar);
                }
            }
        }
        if (asgbVar != null) {
            if (asgbVar.h) {
                p = this.j.p(asgbVar);
            } else {
                p = this.i.p(asgbVar);
            }
            if (!p) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z2 || h == null) {
            z4 = false;
        }
        if (z3) {
            if (!z4 && !j() && !i(j)) {
                j();
                return;
            }
            return;
        }
        if (!z4) {
            c();
        }
    }

    public final void b(asfv asfvVar, int i, int i2) {
        while (true) {
            long j = this.f.b;
            long j2 = 2097152 + j;
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = k(asfvVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && this.f.c(j, (j2 & (-2097152)) | i3)) {
                return;
            }
        }
    }

    public final void c() {
        if (!j() && !i(this.h.b)) {
            j();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        asga asgaVar;
        if (!this.k.a(false, true)) {
            return;
        }
        asfv h = h();
        synchronized (this.g) {
            j = this.h.b & 2097151;
        }
        int i = (int) j;
        if (i > 0) {
            int i2 = 1;
            while (true) {
                Object a2 = this.g.a(i2);
                a2.getClass();
                asfv asfvVar = (asfv) a2;
                if (asfvVar != h) {
                    while (asfvVar.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(asfvVar);
                        asfvVar.join(10000L);
                    }
                    boolean z = arwh.a;
                    atqq atqqVar = asfvVar.e;
                    asuo asuoVar = this.j;
                    asga asgaVar2 = (asga) ((arve) atqqVar.c).a(null);
                    if (asgaVar2 != null) {
                        asuoVar.p(asgaVar2);
                    }
                    while (true) {
                        asga f = atqqVar.f();
                        if (f == null) {
                            break;
                        } else {
                            asuoVar.p(f);
                        }
                    }
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.j.o();
        this.i.o();
        while (true) {
            if (h != null) {
                asgaVar = h.b(true);
                if (asgaVar != null) {
                    continue;
                    f(asgaVar);
                }
            }
            asgaVar = (asga) this.i.n();
            if (asgaVar == null && (asgaVar = (asga) this.j.n()) == null) {
                break;
            }
            f(asgaVar);
        }
        if (h != null) {
            h.d(5);
        }
        boolean z2 = arwh.a;
        this.f.b = 0L;
        this.h.b = 0L;
    }

    public final boolean d() {
        return this.k.b();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final String toString() {
        int d;
        ArrayList arrayList = new ArrayList();
        int length = this.g.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            asfv asfvVar = (asfv) this.g.a(i6);
            if (asfvVar != null) {
                atqq atqqVar = asfvVar.e;
                if (((arve) atqqVar.c).a != null) {
                    d = atqqVar.d() + 1;
                } else {
                    d = atqqVar.d();
                }
                int i7 = asfvVar.d;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    if (i8 == 4) {
                                        i5++;
                                    } else {
                                        throw new armm();
                                    }
                                } else {
                                    i4++;
                                    if (d > 0) {
                                        arrayList.add(a.cq(d, "d"));
                                    }
                                }
                            } else {
                                i3++;
                            }
                        } else {
                            arrayList.add(a.cq(d, "b"));
                            i2++;
                        }
                    } else {
                        arrayList.add(a.cq(d, "c"));
                        i++;
                    }
                } else {
                    throw null;
                }
            }
        }
        arvd arvdVar = this.h;
        String str = this.e;
        long j = arvdVar.b;
        String b = arwi.b(this);
        int i9 = this.b;
        int i10 = this.c;
        asuo asuoVar = this.i;
        asuo asuoVar2 = this.j;
        long j2 = j & 2097151;
        long j3 = 4398044413952L & j;
        long j4 = j & 9223367638808264704L;
        return str + "@" + b + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + asuoVar.m() + ", global blocking queue size = " + asuoVar2.m() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i9 - ((int) (j4 >> 42))) + "}]";
    }
}
