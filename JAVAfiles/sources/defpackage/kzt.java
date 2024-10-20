package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzt implements akgh<kzn> {
    final /* synthetic */ kyf a;

    public kzt(kyf kyfVar) {
        this.a = kyfVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        throw new IllegalStateException("onError() aggregatorDataSource=TYPING_INDICATOR_KEY", th);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        kzn kznVar = (kzn) obj;
        kznVar.getClass();
        mka mkaVar = this.a.p;
        kzh kzhVar = (kzh) mkaVar.a;
        mkaVar.a = lga.F((alor) kznVar.a, kzhVar.b, kzhVar.c);
        this.a.a();
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
