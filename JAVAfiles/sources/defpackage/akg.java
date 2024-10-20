package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akg extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqw a;
    final /* synthetic */ akj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akg(arqw arqwVar, akj akjVar) {
        super(2);
        this.a = arqwVar;
        this.b = akjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            this.a.a(this.b, bwjVar, 0);
        }
        return arnb.a;
    }
}
