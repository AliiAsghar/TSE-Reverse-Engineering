package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alg extends arrp implements arqr<cvc, arnb> {
    final /* synthetic */ ali a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alg(ali aliVar) {
        super(1);
        this.a = aliVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i;
        int i2;
        cvc cvcVar = (cvc) obj;
        if (cvcVar != null) {
            i = cvcVar.u();
            i2 = cvcVar.t();
        } else {
            i = 0;
            i2 = 0;
        }
        ali aliVar = this.a;
        aliVar.f = new tu(tu.c(i, i2));
        aliVar.c = cvcVar;
        return arnb.a;
    }
}
