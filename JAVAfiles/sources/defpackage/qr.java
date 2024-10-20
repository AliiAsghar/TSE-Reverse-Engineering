package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qr implements Interpolator {
    private final /* synthetic */ int a;

    public qr(int i) {
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    float f2 = f - 1.0f;
                    if (i != 3) {
                        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                    }
                    return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                }
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
            float f4 = f - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
        return f * f * f * f * f;
    }
}
