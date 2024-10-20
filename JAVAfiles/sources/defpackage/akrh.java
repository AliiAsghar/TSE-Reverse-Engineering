package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akrh implements Runnable, aksa {
    public akry a;
    private akry b;
    private final boolean c = aiut.h(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public akrh(akry akryVar, boolean z) {
        this.f = false;
        this.a = akryVar;
        this.b = akryVar;
        this.f = z;
    }

    private final void c() {
        boolean z = true;
        this.d = true;
        boolean z2 = this.c;
        akry akryVar = this.a;
        if (!z2 || this.e || !aiut.g()) {
            z = false;
        }
        akryVar.o(z);
        this.a = null;
    }

    public final void a(andc andcVar) {
        b(andcVar.f());
    }

    public final void b(ListenableFuture listenableFuture) {
        if (!this.d) {
            if (!this.e) {
                this.e = true;
                this.a.r();
                listenableFuture.c(this, andi.a);
                return;
            }
            throw new IllegalStateException("Signal is already attached to future");
        }
        throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        akry akryVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (!this.d) {
                    c();
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
            if (akryVar != null) {
                akryVar.close();
            }
            if (this.f) {
                akqj.g(akrf.a);
            }
        } catch (Throwable th) {
            if (akryVar != null) {
                try {
                    akryVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.d && this.e) {
            c();
        } else {
            aiut.e(new akqg(3));
        }
    }
}
