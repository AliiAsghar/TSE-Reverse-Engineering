package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agkw {
    public final Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final AtomicLong f;
    private final boolean g;

    public /* synthetic */ agkw(Thread thread, int i, boolean z, int i2, boolean z2, int i3) {
        boolean z3;
        thread.getClass();
        this.a = thread;
        this.b = (i3 & 2) != 0 ? -1 : i;
        if ((i3 & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.c = z3;
        this.g = ((i3 & 32) == 0) & z2;
        this.d = !z3;
        this.f = new AtomicLong(aglo.m(z, false, false, (i3 & 8) != 0 ? -21 : i2, -21, -21, 0L));
    }

    private final void e(long j) {
        if (agkv.g(j)) {
            boolean z = false;
            while (true) {
                try {
                    LockSupport.park(this);
                    if (!agkv.f(this.f.get())) {
                        break;
                    } else {
                        z |= Thread.interrupted();
                    }
                } catch (Throwable th) {
                    if (z) {
                        this.a.interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                this.a.interrupt();
            }
        }
    }

    public final void a(int i) {
        long j;
        do {
            j = this.f.get();
            int d = agkv.d(j);
            if (agkv.g(j)) {
                if (agkv.h(j)) {
                    if (d != i) {
                        Process.setThreadPriority(this.b, d);
                        i = d;
                    }
                } else {
                    int a = agkm.a(d);
                    if (a != agkm.a(i)) {
                        this.a.setPriority(a);
                    }
                }
            } else {
                throw new IllegalStateException("Unexpected not set, saw " + ("State{started=" + agkv.h(j) + ", setting=" + agkv.g(j) + ", pool=" + agkv.c(j) + ", local=" + agkv.b(j) + ", inherited=" + agkv.a(j) + "}") + " " + Long.toBinaryString(j));
            }
        } while (!this.f.compareAndSet(j, agkv.i(j, false, false, false, 0, 0, 0L, 121)));
        if (agkv.f(j)) {
            LockSupport.unpark(this.a);
        }
    }

    public final void b() {
        long j;
        while (true) {
            j = this.f.get();
            long i = agkv.i(j, false, false, agkv.g(j) & (!this.g), 0, -21, agkv.e(j) + 1, 27);
            if (agkv.g(j)) {
                if (this.f.compareAndSet(j, i)) {
                    break;
                }
            } else if (agkv.d(j) == agkv.d(i)) {
                if (this.f.compareAndSet(j, i)) {
                    break;
                }
            } else if (this.f.compareAndSet(j, agkv.i(i, false, true, false, 0, 0, 0L, 125))) {
                a(agkv.d(j));
                break;
            }
        }
        if (!this.g) {
            e(j);
        }
    }

    public final void c() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, agkv.i(j, false, false, agkv.g(j), 0, 0, 0L, 122)));
        e(j);
    }

    public final void d() {
        long j;
        do {
            j = this.f.get();
            if (!agkv.f(j)) {
                return;
            }
        } while (!this.f.compareAndSet(j, agkv.i(j, false, false, false, 0, 0, 0L, 123)));
    }

    public final String toString() {
        return this.a.getName() + " " + this.b;
    }
}
