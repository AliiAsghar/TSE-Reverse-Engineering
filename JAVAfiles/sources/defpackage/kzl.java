package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzl implements akgh<kzn> {
    final /* synthetic */ kzm a;
    final /* synthetic */ kyf b;

    public kzl(kzm kzmVar, kyf kyfVar) {
        this.a = kzmVar;
        this.b = kyfVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        throw new IllegalStateException("onError() aggregatorDataSource=RCS_AVAILABILITY_DATA_SOURCE_KEY", th);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        kzn kznVar = (kzn) obj;
        kznVar.getClass();
        if (!((ohf) this.a.b.b()).a()) {
            return;
        }
        mka mkaVar = this.b.p;
        kzh kzhVar = (kzh) mkaVar.a;
        mkaVar.a = lga.F(kzhVar.a, kzhVar.b, (ngh) kznVar.a);
        this.b.a();
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
