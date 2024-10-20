package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzl extends arrp implements arqw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzl(Object obj, int i) {
        super(3);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v96, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [aeja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v59, types: [cmb, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga b;
        bwj bwjVar;
        arnb arnbVar;
        bwj bwjVar2;
        boolean z;
        long j;
        cga b2;
        long f;
        cga a;
        int i = 4;
        boolean z2 = true;
        arnb arnbVar2 = null;
        switch (this.b) {
            case 0:
                bwj bwjVar3 = (bwj) obj2;
                int intValue = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue & 81) == 16 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    aeke.bj((aeqm) this.a, null, bwjVar3, 0);
                }
                return arnb.a;
            case 1:
                bwj bwjVar4 = (bwj) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue2 & 81) == 16 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    aabr.aV(((zaj) this.a).b, bwjVar4, 0);
                }
                return arnb.a;
            case 2:
                bwj bwjVar5 = (bwj) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((anq) obj).getClass();
                if ((intValue3 & 81) == 16 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    aabr.aW((zae) this.a, bwjVar5, 0);
                }
                return arnb.a;
            case 3:
                afae afaeVar = (afae) obj;
                bwj bwjVar6 = (bwj) obj2;
                ((Number) obj3).intValue();
                afaeVar.getClass();
                bwjVar6.y(1384987716);
                ?? r3 = this.a;
                if (r3 != 0) {
                    cas a2 = cak.a(r3, bwjVar6);
                    dje djeVar = afaeVar.b;
                    dje djeVar2 = afaeVar.c;
                    dje djeVar3 = afaeVar.d;
                    dje djeVar4 = afaeVar.e;
                    dje djeVar5 = afaeVar.f;
                    dje djeVar6 = afaeVar.g;
                    bse bseVar = afaeVar.h;
                    a2.getClass();
                    afaeVar = new afae(a2, djeVar, djeVar2, djeVar3, djeVar4, djeVar5, djeVar6, bseVar);
                }
                bwjVar6.q();
                return afaeVar;
            case 4:
                bwj bwjVar7 = (bwj) obj2;
                int intValue4 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue4 & 81) == 16 && bwjVar7.L()) {
                    bwjVar7.v();
                } else {
                    Object obj4 = this.a;
                    cga.a aVar = cga.e;
                    ajw.e eVar = ajw.c;
                    int i2 = cfq.a;
                    cue a3 = akk.a(eVar, cfq.a.m, bwjVar7, 0);
                    int a4 = bwg.a(bwjVar7);
                    bwy d = bwjVar7.d();
                    cga b3 = cfv.b(bwjVar7, aVar);
                    int i3 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar7.N();
                    bwjVar7.A();
                    if (bwjVar7.K()) {
                        bwjVar7.l(arqgVar);
                    } else {
                        bwjVar7.C();
                    }
                    caw.b(bwjVar7, a3, cwl.a.e);
                    caw.b(bwjVar7, d, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar7.K() || !d.F(bwjVar7.h(), Integer.valueOf(a4))) {
                        Integer valueOf = Integer.valueOf(a4);
                        bwjVar7.B(valueOf);
                        bwjVar7.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar7, b3, cwl.a.c);
                    bwjVar7.y(1452388603);
                    alur it = ((zyc) obj4).a.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        zyj zyjVar = (zyj) it.next();
                        if (zyjVar.a instanceof aeth) {
                            bwjVar7.y(2074488776);
                            aeth aethVar = (aeth) zyjVar.a;
                            long av = aabr.av(zyjVar.b, bwjVar7);
                            aetn.k(aethVar, dea.a(cga.e, ((aeth) zyjVar.a).a), null, new cku(aabr.av(zyjVar.b, bwjVar7)), new cku(av), null, bwjVar7, 0, 0, 1948);
                            bwjVar7.q();
                        } else {
                            bwjVar7.y(1452401415);
                            aetn.ae(zyjVar.a, null, bwjVar7, 0, 2);
                            bwjVar7.q();
                        }
                    }
                    bwjVar7.q();
                    bwjVar7.p();
                }
                return arnb.a;
            case 5:
                bwj bwjVar8 = (bwj) obj2;
                int intValue5 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue5 & 81) == 16 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    Object obj5 = this.a;
                    cga.a aVar2 = cga.e;
                    ajw.e eVar2 = ajw.c;
                    int i4 = cfq.a;
                    cue a5 = akk.a(eVar2, cfq.a.m, bwjVar8, 0);
                    int a6 = bwg.a(bwjVar8);
                    bwy d2 = bwjVar8.d();
                    cga b4 = cfv.b(bwjVar8, aVar2);
                    int i5 = cwl.a;
                    arqg arqgVar2 = cwl.a.a;
                    bwjVar8.N();
                    bwjVar8.A();
                    if (bwjVar8.K()) {
                        bwjVar8.l(arqgVar2);
                    } else {
                        bwjVar8.C();
                    }
                    caw.b(bwjVar8, a5, cwl.a.e);
                    caw.b(bwjVar8, d2, cwl.a.d);
                    arqv arqvVar2 = cwl.a.f;
                    if (bwjVar8.K() || !d.F(bwjVar8.h(), Integer.valueOf(a6))) {
                        Integer valueOf2 = Integer.valueOf(a6);
                        bwjVar8.B(valueOf2);
                        bwjVar8.j(valueOf2, arqvVar2);
                    }
                    caw.b(bwjVar8, b4, cwl.a.c);
                    ahji.L(zyg.a, null, zyg.b, null, null, bwjVar8, 24582, 494);
                    aetn.ae(((zyf) obj5).a, null, bwjVar8, 0, 2);
                    bwjVar8.p();
                }
                return arnb.a;
            case 6:
                bwj bwjVar9 = (bwj) obj2;
                int intValue6 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue6 & 81) == 16 && bwjVar9.L()) {
                    bwjVar9.v();
                } else {
                    Object obj6 = this.a;
                    cga.a aVar3 = cga.e;
                    ajw.e eVar3 = ajw.c;
                    int i6 = cfq.a;
                    cue a7 = akk.a(eVar3, cfq.a.m, bwjVar9, 0);
                    int a8 = bwg.a(bwjVar9);
                    bwy d3 = bwjVar9.d();
                    cga b5 = cfv.b(bwjVar9, aVar3);
                    int i7 = cwl.a;
                    arqg arqgVar3 = cwl.a.a;
                    bwjVar9.N();
                    bwjVar9.A();
                    if (bwjVar9.K()) {
                        bwjVar9.l(arqgVar3);
                    } else {
                        bwjVar9.C();
                    }
                    caw.b(bwjVar9, a7, cwl.a.e);
                    caw.b(bwjVar9, d3, cwl.a.d);
                    arqv arqvVar3 = cwl.a.f;
                    if (bwjVar9.K() || !d.F(bwjVar9.h(), Integer.valueOf(a8))) {
                        Integer valueOf3 = Integer.valueOf(a8);
                        bwjVar9.B(valueOf3);
                        bwjVar9.j(valueOf3, arqvVar3);
                    }
                    caw.b(bwjVar9, b5, cwl.a.c);
                    bwjVar9.y(1090877176);
                    alur it2 = ((zym) obj6).a.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        aesg aesgVar = (aesg) it2.next();
                        aesgVar.getClass();
                        aetn.ae(aesgVar, null, bwjVar9, 0, 2);
                    }
                    bwjVar9.q();
                    bwjVar9.p();
                }
                return arnb.a;
            case 7:
                bwj bwjVar10 = (bwj) obj2;
                int intValue7 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue7 & 81) == 16 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    Object obj7 = this.a;
                    cga.a aVar4 = cga.e;
                    ajw.e eVar4 = ajw.c;
                    int i8 = cfq.a;
                    cue a9 = akk.a(eVar4, cfq.a.m, bwjVar10, 0);
                    int a10 = bwg.a(bwjVar10);
                    bwy d4 = bwjVar10.d();
                    cga b6 = cfv.b(bwjVar10, aVar4);
                    int i9 = cwl.a;
                    arqg arqgVar4 = cwl.a.a;
                    bwjVar10.N();
                    bwjVar10.A();
                    if (bwjVar10.K()) {
                        bwjVar10.l(arqgVar4);
                    } else {
                        bwjVar10.C();
                    }
                    caw.b(bwjVar10, a9, cwl.a.e);
                    caw.b(bwjVar10, d4, cwl.a.d);
                    arqv arqvVar4 = cwl.a.f;
                    if (bwjVar10.K() || !d.F(bwjVar10.h(), Integer.valueOf(a10))) {
                        Integer valueOf4 = Integer.valueOf(a10);
                        bwjVar10.B(valueOf4);
                        bwjVar10.j(valueOf4, arqvVar4);
                    }
                    caw.b(bwjVar10, b6, cwl.a.c);
                    zyx zyxVar = (zyx) obj7;
                    aabr.at(zyxVar, bwjVar10, 0);
                    aabr.as(zyxVar.b, bwjVar10, 0);
                    bwjVar10.p();
                }
                return arnb.a;
            case 8:
                bwj bwjVar11 = (bwj) obj2;
                int intValue8 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue8 & 81) == 16 && bwjVar11.L()) {
                    bwjVar11.v();
                } else {
                    aabr.aw((zyi) this.a, bwjVar11, 0);
                }
                return arnb.a;
            case 9:
                bwj bwjVar12 = (bwj) obj2;
                int intValue9 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue9 & 81) == 16 && bwjVar12.L()) {
                    bwjVar12.v();
                } else {
                    ahji.e(((zzl) this.a).a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar12, 0, 0, 131070);
                }
                return arnb.a;
            case 10:
                bwj bwjVar13 = (bwj) obj2;
                int intValue10 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue10 & 81) == 16 && bwjVar13.L()) {
                    bwjVar13.v();
                } else {
                    ahji.e(((zzl) this.a).a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar13, 0, 0, 131070);
                }
                return arnb.a;
            case 11:
                bwj bwjVar14 = (bwj) obj2;
                int intValue11 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue11 & 81) == 16 && bwjVar14.L()) {
                    bwjVar14.v();
                } else {
                    ahji.e((String) this.a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar14, 0, 0, 131070);
                }
                return arnb.a;
            case 12:
                amt amtVar = (amt) obj;
                bwj bwjVar15 = (bwj) obj2;
                int intValue12 = ((Number) obj3).intValue();
                amtVar.getClass();
                if ((intValue12 & 14) == 0) {
                    if (true != bwjVar15.G(amtVar)) {
                        i = 2;
                    }
                    intValue12 |= i;
                }
                if ((intValue12 & 91) == 18 && bwjVar15.L()) {
                    bwjVar15.v();
                } else {
                    ?? r4 = this.a;
                    long A = aeke.A(r4, bwjVar15);
                    aeiv aeivVar = (aeiv) r4;
                    aeke.g(aeivVar.a, aeivVar.c, A, bwjVar15, 0);
                    Object obj8 = this.a;
                    bwjVar15.y(-833695536);
                    aekt aektVar = ((aeiv) obj8).g;
                    if (aektVar == null) {
                        arnbVar = null;
                        bwjVar = bwjVar15;
                    } else {
                        ?? r42 = this.a;
                        b = amtVar.b(cga.e, 1.0f, true);
                        bwjVar = bwjVar15;
                        aetn.au(aektVar, amv.d(b, 56.0f), aeke.A(r42, bwjVar15), aeke.B(r42, bwjVar15), brg.a, brg.a, bwjVar, 0, 48);
                        arnbVar = arnb.a;
                    }
                    bwjVar.q();
                    bwjVar.y(-833695980);
                    if (arnbVar == null) {
                        ?? r2 = this.a;
                        bwjVar2 = bwjVar;
                        aeke.i(amtVar, ((aeiv) r2).d, aeke.A(r2, bwjVar), aeke.B(r2, bwjVar), bwjVar, 0);
                    } else {
                        bwjVar2 = bwjVar;
                    }
                    bwjVar2.q();
                    ?? r22 = this.a;
                    aeke.j(((aeiv) r22).b, aeke.C(r22, bwjVar2), bwjVar2, 0);
                }
                return arnb.a;
            case 13:
                amt amtVar2 = (amt) obj;
                bwj bwjVar16 = (bwj) obj2;
                int intValue13 = ((Number) obj3).intValue();
                amtVar2.getClass();
                if ((intValue13 & 14) == 0) {
                    if (true != bwjVar16.G(amtVar2)) {
                        i = 2;
                    }
                    intValue13 |= i;
                }
                if ((intValue13 & 91) == 18 && bwjVar16.L()) {
                    bwjVar16.v();
                } else {
                    long A2 = aeke.A(this.a, bwjVar16);
                    Object obj9 = this.a;
                    bwjVar16.y(-1027064125);
                    aeix aeixVar = (aeix) obj9;
                    if (aeixVar.a != null) {
                        j = cku.d;
                    } else {
                        bwjVar16.y(-2125960654);
                        if (adom.cc(bwjVar16) && aeixVar.d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bwjVar16.q();
                        if (z) {
                            j = cku.d;
                        } else if (aeixVar.d) {
                            j = cku.a;
                        } else if (aeixVar.c && aeixVar.b) {
                            j = cku.a;
                        } else {
                            bwjVar16.y(-2125956369);
                            if (!adom.cc(bwjVar16) || !aeixVar.b) {
                                z2 = false;
                            }
                            bwjVar16.q();
                            if (z2) {
                                j = cku.d;
                            } else {
                                bwjVar16.y(-2125953576);
                                j = bmp.a(bwjVar16).g;
                                bwjVar16.q();
                            }
                        }
                    }
                    long j2 = j;
                    bwjVar16.q();
                    aeke.d(A2, j2, bwjVar16, 0);
                    Object obj10 = this.a;
                    bwjVar16.y(-537121072);
                    aekt aektVar2 = ((aeix) obj10).g;
                    if (aektVar2 != null) {
                        ?? r43 = this.a;
                        b2 = amtVar2.b(cga.e, 1.0f, true);
                        aetn.au(aektVar2, amv.d(b2, 56.0f), aeke.A(r43, bwjVar16), aeke.B(r43, bwjVar16), brg.a, brg.a, bwjVar16, 0, 48);
                        arnbVar2 = arnb.a;
                    }
                    bwjVar16.q();
                    bwjVar16.y(-537121641);
                    if (arnbVar2 == null) {
                        aeke.f(amtVar2, aeke.B(this.a, bwjVar16), bwjVar16, 0);
                    }
                    bwjVar16.q();
                    ?? r1 = this.a;
                    aeke.j(((aeix) r1).f, aeke.C(r1, bwjVar16), bwjVar16, 0);
                }
                return arnb.a;
            case 14:
                bwj bwjVar17 = (bwj) obj2;
                int intValue14 = ((Number) obj3).intValue();
                ((ake) obj).getClass();
                if ((intValue14 & 81) == 16 && bwjVar17.L()) {
                    bwjVar17.v();
                } else {
                    aetn.an(((aekw) this.a).a, bwjVar17, 0);
                }
                return arnb.a;
            case 15:
                bwj bwjVar18 = (bwj) obj2;
                int intValue15 = ((Number) obj3).intValue();
                ((ake) obj).getClass();
                if ((intValue15 & 81) == 16 && bwjVar18.L()) {
                    bwjVar18.v();
                } else {
                    aetn.am(((aekx) this.a).a, bwjVar18, 0);
                }
                return arnb.a;
            case 16:
                bwj bwjVar19 = (bwj) obj2;
                int intValue16 = ((Number) obj3).intValue();
                ((ake) obj).getClass();
                if ((intValue16 & 81) == 16 && bwjVar19.L()) {
                    bwjVar19.v();
                } else {
                    aetn.an(((aela) this.a).a, bwjVar19, 0);
                }
                return arnb.a;
            case 17:
                cga cgaVar = (cga) obj;
                bwj bwjVar20 = (bwj) obj2;
                ((Number) obj3).intValue();
                cgaVar.getClass();
                bwjVar20.y(-2044692850);
                boolean a11 = aef.a(bwjVar20);
                ?? r44 = this.a;
                if (!a11) {
                    f = ckw.f(cku.d(r5), cku.c(r5), cku.b(r5), 0.4f, cku.f(bmp.a(bwjVar20).a));
                    a = chw.a(cgaVar, 7.0f, r44, 0L, f, 12);
                } else {
                    long j3 = cku.a;
                    a = chw.a(cgaVar, 2.5f, r44, j3, j3, 4);
                }
                bwjVar20.q();
                return a;
            case 18:
                bwj bwjVar21 = (bwj) obj2;
                int intValue17 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue17 & 81) == 16 && bwjVar21.L()) {
                    bwjVar21.v();
                } else {
                    ahji.e(((aelj) this.a).a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar21, 0, 0, 131070);
                }
                return arnb.a;
            case 19:
                bwj bwjVar22 = (bwj) obj2;
                int intValue18 = ((Number) obj3).intValue();
                ((amt) obj).getClass();
                if ((intValue18 & 81) == 16 && bwjVar22.L()) {
                    bwjVar22.v();
                } else {
                    ahji.e(((aelj) this.a).a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, bwjVar22, 0, 0, 131070);
                }
                return arnb.a;
            default:
                bwj bwjVar23 = (bwj) obj2;
                int intValue19 = ((Number) obj3).intValue();
                ((akn) obj).getClass();
                if ((intValue19 & 81) == 16 && bwjVar23.L()) {
                    bwjVar23.v();
                } else {
                    aeke.az(((aelk) this.a).a, bwjVar23, 0);
                    aelk aelkVar = (aelk) this.a;
                    if (aelkVar.a == null) {
                        z2 = false;
                    }
                    aeke.al(aelkVar.e, z2, bwjVar23, 0);
                }
                return arnb.a;
        }
    }
}
