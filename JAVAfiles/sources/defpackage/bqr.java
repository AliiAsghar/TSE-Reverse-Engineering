package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqr extends arrp implements arqw<amt, bwj, Integer, arnb> {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqr(String str) {
        super(3);
        this.a = str;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            brx.b(this.a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar, 0, 0, 131070);
        }
        return arnb.a;
    }
}
