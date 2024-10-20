package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqh implements afej, afeg {
    private final /* synthetic */ int a;

    public afqh(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ afcp a(apbt apbtVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                afxt afxtVar = (afxt) apbtVar;
                                afxtVar.getClass();
                                if (afxtVar.c == 200) {
                                    return afxq.a;
                                }
                                afqu afquVar = afxtVar.e;
                                if (afquVar == null) {
                                    afquVar = afqu.a;
                                }
                                afquVar.getClass();
                                return afwv.O(afquVar);
                            }
                            afui afuiVar = (afui) apbtVar;
                            afuiVar.getClass();
                            afuh afuhVar = afuiVar.d;
                            if (afuhVar == null) {
                                afuhVar = afuh.a;
                            }
                            afuhVar.getClass();
                            return afwv.h(afuhVar);
                        }
                        aftv aftvVar = (aftv) apbtVar;
                        aftvVar.getClass();
                        afuh afuhVar2 = aftvVar.c;
                        if (afuhVar2 == null) {
                            afuhVar2 = afuh.a;
                        }
                        afuhVar2.getClass();
                        return afwv.h(afuhVar2);
                    }
                    aftu aftuVar = (aftu) apbtVar;
                    aftuVar.getClass();
                    if (aftuVar.c == 200) {
                        return aggr.a;
                    }
                    afuh afuhVar3 = aftuVar.g;
                    if (afuhVar3 == null) {
                        afuhVar3 = afuh.a;
                    }
                    afuhVar3.getClass();
                    return afwv.h(afuhVar3);
                }
                afqm afqmVar = (afqm) apbtVar;
                afqmVar.getClass();
                afqu afquVar2 = afqmVar.c;
                if (afquVar2 == null) {
                    afquVar2 = afqu.a;
                }
                afquVar2.getClass();
                return afwv.O(afquVar2);
            }
            afcz afczVar = (afcz) apbtVar;
            afczVar.getClass();
            afcy afcyVar = afczVar.c;
            if (afcyVar == null) {
                afcyVar = afcy.a;
            }
            afcyVar.getClass();
            return aeke.cc(afcyVar);
        }
        afqf afqfVar = (afqf) apbtVar;
        afqfVar.getClass();
        if ((afqfVar.b & 2) != 0) {
            aozy createBuilder = afty.a.createBuilder();
            createBuilder.getClass();
            aozy createBuilder2 = aftw.a.createBuilder();
            createBuilder2.getClass();
            afwv.o(afwv.E(createBuilder2), createBuilder);
            return new afqe(afwv.n(createBuilder));
        }
        afuh afuhVar4 = afqfVar.g;
        if (afuhVar4 == null) {
            afuhVar4 = afuh.a;
        }
        afuhVar4.getClass();
        return afwv.h(afuhVar4);
    }

    @Override // defpackage.afeg
    public final /* synthetic */ afee b() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new afxu();
                            }
                            return new afuo();
                        }
                        return new afun();
                    }
                    return new afum();
                }
                return new afqn();
            }
            return new afda();
        }
        return new afqg();
    }

    @Override // defpackage.afeg
    public final /* synthetic */ apbt c(aozb aozbVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                afxt afxtVar = (afxt) apag.parseFrom(afxt.a, aozbVar);
                                afxtVar.getClass();
                                return afxtVar;
                            }
                            afui afuiVar = (afui) apag.parseFrom(afui.a, aozbVar);
                            afuiVar.getClass();
                            return afuiVar;
                        }
                        aftv aftvVar = (aftv) apag.parseFrom(aftv.a, aozbVar);
                        aftvVar.getClass();
                        return aftvVar;
                    }
                    aftu aftuVar = (aftu) apag.parseFrom(aftu.a, aozbVar);
                    aftuVar.getClass();
                    return aftuVar;
                }
                afqm afqmVar = (afqm) apag.parseFrom(afqm.a, aozbVar);
                afqmVar.getClass();
                return afqmVar;
            }
            afcz afczVar = (afcz) apag.parseFrom(afcz.a, aozbVar);
            afczVar.getClass();
            return afczVar;
        }
        afqf afqfVar = (afqf) apag.parseFrom(afqf.a, aozbVar);
        afqfVar.getClass();
        return afqfVar;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object d(aozb aozbVar, arpe arpeVar) {
        Object e;
        Object e2;
        Object e3;
        Object e4;
        Object e5;
        Object e6;
        Object e7;
        int i = this.a;
        if (i == 0) {
            e = e(c(aozbVar), arpeVar);
            return e;
        }
        if (i == 1) {
            e2 = e(c(aozbVar), arpeVar);
            return e2;
        }
        if (i == 2) {
            e3 = e(c(aozbVar), arpeVar);
            return e3;
        }
        if (i == 3) {
            e4 = e(c(aozbVar), arpeVar);
            return e4;
        }
        if (i == 4) {
            e5 = e(c(aozbVar), arpeVar);
            return e5;
        }
        if (i != 5) {
            e7 = e(c(aozbVar), arpeVar);
            return e7;
        }
        e6 = e(c(aozbVar), arpeVar);
        return e6;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object e(apbt apbtVar, arpe arpeVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return aeke.bY(this, apbtVar, arpeVar);
                            }
                            return aeke.bY(this, apbtVar, arpeVar);
                        }
                        return aeke.bY(this, apbtVar, arpeVar);
                    }
                    return aeke.bY(this, apbtVar, arpeVar);
                }
                return aeke.bY(this, apbtVar, arpeVar);
            }
            return aeke.bY(this, apbtVar, arpeVar);
        }
        return aeke.bY(this, apbtVar, arpeVar);
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object f(afee afeeVar, apbt apbtVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                afxu afxuVar = (afxu) afeeVar;
                                afqu afquVar = ((afxt) apbtVar).e;
                                if (afquVar == null) {
                                    afquVar = afqu.a;
                                }
                                afquVar.getClass();
                                afwv.Q(afxuVar, afquVar);
                                return arnb.a;
                            }
                            afuo afuoVar = (afuo) afeeVar;
                            afui afuiVar = (afui) apbtVar;
                            aozn aoznVar = afuiVar.c;
                            if (aoznVar == null) {
                                aoznVar = aozn.a;
                            }
                            aoznVar.getClass();
                            afuoVar.l(aoue.l(aoznVar));
                            afuh afuhVar = afuiVar.d;
                            if (afuhVar == null) {
                                afuhVar = afuh.a;
                            }
                            afvg afvgVar = afuhVar.g;
                            if (afvgVar == null) {
                                afvgVar = afvg.a;
                            }
                            afvgVar.getClass();
                            afwv.e(afuoVar, afvgVar, afup.d);
                            afuh afuhVar2 = afuiVar.d;
                            if (afuhVar2 == null) {
                                afuhVar2 = afuh.a;
                            }
                            afcy afcyVar = afuhVar2.f;
                            if (afcyVar == null) {
                                afcyVar = afcy.a;
                            }
                            afcyVar.getClass();
                            aeke.cf(afuoVar, afcyVar);
                            return arnb.a;
                        }
                        afun afunVar = (afun) afeeVar;
                        aftv aftvVar = (aftv) apbtVar;
                        afuh afuhVar3 = aftvVar.c;
                        if (afuhVar3 == null) {
                            afuhVar3 = afuh.a;
                        }
                        afvg afvgVar2 = afuhVar3.g;
                        if (afvgVar2 == null) {
                            afvgVar2 = afvg.a;
                        }
                        afvgVar2.getClass();
                        afwv.e(afunVar, afvgVar2, afup.c);
                        afuh afuhVar4 = aftvVar.c;
                        if (afuhVar4 == null) {
                            afuhVar4 = afuh.a;
                        }
                        afcy afcyVar2 = afuhVar4.f;
                        if (afcyVar2 == null) {
                            afcyVar2 = afcy.a;
                        }
                        afcyVar2.getClass();
                        aeke.cf(afunVar, afcyVar2);
                        return arnb.a;
                    }
                    afum afumVar = (afum) afeeVar;
                    aftu aftuVar = (aftu) apbtVar;
                    aozn aoznVar2 = aftuVar.e;
                    if (aoznVar2 == null) {
                        aoznVar2 = aozn.a;
                    }
                    aoznVar2.getClass();
                    afumVar.k(aoue.l(aoznVar2));
                    aggp aggpVar = aftuVar.f;
                    if (aggpVar == null) {
                        aggpVar = aggp.a;
                    }
                    aggpVar.getClass();
                    afumVar.o(aggpVar);
                    afuh afuhVar5 = aftuVar.g;
                    if (afuhVar5 == null) {
                        afuhVar5 = afuh.a;
                    }
                    afvg afvgVar3 = afuhVar5.g;
                    if (afvgVar3 == null) {
                        afvgVar3 = afvg.a;
                    }
                    afvgVar3.getClass();
                    afwv.e(afumVar, afvgVar3, afup.a);
                    afuh afuhVar6 = aftuVar.g;
                    if (afuhVar6 == null) {
                        afuhVar6 = afuh.a;
                    }
                    afcy afcyVar3 = afuhVar6.f;
                    if (afcyVar3 == null) {
                        afcyVar3 = afcy.a;
                    }
                    afcyVar3.getClass();
                    aeke.cf(afumVar, afcyVar3);
                    return arnb.a;
                }
                afqn afqnVar = (afqn) afeeVar;
                afqu afquVar2 = ((afqm) apbtVar).c;
                if (afquVar2 == null) {
                    afquVar2 = afqu.a;
                }
                afquVar2.getClass();
                afwv.Q(afqnVar, afquVar2);
                return arnb.a;
            }
            afda afdaVar = (afda) afeeVar;
            afcy afcyVar4 = ((afcz) apbtVar).c;
            if (afcyVar4 == null) {
                afcyVar4 = afcy.a;
            }
            afcyVar4.getClass();
            aeke.cf(afdaVar, afcyVar4);
            return arnb.a;
        }
        afqg afqgVar = (afqg) afeeVar;
        afqf afqfVar = (afqf) apbtVar;
        if ((afqfVar.b & 2) != 0) {
            String str = afqfVar.c;
            str.getClass();
            afqgVar.l(str);
            if ((afqfVar.b & 4) != 0) {
                String str2 = afqfVar.e;
                str2.getClass();
                afqgVar.m(str2);
            }
            String str3 = afqfVar.d;
            str3.getClass();
            afqgVar.s(str3);
        } else {
            String str4 = afqfVar.c;
            str4.getClass();
            afqgVar.l(str4);
            if ((afqfVar.b & 4) != 0) {
                String str5 = afqfVar.e;
                str5.getClass();
                afqgVar.m(str5);
            }
            afuh afuhVar7 = afqfVar.g;
            if (afuhVar7 == null) {
                afuhVar7 = afuh.a;
            }
            afvg afvgVar4 = afuhVar7.g;
            if (afvgVar4 == null) {
                afvgVar4 = afvg.a;
            }
            afvgVar4.getClass();
            afwv.e(afqgVar, afvgVar4, afup.b);
            afuh afuhVar8 = afqfVar.g;
            if (afuhVar8 == null) {
                afuhVar8 = afuh.a;
            }
            afcy afcyVar5 = afuhVar8.f;
            if (afcyVar5 == null) {
                afcyVar5 = afcy.a;
            }
            afcyVar5.getClass();
            aeke.cf(afqgVar, afcyVar5);
            afqgVar.o(afqfVar.f);
        }
        return arnb.a;
    }

    @Override // defpackage.afej
    public final /* synthetic */ apbt g(afcq afcqVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                afxr afxrVar = (afxr) afcqVar;
                                aozy createBuilder = afxt.a.createBuilder();
                                createBuilder.getClass();
                                afqu P = afwv.P(afxrVar);
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                afxt afxtVar = (afxt) createBuilder.b;
                                afxtVar.e = P;
                                afxtVar.b |= 1;
                                if (afxrVar.b instanceof afxq) {
                                    aozy createBuilder2 = afxs.a.createBuilder();
                                    createBuilder2.getClass();
                                    apag s = createBuilder2.s();
                                    s.getClass();
                                    afxs afxsVar = (afxs) s;
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    afxt afxtVar2 = (afxt) createBuilder.b;
                                    afxtVar2.d = afxsVar;
                                    afxtVar2.c = BasePaymentResult.ERROR_REQUEST_FAILED;
                                }
                                apag s2 = createBuilder.s();
                                s2.getClass();
                                return (afxt) s2;
                            }
                            aftq aftqVar = (aftq) afcqVar;
                            aozy createBuilder3 = afui.a.createBuilder();
                            createBuilder3.getClass();
                            aozn j = aoue.j(aftqVar.g);
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            afui afuiVar = (afui) createBuilder3.b;
                            afuiVar.c = j;
                            afuiVar.b |= 1;
                            afuh i2 = afwv.i(aftqVar);
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            afui afuiVar2 = (afui) createBuilder3.b;
                            afuiVar2.d = i2;
                            afuiVar2.b |= 2;
                            apag s3 = createBuilder3.s();
                            s3.getClass();
                            return (afui) s3;
                        }
                        aozy createBuilder4 = aftv.a.createBuilder();
                        createBuilder4.getClass();
                        afuh i3 = afwv.i((afto) afcqVar);
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        aftv aftvVar = (aftv) createBuilder4.b;
                        aftvVar.c = i3;
                        aftvVar.b |= 1;
                        apag s4 = createBuilder4.s();
                        s4.getClass();
                        return (aftv) s4;
                    }
                    aftn aftnVar = (aftn) afcqVar;
                    aozy createBuilder5 = aftu.a.createBuilder();
                    createBuilder5.getClass();
                    aozn j2 = aoue.j(aftnVar.e);
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    apag apagVar = createBuilder5.b;
                    aftu aftuVar = (aftu) apagVar;
                    aftuVar.e = j2;
                    aftuVar.b = 1 | aftuVar.b;
                    aggp aggpVar = aftnVar.f;
                    if (!apagVar.isMutable()) {
                        createBuilder5.u();
                    }
                    aftu aftuVar2 = (aftu) createBuilder5.b;
                    aftuVar2.f = aggpVar;
                    aftuVar2.b |= 2;
                    afuh i4 = afwv.i(aftnVar);
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    aftu aftuVar3 = (aftu) createBuilder5.b;
                    aftuVar3.g = i4;
                    aftuVar3.b = 4 | aftuVar3.b;
                    if (aftnVar.d instanceof aggr) {
                        aozy createBuilder6 = aftt.a.createBuilder();
                        createBuilder6.getClass();
                        apag s5 = createBuilder6.s();
                        s5.getClass();
                        aftt afttVar = (aftt) s5;
                        if (!createBuilder5.b.isMutable()) {
                            createBuilder5.u();
                        }
                        aftu aftuVar4 = (aftu) createBuilder5.b;
                        aftuVar4.d = afttVar;
                        aftuVar4.c = BasePaymentResult.ERROR_REQUEST_FAILED;
                    }
                    apag s6 = createBuilder5.s();
                    s6.getClass();
                    return (aftu) s6;
                }
                aozy createBuilder7 = afqm.a.createBuilder();
                createBuilder7.getClass();
                afqu P2 = afwv.P((afql) afcqVar);
                if (!createBuilder7.b.isMutable()) {
                    createBuilder7.u();
                }
                afqm afqmVar = (afqm) createBuilder7.b;
                afqmVar.c = P2;
                afqmVar.b |= 1;
                apag s7 = createBuilder7.s();
                s7.getClass();
                return (afqm) s7;
            }
            aozy createBuilder8 = afcz.a.createBuilder();
            createBuilder8.getClass();
            afcy cd = aeke.cd((afcw) afcqVar);
            if (!createBuilder8.b.isMutable()) {
                createBuilder8.u();
            }
            afcz afczVar = (afcz) createBuilder8.b;
            afczVar.c = cd;
            afczVar.b |= 1;
            apag s8 = createBuilder8.s();
            s8.getClass();
            return (afcz) s8;
        }
        afqc afqcVar = (afqc) afcqVar;
        aozy createBuilder9 = afqf.a.createBuilder();
        createBuilder9.getClass();
        String str = afqcVar.a;
        if (!createBuilder9.b.isMutable()) {
            createBuilder9.u();
        }
        apag apagVar2 = createBuilder9.b;
        afqf afqfVar = (afqf) apagVar2;
        afqfVar.b = 1 | afqfVar.b;
        afqfVar.c = str;
        String str2 = afqcVar.c;
        if (str2 != null) {
            if (!apagVar2.isMutable()) {
                createBuilder9.u();
            }
            afqf afqfVar2 = (afqf) createBuilder9.b;
            afqfVar2.b = 4 | afqfVar2.b;
            afqfVar2.e = str2;
        }
        afuh i5 = afwv.i(afqcVar);
        if (!createBuilder9.b.isMutable()) {
            createBuilder9.u();
        }
        apag apagVar3 = createBuilder9.b;
        afqf afqfVar3 = (afqf) apagVar3;
        afqfVar3.g = i5;
        afqfVar3.b |= 16;
        boolean z = afqcVar.d;
        if (!apagVar3.isMutable()) {
            createBuilder9.u();
        }
        afqf afqfVar4 = (afqf) createBuilder9.b;
        afqfVar4.b |= 8;
        afqfVar4.f = z;
        apag s9 = createBuilder9.s();
        s9.getClass();
        return (afqf) s9;
    }
}
