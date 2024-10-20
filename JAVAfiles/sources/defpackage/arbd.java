package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arbd extends aqru {
    private static final Logger c = Logger.getLogger(arbd.class.getName());
    private static final aqru d = new arba();
    public final aqsm a;
    public aqru b;
    private final ScheduledFuture e;
    private final Executor f;
    private volatile boolean g;
    private Status h;
    private List i = new ArrayList();
    private arbc j;
    private apsd k;

    /* JADX INFO: Access modifiers changed from: protected */
    public arbd(Executor executor, ScheduledExecutorService scheduledExecutorService, aqsn aqsnVar) {
        long j;
        boolean e;
        String str;
        executor.getClass();
        this.f = executor;
        scheduledExecutorService.getClass();
        aqsm k = aqsm.k();
        this.a = k;
        aqsn b = k.b();
        ScheduledFuture<?> scheduledFuture = null;
        if (aqsnVar != null || b != null) {
            if (aqsnVar != null) {
                j = aqsnVar.b(TimeUnit.NANOSECONDS);
            } else {
                j = Long.MAX_VALUE;
            }
            if (b != null && b.b(TimeUnit.NANOSECONDS) < j) {
                j = b.b(TimeUnit.NANOSECONDS);
                Logger logger = c;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(j)));
                    if (aqsnVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(aqsnVar.b(TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
            }
            long abs = Math.abs(j) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(j) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (aqsnVar == null) {
                e = true;
            } else if (b == null) {
                e = false;
            } else {
                e = b.e(aqsnVar);
            }
            if (true != e) {
                str = "CallOptions";
            } else {
                str = "Context";
            }
            if (j < 0) {
                sb2.append("ClientCall started after ");
                sb2.append(str);
                sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline ");
                sb2.append(str);
                sb2.append(" will be exceeded in ");
            }
            sb2.append(abs);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            scheduledFuture = scheduledExecutorService.schedule(new aqym(this, sb2, 3, (byte[]) null), j, TimeUnit.NANOSECONDS);
        }
        this.e = scheduledFuture;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (!this.g) {
                this.i.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        boolean z;
        Status status;
        boolean z2;
        if (this.k == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "already started");
        synchronized (this) {
            apsdVar.getClass();
            this.k = apsdVar;
            status = this.h;
            z2 = this.g;
            if (!z2) {
                arbc arbcVar = new arbc(apsdVar);
                this.j = arbcVar;
                apsdVar = arbcVar;
            }
        }
        if (status != null) {
            this.f.execute(new arbb(this, apsdVar, status));
        } else if (z2) {
            this.b.a(apsdVar, aqutVar);
        } else {
            j(new aofo(this, apsdVar, aqutVar, 13));
        }
    }

    @Override // defpackage.aqru
    public final void c(String str, Throwable th) {
        Status withDescription;
        Status status = Status.c;
        if (str != null) {
            withDescription = status.withDescription(str);
        } else {
            withDescription = status.withDescription("Call cancelled without message");
        }
        if (th != null) {
            withDescription = withDescription.d(th);
        }
        g(withDescription, false);
    }

    @Override // defpackage.aqru
    public final void d() {
        j(new aomp(this, 14, null));
    }

    @Override // defpackage.aqru
    public final void e(int i) {
        if (this.g) {
            this.b.e(i);
        } else {
            j(new ajbz(this, i, 7, null));
        }
    }

    @Override // defpackage.aqru
    public final void f(Object obj) {
        if (this.g) {
            this.b.f(obj);
        } else {
            j(new aqym(this, obj, 5, (byte[]) null));
        }
    }

    public final void g(Status status, boolean z) {
        boolean z2;
        apsd apsdVar;
        synchronized (this) {
            if (this.b == null) {
                i(d);
                apsdVar = this.k;
                this.h = status;
                z2 = false;
            } else if (!z) {
                z2 = true;
                apsdVar = null;
            } else {
                return;
            }
            if (z2) {
                j(new aqym(this, status, 4, (char[]) null));
            } else {
                if (apsdVar != null) {
                    this.f.execute(new arbb(this, apsdVar, status));
                }
                h();
            }
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.i     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.i = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.g = r0     // Catch: java.lang.Throwable -> L42
            arbc r0 = r3.j     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f
            araz r2 = new araz
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.i     // Catch: java.lang.Throwable -> L42
            r3.i = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arbd.h():void");
    }

    public final void i(aqru aqruVar) {
        boolean z;
        aqru aqruVar2 = this.b;
        if (aqruVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "realCall already set to %s", aqruVar2);
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = aqruVar;
    }

    @Override // defpackage.aqru
    public final boolean k() {
        if (this.g) {
            return this.b.k();
        }
        return false;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("realCall", this.b);
        return aj.toString();
    }

    protected void b() {
    }
}
