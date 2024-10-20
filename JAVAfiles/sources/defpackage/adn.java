package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adn extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ cjp a;
    final /* synthetic */ arsb b;
    final /* synthetic */ long c;
    final /* synthetic */ ckv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adn(cjp cjpVar, arsb arsbVar, long j, ckv ckvVar) {
        super(1);
        this.a = cjpVar;
        this.b = arsbVar;
        this.c = j;
        this.d = ckvVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        coa coaVar = ((cnr.AnonymousClass1) cntVar.q()).a;
        cjp cjpVar = this.a;
        float f = cjpVar.b;
        float f2 = cjpVar.c;
        coaVar.e(f, f2);
        ckv ckvVar = this.d;
        float f3 = -f2;
        float f4 = -f;
        try {
            cnw.h(cntVar, (clg) this.b.a, this.c, 0L, brg.a, ckvVar, 0, 890);
            ((cnr.AnonymousClass1) cntVar.q()).a.e(f4, f3);
            return arnb.a;
        } catch (Throwable th) {
            ((cnr.AnonymousClass1) cntVar.q()).a.e(f4, f3);
            throw th;
        }
    }
}
