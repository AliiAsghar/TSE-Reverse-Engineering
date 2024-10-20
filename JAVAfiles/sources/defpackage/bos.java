package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bos extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ and a;
    final /* synthetic */ cvn b;
    final /* synthetic */ cvc c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cvc e;
    final /* synthetic */ arqw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bos(and andVar, cvn cvnVar, cvc cvcVar, boolean z, cvc cvcVar2, arqw arqwVar) {
        super(2);
        this.a = andVar;
        this.b = cvnVar;
        this.c = cvcVar;
        this.d = z;
        this.e = cvcVar2;
        this.f = arqwVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float eh;
        float eh2;
        cga c;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            and andVar = this.a;
            cvn cvnVar = this.b;
            alt altVar = new alt(andVar, cvnVar);
            cvc cvcVar = this.c;
            if (cvcVar.a == 0 && cvcVar.b == 0) {
                eh = altVar.d();
            } else {
                eh = cvnVar.eh(cvcVar.b);
            }
            if (this.d) {
                eh2 = altVar.a();
            } else {
                eh2 = this.b.eh(this.e.b);
            }
            amk amkVar = new amk(amh.b(altVar, this.b.q()), eh, amh.a(altVar, this.b.q()), eh2);
            c = dhb.c(cga.e, false, bor.a);
            arqw arqwVar = this.f;
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
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b, cwl.a.c);
            arqwVar.a(amkVar, bwjVar, 0);
            bwjVar.p();
        }
        return arnb.a;
    }
}
