package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgy {
    private static final ico a = ico.J("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(hhr hhrVar) {
        int p = hhrVar.p();
        int i = p - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) hhrVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(d.C(p)));
        }
        hhrVar.g();
        float a2 = (float) hhrVar.a();
        while (hhrVar.n()) {
            hhrVar.m();
        }
        hhrVar.i();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(hhr hhrVar) {
        hhrVar.g();
        double a2 = hhrVar.a() * 255.0d;
        double a3 = hhrVar.a() * 255.0d;
        double a4 = hhrVar.a() * 255.0d;
        while (hhrVar.n()) {
            hhrVar.m();
        }
        int i = (int) a3;
        int i2 = (int) a2;
        hhrVar.i();
        return Color.argb(255, i2, i, (int) a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF c(hhr hhrVar, float f) {
        int p = hhrVar.p() - 1;
        if (p != 0) {
            if (p != 2) {
                if (p == 6) {
                    float a2 = (float) hhrVar.a();
                    float a3 = (float) hhrVar.a();
                    while (hhrVar.n()) {
                        hhrVar.m();
                    }
                    return new PointF(a2 * f, a3 * f);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(d.C(hhrVar.p())));
            }
            hhrVar.h();
            float f2 = brg.a;
            float f3 = 0.0f;
            while (hhrVar.n()) {
                int q = hhrVar.q(a);
                if (q != 0) {
                    if (q != 1) {
                        hhrVar.l();
                        hhrVar.m();
                    } else {
                        f3 = a(hhrVar);
                    }
                } else {
                    f2 = a(hhrVar);
                }
            }
            hhrVar.j();
            return new PointF(f2 * f, f3 * f);
        }
        hhrVar.g();
        float a4 = (float) hhrVar.a();
        float a5 = (float) hhrVar.a();
        while (hhrVar.p() != 2) {
            hhrVar.m();
        }
        hhrVar.i();
        return new PointF(a4 * f, a5 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List d(hhr hhrVar, float f) {
        ArrayList arrayList = new ArrayList();
        hhrVar.g();
        while (hhrVar.p() == 1) {
            hhrVar.g();
            arrayList.add(c(hhrVar, f));
            hhrVar.i();
        }
        hhrVar.i();
        return arrayList;
    }
}
