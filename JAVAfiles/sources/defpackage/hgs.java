package defpackage;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgs implements hho {
    private final /* synthetic */ int g;
    public static final hgs f = new hgs(5);
    public static final hgs e = new hgs(4);
    public static final hgs d = new hgs(3);
    public static final hgs c = new hgs(2);
    public static final hgs b = new hgs(1);
    public static final hgs a = new hgs(0);

    private hgs(int i) {
        this.g = i;
    }

    @Override // defpackage.hho
    public final /* synthetic */ Object a(hhr hhrVar, float f2) {
        double d2;
        int i = this.g;
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (hhrVar.p() == 1) {
                                z = true;
                            }
                            if (z) {
                                hhrVar.g();
                            }
                            float a2 = (float) hhrVar.a();
                            float a3 = (float) hhrVar.a();
                            while (hhrVar.n()) {
                                hhrVar.m();
                            }
                            if (z) {
                                hhrVar.i();
                            }
                            return new hih((a2 / 100.0f) * f2, (a3 / 100.0f) * f2);
                        }
                        int p = hhrVar.p();
                        if (p == 1) {
                            return hgy.c(hhrVar, f2);
                        }
                        if (p == 3) {
                            return hgy.c(hhrVar, f2);
                        }
                        if (p == 7) {
                            PointF pointF = new PointF(((float) hhrVar.a()) * f2, ((float) hhrVar.a()) * f2);
                            while (hhrVar.n()) {
                                hhrVar.m();
                            }
                            return pointF;
                        }
                        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(d.C(p)));
                    }
                    return hgy.c(hhrVar, f2);
                }
                return Integer.valueOf(Math.round(hgy.a(hhrVar) * f2));
            }
            if (hhrVar.p() == 1) {
                z = true;
            }
            if (z) {
                hhrVar.g();
            }
            double a4 = hhrVar.a();
            double a5 = hhrVar.a();
            double a6 = hhrVar.a();
            if (hhrVar.p() == 7) {
                d2 = hhrVar.a();
            } else {
                d2 = 1.0d;
            }
            if (z) {
                hhrVar.i();
            }
            if (a4 <= 1.0d && a5 <= 1.0d && a6 <= 1.0d) {
                a4 *= 255.0d;
                a5 *= 255.0d;
                a6 *= 255.0d;
                if (d2 <= 1.0d) {
                    d2 *= 255.0d;
                }
            }
            return Integer.valueOf(Color.argb((int) d2, (int) a4, (int) a5, (int) a6));
        }
        return Float.valueOf(hgy.a(hhrVar) * f2);
    }
}
