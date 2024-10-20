package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yq extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ cuh a;
    final /* synthetic */ yi b;
    final /* synthetic */ cvc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(cuh cuhVar, yi yiVar, cvc cvcVar) {
        super(1);
        this.a = cuhVar;
        this.b = yiVar;
        this.c = cvcVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cvc.a aVar = (cvc.a) obj;
        cti b = aVar.b();
        if (b != null) {
            if (!this.a.ev()) {
                this.b.f = b;
            } else {
                this.b.g = b;
            }
        }
        aVar.e(this.c, 0, 0, brg.a);
        return arnb.a;
    }
}
