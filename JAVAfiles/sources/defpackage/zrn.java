package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrn implements Interpolator {
    private final float a;
    private final /* synthetic */ int b;

    public zrn(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.b != 0) {
            float f2 = f + this.a;
            if (f2 < 0.5f) {
                float f3 = f2 + f2;
                return 0.5f * f3 * f3 * f3 * f3 * f3;
            }
            float f4 = f2 - 0.5f;
            float f5 = (f4 + f4) - 1.0f;
            return (0.5f * f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
        float f6 = this.a;
        if (f < f6) {
            return f / f6;
        }
        return (1.0f - f) / (1.0f - f6);
    }
}
