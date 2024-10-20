package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsg extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cvc a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsg(cvc cvcVar, int i) {
        super(1);
        this.a = cvcVar;
        this.b = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((cvc.a) obj).e(this.a, -this.b, 0, brg.a);
        return arnb.a;
    }
}
