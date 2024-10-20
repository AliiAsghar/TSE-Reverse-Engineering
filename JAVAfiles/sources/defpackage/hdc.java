package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdc extends hdd {
    public hdc(List list) {
        super(list);
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        return Integer.valueOf(k(hieVar, f));
    }

    public final int k(hie hieVar, float f) {
        Integer num;
        if (hieVar.b != null && hieVar.c != null) {
            hig higVar = this.d;
            if (higVar != null && (num = (Integer) higVar.b(hieVar.g, hieVar.h.floatValue(), (Integer) hieVar.b, (Integer) hieVar.c, f, c(), this.c)) != null) {
                return num.intValue();
            }
            int i = hieVar.k;
            if (i == 784923401) {
                i = ((Integer) hieVar.b).intValue();
                hieVar.k = i;
            }
            int i2 = hieVar.l;
            if (i2 == 784923401) {
                i2 = ((Integer) hieVar.c).intValue();
                hieVar.l = i2;
            }
            PointF pointF = hhy.a;
            return (int) (i + (f * (i2 - i)));
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
