package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelv extends arrp implements arqw {
    final /* synthetic */ cga a;
    final /* synthetic */ long b;
    final /* synthetic */ amj c;
    final /* synthetic */ arqw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelv(cga cgaVar, long j, amj amjVar, arqw arqwVar) {
        super(3);
        this.a = cgaVar;
        this.b = j;
        this.c = amjVar;
        this.d = arqwVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga a;
        cga c;
        int i;
        akn aknVar = (akn) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        aknVar.getClass();
        if ((intValue & 14) == 0) {
            if (true != bwjVar.G(aknVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 91) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cga b = aknVar.b(this.a, 1.0f, false);
            arqw arqwVar = this.d;
            ajw.e eVar = ajw.c;
            int i2 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, bwjVar, 0);
            int a3 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b2 = cfv.b(bwjVar, b);
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
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b2, cwl.a.c);
            arqwVar.a(ako.a, bwjVar, 6);
            bwjVar.p();
            a = adf.a(cga.e, this.b, clw.a);
            c = amv.c(a, 1.0f);
            amx.a(amv.d(c, this.c.a()), bwjVar);
        }
        return arnb.a;
    }
}
