package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaad extends arrp implements arqw {
    final /* synthetic */ zzw a;
    final /* synthetic */ aaaa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaad(zzw zzwVar, aaaa aaaaVar) {
        super(3);
        this.a = zzwVar;
        this.b = aaaaVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga a;
        cga b;
        int i;
        amj amjVar = (amj) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        amjVar.getClass();
        if ((intValue & 14) == 0) {
            if (true != bwjVar.G(amjVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 91) != 18 || !bwjVar.L()) {
            a = adf.a(cga.e, bmp.a(bwjVar).F, clw.a);
            b = amv.b(a, 1.0f);
            cga c = amh.c(b, amjVar);
            aaaa aaaaVar = this.b;
            int i2 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b2 = cfv.b(bwjVar, c);
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
            ajw.d dVar = new ajw.d(8.0f, true, ajx.a);
            cga j = amh.j(afs.c(cga.e, afs.b(bwjVar, 0), false, 14), 16.0f, brg.a, 16.0f, brg.a, 10);
            cue a4 = akk.a(dVar, cfq.a.m, bwjVar, 0);
            int a5 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b3 = cfv.b(bwjVar, j);
            arqg arqgVar2 = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar2);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a4, cwl.a.e);
            caw.b(bwjVar, d2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwjVar.B(valueOf2);
                bwjVar.j(valueOf2, arqvVar2);
            }
            caw.b(bwjVar, b3, cwl.a.c);
            aabr.ap(aaaaVar.b, bwjVar, 0);
            aaae.e(aaaaVar, bwjVar, 0);
            bwjVar.p();
            bwjVar.p();
            aewt aewtVar = (aewt) cak.a(this.a.b, bwjVar).a();
            bwjVar.y(1001156022);
            if (aewtVar != null) {
                if (aewtVar instanceof aeqg) {
                    bwjVar.y(1169507240);
                    agkx.I((aeqg) aewtVar, null, bwjVar, 0);
                    bwjVar.q();
                } else if (aewtVar instanceof aemc) {
                    bwjVar.y(1169509041);
                    lga.bj((aemc) aewtVar, null, bwjVar, 0);
                    bwjVar.q();
                } else if (!(aewtVar instanceof kiq)) {
                    if (aewtVar instanceof afgk) {
                        bwjVar.y(1169514242);
                        ((lga) bwjVar.g(aaae.a)).aP((afgk) aewtVar, bwjVar);
                        bwjVar.q();
                    } else {
                        bwjVar.y(1895227471);
                        bwjVar.q();
                    }
                } else {
                    bwjVar.y(1169511836);
                    throw null;
                }
            }
            bwjVar.q();
        } else {
            bwjVar.v();
        }
        return arnb.a;
    }
}
