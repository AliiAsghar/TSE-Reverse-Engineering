package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afau extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ afas b;
    final /* synthetic */ zj c;
    final /* synthetic */ aewe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afau(float f, afas afasVar, zj zjVar, aewe aeweVar) {
        super(2);
        this.a = f;
        this.b = afasVar;
        this.c = zjVar;
        this.d = aeweVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float f;
        long j;
        long f2;
        cga a;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cga a2 = chk.a(amd.c(amv.s(cga.e, brg.a, 48.0f, brg.a, brg.a, 13), this.a, brg.a, 2), awh.a(12.0f));
            afas afasVar = this.b;
            zj zjVar = this.c;
            if (afasVar.d) {
                cga.a aVar = cga.e;
                bwjVar.y(1319568565);
                if (adom.cd(bwjVar)) {
                    bwjVar.y(2123314524);
                    j = adom.bX(bwjVar).d.b;
                    bwjVar.q();
                } else {
                    bwjVar.y(2123383809);
                    j = bmp.a(bwjVar).H;
                    bwjVar.q();
                }
                bwjVar.q();
                f2 = ckw.f(cku.d(j), cku.c(j), cku.b(j), ((Number) zjVar.d()).floatValue(), cku.f(j));
                a = adf.a(aVar, f2, clw.a);
                a2 = a2.a(a);
            }
            arqg arqgVar = this.b.g;
            if (arqgVar != null) {
                a2 = a2.a(adw.c(cga.e, false, null, arqgVar, 7));
            }
            cga i = amh.i(a2, 4.0f, brg.a, 2);
            int i2 = cfq.a;
            cfq.c cVar = cfq.a.k;
            ajw.d dVar = new ajw.d(12.0f, true, ajx.a);
            aewe aeweVar = this.d;
            afas afasVar2 = this.b;
            cue a3 = amq.a(dVar, cVar, bwjVar, 54);
            int a4 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, i);
            int i3 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar2);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a3, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b, cwl.a.c);
            bwjVar.y(-319807955);
            if (aeweVar != null) {
                if (true != afasVar2.f.a) {
                    f = 36.0f;
                } else {
                    f = 40.0f;
                }
                adcx.bo(aeweVar, dea.a(amv.h(cga.e, f), "monogram_test_tag"), bwjVar, 0);
            }
            bwjVar.q();
            cga.a aVar2 = cga.e;
            cue a5 = akk.a(ajw.c, cfq.a.m, bwjVar, 0);
            int a6 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b2 = cfv.b(bwjVar, aVar2);
            arqg arqgVar3 = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar3);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a5, cwl.a.e);
            caw.b(bwjVar, d2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                bwjVar.B(valueOf2);
                bwjVar.j(valueOf2, arqvVar2);
            }
            caw.b(bwjVar, b2, cwl.a.c);
            adom.by(afasVar2.a, bwjVar, 0);
            String str = afasVar2.b;
            bwjVar.y(52078362);
            if (str != null) {
                adom.bC(str, bwjVar, 0);
            }
            bwjVar.q();
            bwjVar.p();
            bwjVar.p();
        }
        return arnb.a;
    }
}
