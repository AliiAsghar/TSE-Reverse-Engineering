package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arcl extends arbt {
    final /* synthetic */ aral a;
    final /* synthetic */ arcm b;

    public arcl(arcm arcmVar, aral aralVar) {
        this.a = aralVar;
        this.b = arcmVar;
    }

    @Override // defpackage.arbt, defpackage.aral
    public final void a(Status status, arak arakVar, aqut aqutVar) {
        this.b.b.a.a(status.f());
        this.a.a(status, arakVar, aqutVar);
    }

    @Override // defpackage.arbt
    protected final aral b() {
        return this.a;
    }
}
