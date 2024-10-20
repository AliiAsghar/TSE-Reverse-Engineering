package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsy extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cvc a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsy(cvc cvcVar, float f, float f2) {
        super(1);
        this.a = cvcVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float f = this.c;
        ((cvc.a) obj).e(this.a, arsk.g(this.b), arsk.g(f), brg.a);
        return arnb.a;
    }
}
