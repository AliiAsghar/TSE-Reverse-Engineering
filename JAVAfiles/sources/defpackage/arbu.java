package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arbu implements arau {
    protected abstract arau a();

    @Override // defpackage.aram
    public araj b(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqrx[] aqrxVarArr) {
        throw null;
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        return a().c();
    }

    @Override // defpackage.aref
    public final Runnable d(aree areeVar) {
        return a().d(areeVar);
    }

    @Override // defpackage.aref
    public void o(Status status) {
        a().o(status);
    }

    @Override // defpackage.aref
    public final void p(Status status) {
        throw null;
    }

    @Override // defpackage.arau
    public final aqrm r() {
        return a().r();
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", a());
        return aj.toString();
    }
}
