package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkt extends acyj {
    final /* synthetic */ adlw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkt(adlw adlwVar) {
        super("ProvisioningStateMachine");
        this.d = adlwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acyj
    public final void h(String str) {
        this.d.D.b(str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acyj
    public final void i(String str) {
        this.d.D.d(str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acyj
    public final void j() {
        this.d.D.e("onHalting", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acyj
    public final void k() {
        this.d.D.e("onQuitting", new Object[0]);
        this.d.aB(4);
    }

    @Override // defpackage.acyj
    public final void l() {
        adlw adlwVar = this.d;
        adlwVar.D.d("onTransitionRequested %s", adlwVar.r());
        this.d.E();
    }
}
