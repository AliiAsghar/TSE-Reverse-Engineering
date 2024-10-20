package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexb implements cue {
    public static final aexb a = new aexb(0);
    private final /* synthetic */ int b;

    public aexb(int i) {
        this.b = i;
    }

    @Override // defpackage.cue
    public final /* synthetic */ int a(ctd ctdVar, List list, int i) {
        if (this.b != 0) {
            return cud.a(this, ctdVar, list, i);
        }
        return cud.a(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int b(ctd ctdVar, List list, int i) {
        if (this.b != 0) {
            return cud.b(this, ctdVar, list, i);
        }
        return cud.b(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int c(ctd ctdVar, List list, int i) {
        if (this.b != 0) {
            return cud.c(this, ctdVar, list, i);
        }
        return cud.c(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int d(ctd ctdVar, List list, int i) {
        if (this.b != 0) {
            return cud.d(this, ctdVar, list, i);
        }
        return cud.d(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        Object obj;
        int i;
        cuf et;
        Integer num;
        int d;
        int b;
        cuf et2;
        int i2 = 0;
        if (this.b != 0) {
            cuhVar.getClass();
            ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((cuc) it.next()).e(j));
            }
            int i3 = ((cvc) arrayList.get(0)).a;
            Iterator it2 = arrayList.subList(1, arrayList.size()).iterator();
            while (it2.hasNext()) {
                i2 += ((cvc) it2.next()).a;
            }
            int i4 = i3 + ((int) (i2 * 0.62f));
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                int i5 = ((cvc) it3.next()).b;
                while (it3.hasNext()) {
                    int i6 = ((cvc) it3.next()).b;
                    if (i5 < i6) {
                        i5 = i6;
                    }
                }
                et2 = cuhVar.et(i4, i5, arnw.a, new aeql(arrayList, 6));
                return et2;
            }
            throw new NoSuchElementException();
        }
        cuhVar.getClass();
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                obj = list.get(i7);
                if (d.F(ctk.b((cuc) obj), "horizontal_card_media")) {
                    break;
                }
                i7++;
            } else {
                obj = null;
                break;
            }
        }
        cuc cucVar = (cuc) obj;
        int size2 = list.size();
        int i8 = 0;
        while (i8 < size2) {
            cuc cucVar2 = (cuc) list.get(i8);
            String str = "horizontal_text_content";
            if (d.F(ctk.b(cucVar2), "horizontal_text_content")) {
                if (cucVar != null) {
                    i = cucVar.d(Integer.MAX_VALUE);
                } else {
                    i = i2;
                }
                int r = arrn.r(dqs.b(j) - i, i2);
                int min = Math.min(cucVar2.c(r), dqs.a(j));
                ArrayList arrayList2 = new ArrayList(aqjn.J(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    cuc cucVar3 = (cuc) it4.next();
                    Object b2 = ctk.b(cucVar3);
                    if (d.F(b2, str)) {
                        num = Integer.valueOf(r);
                    } else if (d.F(b2, "horizontal_card_media")) {
                        num = Integer.valueOf(i);
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        d = num.intValue();
                    } else {
                        d = dqs.d(j);
                    }
                    int i9 = d;
                    if (num != null) {
                        b = num.intValue();
                    } else {
                        b = dqs.b(j);
                    }
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(cucVar3.e(dqs.k(j, i9, b, 0, min, 4)));
                    arrayList2 = arrayList3;
                    r = r;
                    str = str;
                }
                ArrayList arrayList4 = arrayList2;
                Iterator it5 = arrayList4.iterator();
                int i10 = 0;
                while (it5.hasNext()) {
                    i10 += ((cvc) it5.next()).a;
                }
                Iterator it6 = arrayList4.iterator();
                if (it6.hasNext()) {
                    int i11 = ((cvc) it6.next()).b;
                    while (it6.hasNext()) {
                        int i12 = ((cvc) it6.next()).b;
                        if (i11 < i12) {
                            i11 = i12;
                        }
                    }
                    et = cuhVar.et(i10, i11, arnw.a, new aeql(arrayList4, 15));
                    return et;
                }
                throw new NoSuchElementException();
            }
            i8++;
            i2 = 0;
        }
        dru.a("Collection contains no element matching the predicate.");
        throw new armj();
    }
}
