package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbf implements aref {
    public final aqwe b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public aree f;
    private final Executor j;
    private final aqtf i = aqtf.a(arbf.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile asmb h = new asmb(null, null, null);

    public arbf(Executor executor, aqwe aqweVar) {
        this.j = executor;
        this.b = aqweVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aqtx aqtxVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new asmb(aqtxVar, this.h.a, null);
            if (aqtxVar != null && e()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arbe arbeVar = (arbe) arrayList.get(i);
                    aqtt a = aqtxVar.a(arbeVar.a);
                    aqrr aqrrVar = arbeVar.a.a;
                    aram c = arcb.c(a, aqrrVar.g());
                    if (c != null) {
                        Executor executor = this.j;
                        Executor executor2 = aqrrVar.c;
                        aqsm a2 = arbeVar.b.a();
                        try {
                            aqtu aqtuVar = arbeVar.a;
                            araj b = c.b(aqtuVar.c, aqtuVar.b, aqtuVar.a, arbeVar.c);
                            arbeVar.b.f(a2);
                            Runnable q = arbeVar.q(b);
                            if (q != null) {
                                if (executor2 != null) {
                                    executor = executor2;
                                }
                                executor.execute(q);
                            }
                            arrayList2.add(arbeVar);
                        } catch (Throwable th) {
                            arbeVar.b.f(a2);
                            throw th;
                        }
                    }
                }
                synchronized (this.a) {
                    if (!e()) {
                        return;
                    }
                    this.g.removeAll(arrayList2);
                    if (this.g.isEmpty()) {
                        this.g = new LinkedHashSet();
                    }
                    if (!e()) {
                        this.b.b(this.d);
                        if (this.h.a != null && (runnable = this.e) != null) {
                            this.b.b(runnable);
                            this.e = null;
                        }
                    }
                    this.b.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r3 = new defpackage.arbe(r2, r0, r6);
        r2.g.add(r3);
        r5 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r0 = r2.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r0 != 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r2.b.b(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r5 = r6.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r0 >= r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        r1 = r6[r0];
        r0 = r0 + 1;
     */
    @Override // defpackage.aram
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.araj b(defpackage.aqux r3, defpackage.aqut r4, defpackage.aqrr r5, defpackage.aqrx[] r6) {
        /*
            r2 = this;
            aqtu r0 = new aqtu     // Catch: java.lang.Throwable -> L75
            areq r1 = new areq     // Catch: java.lang.Throwable -> L75
            r1.<init>()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L75
            asmb r3 = r2.h     // Catch: java.lang.Throwable -> L75
        Lc:
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L18
            arbq r3 = new arbq     // Catch: java.lang.Throwable -> L75
            io.grpc.Status r4 = (io.grpc.Status) r4     // Catch: java.lang.Throwable -> L75
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L75
            goto L66
        L18:
            java.lang.Object r4 = r3.b     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L37
            aqtx r4 = (defpackage.aqtx) r4     // Catch: java.lang.Throwable -> L75
            aqtt r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L75
            boolean r1 = r5.g()     // Catch: java.lang.Throwable -> L75
            aram r4 = defpackage.arcb.c(r4, r1)     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L37
            aqux r3 = r0.c     // Catch: java.lang.Throwable -> L75
            aqut r5 = r0.b     // Catch: java.lang.Throwable -> L75
            aqrr r0 = r0.a     // Catch: java.lang.Throwable -> L75
            araj r3 = r4.b(r3, r5, r0, r6)     // Catch: java.lang.Throwable -> L75
            goto L66
        L37:
            java.lang.Object r4 = r2.a     // Catch: java.lang.Throwable -> L75
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L75
            asmb r1 = r2.h     // Catch: java.lang.Throwable -> L72
            if (r3 != r1) goto L6f
            arbe r3 = new arbe     // Catch: java.lang.Throwable -> L72
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L72
            java.util.Collection r5 = r2.g     // Catch: java.lang.Throwable -> L72
            r5.add(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L72
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L72
            java.util.Collection r0 = r2.g     // Catch: java.lang.Throwable -> L6c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            r5 = 1
            if (r0 != r5) goto L5c
            aqwe r5 = r2.b     // Catch: java.lang.Throwable -> L72
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> L72
            r5.b(r0)     // Catch: java.lang.Throwable -> L72
        L5c:
            int r5 = r6.length     // Catch: java.lang.Throwable -> L72
            r0 = 0
        L5e:
            if (r0 >= r5) goto L65
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L72
            int r0 = r0 + 1
            goto L5e
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
        L66:
            aqwe r4 = r2.b
            r4.a()
            return r3
        L6c:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            throw r3     // Catch: java.lang.Throwable -> L72
        L6f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            r3 = r1
            goto Lc
        L72:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            throw r3     // Catch: java.lang.Throwable -> L75
        L75:
            r3 = move-exception
            aqwe r4 = r2.b
            r4.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arbf.b(aqux, aqut, aqrr, aqrx[]):araj");
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        return this.i;
    }

    @Override // defpackage.aref
    public final Runnable d(aree areeVar) {
        throw null;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.aref
    public final void o(Status status) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new asmb(this.h.b, status, null);
            this.b.b(new aomp(this, 19, null));
            if (!e() && (runnable = this.e) != null) {
                this.b.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    @Override // defpackage.aref
    public final void p(Status status) {
        throw null;
    }
}
