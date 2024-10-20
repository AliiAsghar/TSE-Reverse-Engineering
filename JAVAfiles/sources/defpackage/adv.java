package defpackage;

import defpackage.bwj;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adv extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ arqg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adv(boolean z, String str, arqg arqgVar) {
        super(3);
        this.a = z;
        this.b = str;
        this.c = arqgVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ajr ajrVar;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-756081143);
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
        cga a = adw.a(cga.e, ajrVar2, aevVar, this.a, this.b, null, this.c);
        bwjVar.q();
        return a;
    }
}
