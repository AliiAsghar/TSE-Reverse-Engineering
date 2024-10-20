package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahjc implements andy {
    final /* synthetic */ ahja a;
    final /* synthetic */ ahit b;
    final /* synthetic */ ahjd c;

    public ahjc(ahjd ahjdVar, ahja ahjaVar, ahit ahitVar) {
        this.a = ahjaVar;
        this.b = ahitVar;
        this.c = ahjdVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        ahiu.e(th, "%s: Failed to run client onComplete", "DownloaderImp");
        ((ahiy) ((alha) ((adec) this.c.c).e).a).a(this.a.a);
        ((aiim) ((adec) this.c.c).a).e(this.b.a);
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        ((ahiy) ((alha) ((adec) this.c.c).e).a).a(this.a.a);
        ((aiim) ((adec) this.c.c).a).e(this.b.a);
    }
}
