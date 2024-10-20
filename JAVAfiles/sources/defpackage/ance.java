package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ance<V> extends anff implements ListenableFuture<V> {
    private static final Object a;
    static final boolean k;
    static final anek l;
    public static final a m;
    public volatile d listeners;
    public volatile Object value;
    public volatile k waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public abstract class a {
        public abstract d a(ance anceVar, d dVar);

        public abstract k b(ance anceVar, k kVar);

        public abstract void c(k kVar, k kVar2);

        public abstract void d(k kVar, Thread thread);

        public abstract boolean e(ance anceVar, d dVar, d dVar2);

        public abstract boolean f(ance anceVar, Object obj, Object obj2);

        public abstract boolean g(ance anceVar, k kVar, k kVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (ance.k) {
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
    /* loaded from: classes4.dex */
    public final class c {
        static final c a = new c(new Throwable() { // from class: ance.c.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            th.getClass();
            this.b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class d {
        static final d a = new d();
        final Runnable b;
        final Executor c;
        d next;

        public d() {
            this.b = null;
            this.c = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    final class e extends a {
        final AtomicReferenceFieldUpdater<k, Thread> a;
        final AtomicReferenceFieldUpdater<k, k> b;
        final AtomicReferenceFieldUpdater<? super ance<?>, k> c;
        final AtomicReferenceFieldUpdater<? super ance<?>, d> d;
        final AtomicReferenceFieldUpdater<? super ance<?>, Object> e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // ance.a
        public final d a(ance anceVar, d dVar) {
            return this.d.getAndSet(anceVar, dVar);
        }

        @Override // ance.a
        public final k b(ance anceVar, k kVar) {
            return this.c.getAndSet(anceVar, kVar);
        }

        @Override // ance.a
        public final void c(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        @Override // ance.a
        public final void d(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }

        @Override // ance.a
        public final boolean e(ance anceVar, d dVar, d dVar2) {
            return defpackage.d.o(this.d, anceVar, dVar, dVar2);
        }

        @Override // ance.a
        public final boolean f(ance anceVar, Object obj, Object obj2) {
            return defpackage.d.o(this.e, anceVar, obj, obj2);
        }

        @Override // ance.a
        public final boolean g(ance anceVar, k kVar, k kVar2) {
            return defpackage.d.o(this.c, anceVar, kVar, kVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class f<V> implements Runnable {
        final ance<V> a;
        final ListenableFuture<? extends V> b;

        public f(ance anceVar, ListenableFuture listenableFuture) {
            this.a = anceVar;
            this.b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = ance.m;
            if (this.a.value == this) {
                ListenableFuture<? extends V> listenableFuture = this.b;
                if (ance.m.f(this.a, this, ance.h(listenableFuture))) {
                    ance.j(this.a, false);
                }
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    final class g extends a {
        @Override // ance.a
        public final d a(ance anceVar, d dVar) {
            d dVar2;
            synchronized (anceVar) {
                dVar2 = anceVar.listeners;
                if (dVar2 != dVar) {
                    anceVar.listeners = dVar;
                }
            }
            return dVar2;
        }

        @Override // ance.a
        public final k b(ance anceVar, k kVar) {
            k kVar2;
            synchronized (anceVar) {
                kVar2 = anceVar.waiters;
                if (kVar2 != kVar) {
                    anceVar.waiters = kVar;
                }
            }
            return kVar2;
        }

        @Override // ance.a
        public final void c(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        @Override // ance.a
        public final void d(k kVar, Thread thread) {
            kVar.thread = thread;
        }

        @Override // ance.a
        public final boolean e(ance anceVar, d dVar, d dVar2) {
            synchronized (anceVar) {
                if (anceVar.listeners == dVar) {
                    anceVar.listeners = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // ance.a
        public final boolean f(ance anceVar, Object obj, Object obj2) {
            synchronized (anceVar) {
                if (anceVar.value == obj) {
                    anceVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // ance.a
        public final boolean g(ance anceVar, k kVar, k kVar2) {
            synchronized (anceVar) {
                if (anceVar.waiters == kVar) {
                    anceVar.waiters = kVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface h<V> extends ListenableFuture<V> {
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public abstract class i<V> extends ance<V> implements h<V> {
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    final class j extends a {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: ance.j.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* synthetic */ Unsafe run() {
                            return aetn.be();
                        }
                    });
                }
                try {
                    c = unsafe.objectFieldOffset(ance.class.getDeclaredField("waiters"));
                    b = unsafe.objectFieldOffset(ance.class.getDeclaredField("listeners"));
                    d = unsafe.objectFieldOffset(ance.class.getDeclaredField(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
                    e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                    f = unsafe.objectFieldOffset(k.class.getDeclaredField("next"));
                    a = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        @Override // ance.a
        public final d a(ance anceVar, d dVar) {
            d dVar2;
            do {
                dVar2 = anceVar.listeners;
                if (dVar == dVar2) {
                    break;
                }
            } while (!e(anceVar, dVar2, dVar));
            return dVar2;
        }

        @Override // ance.a
        public final k b(ance anceVar, k kVar) {
            k kVar2;
            do {
                kVar2 = anceVar.waiters;
                if (kVar == kVar2) {
                    break;
                }
            } while (!g(anceVar, kVar2, kVar));
            return kVar2;
        }

        @Override // ance.a
        public final void c(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // ance.a
        public final void d(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }

        @Override // ance.a
        public final boolean e(ance anceVar, d dVar, d dVar2) {
            return ancf.a(a, anceVar, b, dVar, dVar2);
        }

        @Override // ance.a
        public final boolean f(ance anceVar, Object obj, Object obj2) {
            return ancf.a(a, anceVar, d, obj, obj2);
        }

        @Override // ance.a
        public final boolean g(ance anceVar, k kVar, k kVar2) {
            return ancf.a(a, anceVar, c, kVar, kVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class k {
        static final k a = new k(null);
        volatile k next;
        volatile Thread thread;

        public k(byte[] bArr) {
        }

        final void a(k kVar) {
            ance.m.c(this, kVar);
        }

        public k() {
            ance.m.d(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        k = z;
        l = new anek(ance.class);
        try {
            gVar = new j();
            th2 = null;
            th = null;
        } catch (Error | Exception e2) {
            try {
                th = null;
                th2 = e2;
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "next"), AtomicReferenceFieldUpdater.newUpdater(ance.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(ance.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(ance.class, Object.class, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
            } catch (Error | Exception e3) {
                th = e3;
                th2 = e2;
                gVar = new g();
            }
        }
        m = gVar;
        if (th != null) {
            anek anekVar = l;
            anekVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            anekVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        a = new Object();
    }

    private final void d(StringBuilder sb) {
        try {
            Object p = defpackage.d.p(this);
            sb.append("SUCCESS, result=[");
            if (p == null) {
                sb.append("null");
            } else if (p == this) {
                sb.append("this future");
            } else {
                sb.append(p.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(p)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void e(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof f) {
            sb.append(", setFuture=[");
            f(sb, ((f) obj).b);
            sb.append("]");
        } else {
            try {
                concat = albo.af(gs());
            } catch (Exception | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            d(sb);
        }
    }

    private final void f(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            l.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", defpackage.a.bY(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ListenableFuture listenableFuture) {
        Throwable i2;
        if (listenableFuture instanceof h) {
            Object obj = ((ance) listenableFuture).value;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    Throwable th = bVar.d;
                    obj = th != null ? new b(false, th) : b.b;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((listenableFuture instanceof anff) && (i2 = ((anff) listenableFuture).i()) != null) {
            return new c(i2);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if (!((!k) & isCancelled)) {
            try {
                Object p = defpackage.d.p(listenableFuture);
                if (isCancelled) {
                    return new b(false, new IllegalArgumentException(defpackage.a.cr(listenableFuture, "get() did not throw CancellationException, despite reporting isCancelled() == true: ")));
                }
                if (p == null) {
                    return a;
                }
                return p;
            } catch (Error e2) {
                e = e2;
                return new c(e);
            } catch (CancellationException e3) {
                if (!isCancelled) {
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e3));
                }
                return new b(false, e3);
            } catch (ExecutionException e4) {
                if (isCancelled) {
                    return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(listenableFuture))), e4));
                }
                return new c(e4.getCause());
            } catch (Exception e5) {
                e = e5;
                return new c(e);
            }
        }
        b bVar2 = b.b;
        bVar2.getClass();
        return bVar2;
    }

    public static void j(ance anceVar, boolean z) {
        d dVar = null;
        while (true) {
            for (k b2 = m.b(anceVar, k.a); b2 != null; b2 = b2.next) {
                Thread thread = b2.thread;
                if (thread != null) {
                    b2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                anceVar.k();
            }
            anceVar.gt();
            d dVar2 = dVar;
            d a2 = m.a(anceVar, d.a);
            d dVar3 = dVar2;
            while (a2 != null) {
                d dVar4 = a2.next;
                a2.next = dVar3;
                dVar3 = a2;
                a2 = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.next;
                Runnable runnable = dVar3.b;
                runnable.getClass();
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    anceVar = fVar.a;
                    if (anceVar.value == fVar) {
                        if (m.f(anceVar, fVar, h(fVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.c;
                    executor.getClass();
                    g(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
            z = false;
        }
    }

    private final void o(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 != k.a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.next;
                    if (kVar2.thread != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.next = kVar4;
                        if (kVar3.thread == null) {
                            break;
                        }
                    } else if (!m.g(this, kVar2, kVar4)) {
                        break;
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object p(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == a) {
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

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void c(Runnable runnable, Executor executor) {
        d dVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (dVar = this.listeners) != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (m.e(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.a);
        }
        g(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof ance.f
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = defpackage.ance.k
            if (r1 == 0) goto L1f
            ance$b r1 = new ance$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            ance$b r1 = ance.b.a
            goto L26
        L24:
            ance$b r1 = ance.b.b
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            ance$a r6 = defpackage.ance.m
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L58
            j(r4, r8)
            boolean r4 = r0 instanceof ance.f
            if (r4 == 0) goto L56
            ance$f r0 = (ance.f) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof ance.h
            if (r4 == 0) goto L53
            r4 = r0
            ance r4 = (defpackage.ance) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof ance.f
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = r3
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof ance.f
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ance.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return p(obj2);
            }
            k kVar = this.waiters;
            if (kVar != k.a) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (m.g(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                o(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return p(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != k.a);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return p(obj3);
        }
        throw new InterruptedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public String gs() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // defpackage.anff
    public final Throwable i() {
        if (this instanceof h) {
            Object obj = this.value;
            if (obj instanceof c) {
                return ((c) obj).b;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
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

    public final void l(Future future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(n());
        }
    }

    public final boolean m(ListenableFuture listenableFuture) {
        c cVar;
        listenableFuture.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!m.f(this, null, h(listenableFuture))) {
                    return false;
                }
                j(this, false);
                return true;
            }
            f fVar = new f(this, listenableFuture);
            if (m.f(this, null, fVar)) {
                try {
                    listenableFuture.c(fVar, andi.a);
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Error | Exception unused) {
                        cVar = c.a;
                    }
                    m.f(this, fVar, cVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            listenableFuture.cancel(((b) obj).c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean n() {
        Object obj = this.value;
        if ((obj instanceof b) && ((b) obj).c) {
            return true;
        }
        return false;
    }

    public boolean set(V v) {
        if (v == null) {
            v = (V) a;
        }
        if (!m.f(this, null, v)) {
            return false;
        }
        j(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!m.f(this, null, new c(th))) {
            return false;
        }
        j(this, false);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            e(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void gt() {
    }

    protected void k() {
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof f))) {
                return p(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                k kVar = this.waiters;
                if (kVar != k.a) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (m.g(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return p(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(kVar2);
                        } else {
                            kVar = this.waiters;
                        }
                    } while (kVar != k.a);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return p(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof f))) {
                    return p(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String anceVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(defpackage.a.co(anceVar, str, " for "));
        }
        throw new InterruptedException();
    }
}
