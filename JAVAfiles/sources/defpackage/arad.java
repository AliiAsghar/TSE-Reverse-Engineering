package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arad extends araw {
    final /* synthetic */ aqut a;
    final /* synthetic */ arah b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arad(arah arahVar, aqut aqutVar) {
        super(arahVar.b.e);
        this.a = aqutVar;
        this.b = arahVar;
    }

    @Override // defpackage.araw
    public final void a() {
        int i = armc.a;
        arah arahVar = this.b;
        if (arahVar.a != null) {
            return;
        }
        try {
            arahVar.c.c(this.a);
        } catch (Throwable th) {
            this.b.b(Status.c.d(th).withDescription("Failed to read headers"));
        }
    }
}
