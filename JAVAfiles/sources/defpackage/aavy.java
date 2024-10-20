package defpackage;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavy extends Animation {
    public float a;
    private final float b;

    public aavy() {
        setFillAfter(true);
        setInterpolator(new LinearInterpolator());
        this.b = 1.0f;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.a = ((this.b + brg.a) * f) + brg.a;
    }
}
