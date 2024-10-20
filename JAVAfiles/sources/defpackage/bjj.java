package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjj extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjj(arqv arqvVar, arqv arqvVar2) {
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
            arqv arqvVar = this.a;
            bwjVar.y(1497073574);
            if (arqvVar != null) {
                arqvVar.a(bwjVar, 0);
            }
            bwjVar.q();
            this.b.a(bwjVar, 0);
        }
        return arnb.a;
    }
}
