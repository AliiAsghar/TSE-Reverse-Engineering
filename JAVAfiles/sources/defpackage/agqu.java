package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agqu extends aqvh {
    final /* synthetic */ agqx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agqu(apsd apsdVar, agqx agqxVar) {
        super(apsdVar);
        this.a = agqxVar;
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        agqx agqxVar = this.a;
        synchronized (agqxVar.a) {
            if (!agqxVar.c) {
                agqxVar.c = true;
                agqw agqwVar = agqxVar.b;
                if (agqwVar == null) {
                    agqxVar.d.s = status.getCode().value();
                    ahkc.a().c(agqxVar.d);
                } else {
                    synchronized (agqwVar.a) {
                        agqwVar.b.b(agqwVar.d, agqwVar.e);
                        agqwVar.b.s = status.getCode().value();
                        ahkc.a().c(agqwVar.b);
                        agqwVar.c = true;
                    }
                }
            }
        }
        super.a(status, aqutVar);
    }
}
