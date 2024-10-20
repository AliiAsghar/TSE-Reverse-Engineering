package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dby implements deo {
    private final ViewConfiguration a;

    public dby(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.deo
    public final float a() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }

    @Override // defpackage.deo
    public final float b() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // defpackage.deo
    public final float c() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.deo
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.deo
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.deo
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.deo
    public final /* synthetic */ long g() {
        return a.z(48.0f, 48.0f);
    }

    @Override // defpackage.deo
    public final void h() {
    }
}
