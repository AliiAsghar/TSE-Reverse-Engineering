package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asf {
    private static final Comparator a = new Comparator() { // from class: ase
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return arro.a(((asd) obj).a(), ((asd) obj2).a());
        }
    };

    public static final List a(int i, int i2, List list, List list2) {
        if (list.isEmpty()) {
            return arnv.a;
        }
        List az = aqjn.az(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            asd asdVar = (asd) list.get(i3);
            int a2 = asdVar.a();
            if (i <= a2 && a2 <= i2) {
                az.add(asdVar);
            }
        }
        aqjn.M(az, a);
        return az;
    }
}
