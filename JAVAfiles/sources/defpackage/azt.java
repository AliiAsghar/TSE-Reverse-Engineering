package defpackage;

import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azt extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ azv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ajr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azt(azv azvVar, boolean z, ajr ajrVar) {
        super(3);
        this.a = azvVar;
        this.b = z;
        this.c = ajrVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(805428266);
        Object g = bwjVar.g(dch.i);
        Object obj4 = drk.b;
        if (this.a.c() != ahp.a && g == obj4) {
            z = false;
        } else {
            z = true;
        }
        boolean G = bwjVar.G(this.a);
        azv azvVar = this.a;
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new azr(azvVar);
            bwjVar.B(h);
        }
        cas a = cap.a((arqr) h, bwjVar);
        Object h2 = bwjVar.h();
        if (h2 == bwj.a.a) {
            Object agvVar = new agv(new aih(a));
            bwjVar.B(agvVar);
            h2 = agvVar;
        }
        aig aigVar = (aig) h2;
        boolean G2 = bwjVar.G(aigVar) | bwjVar.G(this.a);
        azv azvVar2 = this.a;
        Object h3 = bwjVar.h();
        if (G2 || h3 == bwj.a.a) {
            h3 = new azs(aigVar, azvVar2);
            bwjVar.B(h3);
        }
        azv azvVar3 = this.a;
        boolean z3 = this.b;
        azs azsVar = (azs) h3;
        cga.a aVar = cga.e;
        ahp c = azvVar3.c();
        if (z3 && this.a.a() != brg.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        cga a2 = ahy.a(aVar, azsVar, c, null, z2, z, null, this.c, null);
        bwjVar.q();
        return a2;
    }
}
