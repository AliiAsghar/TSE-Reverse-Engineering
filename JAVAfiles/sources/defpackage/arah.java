package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arah implements aral {
    public Status a;
    final /* synthetic */ arai b;
    public final apsd c;

    public arah(arai araiVar, apsd apsdVar) {
        this.b = araiVar;
        this.c = apsdVar;
    }

    @Override // defpackage.aral
    public final void a(Status status, arak arakVar, aqut aqutVar) {
        int i = armc.a;
        aqsn b = this.b.b();
        if (status.getCode() == Status.Code.CANCELLED && b != null && b.f()) {
            status = this.b.f.b();
            aqutVar = new aqut();
        }
        this.b.c.execute(new araf(this, status, aqutVar));
    }

    public final void b(Status status) {
        this.a = status;
        this.b.h.c(status);
    }

    @Override // defpackage.aral
    public final void c(aqut aqutVar) {
        int i = armc.a;
        this.b.c.execute(new arad(this, aqutVar));
    }

    @Override // defpackage.arhq
    public final void d(arhp arhpVar) {
        int i = armc.a;
        this.b.c.execute(new arae(this, arhpVar));
    }

    @Override // defpackage.arhq
    public final void e() {
        if (this.b.b.a.a()) {
            return;
        }
        int i = armc.a;
        this.b.c.execute(new arag(this));
    }
}
