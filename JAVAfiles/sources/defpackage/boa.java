package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class boa extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ajr c;
    final /* synthetic */ brr d;
    final /* synthetic */ cmb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boa(boolean z, boolean z2, ajr ajrVar, brr brrVar, cmb cmbVar) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = ajrVar;
        this.d = brrVar;
        this.e = cmbVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bnv.a.a(this.a, this.b, this.c, null, this.d, this.e, brg.a, brg.a, bwjVar, 100663296);
        }
        return arnb.a;
    }
}
