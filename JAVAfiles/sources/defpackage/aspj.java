package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspj {
    public final int a;
    public final aspc b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final asph g;
    public final aspg h;
    public final aspi i;
    public final aspi j;
    public IOException k;
    private final ArrayDeque l;
    private boolean m;
    private int n;

    public aspj(int i, aspc aspcVar, boolean z, boolean z2, aslv aslvVar) {
        this.a = i;
        this.b = aspcVar;
        this.f = aspcVar.r.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.l = arrayDeque;
        this.g = new asph(this, aspcVar.q.c(), z2);
        this.h = new aspg(this, z);
        this.i = new aspi(this);
        this.j = new aspi(this);
        if (aslvVar != null) {
            if (!h()) {
                arrayDeque.add(aslvVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean n(int i, IOException iOException) {
        byte[] bArr = asmt.a;
        synchronized (this) {
            if (this.n != 0) {
                return false;
            }
            this.n = i;
            this.k = iOException;
            notifyAll();
            if (this.g.b) {
                if (this.h.a) {
                    return false;
                }
            }
            this.b.b(this.a);
            return true;
        }
    }

    public final synchronized aslv a() {
        Object removeFirst;
        this.i.e();
        while (this.l.isEmpty() && this.n == 0) {
            try {
                g();
            } catch (Throwable th) {
                this.i.b();
                throw th;
            }
        }
        this.i.b();
        if (!this.l.isEmpty()) {
            removeFirst = this.l.removeFirst();
            removeFirst.getClass();
        } else {
            IOException iOException = this.k;
            if (iOException == null) {
                int i = this.n;
                if (i == 0) {
                    throw null;
                }
                throw new aspq(i);
            }
            throw iOException;
        }
        return (aslv) removeFirst;
    }

    public final asro b() {
        synchronized (this) {
            if (!this.m && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public final void c(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void d() {
        boolean z;
        boolean i;
        byte[] bArr = asmt.a;
        synchronized (this) {
            asph asphVar = this.g;
            z = false;
            if (!asphVar.b && asphVar.e) {
                aspg aspgVar = this.h;
                if (aspgVar.a || aspgVar.b) {
                    z = true;
                }
            }
            i = i();
        }
        if (z) {
            k(9, null);
        } else if (!i) {
            this.b.b(this.a);
        }
    }

    public final void e() {
        aspg aspgVar = this.h;
        if (!aspgVar.b) {
            if (!aspgVar.a) {
                int i = this.n;
                if (i != 0) {
                    IOException iOException = this.k;
                    if (iOException != null) {
                        throw iOException;
                    }
                    throw new aspq(i);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0015, code lost:
    
        if (r4 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.aslv r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            byte[] r0 = defpackage.asmt.a
            monitor-enter(r2)
            boolean r0 = r2.m     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            if (r0 == 0) goto Le
            if (r4 != 0) goto L17
            r4 = 0
        Le:
            r2.m = r1     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayDeque r0 = r2.l     // Catch: java.lang.Throwable -> L2d
            r0.add(r3)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L1b
        L17:
            asph r3 = r2.g     // Catch: java.lang.Throwable -> L2d
            r3.b = r1     // Catch: java.lang.Throwable -> L2d
        L1b:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L2d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            if (r3 != 0) goto L2c
            aspc r3 = r2.b
            int r4 = r2.a
            r3.b(r4)
        L2c:
            return
        L2d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspj.f(aslv, boolean):void");
    }

    public final void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean h() {
        if ((this.a & 1) == 1) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.n != 0) {
            return false;
        }
        asph asphVar = this.g;
        if (asphVar.b || asphVar.e) {
            aspg aspgVar = this.h;
            if (aspgVar.a || aspgVar.b) {
                if (this.m) {
                    return false;
                }
            }
        }
        return true;
    }

    public final synchronized int j() {
        return this.n;
    }

    public final void k(int i, IOException iOException) {
        if (!n(i, iOException)) {
            return;
        }
        this.b.m(this.a, i);
    }

    public final void l(int i) {
        if (!n(i, null)) {
            return;
        }
        this.b.n(this.a, i);
    }

    public final synchronized void m(int i) {
        if (this.n == 0) {
            this.n = i;
            notifyAll();
        }
    }
}
