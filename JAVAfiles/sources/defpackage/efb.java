package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efb extends efc {
    private final WindowInsetsAnimation a;

    public efb(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.efc
    public final float g() {
        float interpolatedFraction;
        interpolatedFraction = this.a.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.efc
    public final int h() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.efc
    public final long i() {
        long durationMillis;
        durationMillis = this.a.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.efc
    public final void j(float f) {
        this.a.setFraction(f);
    }
}
