package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argc implements araj {
    static final aquo a = new aquj("grpc-previous-rpc-attempts", aqut.c);
    static final aquo b = new aquj("grpc-retry-pushback-ms", aqut.c);
    public static final Status c = Status.c.withDescription("Stream thrown away because RetriableStream committed");
    public static final Random d = new Random();
    final /* synthetic */ aqux A;
    final /* synthetic */ aqrr B;
    final /* synthetic */ aqsm C;
    public final /* synthetic */ ardc D;
    public asqe E;
    public final atoi F;
    private final aqut G;
    private Status H;
    public final aqux e;
    public final Executor f;
    public final Executor g;
    public final ScheduledExecutorService h;
    public final argd i;
    public final arcc j;
    public final boolean k;
    public final Object l;
    public final long m;
    public final long n;
    public final argb o;
    public final arch p;
    public volatile arfy q;
    public final AtomicBoolean r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public long u;
    public aral v;
    public arfw w;
    public arfw x;
    public long y;
    public boolean z;

    public argc(ardc ardcVar, aqux aquxVar, aqut aqutVar, aqrr aqrrVar, argd argdVar, arcc arccVar, aqsm aqsmVar) {
        boolean z;
        this.A = aquxVar;
        this.B = aqrrVar;
        this.C = aqsmVar;
        this.D = ardcVar;
        ardr ardrVar = ardcVar.b;
        atoi atoiVar = ardrVar.U;
        long j = ardrVar.O;
        long j2 = ardrVar.P;
        Executor g = ardrVar.g(aqrrVar);
        ScheduledExecutorService c2 = ardrVar.i.c();
        argb argbVar = ardcVar.a;
        this.g = new aqwe(new arfo(0));
        this.l = new Object();
        this.p = new arch();
        this.q = new arfy(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.r = new AtomicBoolean();
        this.s = new AtomicInteger();
        this.t = new AtomicInteger();
        this.e = aquxVar;
        this.F = atoiVar;
        this.m = j;
        this.n = j2;
        this.f = g;
        this.h = c2;
        this.G = aqutVar;
        this.i = argdVar;
        if (argdVar != null) {
            this.y = argdVar.b;
        }
        this.j = arccVar;
        if (argdVar != null && arccVar != null) {
            z = false;
        } else {
            z = true;
        }
        d.t(z, "Should not provide both retryPolicy and hedgingPolicy");
        this.k = arccVar != null;
        this.o = argbVar;
    }

    public static /* bridge */ /* synthetic */ void x(argc argcVar) {
        argcVar.z = true;
    }

    @Override // defpackage.araj
    public final aqrm a() {
        throw null;
    }

    @Override // defpackage.araj
    public final void b(arch archVar) {
        arfy arfyVar;
        synchronized (this.l) {
            archVar.b("closed", this.p);
            arfyVar = this.q;
        }
        if (arfyVar.f != null) {
            arch archVar2 = new arch();
            arfyVar.f.a.b(archVar2);
            archVar.b("committed", archVar2);
            return;
        }
        arch archVar3 = new arch();
        for (arga argaVar : arfyVar.c) {
            arch archVar4 = new arch();
            argaVar.a.b(archVar4);
            archVar3.a(archVar4);
        }
        archVar.b("open", archVar3);
    }

    @Override // defpackage.araj
    public final void c(Status status) {
        arga argaVar;
        arga argaVar2 = new arga(0);
        argaVar2.a = new areo();
        Runnable q = q(argaVar2);
        if (q != null) {
            synchronized (this.l) {
                this.q = this.q.c(argaVar2);
            }
            q.run();
            v(status, arak.PROCESSED, new aqut());
            return;
        }
        synchronized (this.l) {
            if (this.q.c.contains(this.q.f)) {
                argaVar = this.q.f;
            } else {
                this.H = status;
                argaVar = null;
            }
            arfy arfyVar = this.q;
            this.q = new arfy(arfyVar.b, arfyVar.c, arfyVar.d, arfyVar.f, true, arfyVar.a, arfyVar.h, arfyVar.e);
        }
        if (argaVar != null) {
            argaVar.a.c(status);
        }
    }

    @Override // defpackage.arho
    public final void d() {
        arfy arfyVar = this.q;
        if (arfyVar.a) {
            arfyVar.f.a.d();
        } else {
            s(new arfq(1));
        }
    }

    @Override // defpackage.araj
    public final void e() {
        s(new arfq(0));
    }

    @Override // defpackage.arho
    public final void f() {
        s(new arfq(2));
    }

    @Override // defpackage.arho
    public final void g(int i) {
        arfy arfyVar = this.q;
        if (arfyVar.a) {
            arfyVar.f.a.g(i);
        } else {
            s(new arfr(i, 2));
        }
    }

    @Override // defpackage.arho
    public final void h(aqsa aqsaVar) {
        s(new arfp(aqsaVar, 1));
    }

    @Override // defpackage.araj
    public final void i(aqsn aqsnVar) {
        s(new arfp(aqsnVar, 0));
    }

    @Override // defpackage.araj
    public final void j(aqsp aqspVar) {
        s(new arfp(aqspVar, 2));
    }

    @Override // defpackage.araj
    public final void k(int i) {
        s(new arfr(i, 1));
    }

    @Override // defpackage.araj
    public final void l(int i) {
        s(new arfr(i, 0));
    }

    @Override // defpackage.araj
    public final void m(aral aralVar) {
        Status status;
        arfw arfwVar;
        argb argbVar;
        this.v = aralVar;
        ardq ardqVar = this.D.b.A;
        synchronized (ardqVar.a) {
            status = ardqVar.c;
            arfwVar = null;
            if (status == null) {
                ardqVar.b.add(this);
                status = null;
            }
        }
        if (status != null) {
            c(status);
            return;
        }
        synchronized (this.l) {
            this.q.b.add(new arfx(this));
        }
        arga p = p(0, false);
        if (p == null) {
            return;
        }
        if (this.k) {
            synchronized (this.l) {
                this.q = this.q.a(p);
                if (w(this.q) && ((argbVar = this.o) == null || argbVar.a())) {
                    arfwVar = new arfw(this.l);
                    this.x = arfwVar;
                }
            }
            if (arfwVar != null) {
                arfwVar.b(this.h.schedule(new absa(this, arfwVar, 2), this.j.b, TimeUnit.NANOSECONDS));
            }
        }
        t(p);
    }

    @Override // defpackage.arho
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.arho
    public final boolean o() {
        Iterator it = this.q.c.iterator();
        while (it.hasNext()) {
            if (((arga) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public final arga p(int i, boolean z) {
        int i2;
        do {
            i2 = this.t.get();
            if (i2 < 0) {
                return null;
            }
        } while (!this.t.compareAndSet(i2, i2 + 1));
        arga argaVar = new arga(i);
        arft arftVar = new arft(new arfv(this, argaVar));
        aqut aqutVar = this.G;
        aqut aqutVar2 = new aqut();
        aqutVar2.f(aqutVar);
        if (i > 0) {
            aqutVar2.h(a, String.valueOf(i));
        }
        aqrr h = this.B.h(arftVar);
        aqrx[] l = arcb.l(h);
        aqsm a2 = this.C.a();
        try {
            araj b2 = this.D.b.z.b(this.A, aqutVar2, h, l);
            this.C.f(a2);
            argaVar.a = b2;
            return argaVar;
        } catch (Throwable th) {
            this.C.f(a2);
            throw th;
        }
    }

    public final Runnable q(arga argaVar) {
        boolean z;
        List list;
        Collection emptyList;
        boolean z2;
        boolean z3;
        Future future;
        Future future2;
        synchronized (this.l) {
            if (this.q.f != null) {
                return null;
            }
            Collection collection = this.q.c;
            arfy arfyVar = this.q;
            if (arfyVar.f == null) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Already committed");
            List list2 = arfyVar.b;
            if (arfyVar.c.contains(argaVar)) {
                list = null;
                emptyList = Collections.singleton(argaVar);
                z2 = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z2 = false;
            }
            this.q = new arfy(list, emptyList, arfyVar.d, argaVar, arfyVar.g, z2, arfyVar.h, arfyVar.e);
            this.F.c(-this.u);
            arfw arfwVar = this.w;
            if (arfwVar != null) {
                z3 = arfwVar.b;
            } else {
                z3 = false;
            }
            if (arfwVar != null) {
                Future a2 = arfwVar.a();
                this.w = null;
                future = a2;
            } else {
                future = null;
            }
            arfw arfwVar2 = this.x;
            if (arfwVar2 != null) {
                future2 = arfwVar2.a();
                this.x = null;
            } else {
                future2 = null;
            }
            return new qzc(this, collection, argaVar, future, z3, future2, 3);
        }
    }

    public final void r(arga argaVar) {
        Runnable q = q(argaVar);
        if (q != null) {
            this.f.execute(q);
        }
    }

    public final void s(arfu arfuVar) {
        Collection collection;
        synchronized (this.l) {
            if (!this.q.a) {
                this.q.b.add(arfuVar);
            }
            collection = this.q.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arfuVar.a((arga) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r9.g.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r4 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r10.a.m(new defpackage.arfz(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9.q.f != r10) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r10 = r9.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r0.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r10 = defpackage.argc.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r5 >= r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r6 = (defpackage.arfu) r3.get(r5);
        r6.a(r10);
        r4 = r4 | (r6 instanceof defpackage.arfx);
        r6 = r9.q;
        r8 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r8 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r8 != r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r6.g == false) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.arga r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.l
            monitor-enter(r5)
            arfy r6 = r9.q     // Catch: java.lang.Throwable -> Lac
            arga r7 = r6.f     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            goto L36
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            goto L36
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> Lac
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lac
            if (r2 != r7) goto L5b
            arfy r0 = r6.c(r10)     // Catch: java.lang.Throwable -> Lac
            r9.q = r0     // Catch: java.lang.Throwable -> Lac
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            return
        L2e:
            arer r1 = new arer     // Catch: java.lang.Throwable -> Lac
            r0 = 8
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r10 = r9.g
            r10.execute(r1)
            return
        L3e:
            if (r4 != 0) goto L4a
            araj r0 = r10.a
            arfz r1 = new arfz
            r1.<init>(r9, r10)
            r0.m(r1)
        L4a:
            araj r0 = r10.a
            arfy r1 = r9.q
            arga r1 = r1.f
            if (r1 != r10) goto L55
            io.grpc.Status r10 = r9.H
            goto L57
        L55:
            io.grpc.Status r10 = defpackage.argc.c
        L57:
            r0.c(r10)
            return
        L5b:
            boolean r7 = r10.b     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L61
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            return
        L61:
            int r7 = r2 + 128
            java.util.List r8 = r6.b     // Catch: java.lang.Throwable -> Lac
            int r8 = r8.size()     // Catch: java.lang.Throwable -> Lac
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Lac
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> Lac
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Lac
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Lac
            r3.addAll(r2)     // Catch: java.lang.Throwable -> Lac
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            int r2 = r3.size()
            r5 = r0
        L8d:
            if (r5 >= r2) goto La9
            java.lang.Object r6 = r3.get(r5)
            arfu r6 = (defpackage.arfu) r6
            r6.a(r10)
            boolean r6 = r6 instanceof defpackage.arfx
            r4 = r4 | r6
            arfy r6 = r9.q
            arga r8 = r6.f
            if (r8 == 0) goto La3
            if (r8 != r10) goto La9
        La3:
            boolean r6 = r6.g
            int r5 = r5 + 1
            if (r6 == 0) goto L8d
        La9:
            r2 = r7
            goto L5
        Lac:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.argc.t(arga):void");
    }

    public final void u() {
        Future future;
        synchronized (this.l) {
            arfw arfwVar = this.x;
            future = null;
            if (arfwVar != null) {
                Future a2 = arfwVar.a();
                this.x = null;
                future = a2;
            }
            this.q = this.q.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void v(Status status, arak arakVar, aqut aqutVar) {
        this.E = new asqe(status, arakVar, aqutVar);
        if (this.t.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.g.execute(new uju((Object) this, status, arakVar, aqutVar, 14));
        }
    }

    public final boolean w(arfy arfyVar) {
        if (arfyVar.f == null && arfyVar.e < this.j.a && !arfyVar.h) {
            return true;
        }
        return false;
    }
}
