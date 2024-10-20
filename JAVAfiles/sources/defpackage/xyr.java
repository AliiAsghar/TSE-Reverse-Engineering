package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyr implements Interpolator {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public xyr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    private static float a(float f, float f2, float f3) {
        if (f != brg.a && f != 1.0f) {
            float f4 = ((f2 + brg.a) * f) + brg.a;
            float f5 = f2 + ((f3 - f2) * f);
            float f6 = f4 + ((f5 - f4) * f);
            return f6 + (((f5 + (((f3 + ((1.0f - f3) * f)) - f5) * f)) - f6) * f);
        }
        return f;
    }

    private final float b(float f) {
        return a(f, this.a, this.c);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = brg.a;
        if (f > brg.a) {
            if (f >= 1.0f) {
                f2 = 1.0f;
            } else {
                float f3 = 0.0f;
                float f4 = 1.0f;
                f2 = f;
                float f5 = 0.0f;
                for (int i = 0; i < 8; i++) {
                    f3 = b(f2);
                    float b = (b(f2 + 1.0E-6f) - f3) / 1.0E-6f;
                    float f6 = f3 - f;
                    if (Math.abs(f6) < 1.0E-6f) {
                        break;
                    }
                    double d = b;
                    if (Math.abs(d) < 9.999999974752427E-7d) {
                        break;
                    }
                    if (f3 >= f) {
                        f4 = f2;
                    }
                    if (f3 < f) {
                        f5 = f2;
                    }
                    f2 = (float) (f2 - (f6 / d));
                }
                for (int i2 = 0; Math.abs(f3 - f) > 1.0E-6f && i2 < 8; i2++) {
                    if (f3 < f) {
                        f5 = f2;
                        f2 = (f2 + f4) / 2.0f;
                    } else {
                        f4 = f2;
                        f2 = (f2 + f5) / 2.0f;
                    }
                    f3 = b(f2);
                }
            }
        }
        return a(f2, this.b, this.d);
    }
}
