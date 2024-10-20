package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asv {
    public static final int a(asd asdVar) {
        long k = asdVar.k(0);
        if (asdVar.p()) {
            return dre.b(k);
        }
        return dre.a(k);
    }

    public static final List b(atm atmVar, List list, tv tvVar, int i, int i2, int i3, arqr arqrVar) {
        tv tvVar2;
        asd asdVar;
        int a;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        if (atmVar != null && !list.isEmpty() && tvVar.b != 0) {
            int a2 = ((asd) aqjn.X(list)).a();
            int i8 = -1;
            int i9 = 0;
            if (((asd) aqjn.ac(list)).a() - a2 >= 0 && (i6 = tvVar.b) != 0) {
                artb B = arrn.B(0, i6);
                int i10 = B.a;
                int i11 = B.b;
                if (i10 <= i11) {
                    i7 = -1;
                    while (tvVar.a(i10) <= a2) {
                        i7 = tvVar.a(i10);
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                } else {
                    i7 = -1;
                }
                if (i7 == -1) {
                    tvVar2 = tw.a;
                } else {
                    tvVar2 = new tv(1);
                    tvVar2.e(i7);
                }
            } else {
                tvVar2 = tw.a;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj2 = list.get(i12);
                int a3 = ((asd) obj2).a();
                int[] iArr = tvVar.a;
                int i13 = tvVar.b;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        break;
                    }
                    if (iArr[i14] == a3) {
                        arrayList2.add(obj2);
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr2 = tvVar2.a;
            int i15 = tvVar2.b;
            int i16 = 0;
            while (i16 < i15) {
                int i17 = iArr2[i16];
                Iterator it = list.iterator();
                int i18 = i9;
                while (true) {
                    if (it.hasNext()) {
                        if (((asd) it.next()).a() == i17) {
                            break;
                        }
                        i18++;
                    } else {
                        i18 = i8;
                        break;
                    }
                }
                if (i18 == i8) {
                    asdVar = (asd) arqrVar.a(Integer.valueOf(i17));
                } else {
                    asdVar = (asd) list.remove(i18);
                }
                int g = asdVar.g();
                if (i18 == i8) {
                    i4 = i;
                    a = Integer.MIN_VALUE;
                } else {
                    a = a(asdVar);
                    i4 = i;
                }
                int i19 = -i4;
                int size2 = arrayList2.size();
                while (true) {
                    if (i9 < size2) {
                        obj = arrayList2.get(i9);
                        if (((asd) obj).a() != i17) {
                            break;
                        }
                        i9++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                asd asdVar2 = (asd) obj;
                if (asdVar2 != null) {
                    i5 = a(asdVar2);
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                if (a != Integer.MIN_VALUE) {
                    i19 = Math.max(i19, a);
                }
                if (i5 != Integer.MIN_VALUE) {
                    i19 = Math.min(i19, i5 - g);
                }
                asdVar.q();
                asdVar.o(i19, 0, i2, i3);
                arrayList.add(asdVar);
                i16++;
                i9 = 0;
                i8 = -1;
            }
            return arrayList;
        }
        return arnv.a;
    }
}
