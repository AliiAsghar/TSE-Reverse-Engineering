package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class boq extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cvc a;
    final /* synthetic */ cvc b;
    final /* synthetic */ cvc c;
    final /* synthetic */ int d;
    final /* synthetic */ and e;
    final /* synthetic */ cvn f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ cvc i;
    final /* synthetic */ blw j;
    final /* synthetic */ cvc k;
    final /* synthetic */ Integer l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boq(cvc cvcVar, cvc cvcVar2, cvc cvcVar3, int i, and andVar, cvn cvnVar, int i2, int i3, cvc cvcVar4, blw blwVar, cvc cvcVar5, Integer num) {
        super(1);
        this.a = cvcVar;
        this.b = cvcVar2;
        this.c = cvcVar3;
        this.d = i;
        this.e = andVar;
        this.f = cvnVar;
        this.g = i2;
        this.h = i3;
        this.i = cvcVar4;
        this.j = blwVar;
        this.k = cvcVar5;
        this.l = num;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cvc.a aVar = (cvc.a) obj;
        aVar.e(this.a, 0, 0, brg.a);
        aVar.e(this.b, 0, 0, brg.a);
        int i = this.d;
        cvc cvcVar = this.c;
        int i2 = i - cvcVar.a;
        and andVar = this.e;
        cvn cvnVar = this.f;
        aVar.e(cvcVar, (i2 / 2) + andVar.b(cvnVar, cvnVar.q()), this.g - this.h, brg.a);
        int i3 = this.g;
        cvc cvcVar2 = this.i;
        aVar.e(cvcVar2, 0, i3 - cvcVar2.b, brg.a);
        blw blwVar = this.j;
        if (blwVar != null) {
            cvc cvcVar3 = this.k;
            int i4 = this.g;
            Integer num = this.l;
            num.getClass();
            aVar.e(cvcVar3, blwVar.a, i4 - num.intValue(), brg.a);
        }
        return arnb.a;
    }
}
