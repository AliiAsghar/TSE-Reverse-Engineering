package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqxy implements araj {
    private final aqxp a;
    private final aqyd b;

    public aqxy(aqxp aqxpVar, aqyd aqydVar) {
        this.a = aqxpVar;
        this.b = aqydVar;
    }

    @Override // defpackage.araj
    public final aqrm a() {
        throw null;
    }

    @Override // defpackage.araj
    public final void c(Status status) {
        synchronized (this.a) {
            this.a.i(status);
        }
    }

    @Override // defpackage.araj
    public final void e() {
        try {
            synchronized (this.b) {
                aqyd aqydVar = this.b;
                aqydVar.f();
                aqydVar.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.arho
    public final void g(int i) {
        synchronized (this.a) {
            this.a.n(i);
        }
    }

    @Override // defpackage.araj
    public final void i(aqsn aqsnVar) {
        synchronized (this.b) {
            this.b.c(aqsnVar);
        }
    }

    @Override // defpackage.araj
    public final void m(aral aralVar) {
        synchronized (this.a) {
            this.a.l(this.b, aralVar);
        }
        if (this.b.h()) {
            aralVar.e();
        }
        try {
            synchronized (this.b) {
                this.b.e();
                this.b.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.arho
    public final void n(InputStream inputStream) {
        try {
            synchronized (this.b) {
                this.b.d(inputStream);
                this.b.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.arho
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        aqyd aqydVar = this.b;
        return "MultiMessageClientStream[" + this.a.toString() + "/" + aqydVar.toString() + "]";
    }

    @Override // defpackage.arho
    public final void d() {
    }

    @Override // defpackage.arho
    public final void f() {
    }

    @Override // defpackage.araj
    public final void b(arch archVar) {
    }

    @Override // defpackage.arho
    public final void h(aqsa aqsaVar) {
    }

    @Override // defpackage.araj
    public final void j(aqsp aqspVar) {
    }

    @Override // defpackage.araj
    public final void k(int i) {
    }

    @Override // defpackage.araj
    public final void l(int i) {
    }
}
