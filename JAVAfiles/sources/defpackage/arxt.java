package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arxt extends arxp {
    final /* synthetic */ arxw a;
    private final asgj b;

    public arxt(arxw arxwVar, asgj asgjVar) {
        this.a = arxwVar;
        this.b = asgjVar;
    }

    @Override // defpackage.arxp
    public final void a(Throwable th) {
        Object G = this.a.G();
        if (!(G instanceof arvx)) {
            G = arxx.b(G);
        }
        this.b.g(this.a, G);
    }

    @Override // defpackage.arxp
    public final boolean b() {
        return false;
    }
}
