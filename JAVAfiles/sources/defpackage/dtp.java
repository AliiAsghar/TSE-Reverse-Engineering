package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dtp<V> implements ListenableFuture<V> {
    static final a b;
    private static final Object d;
    volatile d listeners;
    public volatile Object value;
    volatile h waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(dtp.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class a {
        public abstract void a(h hVar, h hVar2);

        public abstract void b(h hVar, Thread thread);

        public abstract boolean c(dtp dtpVar, d dVar, d dVar2);

        public abstract boolean d(dtp dtpVar, Object obj, Object obj2);

        public abstract boolean e(dtp dtpVar, h hVar, h hVar2);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        static final b a;
        static final b b;
        public final boolean c;
        final Throwable d;

        static {
            if (dtp.a) {
                b = null;
                a = null;
            } else {
                b = new b(false, null);
                a = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c {
        static final c a = new c(new Throwable() { // from class: dtp.c.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            dtp.h(th);
            this.b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class d {
        static final d a = new d(null, null);
        final Runnable b;
        final Executor c;
        d next;

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class e extends a {
        final AtomicReferenceFieldUpdater<h, Thread> a;
        final AtomicReferenceFieldUpdater<h, h> b;
        final AtomicReferenceFieldUpdater<dtp, h> c;
        final AtomicReferenceFieldUpdater<dtp, d> d;
        final AtomicReferenceFieldUpdater<dtp, Object> e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // dtp.a
        public final void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // dtp.a
        public final void b(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        @Override // dtp.a
        public final boolean c(dtp dtpVar, d dVar, d dVar2) {
            return defpackage.d.o(this.d, dtpVar, dVar, dVar2);
        }

        @Override // dtp.a
        public final boolean d(dtp dtpVar, Object obj, Object obj2) {
            return defpackage.d.o(this.e, dtpVar, obj, obj2);
        }

        @Override // dtp.a
        public final boolean e(dtp dtpVar, h hVar, h hVar2) {
            return defpackage.d.o(this.c, dtpVar, hVar, hVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class f<V> implements Runnable {
        final dtp<V> a;
        final ListenableFuture<? extends V> b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class g extends a {
        @Override // dtp.a
        public final void a(h hVar, h hVar2) {
            hVar.next = hVar2;
        }

        @Override // dtp.a
        public final void b(h hVar, Thread thread) {
            hVar.thread = thread;
        }

        @Override // dtp.a
        public final boolean c(dtp dtpVar, d dVar, d dVar2) {
            synchronized (dtpVar) {
                if (dtpVar.listeners == dVar) {
                    dtpVar.listeners = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // dtp.a
        public final boolean d(dtp dtpVar, Object obj, Object obj2) {
            synchronized (dtpVar) {
                if (dtpVar.value == obj) {
                    dtpVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // dtp.a
        public final boolean e(dtp dtpVar, h hVar, h hVar2) {
            synchronized (dtpVar) {
                if (dtpVar.waiters == hVar) {
                    dtpVar.waiters = hVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class h {
        static final h a = new h(null);
        volatile h next;
        volatile Thread thread;

        public h(byte[] bArr) {
        }

        final void a(h hVar) {
            dtp.b.a(this, hVar);
        }

        public h() {
            dtp.b.b(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "next"), AtomicReferenceFieldUpdater.newUpdater(dtp.class, h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(dtp.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(dtp.class, Object.class, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        b = gVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    static Object a(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof dtp) {
            Object obj = ((dtp) listenableFuture).value;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    Throwable th = bVar.d;
                    if (th != null) {
                        return new b(false, th);
                    }
                    return b.b;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if (!((!a) & isCancelled)) {
            try {
                Object p = defpackage.d.p(listenableFuture);
                if (p == null) {
                    return d;
                }
                return p;
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    Objects.toString(listenableFuture);
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2));
                }
                return new b(false, e2);
            } catch (ExecutionException e3) {
                return new c(e3.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        return b.b;
    }

    static void e(dtp dtpVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = dtpVar.waiters;
            if (b.e(dtpVar, hVar, h.a)) {
                while (hVar != null) {
                    Thread thread = hVar.thread;
                    if (thread != null) {
                        hVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.next;
                }
                dtpVar.d();
                do {
                    dVar = dtpVar.listeners;
                } while (!b.c(dtpVar, dVar, d.a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.next;
                    dVar3.next = dVar2;
                }
                while (dVar2 != null) {
                    Runnable runnable = dVar2.b;
                    d dVar4 = dVar2.next;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        dtpVar = fVar.a;
                        if (dtpVar.value == fVar) {
                            if (b.d(dtpVar, fVar, a(fVar.b))) {
                                dVar3 = dVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        k(runnable, dVar2.c);
                    }
                    dVar2 = dVar4;
                }
                return;
            }
        }
    }

    static void h(Object obj) {
        obj.getClass();
    }

    private final String i(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    private final void j(StringBuilder sb) {
        try {
            Object p = defpackage.d.p(this);
            sb.append("SUCCESS, result=[");
            sb.append(i(p));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            c.log(Level.SEVERE, defpackage.a.cd(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void l(h hVar) {
        hVar.thread = null;
        while (true) {
            h hVar2 = this.waiters;
            if (hVar2 != h.a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.next;
                    if (hVar2.thread != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.next = hVar4;
                        if (hVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, hVar2, hVar4)) {
                        break;
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object m(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == d) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).b);
        }
        Throwable th = ((b) obj).d;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof f) {
            return "setFuture=[" + i(((f) obj).b) + "]";
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void c(Runnable runnable, Executor executor) {
        h(runnable);
        h(executor);
        d dVar = this.listeners;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (b.c(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.a);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        b bVar;
        boolean z3;
        Object obj = this.value;
        boolean z4 = obj instanceof f;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z4 | z2)) {
            return false;
        }
        if (a) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = b.a;
        } else {
            bVar = b.b;
        }
        dtp<V> dtpVar = this;
        boolean z5 = false;
        while (true) {
            if (b.d(dtpVar, obj, bVar)) {
                e(dtpVar);
                if (!(obj instanceof f)) {
                    break;
                }
                ListenableFuture<? extends V> listenableFuture = ((f) obj).b;
                if (listenableFuture instanceof dtp) {
                    dtpVar = (dtp) listenableFuture;
                    obj = dtpVar.value;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof f)) {
                        break;
                    }
                    z5 = true;
                } else {
                    listenableFuture.cancel(z);
                    break;
                }
            } else {
                obj = dtpVar.value;
                if (!(obj instanceof f)) {
                    return z5;
                }
            }
        }
        return true;
    }

    public final boolean f(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (b.d(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    public final boolean g(Throwable th) {
        h(th);
        if (b.d(this, null, new c(th))) {
            e(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return m(obj2);
            }
            h hVar = this.waiters;
            if (hVar != h.a) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (b.e(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                l(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return m(obj);
                    }
                    hVar = this.waiters;
                } while (hVar != h.a);
            }
            return m(this.value);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.value;
        boolean z2 = obj instanceof f;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return z & (!z2);
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            j(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e2) {
                Class<?> cls = e2.getClass();
                Objects.toString(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                j(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof f))) {
                return m(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                h hVar = this.waiters;
                if (hVar != h.a) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (b.e(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return m(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    l(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            l(hVar2);
                        } else {
                            hVar = this.waiters;
                        }
                    } while (hVar != h.a);
                }
                return m(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof f))) {
                    return m(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String dtpVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(defpackage.a.co(dtpVar, str, " for "));
        }
        throw new InterruptedException();
    }

    protected void d() {
    }
}
