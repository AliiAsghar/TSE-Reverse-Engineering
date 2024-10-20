package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnw extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ ajr b;
    final /* synthetic */ brr c;
    final /* synthetic */ cmb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnw(boolean z, ajr ajrVar, brr brrVar, cmb cmbVar) {
        super(2);
        this.a = z;
        this.b = ajrVar;
        this.c = brrVar;
        this.d = cmbVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bnv.a.a(this.a, false, this.b, null, this.c, this.d, brg.a, brg.a, bwjVar, 100663296);
        }
        return arnb.a;
    }
}
