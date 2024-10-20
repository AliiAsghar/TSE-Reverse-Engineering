package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmu extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ amt a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmu(amt amtVar, arqv arqvVar) {
        super(2);
        this.a = amtVar;
        this.b = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cga b;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !bwjVar.L()) {
            b = this.a.b(cga.e, 1.0f, true);
            cga j = amh.j(b, brg.a, brg.a, brg.a, brg.a, 10);
            arqv arqvVar = this.b;
            int i = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b2 = cfv.b(bwjVar, j);
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
            caw.b(bwjVar, b2, cwl.a.c);
            arqvVar.a(bwjVar, 0);
            bwjVar.p();
        } else {
            bwjVar.v();
        }
        return arnb.a;
    }
}
