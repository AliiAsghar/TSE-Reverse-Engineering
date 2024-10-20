package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ber extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ bdy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(bdy bdyVar) {
        super(3);
        this.a = bdyVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga cgaVar = (cga) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-1914520728);
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            byu byuVar = new byu(new dri(0L), cav.a);
            bwjVar.B(byuVar);
            h = byuVar;
        }
        byn bynVar = (byn) h;
        boolean I = bwjVar.I(this.a);
        bdy bdyVar = this.a;
        Object h2 = bwjVar.h();
        if (I || h2 == bwj.a.a) {
            h2 = new ben(bdyVar, bynVar);
            bwjVar.B(h2);
        }
        arqg arqgVar = (arqg) h2;
        boolean G = bwjVar.G(dqvVar);
        Object h3 = bwjVar.h();
        if (G || h3 == bwj.a.a) {
            h3 = new beq(dqvVar, bynVar);
            bwjVar.B(h3);
        }
        cga b = bdu.b(cgaVar, arqgVar, (arqr) h3);
        bwjVar.q();
        return b;
    }
}
