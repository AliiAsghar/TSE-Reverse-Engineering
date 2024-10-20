package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajil {
    public final TimeInterpolator a = new PathInterpolator(0.1f, 0.1f, brg.a, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public qz f;
    private final float g;
    private final float h;

    public ajil(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = ajgk.g(context, R.attr.motionDurationMedium2, 300);
        this.d = ajgk.g(context, R.attr.motionDurationShort3, 150);
        this.e = ajgk.g(context, R.attr.motionDurationShort2, 100);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new emq());
        return animatorSet;
    }

    public final void b(float f) {
        float f2;
        float interpolation = this.a.getInterpolation(f);
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        if (width > brg.a && height > brg.a) {
            float f3 = this.g / width;
            float f4 = this.h / height;
            TimeInterpolator timeInterpolator = ajdd.a;
            float f5 = ((f3 + brg.a) * interpolation) + brg.a;
            float f6 = (interpolation * (f4 + brg.a)) + brg.a;
            float f7 = 1.0f - f5;
            if (!Float.isNaN(f7)) {
                float f8 = 1.0f - f6;
                if (!Float.isNaN(f8)) {
                    this.b.setScaleX(f7);
                    this.b.setPivotY(height);
                    this.b.setScaleY(f8);
                    View view = this.b;
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
                            View childAt = viewGroup.getChildAt(i);
                            childAt.setPivotY(-childAt.getTop());
                            if (f8 != brg.a) {
                                f2 = f7 / f8;
                            } else {
                                f2 = 1.0f;
                            }
                            childAt.setScaleY(f2);
                        }
                    }
                }
            }
        }
    }
}
