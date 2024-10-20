package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bua extends arrp implements arqr<chj, chp> {
    final /* synthetic */ cmb a;
    final /* synthetic */ ckx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bua(cmb cmbVar, ckx ckxVar) {
        super(1);
        this.a = cmbVar;
        this.b = ckxVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        chj chjVar = (chj) obj;
        return chjVar.o(new chi(new btz(this.a.a(chjVar.a(), chjVar.p(), chjVar), this.b)));
    }
}
