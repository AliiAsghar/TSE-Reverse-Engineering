package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciv extends acir {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final arfw e = new arfw();

    private final void A() {
        synchronized (this.a) {
            if (!this.b) {
                return;
            }
            this.e.d(this);
        }
    }

    private final void x() {
        abhg.i(this.b, "Task is not yet complete");
    }

    private final void y() {
        if (!this.c) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void z() {
        String str;
        if (this.b) {
            if (k()) {
                Exception g = g();
                if (g == null) {
                    if (!l()) {
                        if (this.c) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(String.valueOf(h())));
                    }
                } else {
                    str = "failure";
                }
                throw new acih("Complete with: ".concat(str), g);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    @Override // defpackage.acir
    public final acir a(acig acigVar) {
        return b(aciu.a, acigVar);
    }

    @Override // defpackage.acir
    public final acir b(Executor executor, acig acigVar) {
        aciv acivVar = new aciv();
        this.e.c(new acii(executor, acigVar, acivVar, 1));
        A();
        return acivVar;
    }

    @Override // defpackage.acir
    public final acir c(acig acigVar) {
        return d(aciu.a, acigVar);
    }

    @Override // defpackage.acir
    public final acir d(Executor executor, acig acigVar) {
        aciv acivVar = new aciv();
        this.e.c(new acin(executor, acigVar, acivVar, 1));
        A();
        return acivVar;
    }

    @Override // defpackage.acir
    public final acir e(aciq aciqVar) {
        return f(aciu.a, aciqVar);
    }

    @Override // defpackage.acir
    public final acir f(Executor executor, aciq aciqVar) {
        aciv acivVar = new aciv();
        this.e.c(new acin(executor, aciqVar, acivVar, 0));
        A();
        return acivVar;
    }

    @Override // defpackage.acir
    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.acir
    public final Object h() {
        Object obj;
        synchronized (this.a) {
            x();
            y();
            Exception exc = this.d;
            if (exc == null) {
                obj = this.f;
            } else {
                throw new acip(exc);
            }
        }
        return obj;
    }

    @Override // defpackage.acir
    public final Object i(Class cls) {
        Object obj;
        synchronized (this.a) {
            x();
            y();
            if (!cls.isInstance(this.d)) {
                Exception exc = this.d;
                if (exc == null) {
                    obj = this.f;
                } else {
                    throw new acip(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.d));
            }
        }
        return obj;
    }

    @Override // defpackage.acir
    public final boolean j() {
        return this.c;
    }

    @Override // defpackage.acir
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.acir
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.acir
    public final void m(Executor executor, acij acijVar) {
        this.e.c(new acii(executor, acijVar, 0));
        A();
    }

    @Override // defpackage.acir
    public final void n(Executor executor, acik acikVar) {
        this.e.c(new acii(executor, acikVar, 2));
        A();
    }

    @Override // defpackage.acir
    public final void o(Executor executor, acil acilVar) {
        this.e.c(new acii(executor, acilVar, 3));
        A();
    }

    @Override // defpackage.acir
    public final void p(Executor executor, acim acimVar) {
        this.e.c(new acii(executor, acimVar, 4));
        A();
    }

    @Override // defpackage.acir
    public final void q(acik acikVar) {
        n(aciu.a, acikVar);
    }

    @Override // defpackage.acir
    public final void r(acil acilVar) {
        o(aciu.a, acilVar);
    }

    @Override // defpackage.acir
    public final void s(acim acimVar) {
        p(aciu.a, acimVar);
    }

    public final void t(Exception exc) {
        d.aC(exc, "Exception must not be null");
        synchronized (this.a) {
            z();
            this.b = true;
            this.d = exc;
        }
        this.e.d(this);
    }

    public final void u(Object obj) {
        synchronized (this.a) {
            z();
            this.b = true;
            this.f = obj;
        }
        this.e.d(this);
    }

    public final boolean v(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.d(this);
            return true;
        }
    }

    public final void w() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.d(this);
        }
    }
}
