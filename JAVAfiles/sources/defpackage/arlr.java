package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arlr extends aqtr {
    @Override // defpackage.aqtr
    public final aqtw b(aqto aqtoVar) {
        return g().b(aqtoVar);
    }

    @Override // defpackage.aqtr
    public final aqwe c() {
        return g().c();
    }

    @Override // defpackage.aqtr
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.aqtr
    public final void e() {
        g().e();
    }

    @Override // defpackage.aqtr
    public void f(aqsd aqsdVar, aqtx aqtxVar) {
        throw null;
    }

    protected abstract aqtr g();

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", g());
        return aj.toString();
    }
}
