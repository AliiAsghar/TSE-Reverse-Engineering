package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avv extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ boolean a;
    final /* synthetic */ arqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avv(boolean z, arqr arqrVar) {
        super(3);
        this.a = z;
        this.b = arqrVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ajr ajrVar;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(290332169);
        aev aevVar = (aev) bwjVar.g(aex.a);
        if (aevVar instanceof afa) {
            ajrVar = null;
        } else {
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new ajs();
                bwjVar.B(h);
            }
            ajrVar = (ajr) h;
        }
        ajr ajrVar2 = ajrVar;
        cga a = avw.a(cga.e, this.a, ajrVar2, aevVar, null, this.b);
        bwjVar.q();
        return a;
    }
}
