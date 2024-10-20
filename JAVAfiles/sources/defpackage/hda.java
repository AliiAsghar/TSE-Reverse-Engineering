package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hda extends hdd {
    public hda(List list) {
        super(list);
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        return Float.valueOf(l(hieVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(hie hieVar, float f) {
        Float f2;
        if (hieVar.b != null && hieVar.c != null) {
            hig higVar = this.d;
            if (higVar != null && (f2 = (Float) higVar.b(hieVar.g, hieVar.h.floatValue(), (Float) hieVar.b, (Float) hieVar.c, f, c(), this.c)) != null) {
                return f2.floatValue();
            }
            float f3 = hieVar.i;
            if (f3 == -3987645.8f) {
                f3 = ((Float) hieVar.b).floatValue();
                hieVar.i = f3;
            }
            float f4 = hieVar.j;
            if (f4 == -3987645.8f) {
                f4 = ((Float) hieVar.c).floatValue();
                hieVar.j = f4;
            }
            PointF pointF = hhy.a;
            return f3 + (f * (f4 - f3));
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
