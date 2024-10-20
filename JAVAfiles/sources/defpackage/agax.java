package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agax extends agaz {
    public agax(WindowInsetsAnimation windowInsetsAnimation) {
        super(windowInsetsAnimation);
    }

    @Override // defpackage.agaz
    public final float a() {
        float interpolatedFraction;
        interpolatedFraction = this.a.getInterpolatedFraction();
        return 1.0f - interpolatedFraction;
    }
}
