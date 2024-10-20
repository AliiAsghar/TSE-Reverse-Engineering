package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bou extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bou(arqv arqvVar) {
        super(2);
        this.a = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cga c;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !bwjVar.L()) {
            c = dhb.c(cga.e, false, bot.a);
            arqv arqvVar = this.a;
            int i = cfq.a;
            cue a = akc.a(cfq.a.a, false);
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
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar2);
            }
            caw.b(bwjVar, b, cwl.a.c);
            arqvVar.a(bwjVar, 0);
            bwjVar.p();
        } else {
            bwjVar.v();
        }
        return arnb.a;
    }
}
