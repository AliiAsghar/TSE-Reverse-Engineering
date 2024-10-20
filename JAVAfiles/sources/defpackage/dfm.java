package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfm {
    public static final boolean a(List list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = arnv.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int z = aqjn.z(list);
            int i = 0;
            while (i < z) {
                i++;
                Object obj2 = list.get(i);
                dhe dheVar = (dhe) obj2;
                dhe dheVar2 = (dhe) obj;
                float abs = Math.abs(Float.intBitsToFloat((int) (dheVar2.b().a() >> 32)) - Float.intBitsToFloat((int) (dheVar.b().a() >> 32)));
                float abs2 = Math.abs(Float.intBitsToFloat((int) (dheVar2.b().a() & 4294967295L)) - Float.intBitsToFloat((int) (dheVar.b().a() & 4294967295L)));
                arrayList.add(new cjn((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j = ((cjn) aqjn.X(list2)).a;
        } else {
            if (list2.isEmpty()) {
                dru.c("Empty collection can't be reduced.");
            }
            Object X = aqjn.X(list2);
            int z2 = aqjn.z(list2);
            if (z2 > 0) {
                int i2 = 1;
                while (true) {
                    X = new cjn(d.aH(((cjn) X).a, ((cjn) list2.get(i2)).a));
                    if (i2 == z2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((cjn) X).a;
        }
        if (Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32))) {
            return true;
        }
        return false;
    }

    public static final boolean b(dhe dheVar) {
        dgy e = dheVar.e();
        dhn dhnVar = dhh.a;
        if (dgz.a(e, dhh.f) == null && dgz.a(dheVar.e(), dhh.e) == null) {
            return false;
        }
        return true;
    }
}
