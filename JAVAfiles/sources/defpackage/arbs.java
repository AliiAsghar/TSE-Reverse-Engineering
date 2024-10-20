package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arbs implements araj {
    @Override // defpackage.araj
    public final aqrm a() {
        throw null;
    }

    @Override // defpackage.araj
    public final void b(arch archVar) {
        p().b(archVar);
    }

    @Override // defpackage.araj
    public final void c(Status status) {
        p().c(status);
    }

    @Override // defpackage.arho
    public final void d() {
        p().d();
    }

    @Override // defpackage.araj
    public final void e() {
        p().e();
    }

    @Override // defpackage.arho
    public final void f() {
        p().f();
    }

    @Override // defpackage.arho
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.arho
    public final void h(aqsa aqsaVar) {
        p().h(aqsaVar);
    }

    @Override // defpackage.araj
    public final void i(aqsn aqsnVar) {
        p().i(aqsnVar);
    }

    @Override // defpackage.araj
    public final void j(aqsp aqspVar) {
        p().j(aqspVar);
    }

    @Override // defpackage.araj
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.araj
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.araj
    public void m(aral aralVar) {
        throw null;
    }

    @Override // defpackage.arho
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.arho
    public final boolean o() {
        return p().o();
    }

    protected abstract araj p();

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", p());
        return aj.toString();
    }
}
