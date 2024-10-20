package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hde extends hie {
    public Path a;
    private final hie o;

    public hde(hbb hbbVar, hie hieVar) {
        super(hbbVar, (PointF) hieVar.b, (PointF) hieVar.c, hieVar.d, hieVar.e, hieVar.f, hieVar.g, hieVar.h);
        this.o = hieVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 != null && (obj = this.c) != null && !z) {
            hie hieVar = this.o;
            PointF pointF = (PointF) obj4;
            PointF pointF2 = (PointF) obj;
            PointF pointF3 = hieVar.m;
            PointF pointF4 = hieVar.n;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != brg.a || pointF4.length() != brg.a)) {
                path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.a = path;
        }
    }
}
