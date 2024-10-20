package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jyr extends arrp implements arqw {
    final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyr(float f) {
        super(3);
        this.a = f;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        ((anq) obj).getClass();
        if ((intValue & 81) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            amx.a(amv.d(cga.e, this.a), bwjVar);
        }
        return arnb.a;
    }
}
