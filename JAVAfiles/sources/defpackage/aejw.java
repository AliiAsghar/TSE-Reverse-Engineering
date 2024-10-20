package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aejw extends arrp implements arqv {
    final /* synthetic */ aeja a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aejw(aeja aejaVar) {
        super(2);
        this.a = aejaVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cga a = cgh.a(cga.e, 1.0f);
            aeja aejaVar = this.a;
            ajw.e eVar = ajw.c;
            int i = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, bwjVar, 0);
            int a3 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, a);
            int i2 = cwl.a;
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
            caw.b(bwjVar, b, cwl.a.c);
            aeiz a4 = aejaVar.a();
            bwjVar.y(-1370641489);
            if (a4 != null) {
                bwjVar.y(-1370639764);
                afbd afbdVar = a4.a;
                cga.a aVar = cga.e;
                afbdVar.b();
                bwjVar.q();
                cue a5 = akc.a(cfq.a.a, false);
                int a6 = bwg.a(bwjVar);
                bwy d2 = bwjVar.d();
                cga b2 = cfv.b(bwjVar, aVar);
                arqg arqgVar2 = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar2);
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
                afbd afbdVar2 = a4.a;
                qdq qdqVar = a4.b;
                bwjVar.y(646348605);
                bwjVar.y(968752636);
                if (adom.cc(bwjVar) && aejaVar.b() != null) {
                    z = true;
                } else {
                    z = false;
                }
                bwjVar.q();
                if (z) {
                    bwjVar.y(968754883);
                    j = bmp.a(bwjVar).v;
                    bwjVar.q();
                } else {
                    bwjVar.y(968755576);
                    if (adom.cc(bwjVar) && aejaVar.d()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bwjVar.q();
                    if (z2) {
                        j = cku.a;
                    } else {
                        bwjVar.y(968757411);
                        if (adom.cc(bwjVar) && aejaVar.f() && aejaVar.e()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bwjVar.q();
                        if (z3) {
                            j = cku.d;
                        } else {
                            bwjVar.y(968759573);
                            if (adom.cc(bwjVar) && aejaVar.e()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            bwjVar.q();
                            if (z4) {
                                j = cku.a;
                            } else {
                                bwjVar.y(968762364);
                                j = bmp.a(bwjVar).q;
                                bwjVar.q();
                            }
                        }
                    }
                }
                bwjVar.q();
                adom.ct(afbdVar2, qdqVar, new cku(j), bwjVar, 64);
                bwjVar.p();
            }
            bwjVar.q();
            if (aejaVar instanceof aeiw) {
                bwjVar.y(-1370618339);
                adom.bq(cdk.e(-1654508758, new zny(aejaVar, 19), bwjVar), bwjVar, 6);
                bwjVar.q();
            } else if (aejaVar instanceof aeit) {
                bwjVar.y(-1370614172);
                aeke.a(bwjVar, 0);
                bwjVar.q();
            } else if (aejaVar instanceof aeix) {
                bwjVar.y(-1370610916);
                adom.bq(cdk.e(-314928222, new zny(aejaVar, 20), bwjVar), bwjVar, 6);
                bwjVar.q();
            } else if (aejaVar instanceof aeiv) {
                bwjVar.y(-1370607725);
                adom.bq(cdk.e(44486115, new aekj(aejaVar, 1), bwjVar), bwjVar, 6);
                bwjVar.q();
            } else {
                bwjVar.y(-1370620607);
                bwjVar.q();
                throw new armm();
            }
            bwjVar.p();
        }
        return arnb.a;
    }
}
