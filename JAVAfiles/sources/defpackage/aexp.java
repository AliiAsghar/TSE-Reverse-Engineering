package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexp implements cue {
    public static final aexp a = new aexp();

    @Override // defpackage.cue
    public final /* synthetic */ int a(ctd ctdVar, List list, int i) {
        return cud.a(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int b(ctd ctdVar, List list, int i) {
        return cud.b(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int c(ctd ctdVar, List list, int i) {
        return cud.c(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int d(ctd ctdVar, List list, int i) {
        return cud.d(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        List list2;
        int i;
        aexs am;
        cuf et;
        cuhVar.getClass();
        int i2 = 0;
        cuc cucVar = (cuc) list.get(0);
        cuc cucVar2 = (cuc) list.get(1);
        cuc cucVar3 = (cuc) list.get(2);
        List al = aqjn.al(list, 3);
        aexr aexrVar = new aexr(j, cucVar, cucVar2, cucVar3, aqjn.am(al, 1), (cuc) aqjn.ac(al));
        List list3 = aexrVar.e;
        ArrayList arrayList = new ArrayList(aqjn.J(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(adcx.an((cuc) it.next(), aexrVar)));
        }
        List aM = aqjn.aM(arrayList, 2, true, aeys.b);
        Iterator it2 = aM.iterator();
        if (!it2.hasNext()) {
            list2 = arnv.a;
        } else {
            Object next = it2.next();
            ArrayList arrayList2 = new ArrayList(aqjn.J(aM, 10));
            arrayList2.add(next);
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
                arrayList2.add(next);
            }
            list2 = arrayList2;
        }
        long j2 = aexrVar.a;
        int an = adcx.an(aexrVar.b, aexrVar);
        cuc cucVar4 = aexrVar.c;
        int ao = adcx.ao(cucVar4);
        int an2 = adcx.an(cucVar4, aexrVar);
        cuc cucVar5 = aexrVar.d;
        int ao2 = adcx.ao(cucVar5);
        int an3 = adcx.an(cucVar5, aexrVar);
        Integer num = (Integer) aqjn.ad(list2);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        aexo aexoVar = new aexo(dqs.a(j2), an, ao, an2, ao2, an3, list2, i, adcx.an(aexrVar.f, aexrVar));
        int i3 = aexoVar.b;
        int i4 = aexoVar.d;
        int i5 = aexoVar.f;
        int i6 = aexoVar.h;
        int i7 = aexoVar.i;
        int i8 = aexoVar.a;
        if (i3 + i4 + i5 + i6 + i7 <= i8) {
            am = new aexs(i3, i4, i5, aexoVar.g.size(), i7);
        } else {
            int i9 = aexoVar.e;
            int i10 = i8 - i3;
            int i11 = ((i10 - i4) - i6) - i7;
            if (i11 >= i9) {
                am = new aexs(i3, i4, i11, aexoVar.g.size(), i7);
            } else {
                int i12 = aexoVar.c;
                int i13 = ((i10 - i9) - i6) - i7;
                if (i13 >= i12) {
                    am = new aexs(i3, i13, i9, aexoVar.g.size(), i7);
                } else {
                    am = adcx.am(aexoVar, i12, i9);
                    if (am == null && (am = adcx.am(aexoVar, aexoVar.c, 0)) == null) {
                        aexs am2 = adcx.am(aexoVar, 0, 0);
                        if (am2 != null && am2.d > 0) {
                            am = am2;
                        } else {
                            am = null;
                        }
                        if (am == null) {
                            am = new aexs(0, 0, 0, 0, 0);
                        }
                    }
                }
            }
        }
        aron aronVar = new aron((byte[]) null);
        aronVar.add(adcx.ap(aexrVar.b, aexrVar, am.a));
        aronVar.add(adcx.ap(aexrVar.c, aexrVar, am.b));
        aronVar.add(adcx.ap(aexrVar.d, aexrVar, am.c));
        if (am.d > 0) {
            List av = aqjn.av(aexrVar.e, (r3 + r3) - 1);
            ArrayList arrayList3 = new ArrayList(aqjn.J(av, 10));
            Iterator it3 = av.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((cuc) it3.next()).e(aexrVar.a));
            }
            aronVar.addAll(arrayList3);
        }
        aronVar.add(adcx.ap(aexrVar.f, aexrVar, am.e));
        List x = aqjn.x(aronVar);
        Iterator it4 = x.iterator();
        if (it4.hasNext()) {
            int i14 = ((cvc) it4.next()).a;
            while (it4.hasNext()) {
                int i15 = ((cvc) it4.next()).a;
                if (i14 < i15) {
                    i14 = i15;
                }
            }
            Iterator it5 = x.iterator();
            while (it5.hasNext()) {
                i2 += ((cvc) it5.next()).b;
            }
            et = cuhVar.et(i14, i2, arnw.a, new aeql(x, 16));
            return et;
        }
        throw new NoSuchElementException();
    }
}
