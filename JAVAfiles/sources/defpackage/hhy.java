package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhy {
    public static final PointF a = new PointF();

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static PointF c(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void d(heo heoVar, int i, List list, heo heoVar2, hch hchVar) {
        if (heoVar.d(hchVar.g(), i)) {
            list.add(heoVar2.b(hchVar.g()).c(hchVar));
        }
    }

    public static int e(int i) {
        return Math.max(0, Math.min(255, i));
    }
}
