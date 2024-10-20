package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhk extends arrp implements arqv {
    final /* synthetic */ bkm a;
    final /* synthetic */ byj b;
    final /* synthetic */ afhe c;
    final /* synthetic */ byn d;
    final /* synthetic */ float e;
    final /* synthetic */ aki f;
    final /* synthetic */ afhp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhk(afhp afhpVar, bkm bkmVar, byj byjVar, afhe afheVar, byn bynVar, float f, aki akiVar) {
        super(2);
        this.g = afhpVar;
        this.a = bkmVar;
        this.b = byjVar;
        this.c = afheVar;
        this.d = bynVar;
        this.e = f;
        this.f = akiVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        cdi e;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = bxl.a(arpj.a, bwjVar);
                bwjVar.B(h);
            }
            aenj aenjVar = new aenj((arwe) h, this.a, 11);
            afhp afhpVar = this.g;
            float bA = aeke.bA(qjl.c(this.b));
            bwjVar.y(46289779);
            if (bA == brg.a) {
                e = null;
            } else {
                e = cdk.e(-32386096, new afhg(this.c, bA, aenjVar, this.d, 0), bwjVar);
            }
            float f = afhpVar.a;
            bwjVar.q();
            long j = cku.g;
            long j2 = bmp.a(bwjVar).J;
            long j3 = bmp.a(bwjVar).G;
            ahji.ap(cdk.e(-1193199859, new afhi(this.e, this.g, this.f, this.b, this.c, aenjVar, 0), bwjVar), null, this.a, f, null, j3, j2, brg.a, brg.a, cdk.e(-418343738, new aeyl(this.b, 6), bwjVar), false, e, null, j, 0L, cdk.e(2117481654, new afao(aenjVar, this.b, 4), bwjVar), bwjVar, 805306374, 199680);
        }
        return arnb.a;
    }
}
