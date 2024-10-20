package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aljj extends ReentrantLock {
    final alkd a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final albo n;

    public aljj(alkd alkdVar, int i, long j, albo alboVar) {
        ReferenceQueue referenceQueue;
        Queue queue;
        Queue queue2;
        Queue queue3;
        this.a = alkdVar;
        this.g = j;
        this.n = alboVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.e = (atomicReferenceArray.length() * 3) / 4;
        if (!alkdVar.g()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = atomicReferenceArray;
        if (alkdVar.n()) {
            referenceQueue = new ReferenceQueue();
        } else {
            referenceQueue = null;
        }
        this.h = referenceQueue;
        this.i = alkdVar.o() ? new ReferenceQueue() : null;
        if (alkdVar.m()) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = alkd.c;
        }
        this.j = queue;
        if (alkdVar.j()) {
            queue2 = new alkb();
        } else {
            queue2 = alkd.c;
        }
        this.l = queue2;
        if (alkdVar.m()) {
            queue3 = new aliq();
        } else {
            queue3 = alkd.c;
        }
        this.m = queue3;
    }

    final alke a(alke alkeVar, alke alkeVar2) {
        Object j = alkeVar.j();
        if (j != null) {
            aljs d = alkeVar.d();
            Object obj = d.get();
            if (obj == null && d.f()) {
                return null;
            }
            alke a = this.a.q.a(this, alkeVar, alkeVar2, j);
            a.p(d.b(this.i, obj, a));
            return a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alke b(Object obj, int i) {
        for (alke alkeVar = (alke) this.f.get((r0.length() - 1) & i); alkeVar != null; alkeVar = alkeVar.e()) {
            if (alkeVar.a() == i) {
                Object j = alkeVar.j();
                if (j == null) {
                    u();
                } else if (this.a.h.d(obj, j)) {
                    return alkeVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alke c(Object obj, int i, long j) {
        alke b = b(obj, i);
        if (b == null) {
            return null;
        }
        if (this.a.k(b, j)) {
            v(j);
            return null;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alke d(Object obj, int i, alke alkeVar) {
        return this.a.q.b(this, obj, i, alkeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alke e(alke alkeVar, alke alkeVar2) {
        int i = this.b;
        alke e = alkeVar2.e();
        while (alkeVar != alkeVar2) {
            alke a = a(alkeVar, e);
            if (a != null) {
                e = a;
            } else {
                r(alkeVar);
                i--;
            }
            alkeVar = alkeVar.e();
        }
        this.b = i;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(Object obj, int i) {
        long a;
        alke c;
        try {
            Object obj2 = null;
            if (this.b != 0 && (c = c(obj, i, (a = this.a.p.a()))) != null) {
                Object obj3 = c.d().get();
                if (obj3 != null) {
                    q(c, a);
                    c.j();
                    asqc asqcVar = this.a.w;
                    obj2 = obj3;
                } else {
                    u();
                }
            }
            return obj2;
        } finally {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object g(alke alkeVar, long j) {
        if (alkeVar.j() == null) {
            u();
            return null;
        }
        Object obj = alkeVar.d().get();
        if (obj == null) {
            u();
            return null;
        }
        if (this.a.k(alkeVar, j)) {
            v(j);
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object h(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        int i2;
        lock();
        try {
            long a = this.a.p.a();
            s(a);
            if (this.b + 1 > this.e) {
                m();
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            alke alkeVar = (alke) atomicReferenceArray.get(length);
            alke alkeVar2 = alkeVar;
            while (true) {
                obj3 = null;
                if (alkeVar2 != null) {
                    Object j = alkeVar2.j();
                    if (alkeVar2.a() == i && j != null && this.a.h.d(obj, j)) {
                        aljs d = alkeVar2.d();
                        Object obj4 = d.get();
                        if (obj4 == null) {
                            this.d++;
                            if (d.f()) {
                                x(obj, null, d.a(), 3);
                                z(alkeVar2, obj2, a);
                                i2 = this.b;
                            } else {
                                z(alkeVar2, obj2, a);
                                i2 = this.b + 1;
                            }
                            this.b = i2;
                            l(alkeVar2);
                        } else {
                            if (z) {
                                p(alkeVar2, a);
                            } else {
                                this.d++;
                                x(obj, obj4, d.a(), 2);
                                z(alkeVar2, obj2, a);
                                l(alkeVar2);
                            }
                            obj3 = obj4;
                        }
                    } else {
                        alkeVar2 = alkeVar2.e();
                    }
                } else {
                    this.d++;
                    alke d2 = d(obj, i, alkeVar);
                    z(d2, obj2, a);
                    atomicReferenceArray.set(length, d2);
                    this.b++;
                    l(d2);
                    break;
                }
            }
            return obj3;
        } finally {
            unlock();
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object i(alke alkeVar, Object obj, aljs aljsVar) {
        if (aljsVar.g()) {
            albo.X(!Thread.holdsLock(alkeVar), "Recursive load of: %s", obj);
            Object d = aljsVar.d();
            if (d != null) {
                q(alkeVar, this.a.p.a());
                return d;
            }
            throw new alih(a.bX(obj, "CacheLoader returned null for key ", "."));
        }
        throw new AssertionError();
    }

    final void j() {
        while (true) {
            alke alkeVar = (alke) this.j.poll();
            if (alkeVar != null) {
                if (this.m.contains(alkeVar)) {
                    this.m.add(alkeVar);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void k() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljj.k():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(alke alkeVar) {
        if (this.a.h()) {
            j();
            if (alkeVar.d().a() <= this.g || w(alkeVar, alkeVar.a(), 5)) {
                while (this.c > this.g) {
                    for (alke alkeVar2 : this.m) {
                        if (alkeVar2.d().a() > 0) {
                            if (!w(alkeVar2, alkeVar2.a(), 5)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        int i;
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i2 = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i3 = 0; i3 < length; i3++) {
            alke alkeVar = (alke) atomicReferenceArray.get(i3);
            if (alkeVar != null) {
                alke e = alkeVar.e();
                int a = alkeVar.a() & length2;
                if (e == null) {
                    atomicReferenceArray2.set(a, alkeVar);
                } else {
                    alke alkeVar2 = alkeVar;
                    while (e != null) {
                        int a2 = e.a() & length2;
                        if (a2 != a) {
                            i = a2;
                        } else {
                            i = a;
                        }
                        if (a2 != a) {
                            alkeVar2 = e;
                        }
                        e = e.e();
                        a = i;
                    }
                    atomicReferenceArray2.set(a, alkeVar2);
                    while (alkeVar != alkeVar2) {
                        int a3 = alkeVar.a() & length2;
                        alke a4 = a(alkeVar, (alke) atomicReferenceArray2.get(a3));
                        if (a4 != null) {
                            atomicReferenceArray2.set(a3, a4);
                        } else {
                            r(alkeVar);
                            i2--;
                        }
                        alkeVar = alkeVar.e();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i2;
    }

    final void n(long j) {
        alke alkeVar;
        alke alkeVar2;
        j();
        do {
            alkeVar = (alke) this.l.peek();
            if (alkeVar == null || !this.a.k(alkeVar, j)) {
                do {
                    alkeVar2 = (alke) this.m.peek();
                    if (alkeVar2 == null || !this.a.k(alkeVar2, j)) {
                        return;
                    }
                } while (w(alkeVar2, alkeVar2.a(), 4));
                throw new AssertionError();
            }
        } while (w(alkeVar, alkeVar.a(), 4));
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            s(this.a.p.a());
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(alke alkeVar, long j) {
        if (this.a.i()) {
            alkeVar.k(j);
        }
        this.m.add(alkeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(alke alkeVar, long j) {
        if (this.a.i()) {
            alkeVar.k(j);
        }
        this.j.add(alkeVar);
    }

    final void r(alke alkeVar) {
        Object j = alkeVar.j();
        alkeVar.a();
        x(j, alkeVar.d().get(), alkeVar.d().a(), 3);
        this.l.remove(alkeVar);
        this.m.remove(alkeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(long j) {
        if (tryLock()) {
            try {
                k();
                n(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        if (!isHeldByCurrentThread()) {
            alkd alkdVar = this.a;
            while (((alkf) alkdVar.o.poll()) != null) {
                try {
                    alie alieVar = alkdVar.v;
                } catch (Throwable th) {
                    alkd.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
                }
            }
        }
    }

    final void u() {
        if (tryLock()) {
            try {
                k();
            } finally {
                unlock();
            }
        }
    }

    final void v(long j) {
        if (tryLock()) {
            try {
                n(j);
            } finally {
                unlock();
            }
        }
    }

    final boolean w(alke alkeVar, int i, int i2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        alke alkeVar2 = (alke) atomicReferenceArray.get(length);
        for (alke alkeVar3 = alkeVar2; alkeVar3 != null; alkeVar3 = alkeVar3.e()) {
            if (alkeVar3 == alkeVar) {
                this.d++;
                alke y = y(alkeVar2, alkeVar3, alkeVar3.j(), alkeVar3.d().get(), alkeVar3.d(), i2);
                int i3 = this.b - 1;
                atomicReferenceArray.set(length, y);
                this.b = i3;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(Object obj, Object obj2, int i, int i2) {
        this.c -= i;
        if (this.a.o != alkd.c) {
            this.a.o.offer(new alkf(obj, obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alke y(alke alkeVar, alke alkeVar2, Object obj, Object obj2, aljs aljsVar, int i) {
        x(obj, obj2, aljsVar.a(), i);
        this.l.remove(alkeVar2);
        this.m.remove(alkeVar2);
        if (aljsVar.g()) {
            aljsVar.e(null);
            return alkeVar;
        }
        return e(alkeVar, alkeVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(alke alkeVar, Object obj, long j) {
        aljs aljpVar;
        alkd alkdVar = this.a;
        aljs d = alkeVar.d();
        alif alifVar = alkdVar.u;
        albo.U(true, "Weights must be non-negative");
        int ordinal = this.a.k.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    aljpVar = new aljx(this.i, obj, alkeVar);
                } else {
                    throw null;
                }
            } else {
                aljpVar = new aljk(this.i, obj, alkeVar);
            }
        } else {
            aljpVar = new aljp(obj);
        }
        alkeVar.p(aljpVar);
        j();
        this.c++;
        if (this.a.i()) {
            alkeVar.k(j);
        }
        if (this.a.l()) {
            alkeVar.q(j);
        }
        this.m.add(alkeVar);
        this.l.add(alkeVar);
        d.e(obj);
    }
}
