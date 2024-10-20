package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alk extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ int[] a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ cvc[] e;
    final /* synthetic */ all f;
    final /* synthetic */ int g;
    final /* synthetic */ drk h;
    final /* synthetic */ int[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alk(int[] iArr, int i, int i2, int i3, cvc[] cvcVarArr, all allVar, int i4, drk drkVar, int[] iArr2) {
        super(1);
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = cvcVarArr;
        this.f = allVar;
        this.g = i4;
        this.h = drkVar;
        this.i = iArr2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i;
        akr akrVar;
        int[] iArr = this.a;
        cvc.a aVar = (cvc.a) obj;
        if (iArr != null) {
            i = iArr[this.b];
        } else {
            i = 0;
        }
        for (int i2 = this.c; i2 < this.d; i2++) {
            cvc cvcVar = this.e[i2];
            cvcVar.getClass();
            all allVar = this.f;
            int i3 = this.g;
            drk drkVar = this.h;
            amp c = amm.c(cvcVar);
            if (c == null || (akrVar = c.c) == null) {
                akrVar = ((alm) allVar).b;
            }
            aVar.e(cvcVar, this.i[i2 - this.c], akrVar.a(i3 - cvcVar.t(), drkVar) + i, brg.a);
        }
        return arnb.a;
    }
}
