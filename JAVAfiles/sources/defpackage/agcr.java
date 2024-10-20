package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agcr extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ agcj b;
    final /* synthetic */ byn c;
    final /* synthetic */ byn d;
    final /* synthetic */ agcw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agcr(long j, agcj agcjVar, byn bynVar, byn bynVar2, agcw agcwVar) {
        super(2);
        this.a = j;
        this.b = agcjVar;
        this.c = bynVar;
        this.d = bynVar2;
        this.e = agcwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            long j = this.a;
            bwjVar.y(1252822264);
            byn bynVar = this.d;
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new afyq(bynVar, 8);
                bwjVar.B(h);
            }
            bwjVar.q();
            this.e.e.f(new agcg(j, (arqr) h, 1), cga.e, this.b.a, bwjVar, 48);
        }
        return arnb.a;
    }
}
