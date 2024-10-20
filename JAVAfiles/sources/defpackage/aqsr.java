package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqsr extends aque {
    @Override // defpackage.aque
    public aquc a() {
        return b().a();
    }

    protected abstract aque b();

    @Override // defpackage.aque
    public void c(aqsb aqsbVar) {
        b().c(aqsbVar);
    }

    @Override // defpackage.aque
    public void d(aqsp aqspVar) {
        b().d(aqspVar);
    }

    @Override // defpackage.aque
    public void e(Executor executor) {
        b().e(executor);
    }

    @Override // defpackage.aque
    public void f(long j, TimeUnit timeUnit) {
        b().f(j, timeUnit);
    }

    @Override // defpackage.aque
    public void g(aqrv... aqrvVarArr) {
        b().g(aqrvVarArr);
    }

    @Override // defpackage.aque
    public void h(Executor executor) {
        b().h(executor);
    }

    @Override // defpackage.aque
    public void i(String str) {
        b().i(str);
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", b());
        return aj.toString();
    }
}
