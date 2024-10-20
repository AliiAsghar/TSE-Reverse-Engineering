package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agl extends arrp implements arqw<akn, bwj, Integer, arnb> {
    final /* synthetic */ arqr a;
    final /* synthetic */ afy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agl(arqr arqrVar, afy afyVar) {
        super(3);
        this.a = arqrVar;
        this.b = afyVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new agf();
                bwjVar.B(h);
            }
            arqr arqrVar = this.a;
            afy afyVar = this.b;
            agf agfVar = (agf) h;
            agfVar.a.clear();
            arqrVar.a(agfVar);
            agfVar.a(afyVar, bwjVar, 0);
        }
        return arnb.a;
    }
}
