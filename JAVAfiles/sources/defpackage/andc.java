package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andc {
    public static final anek a = new anek(andc.class);
    public final ancw b;
    public final anee c;
    private final AtomicReference d;

    public andc(ListenableFuture listenableFuture) {
        this(listenableFuture, new ancw());
    }

    @Deprecated
    public static andc a(ListenableFuture listenableFuture, Executor executor) {
        executor.getClass();
        andc andcVar = new andc(albo.bJ(listenableFuture));
        albo.bR(listenableFuture, new adsc(andcVar, executor, 3), andi.a);
        return andcVar;
    }

    public static andc b(ancx ancxVar, Executor executor) {
        ancw ancwVar = new ancw();
        anfd anfdVar = new anfd(new aktl(ancxVar, ancwVar, 2));
        executor.execute(anfdVar);
        return new andc(anfdVar, ancwVar);
    }

    public static andc c(ancu ancuVar, Executor executor) {
        ancw ancwVar = new ancw();
        anfd anfdVar = new anfd(new aktk(ancuVar, ancwVar, 2));
        executor.execute(anfdVar);
        return new andc(anfdVar, ancwVar);
    }

    public static void j(AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new akwm(autoCloseable, 7));
            } catch (RejectedExecutionException e) {
                anek anekVar = a;
                if (anekVar.a().isLoggable(Level.WARNING)) {
                    anekVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                j(autoCloseable, andi.a);
            }
        }
    }

    private final boolean n(anda andaVar, anda andaVar2) {
        return a.bC(this.d, andaVar, andaVar2);
    }

    private final andc o(anee aneeVar) {
        andc andcVar = new andc(aneeVar);
        g(andcVar.b);
        return andcVar;
    }

    public final andc d(ancy ancyVar, Executor executor) {
        return o((anee) ancj.g(this.c, new anct(this, ancyVar, 0), executor));
    }

    public final andc e(ancv ancvVar, Executor executor) {
        return o((anee) ancj.g(this.c, new anct(this, ancvVar, 2), executor));
    }

    public final ListenableFuture f() {
        return albo.bJ(ancj.f(this.c, new algm(null), andi.a));
    }

    protected final void finalize() {
        if (((anda) this.d.get()).equals(anda.OPEN)) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            l();
        }
    }

    public final void g(ancw ancwVar) {
        h(anda.OPEN, anda.SUBSUMED);
        ancwVar.a(this.b, andi.a);
    }

    public final void h(anda andaVar, anda andaVar2) {
        albo.Z(n(andaVar, andaVar2), "Expected state to be %s, but it was %s", andaVar, andaVar2);
    }

    public final void i() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", this);
        this.b.close();
    }

    public final void k(andb andbVar, Executor executor) {
        if (!n(anda.OPEN, anda.WILL_CREATE_VALUE_AND_CLOSER)) {
            int ordinal = ((anda) this.d.get()).ordinal();
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        throw new AssertionError(this.d);
                    }
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                }
                throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            }
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        this.c.c(new ajnt(this, andbVar, 18, (char[]) null), executor);
    }

    public final anee l() {
        if (n(anda.OPEN, anda.WILL_CLOSE)) {
            a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            this.c.c(new akwm(this, 8, null), andi.a);
        } else {
            int ordinal = ((anda) this.d.get()).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        if (ordinal == 5) {
                            throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                        }
                    } else {
                        throw new IllegalStateException("Cannot call finishToFuture() twice");
                    }
                } else {
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                }
            } else {
                throw new AssertionError();
            }
        }
        return this.c;
    }

    public final void m() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "cancel", "cancelling {0}", this);
        if (this.c.cancel(false)) {
            i();
        }
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("state", this.d.get());
        aj.a(this.c);
        return aj.toString();
    }

    private andc(ListenableFuture listenableFuture, ancw ancwVar) {
        this.d = new AtomicReference(anda.OPEN);
        this.c = anee.o(listenableFuture);
        this.b = ancwVar;
    }
}
