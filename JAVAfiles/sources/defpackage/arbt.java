package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class arbt implements aral {
    @Override // defpackage.aral
    public void a(Status status, arak arakVar, aqut aqutVar) {
        throw null;
    }

    protected abstract aral b();

    @Override // defpackage.aral
    public final void c(aqut aqutVar) {
        b().c(aqutVar);
    }

    @Override // defpackage.arhq
    public final void d(arhp arhpVar) {
        b().d(arhpVar);
    }

    @Override // defpackage.arhq
    public final void e() {
        b().e();
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", b());
        return aj.toString();
    }
}
