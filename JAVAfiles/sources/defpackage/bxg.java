package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxg implements bzt {
    private final arqr a;
    private bxh b;

    public bxg(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.bzt
    public final void h() {
        bxh bxhVar = this.b;
        if (bxhVar != null) {
            bxhVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.bzt
    public final void i() {
        this.b = (bxh) this.a.a(bxl.a);
    }

    @Override // defpackage.bzt
    public final void g() {
    }
}
