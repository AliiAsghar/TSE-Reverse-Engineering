package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agcs extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ float b;
    final /* synthetic */ agcj c;
    final /* synthetic */ byn d;
    final /* synthetic */ byn e;
    final /* synthetic */ agcw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agcs(long j, float f, agcj agcjVar, byn bynVar, byn bynVar2, agcw agcwVar) {
        super(2);
        this.a = j;
        this.b = f;
        this.c = agcjVar;
        this.d = bynVar;
        this.e = bynVar2;
        this.f = agcwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            long j = this.a;
            float f = this.b;
            afwv.r(this.d);
            bwjVar.y(1252799729);
            byn bynVar = this.e;
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new afyq(bynVar, 9);
                bwjVar.B(h);
            }
            bwjVar.q();
            this.f.d.f(new agcf(j, f, (arqr) h), cga.e, this.c.a, bwjVar, 48);
        }
        return arnb.a;
    }
}
