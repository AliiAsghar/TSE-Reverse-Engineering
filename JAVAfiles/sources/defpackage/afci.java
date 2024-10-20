package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afci extends arrp implements arqw {
    final /* synthetic */ boolean a;
    final /* synthetic */ arqr b;
    final /* synthetic */ arqr c;
    final /* synthetic */ afca d;
    final /* synthetic */ afce e;
    final /* synthetic */ byn f;
    final /* synthetic */ adtl g;
    final /* synthetic */ adec h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afci(boolean z, adec adecVar, adtl adtlVar, arqr arqrVar, arqr arqrVar2, afca afcaVar, afce afceVar, byn bynVar) {
        super(3);
        this.a = z;
        this.h = adecVar;
        this.g = adtlVar;
        this.b = arqrVar;
        this.c = arqrVar2;
        this.d = afcaVar;
        this.e = afceVar;
        this.f = bynVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i;
        aki akiVar = (aki) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        akiVar.getClass();
        if ((intValue & 14) == 0) {
            if (true != bwjVar.G(akiVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 91) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            aepl aeplVar = new aepl(this.b, this.c, akiVar, this.d, this.e, this.f, 2);
            bwjVar.y(-966153429);
            boolean H = bwjVar.H(this.a) | bwjVar.G(this.h) | bwjVar.G(this.g);
            boolean z = this.a;
            adec adecVar = this.h;
            adtl adtlVar = this.g;
            Object h = bwjVar.h();
            if (H || h == bwj.a.a) {
                h = new xks(z, adecVar, adtlVar, 3);
                bwjVar.B(h);
            }
            bwjVar.q();
            dsa.b(aeplVar, null, (arqr) h, bwjVar, 0, 2);
        }
        return arnb.a;
    }
}
