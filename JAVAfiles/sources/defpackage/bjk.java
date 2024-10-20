package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjk extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjk(arqv arqvVar, arqv arqvVar2) {
        super(2);
        this.a = arqvVar;
        this.b = arqvVar2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            amj amjVar = bji.a;
            bji.d(cdk.e(1887135077, new bjj(this.a, this.b), bwjVar), bwjVar, 438);
        }
        return arnb.a;
    }
}
