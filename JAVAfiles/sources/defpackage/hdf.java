package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdf extends hdd {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private hde h;

    public hdf(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        PointF pointF;
        hde hdeVar = (hde) hieVar;
        Path path = hdeVar.a;
        if (path == null) {
            return (PointF) hieVar.b;
        }
        hig higVar = this.d;
        if (higVar == null || (pointF = (PointF) higVar.b(hdeVar.g, hdeVar.h.floatValue(), (PointF) hdeVar.b, (PointF) hdeVar.c, c(), f, this.c)) == null) {
            if (this.h != hdeVar) {
                this.g.setPath(path, false);
                this.h = hdeVar;
            }
            PathMeasure pathMeasure = this.g;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f, null);
            PointF pointF2 = this.e;
            float[] fArr = this.f;
            pointF2.set(fArr[0], fArr[1]);
            return this.e;
        }
        return pointF;
    }
}
