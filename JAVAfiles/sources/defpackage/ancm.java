package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ancm extends ancq {
    private static final anek b = new anek(ancm.class);
    private alnu c;
    private final boolean d;
    private final boolean e;

    public ancm(alnu alnuVar, boolean z, boolean z2) {
        super(alnuVar.size());
        alnuVar.getClass();
        this.c = alnuVar;
        this.d = z;
        this.e = z2;
    }

    private final void r(int i, Future future) {
        try {
            e(i, d.p(future));
        } catch (ExecutionException e) {
            s(e.getCause());
        } catch (Throwable th) {
            s(th);
        }
    }

    private final void s(Throwable th) {
        th.getClass();
        if (this.d && !setException(th)) {
            Set<Throwable> set = this.seenExceptions;
            if (set == null) {
                Set N = alzz.N();
                d(N);
                ancq.a.b(this, N);
                set = this.seenExceptions;
                set.getClass();
            }
            if (u(set, th)) {
                t(th);
                return;
            }
        }
        if (th instanceof Error) {
            t(th);
        }
    }

    private static void t(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    private static boolean u(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.ancq
    public final void d(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable i = i();
            i.getClass();
            u(set, i);
        }
    }

    public abstract void e(int i, Object obj);

    public final void f(alnu alnuVar) {
        boolean z;
        int a = ancq.a.a(this);
        int i = 0;
        if (a >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Less than 0 remaining futures");
        if (a == 0) {
            if (alnuVar != null) {
                aluq listIterator = alnuVar.listIterator();
                while (listIterator.hasNext()) {
                    Future future = (Future) listIterator.next();
                    if (!future.isCancelled()) {
                        r(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            g();
            q(2);
        }
    }

    public abstract void g();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        alnu alnuVar = this.c;
        if (alnuVar != null) {
            return "futures=".concat(alnuVar.toString());
        }
        return super.gs();
    }

    @Override // defpackage.ance
    protected final void gt() {
        alnu alnuVar = this.c;
        boolean z = true;
        q(1);
        boolean isCancelled = isCancelled();
        if (alnuVar == null) {
            z = false;
        }
        if (z & isCancelled) {
            boolean n = n();
            aluq listIterator = alnuVar.listIterator();
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        final alnu alnuVar;
        alnu alnuVar2 = this.c;
        alnuVar2.getClass();
        if (alnuVar2.isEmpty()) {
            g();
            return;
        }
        if (this.d) {
            aluq listIterator = this.c.listIterator();
            final int i = 0;
            while (listIterator.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) listIterator.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    p(i, listenableFuture);
                } else {
                    listenableFuture.c(new Runnable() { // from class: anck
                        @Override // java.lang.Runnable
                        public final void run() {
                            ancm.this.p(i, listenableFuture);
                        }
                    }, andi.a);
                }
                i = i2;
            }
            return;
        }
        if (this.e) {
            alnuVar = this.c;
        } else {
            alnuVar = null;
        }
        Runnable runnable = new Runnable() { // from class: ancl
            @Override // java.lang.Runnable
            public final void run() {
                ancm.this.f(alnuVar);
            }
        };
        aluq listIterator2 = this.c.listIterator();
        while (listIterator2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) listIterator2.next();
            if (listenableFuture2.isDone()) {
                f(alnuVar);
            } else {
                listenableFuture2.c(runnable, andi.a);
            }
        }
    }

    public final void p(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                r(i, listenableFuture);
            }
        } finally {
            f(null);
        }
    }

    public void q(int i) {
        this.c = null;
    }
}
