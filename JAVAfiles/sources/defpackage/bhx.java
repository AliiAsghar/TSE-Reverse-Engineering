package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhx extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhx(arqv arqvVar) {
        super(2);
        this.a = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bid.a(bgu.c(bwjVar).a, cdk.e(225114541, new bhw(this.a), bwjVar), bwjVar, 48);
        }
        return arnb.a;
    }
}
