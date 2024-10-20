package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnh implements Cloneable {
    public final asme a;
    public final asmh b;
    public final asnl c;
    public final aslr d;
    public final asng e;
    public final AtomicBoolean f;
    public Object g;
    public asnd h;
    public asnj i;
    public asnc j;
    public boolean k;
    public boolean l;
    public boolean m;
    public volatile boolean n;
    public volatile asnc o;
    public volatile asnj p;

    public asnh(asme asmeVar, asmh asmhVar) {
        this.a = asmeVar;
        this.b = asmhVar;
        this.c = (asnl) asmeVar.r.a;
        Object obj = asmeVar.q.a;
        byte[] bArr = asmt.a;
        this.d = (aslr) obj;
        asng asngVar = new asng(this);
        asngVar.k(0L, TimeUnit.MILLISECONDS);
        this.e = asngVar;
        this.f = new AtomicBoolean();
        this.m = true;
    }

    private final IOException h(IOException iOException) {
        IOException iOException2;
        Socket d;
        byte[] bArr = asmt.a;
        asnj asnjVar = this.i;
        if (asnjVar != null) {
            synchronized (asnjVar) {
                d = d();
            }
            if (this.i == null) {
                if (d != null) {
                    asmt.q(d);
                }
            } else if (d != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.e.f()) {
            iOException2 = iOException;
        } else {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            iOException2 = interruptedIOException;
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r2.m != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:42:0x000e, B:11:0x001e, B:13:0x0022, B:14:0x0024, B:16:0x0028, B:20:0x0031, B:22:0x0035, B:7:0x0017), top: B:41:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:42:0x000e, B:11:0x001e, B:13:0x0022, B:14:0x0024, B:16:0x0028, B:20:0x0031, B:22:0x0035, B:7:0x0017), top: B:41:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException a(defpackage.asnc r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            asnc r0 = r2.o
            boolean r3 = defpackage.d.F(r3, r0)
            if (r3 != 0) goto L9
            goto L54
        L9:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1c
            goto L15
        L13:
            r3 = move-exception
            goto L3d
        L15:
            if (r5 == 0) goto L3f
            boolean r5 = r2.l     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L3f
            r5 = r3
        L1c:
            if (r4 == 0) goto L20
            r2.k = r0     // Catch: java.lang.Throwable -> L13
        L20:
            if (r5 == 0) goto L24
            r2.l = r0     // Catch: java.lang.Throwable -> L13
        L24:
            boolean r4 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2e
            boolean r5 = r2.l     // Catch: java.lang.Throwable -> L13
            if (r5 != 0) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r0
        L2f:
            if (r4 != 0) goto L3a
            boolean r4 = r2.l     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            boolean r4 = r2.m     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r3 = r0
        L3b:
            r0 = r5
            goto L40
        L3d:
            monitor-exit(r2)
            throw r3
        L3f:
            r3 = r0
        L40:
            monitor-exit(r2)
            if (r0 == 0) goto L4d
            r4 = 0
            r2.o = r4
            asnj r4 = r2.i
            if (r4 == 0) goto L4d
            r4.c()
        L4d:
            if (r3 == 0) goto L54
            java.io.IOException r3 = r2.h(r6)
            return r3
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asnh.a(asnc, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException b(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.m) {
                this.m = false;
                if (!this.k) {
                    if (!this.l) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return h(iOException);
        }
        return iOException;
    }

    public final String c() {
        return this.b.a.e();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new asnh(this.a, this.b);
    }

    public final Socket d() {
        asnj asnjVar = this.i;
        asnjVar.getClass();
        byte[] bArr = asmt.a;
        List list = asnjVar.l;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (d.F(((Reference) it.next()).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            list.remove(i);
            this.i = null;
            if (list.isEmpty()) {
                asnjVar.m = System.nanoTime();
                asnl asnlVar = this.c;
                if (!asnjVar.i) {
                    ((asmx) asnlVar.b).f((asmv) asnlVar.c);
                } else {
                    asnjVar.k();
                    ((ConcurrentLinkedQueue) asnlVar.d).remove(asnjVar);
                    if (((ConcurrentLinkedQueue) asnlVar.d).isEmpty()) {
                        ((asmx) asnlVar.b).a();
                    }
                    return asnjVar.a();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void e(asnj asnjVar) {
        byte[] bArr = asmt.a;
        if (this.i == null) {
            this.i = asnjVar;
            asnjVar.l.add(new asnf(this, this.g));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [asnt, java.lang.Object] */
    public final void f() {
        if (!this.n) {
            this.n = true;
            asnc asncVar = this.o;
            if (asncVar != null) {
                asncVar.d.f();
            }
            asnj asnjVar = this.p;
            if (asnjVar != null) {
                asnjVar.b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [asnt, java.lang.Object] */
    public final void g(boolean z) {
        asnc asncVar;
        synchronized (this) {
            if (!this.m) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (asncVar = this.o) != null) {
            asncVar.d.f();
            ((asnh) asncVar.b).a(asncVar, true, true, null);
        }
        this.j = null;
    }
}
