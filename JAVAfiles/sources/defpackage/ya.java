package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ya extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ xy a;
    final /* synthetic */ cvc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(xy xyVar, cvc cvcVar) {
        super(1);
        this.a = xyVar;
        this.b = cvcVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cjn cjnVar;
        long c;
        cti b;
        cvc.a aVar = (cvc.a) obj;
        if (this.a.l().b() != null) {
            xy xyVar = this.a;
            wk k = xyVar.k();
            cjp a = xyVar.l().a();
            a.getClass();
            cjp b2 = this.a.l().b();
            b2.getClass();
            k.d(a, b2);
        }
        cjp c2 = this.a.k().c();
        cti b3 = aVar.b();
        long j = 0;
        if (b3 != null) {
            cjnVar = new cjn(this.a.m().h(b3, 0L));
        } else {
            cjnVar = null;
        }
        if (c2 != null) {
            if (this.a.k().f()) {
                this.a.l().d(c2);
            }
            c = c2.c();
        } else {
            if (this.a.k().f() && (b = aVar.b()) != null) {
                this.a.v(b);
            }
            cjp a2 = this.a.l().a();
            a2.getClass();
            c = a2.c();
        }
        if (cjnVar != null) {
            j = a.Q(c, cjnVar.a);
        }
        aVar.e(this.b, Math.round(Float.intBitsToFloat((int) (j >> 32))), Math.round(Float.intBitsToFloat((int) (4294967295L & j))), brg.a);
        return arnb.a;
    }
}
