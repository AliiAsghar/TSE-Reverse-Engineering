package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhi implements hho {
    public static final hhi a = new hhi();
    private static final ico b = ico.J("c", "v", "i", "o");

    private hhi() {
    }

    @Override // defpackage.hho
    public final /* bridge */ /* synthetic */ Object a(hhr hhrVar, float f) {
        if (hhrVar.p() == 1) {
            hhrVar.g();
        }
        hhrVar.h();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (hhrVar.n()) {
            int q = hhrVar.q(b);
            if (q != 0) {
                if (q != 1) {
                    if (q != 2) {
                        if (q != 3) {
                            hhrVar.l();
                            hhrVar.m();
                        } else {
                            list3 = hgy.d(hhrVar, f);
                        }
                    } else {
                        list2 = hgy.d(hhrVar, f);
                    }
                } else {
                    list = hgy.d(hhrVar, f);
                }
            } else {
                z = hhrVar.o();
            }
        }
        hhrVar.j();
        if (hhrVar.p() == 2) {
            hhrVar.i();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new hfp(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new hel(hhy.c((PointF) list.get(i2), (PointF) list3.get(i2)), hhy.c(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new hel(hhy.c((PointF) list.get(i3), (PointF) list3.get(i3)), hhy.c(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new hfp(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
