package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agcu extends arrp implements arqv {
    final /* synthetic */ agcj a;
    final /* synthetic */ bqn b;
    final /* synthetic */ byn c;
    final /* synthetic */ byn d;
    final /* synthetic */ agcw e;
    final /* synthetic */ byn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agcu(agcj agcjVar, bqn bqnVar, byn bynVar, byn bynVar2, agcw agcwVar, byn bynVar3) {
        super(2);
        this.a = agcjVar;
        this.b = bqnVar;
        this.c = bynVar;
        this.d = bynVar2;
        this.e = agcwVar;
        this.f = bynVar3;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        cuf et;
        cvn cvnVar = (cvn) obj;
        long j = ((dqs) obj2).a;
        cvnVar.getClass();
        agcg agcgVar = new agcg(j, 0);
        zay zayVar = new zay((Object) this.a.c, 9, (short[][]) null);
        afwv.r(this.d);
        List a = cvnVar.a(agci.a, new cdj(968347872, true, new keh((Object) this.e, (Object) new agch(j, zayVar), (Object) this.a, 13, (byte[]) null)));
        char c = '\n';
        ArrayList arrayList3 = new ArrayList(aqjn.J(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ArrayList arrayList4 = arrayList3;
            arrayList4.add(((cuc) it.next()).e(dqs.k(j, 0, 0, 0, 0, 11)));
            arrayList3 = arrayList4;
            c = '\n';
        }
        ArrayList arrayList5 = arrayList3;
        int size = arrayList5.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((cvc) arrayList5.get(i2)).b;
        }
        float eh = cvnVar.eh(i);
        List a2 = cvnVar.a(agci.c, new cdj(805945070, true, new keh((Object) this.e, (Object) agcgVar, (Object) this.a, 12, (byte[]) null)));
        ArrayList arrayList6 = new ArrayList(aqjn.J(a2, 10));
        Iterator it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((cuc) it2.next()).e(dqs.k(j, 0, 0, 0, 0, 11)));
        }
        int size2 = arrayList6.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            i3 += ((cvc) arrayList6.get(i4)).b;
        }
        cvnVar.eh(i3);
        List a3 = cvnVar.a(agci.e, new cdj(1655364285, true, new agct(j, this.a, this.d, this.e)));
        ArrayList arrayList7 = new ArrayList(aqjn.J(a3, 10));
        Iterator it3 = a3.iterator();
        while (it3.hasNext()) {
            cuc cucVar = (cuc) it3.next();
            Iterator it4 = it3;
            ArrayList arrayList8 = arrayList7;
            arrayList8.add(cucVar.e(dqs.k(j, 0, 0, 0, 0, 11)));
            arrayList7 = arrayList8;
            it3 = it4;
        }
        ArrayList arrayList9 = arrayList7;
        bqn bqnVar = this.b;
        if (bqnVar != null) {
            List a4 = cvnVar.a(agci.f, new cdj(-458364813, true, new aezg(this.e, bqnVar, 12, null)));
            ArrayList arrayList10 = new ArrayList(aqjn.J(a4, 10));
            Iterator it5 = a4.iterator();
            while (it5.hasNext()) {
                ArrayList arrayList11 = arrayList6;
                ArrayList arrayList12 = arrayList10;
                arrayList12.add(((cuc) it5.next()).e(dqs.k(j, 0, 0, 0, 0, 11)));
                arrayList10 = arrayList12;
                arrayList6 = arrayList11;
            }
            arrayList = arrayList6;
            arrayList2 = arrayList10;
        } else {
            arrayList = arrayList6;
            arrayList2 = null;
        }
        int i5 = i3;
        ArrayList arrayList13 = arrayList;
        List a5 = cvnVar.a(agci.b, new cdj(-1567261774, true, new agcs(j, eh, this.a, this.d, this.f, this.e)));
        ArrayList arrayList14 = new ArrayList(aqjn.J(a5, 10));
        Iterator it6 = a5.iterator();
        while (it6.hasNext()) {
            arrayList14.add(((cuc) it6.next()).e(j));
        }
        List a6 = cvnVar.a(agci.d, new cdj(-648994838, true, new agcr(j, this.a, this.f, this.c, this.e)));
        ArrayList arrayList15 = new ArrayList(aqjn.J(a6, 10));
        Iterator it7 = a6.iterator();
        while (it7.hasNext()) {
            arrayList15.add(((cuc) it7.next()).e(dqs.k(j, 0, 0, 0, 0, 11)));
        }
        et = cvnVar.et(dqs.b(j), dqs.a(j), arnw.a, new agcq(arrayList14, arrayList15, arrayList5, arrayList13, arrayList9, arrayList2, j, i5));
        return et;
    }
}
