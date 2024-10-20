package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhf extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ bgp a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhf(bgp bgpVar, arqv arqvVar) {
        super(2);
        this.a = bgpVar;
        this.b = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bwx.a(bgz.a.c(this.a), this.b, bwjVar, 8);
        }
        return arnb.a;
    }
}
