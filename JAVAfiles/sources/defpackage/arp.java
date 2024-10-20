package defpackage;

import defpackage.arq;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arp extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arq a;
    final /* synthetic */ arq.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arp(arq arqVar, arq.a aVar) {
        super(2);
        this.a = arqVar;
        this.b = aVar;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [ars, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            arq arqVar = this.a;
            arq.a aVar = this.b;
            ?? a = arqVar.b.a();
            int i = aVar.c;
            if ((i >= a.e() || !d.F(a.g(i), this.b.a)) && (i = a.d(this.b.a)) != -1) {
                this.b.c = i;
            }
            int i2 = i;
            bwjVar.y(-714040554);
            if (i2 != -1) {
                arr.a(a, this.a.a, i2, this.b.a, bwjVar, 0);
            }
            bwjVar.q();
            arq.a aVar2 = this.b;
            boolean I = bwjVar.I(aVar2);
            arq.a aVar3 = this.b;
            Object h = bwjVar.h();
            if (I || h == bwj.a.a) {
                h = new aro(aVar3);
                bwjVar.B(h);
            }
            bxl.c(aVar2.a, (arqr) h, bwjVar);
        }
        return arnb.a;
    }
}
