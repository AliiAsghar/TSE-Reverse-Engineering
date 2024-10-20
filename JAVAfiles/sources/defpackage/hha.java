package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hha {
    static final ico a = ico.J("k");

    public static List a(hhr hhrVar, hbb hbbVar, float f, hho hhoVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (hhrVar.p() == 6) {
            hbbVar.d("Lottie doesn't support expressions.");
            return arrayList;
        }
        hhrVar.h();
        while (hhrVar.n()) {
            if (hhrVar.q(a) != 0) {
                hhrVar.m();
            } else if (hhrVar.p() == 1) {
                hhrVar.g();
                if (hhrVar.p() != 7) {
                    while (hhrVar.n()) {
                        arrayList.add(hgz.a(hhrVar, hbbVar, f, hhoVar, true, z));
                    }
                } else {
                    arrayList.add(hgz.a(hhrVar, hbbVar, f, hhoVar, false, z));
                }
                hhrVar.i();
            } else {
                arrayList.add(hgz.a(hhrVar, hbbVar, f, hhoVar, false, z));
            }
        }
        hhrVar.j();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            hie hieVar = (hie) list.get(i2);
            i2++;
            hie hieVar2 = (hie) list.get(i2);
            hieVar.h = Float.valueOf(hieVar2.g);
            if (hieVar.c == null && (obj = hieVar2.b) != null) {
                hieVar.c = obj;
                if (hieVar instanceof hde) {
                    ((hde) hieVar).a();
                }
            }
        }
        hie hieVar3 = (hie) list.get(i);
        if ((hieVar3.b == null || hieVar3.c == null) && list.size() > 1) {
            list.remove(hieVar3);
        }
    }
}
