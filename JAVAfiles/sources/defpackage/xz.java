package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xz extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ xy a;
    final /* synthetic */ cvc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(xy xyVar, cvc cvcVar) {
        super(1);
        this.a = xyVar;
        this.b = cvcVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cvc.a aVar = (cvc.a) obj;
        cti b = aVar.b();
        if (b != null) {
            this.a.v(b);
        }
        aVar.e(this.b, 0, 0, brg.a);
        return arnb.a;
    }
}
