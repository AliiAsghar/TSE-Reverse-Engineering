package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agct extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ agcj b;
    final /* synthetic */ byn c;
    final /* synthetic */ agcw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agct(long j, agcj agcjVar, byn bynVar, agcw agcwVar) {
        super(2);
        this.a = j;
        this.b = agcjVar;
        this.c = bynVar;
        this.d = agcwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            long j = this.a;
            bwjVar.y(1252768695);
            byn bynVar = this.c;
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new afyq(bynVar, 10);
                bwjVar.B(h);
            }
            bwjVar.q();
            this.d.f.f(new agcg(j, (arqr) h, 2, null), cga.e, this.b.a, bwjVar, 48);
        }
        return arnb.a;
    }
}
