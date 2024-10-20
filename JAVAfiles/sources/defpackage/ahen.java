package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahen implements ahch {
    public final ahdy a;
    public final ahck b;
    private final ahow c;

    public ahen(ahdy ahdyVar, ahck ahckVar, ahow ahowVar) {
        this.a = ahdyVar;
        this.b = ahckVar;
        this.c = ahowVar;
    }

    @Override // defpackage.ahch
    public final Set a() {
        return new altx(ahdx.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ahch
    public final ListenableFuture b(agrk agrkVar) {
        apae checkIsLite;
        String g;
        ahcw aF;
        apae checkIsLite2;
        algw algwVar;
        apae checkIsLite3;
        Object c;
        apae checkIsLite4;
        Object c2;
        final ahdx ahdxVar = (ahdx) agrkVar.a;
        ahcw aF2 = ahji.aF(ahdxVar);
        checkIsLite = apag.checkIsLite(ahep.a);
        aF2.b(checkIsLite);
        if (aF2.l.o(checkIsLite.d)) {
            ahcw aF3 = ahji.aF(ahdxVar);
            checkIsLite4 = apag.checkIsLite(ahep.a);
            aF3.b(checkIsLite4);
            Object l = aF3.l.l(checkIsLite4.d);
            if (l == null) {
                c2 = checkIsLite4.b;
            } else {
                c2 = checkIsLite4.c(l);
            }
            g = ((aheo) c2).b;
        } else {
            g = this.a.g(ahdxVar);
        }
        if (g.isEmpty()) {
            return albo.bI(null);
        }
        this.a.c(ahdxVar);
        ListenableFuture d = this.a.d(ahdxVar, agrkVar.b);
        ahdy ahdyVar = this.a;
        Object obj = agrkVar.b;
        ListenableFuture h = ahdyVar.h();
        ListenableFuture e = ahdyVar.e(ahdxVar, agrkVar.b);
        ahow ahowVar = this.c;
        List list = ahdxVar.b;
        final ListenableFuture bI = albo.bI(null);
        final ahcu ahcuVar = ahdxVar.c.a;
        final ArrayList arrayList = new ArrayList();
        ((ahow) ahowVar.b).c(ahcuVar, ahcuVar.d, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        ((ahow) ahowVar.a).c(ahcuVar, ahcuVar.d, null, arrayList2);
        ListenableFuture a = albo.bX(almw.a(arrayList, arrayList2)).a(new Callable() { // from class: aheu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                apae checkIsLite5;
                apae checkIsLite6;
                Object c3;
                apae checkIsLite7;
                Object c4;
                apae checkIsLite8;
                Object c5;
                boolean z;
                aozy createBuilder = amnr.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ahdx ahdxVar2 = ahdx.this;
                anat anatVar = ahdxVar2.a;
                amnr amnrVar = (amnr) createBuilder.b;
                anatVar.getClass();
                amnrVar.c = anatVar;
                amnrVar.b |= 1;
                if (!ahdxVar2.e) {
                    anat aA = ahji.aA(ahdxVar2, true);
                    if (aA != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    albo.U(z, "No Parent Event");
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amnr amnrVar2 = (amnr) createBuilder.b;
                    aA.getClass();
                    amnrVar2.e = aA;
                    amnrVar2.b |= 2;
                }
                ahcw aF4 = ahji.aF(ahdxVar2);
                checkIsLite5 = apag.checkIsLite(ahey.a);
                aF4.b(checkIsLite5);
                if (aF4.l.o(checkIsLite5.d)) {
                    aozy createBuilder2 = amns.a.createBuilder();
                    anas anasVar = aF4.d;
                    if (anasVar == null) {
                        anasVar = anas.a;
                    }
                    anat anatVar2 = anasVar.e;
                    if (anatVar2 == null) {
                        anatVar2 = anat.a;
                    }
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amns amnsVar = (amns) createBuilder2.b;
                    anatVar2.getClass();
                    amnsVar.c = anatVar2;
                    amnsVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amnr amnrVar3 = (amnr) createBuilder.b;
                    amns amnsVar2 = (amns) createBuilder2.s();
                    amnsVar2.getClass();
                    amnrVar3.h = amnsVar2;
                    amnrVar3.b |= 128;
                }
                anas anasVar2 = ahji.aG(ahdxVar2).d;
                if (anasVar2 == null) {
                    anasVar2 = anas.a;
                }
                apaa apaaVar = (apaa) amod.a.createBuilder();
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                ahcu ahcuVar2 = ahcuVar;
                amod amodVar = (amod) apaaVar.b;
                anasVar2.getClass();
                amodVar.c = anasVar2;
                amodVar.b |= 1;
                int at = aktp.at(ahcuVar2.c);
                if (at == 0) {
                    at = 1;
                }
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                amod amodVar2 = (amod) apaaVar.b;
                amodVar2.b |= 16;
                amodVar2.e = at - 1;
                int at2 = aktp.at(ahcuVar2.c);
                if (at2 == 0) {
                    at2 = 1;
                }
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                amod amodVar3 = (amod) apaaVar.b;
                amodVar3.b |= 16;
                amodVar3.e = at2 - 1;
                Iterator<E> it = ahcuVar2.d.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 100000001:
                            checkIsLite6 = apag.checkIsLite(ahdr.a);
                            ahcuVar2.b(checkIsLite6);
                            Object l2 = ahcuVar2.l.l(checkIsLite6.d);
                            if (l2 == null) {
                                c3 = checkIsLite6.b;
                            } else {
                                c3 = checkIsLite6.c(l2);
                            }
                            int U = a.U(((ahds) c3).b);
                            if (U == 0) {
                                U = 1;
                            }
                            if (!apaaVar.b.isMutable()) {
                                apaaVar.u();
                            }
                            amod amodVar4 = (amod) apaaVar.b;
                            amodVar4.b |= 32;
                            amodVar4.f = U - 1;
                            break;
                        case 100000002:
                            checkIsLite7 = apag.checkIsLite(ahdr.b);
                            ahcuVar2.b(checkIsLite7);
                            Object l3 = ahcuVar2.l.l(checkIsLite7.d);
                            if (l3 == null) {
                                c4 = checkIsLite7.b;
                            } else {
                                c4 = checkIsLite7.c(l3);
                            }
                            int R = a.R(((anbc) c4).b);
                            if (R == 0) {
                                R = 1;
                            }
                            if (!apaaVar.b.isMutable()) {
                                apaaVar.u();
                            }
                            amod amodVar5 = (amod) apaaVar.b;
                            amodVar5.b |= 64;
                            amodVar5.g = R - 1;
                            break;
                        case 100000003:
                            checkIsLite8 = apag.checkIsLite(ahev.b);
                            ahcuVar2.b(checkIsLite8);
                            Object l4 = ahcuVar2.l.l(checkIsLite8.d);
                            if (l4 == null) {
                                c5 = checkIsLite8.b;
                            } else {
                                c5 = checkIsLite8.c(l4);
                            }
                            int i = ((ahel) c5).b;
                            if (!apaaVar.b.isMutable()) {
                                apaaVar.u();
                            }
                            amod amodVar6 = (amod) apaaVar.b;
                            amodVar6.b |= 128;
                            amodVar6.h = i;
                            break;
                    }
                }
                apaa apaaVar2 = (apaa) amnq.a.createBuilder();
                long j = ahdxVar2.d;
                if (j != -1) {
                    apae apaeVar = amnv.b;
                    aozy createBuilder3 = amnt.a.createBuilder();
                    aozy createBuilder4 = amnu.a.createBuilder();
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    amnu amnuVar = (amnu) createBuilder4.b;
                    amnuVar.b |= 1;
                    amnuVar.c = j;
                    amnu amnuVar2 = (amnu) createBuilder4.s();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    amnt amntVar = (amnt) createBuilder3.b;
                    amnuVar2.getClass();
                    amntVar.c = amnuVar2;
                    amntVar.b = 1 | amntVar.b;
                    apaaVar2.ct(apaeVar, (amnt) createBuilder3.s());
                }
                List list2 = arrayList;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((ahed) albo.bQ((ListenableFuture) it2.next())).a(apaaVar2);
                    }
                }
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                List list3 = arrayList2;
                amod amodVar7 = (amod) apaaVar.b;
                amnq amnqVar = (amnq) apaaVar2.s();
                amnqVar.getClass();
                amodVar7.j = amnqVar;
                amodVar7.b |= 16384;
                if (!list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((ahed) albo.bQ((ListenableFuture) it3.next())).a(apaaVar);
                    }
                }
                apaa[] apaaVarArr = (apaa[]) albo.bQ(bI);
                if (apaaVarArr != null) {
                    for (apaa apaaVar3 : apaaVarArr) {
                        if (!apaaVar.b.isMutable()) {
                            apaaVar.u();
                        }
                        amod amodVar8 = (amod) apaaVar.b;
                        amoe amoeVar = (amoe) apaaVar3.s();
                        amoeVar.getClass();
                        apax apaxVar = amodVar8.i;
                        if (!apaxVar.c()) {
                            amodVar8.i = apag.mutableCopy(apaxVar);
                        }
                        amodVar8.i.add(amoeVar);
                    }
                }
                amod amodVar9 = (amod) apaaVar.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amnr amnrVar4 = (amnr) createBuilder.b;
                amodVar9.getClass();
                amnrVar4.f = amodVar9;
                amnrVar4.b |= 16;
                return (amnr) createBuilder.s();
            }
        }, andi.a);
        if (ahdxVar.e) {
            aF = ahji.aG(ahdxVar);
        } else {
            aF = ahji.aF(ahdxVar);
        }
        checkIsLite2 = apag.checkIsLite(aheh.a);
        aF.b(checkIsLite2);
        if (aF.l.o(checkIsLite2.d)) {
            checkIsLite3 = apag.checkIsLite(aheh.a);
            aF.b(checkIsLite3);
            Object l2 = aF.l.l(checkIsLite3.d);
            if (l2 == null) {
                c = checkIsLite3.b;
            } else {
                c = checkIsLite3.c(l2);
            }
            algwVar = algw.i(Integer.valueOf(((aheg) c).b));
        } else {
            this.a.a(ahdxVar);
            algwVar = alfd.a;
        }
        return albo.bY(d, a, h, e).b(akto.c(new ahem(this, g, d, a, algwVar, h, ahdxVar, e, agrkVar, 0)), andi.a);
    }
}
