package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekq extends arrp implements arqr {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ aekt c;
    final /* synthetic */ byn d;
    final /* synthetic */ arqr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aekq(float f, float f2, aekt aektVar, byn bynVar, arqr arqrVar) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = aektVar;
        this.d = bynVar;
        this.e = arqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List] */
    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        chj chjVar;
        ArrayList arrayList;
        Iterator it;
        int i;
        chj chjVar2 = (chj) obj;
        chjVar2.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (chjVar2.a() & 4294967295L));
        float f = intBitsToFloat / 2.0f;
        float d = dqu.d(chjVar2, this.a);
        float d2 = dqu.d(chjVar2, this.b);
        float d3 = dqu.d(chjVar2, 4.0f);
        float d4 = dqu.d(chjVar2, 24.0f);
        float d5 = dqu.d(chjVar2, 24.0f);
        long floatToRawIntBits = Float.floatToRawIntBits(d4);
        long floatToRawIntBits2 = Float.floatToRawIntBits(d5);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (chjVar2.a() >> 32)) / d2;
        aekt aektVar = this.c;
        List list = aektVar.a;
        int i2 = (int) intBitsToFloat2;
        if (aetn.at(aektVar.b)) {
            chjVar = chjVar2;
            arrayList = aqjn.aw(list, i2);
        } else {
            if (list.size() >= i2) {
                chjVar = chjVar2;
            } else {
                float ceil = (float) Math.ceil(i2 / list.size());
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int i3 = (int) ceil;
                    float f2 = ceil;
                    int i4 = ((aekn) it2.next()).a;
                    Iterator it3 = it2;
                    ArrayList arrayList3 = new ArrayList(i3);
                    chj chjVar3 = chjVar2;
                    int i5 = 0;
                    while (i5 < i3) {
                        arrayList3.add(new aekn(i4));
                        i5++;
                        i3 = i3;
                    }
                    aqjn.S(arrayList2, arrayList3);
                    it2 = it3;
                    ceil = f2;
                    chjVar2 = chjVar3;
                }
                chjVar = chjVar2;
                list = arrayList2;
            }
            List av = aqjn.av(aqjn.aj(list, arrn.r((int) (list.size() / i2), 1)), i2);
            arrayList = new ArrayList(aqjn.J(av, 10));
            Iterator it4 = av.iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((List) it4.next()).iterator();
                if (it5.hasNext()) {
                    Object next = it5.next();
                    if (it5.hasNext()) {
                        int i6 = ((aekn) next).a;
                        while (true) {
                            Object next2 = it5.next();
                            it = it4;
                            int i7 = ((aekn) next2).a;
                            if (i6 < i7) {
                                i = i7;
                            } else {
                                i = i6;
                            }
                            if (i6 < i7) {
                                next = next2;
                            }
                            if (!it5.hasNext()) {
                                break;
                            }
                            it4 = it;
                            i6 = i;
                        }
                    } else {
                        it = it4;
                    }
                    arrayList.add(new aekn(((aekn) next).a));
                    it4 = it;
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
        float size = arrayList.size();
        byn bynVar = this.d;
        float size2 = (i2 - arrayList.size()) * d2;
        if (!aetn.at(this.c.b)) {
            size2 /= 2.0f;
        }
        bynVar.h(new arsy(size2, (arrayList.size() * d2) + size2));
        return chjVar.o(new aekp(arrayList, intBitsToFloat, d3, this.e, size, d2, f, d, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), this.d));
    }
}
