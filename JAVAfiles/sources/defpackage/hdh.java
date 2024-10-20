package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdh extends hdd {
    private final hih e;

    public hdh(List list) {
        super(list);
        this.e = new hih();
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        Object obj;
        hih hihVar;
        Object obj2 = hieVar.b;
        if (obj2 != null && (obj = hieVar.c) != null) {
            hih hihVar2 = (hih) obj2;
            hih hihVar3 = (hih) obj;
            hig higVar = this.d;
            if (higVar != null && (hihVar = (hih) higVar.b(hieVar.g, hieVar.h.floatValue(), hihVar2, hihVar3, f, c(), this.c)) != null) {
                return hihVar;
            }
            hih hihVar4 = this.e;
            float f2 = hihVar2.a;
            float f3 = hihVar3.a;
            PointF pointF = hhy.a;
            float f4 = hihVar2.b;
            float f5 = f4 + (f * (hihVar3.b - f4));
            hihVar4.a = f2 + ((f3 - f2) * f);
            hihVar4.b = f5;
            return this.e;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
