package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzi implements akgh<kzn> {
    final /* synthetic */ kzj a;
    final /* synthetic */ kyf b;

    public kzi(kzj kzjVar, kyf kyfVar) {
        this.a = kzjVar;
        this.b = kyfVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        throw new IllegalStateException("onError() aggregatorDataSource=GROUP_UPGRADE_KEY", th);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        kzn kznVar = (kzn) obj;
        kznVar.getClass();
        if (!((oju) this.a.c.b()).a()) {
            return;
        }
        mka mkaVar = this.b.p;
        kzh kzhVar = (kzh) mkaVar.a;
        mkaVar.a = lga.F(kzhVar.a, (Integer) kznVar.a, kzhVar.c);
        this.b.a();
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
