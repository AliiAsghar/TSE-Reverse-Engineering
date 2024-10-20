package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazv extends rg {
    final /* synthetic */ aazt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazv(aazt aaztVar) {
        super(true);
        this.a = aaztVar;
    }

    @Override // defpackage.rg
    public final void b() {
        aazt aaztVar = this.a;
        aaztVar.k(amlw.RCS_PROVISIONING_BACK_BUTTON_CLICKED);
        aaztVar.s(5);
        aaztVar.d.F().setResult(7337);
        aaztVar.d.F().finish();
    }
}
