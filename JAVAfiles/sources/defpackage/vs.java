package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vs extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cvc a;
    final /* synthetic */ wr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(cvc cvcVar, wr wrVar) {
        super(1);
        this.a = cvcVar;
        this.b = wrVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((cvc.a) obj).e(this.a, 0, 0, this.b.c.b());
        return arnb.a;
    }
}
