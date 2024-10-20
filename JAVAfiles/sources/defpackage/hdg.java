package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdg extends hdd {
    private final PointF e;

    public hdg(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.hcw
    public final /* synthetic */ Object f(hie hieVar, float f) {
        return g(hieVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hcw
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(hie hieVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = hieVar.b;
        if (obj2 != null && (obj = hieVar.c) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            hig higVar = this.d;
            if (higVar != null && (pointF = (PointF) higVar.b(hieVar.g, hieVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
                return pointF;
            }
            this.e.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
            return this.e;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
