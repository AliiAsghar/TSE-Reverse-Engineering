package defpackage;

import defpackage.bwj;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adx extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ boolean a;
    final /* synthetic */ arqg b;
    final /* synthetic */ arqg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adx(boolean z, arqg arqgVar, arqg arqgVar2) {
        super(3);
        this.a = z;
        this.b = arqgVar;
        this.c = arqgVar2;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ajr ajrVar;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-1534186401);
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
        cga d = adw.d(cga.e, ajrVar2, aevVar, this.a, null, this.b, null, this.c);
        bwjVar.q();
        return d;
    }
}
