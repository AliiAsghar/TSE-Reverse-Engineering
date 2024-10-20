package defpackage;

import defpackage.bcy;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcu {
    public static final int a(long j, diy diyVar) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= brg.a) {
            return 0;
        }
        if (Float.intBitsToFloat(i) >= diyVar.b.d) {
            return diyVar.a.a.a();
        }
        return diyVar.j(j);
    }

    public static final int b(bcy.a aVar, Comparator comparator, long j, int i) {
        int compare = comparator.compare(Long.valueOf(aVar.c), Long.valueOf(j));
        if (compare < 0) {
            return 0;
        }
        if (compare <= 0) {
            return aVar.b;
        }
        return i;
    }

    public static final bco c(bco bcoVar, bco bcoVar2, bdr bdrVar, long j, bcy.a aVar) {
        bco bcoVar3;
        if (aVar != null) {
            int compare = bdrVar.f.compare(Long.valueOf(aVar.c), Long.valueOf(j));
            if (compare < 0) {
                bcoVar3 = bco.a;
            } else if (compare > 0) {
                bcoVar3 = bco.c;
            } else {
                bcoVar3 = bco.b;
            }
            if (bcoVar3 != null) {
                return bcoVar3;
            }
        }
        return bdt.a(bcoVar, bcoVar2);
    }
}
