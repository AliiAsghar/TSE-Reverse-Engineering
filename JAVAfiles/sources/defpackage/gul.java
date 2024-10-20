package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gul implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public gul(aqsf aqsfVar, Throwable th, int i) {
        this.a = i;
        this.b = aqsfVar;
        this.c = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, akxq] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, akxq] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, apvh] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, akxq] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                if (this.b.isCancelled()) {
                    this.c.h(null);
                    return;
                }
                try {
                    this.c.w(gvs.b(this.b));
                    return;
                } catch (ExecutionException e) {
                    this.c.w(aqil.O(gvs.c(e)));
                    return;
                }
            case 1:
                if (this.b.isCancelled()) {
                    this.c.h(null);
                    return;
                }
                try {
                    this.c.w(d.p(this.b));
                    return;
                } catch (ExecutionException e2) {
                    this.c.w(aqil.O(d.l(e2)));
                    return;
                }
            case 2:
                try {
                    this.c.run();
                    synchronized (((gzx) this.b).b) {
                        ((gzx) this.b).a();
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (((gzx) this.b).b) {
                        ((gzx) this.b).a();
                        throw th;
                    }
                }
            case 3:
                synchronized (((hag) this.c).e) {
                    if (((gul) ((hag) this.c).c.remove(this.b)) != null) {
                        haf hafVar = (haf) ((hag) this.c).d.remove(this.b);
                        if (hafVar != null) {
                            hafVar.b((gyg) this.b);
                        }
                    } else {
                        gsy.a().c("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.b));
                    }
                }
                return;
            case 4:
                try {
                    ?? r0 = this.c;
                    boolean isDone = r0.isDone();
                    Future future = r0;
                    if (!isDone) {
                        throw new IllegalStateException("future is expected to be done already.");
                    }
                    while (true) {
                        try {
                            Object obj = future.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            this.b.b(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                            future = future;
                        } catch (Throwable th2) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    }
                } catch (Error e3) {
                    e = e3;
                    this.b.a(e);
                    return;
                } catch (RuntimeException e4) {
                    e = e4;
                    this.b.a(e);
                    return;
                } catch (ExecutionException e5) {
                    e = e5;
                    ?? r1 = this.b;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    r1.a(e);
                    return;
                }
            case 5:
                ((aovn) this.c).b(this.b);
                return;
            case 6:
                ((aqsf) this.b).j((Throwable) this.c);
                return;
            default:
                this.b.g((arwb) this.c, arnb.a);
                return;
        }
    }

    public gul(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public gul(Object obj, Object obj2, int i, byte[] bArr) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public gul(Object obj, Object obj2, int i, char[] cArr) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
