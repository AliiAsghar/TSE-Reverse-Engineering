package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class araf extends araw {
    final /* synthetic */ Status a;
    final /* synthetic */ aqut b;
    final /* synthetic */ arah c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public araf(arah arahVar, Status status, aqut aqutVar) {
        super(arahVar.b.e);
        this.a = status;
        this.b = aqutVar;
        this.c = arahVar;
    }

    @Override // defpackage.araw
    public final void a() {
        int i = armc.a;
        this.c.b.f.c();
        Status status = this.a;
        aqut aqutVar = this.b;
        Status status2 = this.c.a;
        if (status2 != null) {
            aqutVar = new aqut();
            status = status2;
        }
        try {
            this.c.c.a(status, aqutVar);
        } finally {
            this.c.b.d.a(status.f());
        }
    }
}
