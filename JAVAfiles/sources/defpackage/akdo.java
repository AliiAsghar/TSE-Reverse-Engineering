package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdo implements apxn, emx {
    private final arwe a;
    private final apxa b;
    private final aklj c;

    public akdo(apxa apxaVar, aklj akljVar, arwe arweVar) {
        this.b = apxaVar;
        this.c = akljVar;
        this.a = arweVar;
    }

    @Override // defpackage.apxn
    public final void a() {
        arwi.g(this.a, null);
        this.c.N().d(this);
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        arwi.g(this.a, null);
        aowt.o();
        apxa apxaVar = this.b;
        apxaVar.c();
        apxaVar.a.remove(this);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
