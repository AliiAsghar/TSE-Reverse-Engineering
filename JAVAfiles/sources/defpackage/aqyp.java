package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqyp implements araj {
    private final aqxp a;
    private final aqyd b;
    private InputStream c;
    private aqsn d;

    public aqyp(aqxp aqxpVar, aqyd aqydVar) {
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
                aqsn aqsnVar = this.d;
                if (aqsnVar != null) {
                    this.b.c(aqsnVar);
                }
                this.b.e();
                aqyd aqydVar = this.b;
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    aqydVar.d(inputStream);
                }
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
        this.d = aqsnVar;
    }

    @Override // defpackage.araj
    public final void m(aral aralVar) {
        synchronized (this.a) {
            this.a.l(this.b, aralVar);
        }
        if (this.b.h()) {
            aralVar.e();
        }
    }

    @Override // defpackage.arho
    public final void n(InputStream inputStream) {
        if (this.c != null) {
            synchronized (this.a) {
                this.a.h(Status.m.withDescription("too many messages"));
            }
            return;
        }
        this.c = inputStream;
    }

    @Override // defpackage.arho
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        aqyd aqydVar = this.b;
        return "SingleMessageClientStream[" + this.a.toString() + "/" + aqydVar.toString() + "]";
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
