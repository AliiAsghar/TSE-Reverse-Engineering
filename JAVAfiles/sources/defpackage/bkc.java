package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkc extends arrp implements arqg<arnb> {
    final /* synthetic */ bpq a;
    final /* synthetic */ arwe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(bpq bpqVar, arwe arweVar) {
        super(0);
        this.a = bpqVar;
        this.b = arweVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        bps c = this.a.c();
        bps bpsVar = bps.a;
        int ordinal = c.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                arrn.J(this.b, null, null, new bkb(this.a, null), 3);
            } else {
                arrn.J(this.b, null, null, new bka(this.a, null), 3);
            }
        } else {
            arrn.J(this.b, null, null, new bjz(this.a, null), 3);
        }
        return arnb.a;
    }
}
