package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avs extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ boolean a;
    final /* synthetic */ arqg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avs(boolean z, arqg arqgVar) {
        super(3);
        this.a = z;
        this.b = arqgVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ajr ajrVar;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-2124609672);
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
        cga a = avt.a(cga.e, this.a, ajrVar2, aevVar, true, null, this.b);
        bwjVar.q();
        return a;
    }
}
