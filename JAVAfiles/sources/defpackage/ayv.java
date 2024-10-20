package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayv extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ cko a;
    final /* synthetic */ ayd b;
    final /* synthetic */ doj c;
    final /* synthetic */ dob d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayv(cko ckoVar, ayd aydVar, doj dojVar, dob dobVar) {
        super(3);
        this.a = ckoVar;
        this.b = aydVar;
        this.c = dojVar;
        this.d = dobVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        cga cgaVar = (cga) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-84507373);
        boolean booleanValue = ((Boolean) bwjVar.g(dch.q)).booleanValue();
        boolean H = bwjVar.H(booleanValue);
        Object h = bwjVar.h();
        if (H || h == bwj.a.a) {
            h = new baw(booleanValue);
            bwjVar.B(h);
        }
        cko ckoVar = this.a;
        baw bawVar = (baw) h;
        boolean z = true;
        if ((ckoVar instanceof cmd) && ((cmd) ckoVar).a == 16) {
            z = false;
        }
        if (((des) bwjVar.g(dch.n)).a() && this.b.n() && djc.h(this.c.b) && z) {
            doj dojVar = this.c;
            djc djcVar = new djc(dojVar.b);
            boolean I = bwjVar.I(bawVar);
            Object h2 = bwjVar.h();
            if (I || h2 == bwj.a.a) {
                h2 = new ayt(bawVar, null);
                bwjVar.B(h2);
            }
            bxl.f(dojVar.a, djcVar, (arqv) h2, bwjVar);
            boolean I2 = bwjVar.I(bawVar) | bwjVar.I(this.d) | bwjVar.G(this.c) | bwjVar.I(this.b) | bwjVar.G(this.a);
            dob dobVar = this.d;
            doj dojVar2 = this.c;
            ayd aydVar = this.b;
            cko ckoVar2 = this.a;
            Object h3 = bwjVar.h();
            if (I2 || h3 == bwj.a.a) {
                h3 = new ayu(bawVar, dobVar, dojVar2, aydVar, ckoVar2);
                bwjVar.B(h3);
            }
            obj4 = cho.c(cgaVar, (arqr) h3);
        } else {
            obj4 = cga.e;
        }
        bwjVar.q();
        return obj4;
    }
}
