package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhw extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhw(arqv arqvVar) {
        super(2);
        this.a = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bwjVar.y(1850968129);
            bhy.a(this.a, bwjVar, 0);
            bwjVar.q();
        }
        return arnb.a;
    }
}
