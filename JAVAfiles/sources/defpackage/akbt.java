package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akbt implements andy {
    final /* synthetic */ akbu a;

    public akbt(akbu akbuVar) {
        this.a = akbuVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.andy
    public final void b(Object obj) {
        akbu akbuVar = this.a;
        akbuVar.e = obj;
        akbuVar.b = true;
        akbuVar.a();
    }
}
