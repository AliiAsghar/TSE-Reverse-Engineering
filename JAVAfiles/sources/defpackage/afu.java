package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afu extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cvc a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afu(cvc cvcVar, int i, int i2) {
        super(1);
        this.a = cvcVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cvc.a.o((cvc.a) obj, this.a, this.b, this.c);
        return arnb.a;
    }
}
