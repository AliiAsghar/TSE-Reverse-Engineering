package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjg extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ akn a;
    final /* synthetic */ arqv b;
    final /* synthetic */ arqv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjg(akn aknVar, arqv arqvVar, arqv arqvVar2) {
        super(2);
        this.a = aknVar;
        this.b = arqvVar;
        this.c = arqvVar2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cfq.b bVar;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            akn aknVar = this.a;
            cga c = amh.c(cga.e, bji.c);
            if (this.b == null) {
                int i = cfq.a;
                bVar = cfq.a.m;
            } else {
                int i2 = cfq.a;
                bVar = cfq.a.n;
            }
            cga a = aknVar.a(c, bVar);
            arqv arqvVar = this.c;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, a);
            int i3 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a2, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar2);
            }
            caw.b(bwjVar, b, cwl.a.c);
            arqvVar.a(bwjVar, 0);
            bwjVar.p();
        }
        return arnb.a;
    }
}
