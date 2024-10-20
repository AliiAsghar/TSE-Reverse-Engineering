package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arag extends araw {
    final /* synthetic */ arah a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arag(arah arahVar) {
        super(arahVar.b.e);
        this.a = arahVar;
    }

    @Override // defpackage.araw
    public final void a() {
        int i = armc.a;
        arah arahVar = this.a;
        if (arahVar.a != null) {
            return;
        }
        try {
            arahVar.c.e();
        } catch (Throwable th) {
            this.a.b(Status.c.d(th).withDescription("Failed to call onReady."));
        }
    }
}
