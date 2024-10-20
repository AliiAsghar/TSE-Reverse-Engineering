package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkt extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ amj a;
    final /* synthetic */ arqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkt(amj amjVar, arqw arqwVar) {
        super(2);
        this.a = amjVar;
        this.b = arqwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cga.a aVar = cga.e;
            amj amjVar = bko.a;
            cga c = amh.c(amv.a(aVar, bko.c, bko.d), this.a);
            ajw.c cVar = ajw.e;
            int i = cfq.a;
            arqw arqwVar = this.b;
            cue a = amq.a(cVar, cfq.a.k, bwjVar, 54);
            int a2 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, c);
            int i2 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b, cwl.a.c);
            arqwVar.a(amu.a, bwjVar, 6);
            bwjVar.p();
        }
        return arnb.a;
    }
}
