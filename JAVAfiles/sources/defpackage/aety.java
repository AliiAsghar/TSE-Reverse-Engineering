package defpackage;

import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aety extends arrp implements arqv {
    final /* synthetic */ aeul a;
    final /* synthetic */ arqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aety(aeul aeulVar, arqw arqwVar) {
        super(2);
        this.a = aeulVar;
        this.b = arqwVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        apeb apebVar;
        apeb apebVar2;
        awa cd;
        akf akfVar;
        awa awaVar;
        int i;
        float floatValue;
        float floatValue2;
        apdx h;
        apdu g;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            apdv apdvVar = this.a.w;
            arqg arqgVar = null;
            if (apdvVar != null && (g = aotl.g(apdvVar)) != null && (g.b & 1) != 0) {
                apebVar = g.c;
                if (apebVar == null) {
                    apebVar = apeb.a;
                }
            } else {
                apebVar = null;
            }
            apdv apdvVar2 = this.a.w;
            if (apdvVar2 != null && (h = aotl.h(apdvVar2)) != null && (h.b & 1) != 0) {
                apeb apebVar3 = h.c;
                if (apebVar3 == null) {
                    apebVar3 = apeb.a;
                }
                apebVar2 = apebVar3;
            } else {
                apebVar2 = null;
            }
            aeul aeulVar = this.a;
            arqw arqwVar = this.b;
            cga.a aVar = cga.e;
            int i2 = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, aVar);
            int i3 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar2);
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
            akf akfVar2 = akf.a;
            if (apebVar2 == null) {
                arqgVar = aeulVar.x;
            }
            adcx.ck(akfVar2, apebVar, arqgVar, bwjVar, 6);
            bwjVar.y(-1909814532);
            if (aeulVar.y.c) {
                if (aeulVar.m != null) {
                    awaVar = adcx.bW(adcx.cd(aeulVar));
                } else {
                    awaVar = adcx.cd(aeulVar);
                }
                bwjVar.q();
                i = 0;
                akfVar = akfVar2;
            } else {
                if (aeulVar.m != null) {
                    cd = adcx.bW(adcx.cd(aeulVar));
                } else {
                    aeva aevaVar = aeulVar.i;
                    if (aevaVar != null) {
                        List list = ((aeun) aevaVar).a;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((aeur) it.next()) instanceof aeuw) {
                                    cd = awa.c(adcx.cd(aeulVar), new awd(4.0f), null, null, null, 14);
                                    break;
                                }
                            }
                        }
                    }
                    cd = adcx.cd(aeulVar);
                }
                awa awaVar2 = cd;
                if (aeulVar.f) {
                    akfVar = akfVar2;
                    cas c = zl.c(awaVar2.d.a(9205357640488583168L, (dqv) bwjVar.g(dch.d)), null, null, bwjVar, 3072, 22);
                    cas c2 = zl.c(awaVar2.c.a(9205357640488583168L, (dqv) bwjVar.g(dch.d)), null, null, bwjVar, 3072, 22);
                    floatValue = ((Number) c.a()).floatValue();
                    awf awfVar = new awf(floatValue);
                    floatValue2 = ((Number) c2.a()).floatValue();
                    awaVar = awa.c(awaVar2, null, null, new awf(floatValue2), awfVar, 3);
                    bwjVar.q();
                } else {
                    akfVar = akfVar2;
                    bwjVar.q();
                    awaVar = awaVar2;
                }
                i = 0;
            }
            arqwVar.a(awaVar, bwjVar, Integer.valueOf(i));
            bwjVar.y(-771156759);
            bwjVar.q();
            adcx.ck(akfVar, apebVar2, aeulVar.x, bwjVar, 6);
            bwjVar.p();
        }
        return arnb.a;
    }
}
