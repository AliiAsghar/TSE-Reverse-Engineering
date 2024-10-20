package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhb extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqw a;
    final /* synthetic */ bhj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhb(arqw arqwVar, bhj bhjVar) {
        super(2);
        this.a = arqwVar;
        this.b = bhjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            this.a.a(this.b.a, bwjVar, 0);
        }
        return arnb.a;
    }
}
