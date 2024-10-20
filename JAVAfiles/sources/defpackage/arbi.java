package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arbi implements araj {
    private volatile boolean a;
    private aral b;
    private Status c;
    public araj e;
    private arbh f;
    private long g;
    private long h;
    private List d = new ArrayList();
    private List i = new ArrayList();

    private final void s(Runnable runnable) {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called after start");
        synchronized (this) {
            if (!this.a) {
                this.d.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private final void t(aral aralVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.e.m(aralVar);
    }

    private final void u(araj arajVar) {
        boolean z;
        araj arajVar2 = this.e;
        if (arajVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "realStream already set to %s", arajVar2);
        this.e = arajVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.araj
    public final aqrm a() {
        throw null;
    }

    @Override // defpackage.araj
    public void b(arch archVar) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.e != null) {
                archVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.e.b(archVar);
            } else {
                archVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                archVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.araj
    public void c(Status status) {
        boolean z;
        boolean z2 = true;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called after start");
        status.getClass();
        synchronized (this) {
            if (this.e == null) {
                u(areo.a);
                this.c = status;
                z2 = false;
            }
        }
        if (z2) {
            s(new aqym(this, status, 12, (char[]) null));
            return;
        }
        r();
        p();
        this.b.a(status, arak.PROCESSED, new aqut());
    }

    @Override // defpackage.arho
    public final void d() {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called after start");
        if (this.a) {
            this.e.d();
        } else {
            s(new arbg(this, 0));
        }
    }

    @Override // defpackage.araj
    public final void e() {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called after start");
        s(new arbg(this, 2));
    }

    @Override // defpackage.arho
    public final void f() {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called before start");
        this.i.add(new aomp(this, 20, null));
    }

    @Override // defpackage.arho
    public final void g(int i) {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called after start");
        if (this.a) {
            this.e.g(i);
        } else {
            s(new ajbz(this, i, 8, null));
        }
    }

    @Override // defpackage.arho
    public final void h(aqsa aqsaVar) {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called before start");
        aqsaVar.getClass();
        this.i.add(new aqym(this, aqsaVar, 8, (char[]) null));
    }

    @Override // defpackage.araj
    public final void i(aqsn aqsnVar) {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called before start");
        this.i.add(new aqym(this, aqsnVar, 10, (char[]) null));
    }

    @Override // defpackage.araj
    public final void j(aqsp aqspVar) {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called before start");
        aqspVar.getClass();
        this.i.add(new aqym(this, aqspVar, 9, (char[]) null));
    }

    @Override // defpackage.araj
    public final void k(int i) {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called before start");
        this.i.add(new ajbz(this, i, 9, null));
    }

    @Override // defpackage.araj
    public final void l(int i) {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called before start");
        this.i.add(new ajbz(this, i, 10, null));
    }

    @Override // defpackage.araj
    public final void m(aral aralVar) {
        boolean z;
        Status status;
        boolean z2;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "already started");
        synchronized (this) {
            status = this.c;
            z2 = this.a;
            if (!z2) {
                arbh arbhVar = new arbh(aralVar);
                this.f = arbhVar;
                aralVar = arbhVar;
            }
            this.b = aralVar;
            this.g = System.nanoTime();
        }
        if (status != null) {
            aralVar.a(status, arak.PROCESSED, new aqut());
        } else if (z2) {
            t(aralVar);
        }
    }

    @Override // defpackage.arho
    public final void n(InputStream inputStream) {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "May only be called after start");
        if (this.a) {
            this.e.n(inputStream);
        } else {
            s(new aqym(this, inputStream, 11, (byte[]) null));
        }
    }

    @Override // defpackage.arho
    public final boolean o() {
        if (this.a) {
            return this.e.o();
        }
        return false;
    }

    public final Runnable q(araj arajVar) {
        synchronized (this) {
            if (this.e == null) {
                arajVar.getClass();
                u(arajVar);
                aral aralVar = this.b;
                if (aralVar == null) {
                    this.d = null;
                    this.a = true;
                }
                if (aralVar != null) {
                    t(aralVar);
                    return new arbg(this, 1);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            arbh r2 = r6.f     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arbi.r():void");
    }

    protected void p() {
    }
}
