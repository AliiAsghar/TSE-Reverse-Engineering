package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class yai {
    public static final Interpolator a = new emq();
    public static final Interpolator b = new xyr(0.4f, brg.a, 0.2f, 1.0f);

    public static int a(Context context) {
        return context.getResources().getInteger(R.integer.no_shifting_animation_duration);
    }

    public static int b(View view) {
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), Integer.MIN_VALUE);
    }

    public static int c(View view) {
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), Integer.MIN_VALUE);
    }

    public static int d(View view) {
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824);
    }

    public static Animator e(View view, int i, long j) {
        float f;
        if (i == 0) {
            f = 1.0f;
        } else {
            f = brg.a;
        }
        return ObjectAnimator.ofFloat(view, "alpha", f).setDuration(j);
    }

    public static Animator f(View view, int i, int i2, Runnable runnable) {
        if (view.getVisibility() != 0 && i == 0) {
            view.setAlpha(brg.a);
        }
        Animator e = e(view, i, i2);
        e.addListener(new yae(i, view, runnable));
        return e;
    }

    public static void l(View view, int i, long j, Interpolator interpolator, Runnable runnable, Animation... animationArr) {
        xyl.l(animationArr);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animationArr[0]);
        if (j == -1) {
            animationSet.setDuration(a(view.getContext()));
        } else {
            animationSet.setDuration(j);
        }
        animationSet.setInterpolator(interpolator);
        animationSet.setAnimationListener(new yag(i, view, runnable));
        view.clearAnimation();
        view.startAnimation(animationSet);
    }

    public static boolean o(View view, int i, Runnable runnable) {
        if (view.getVisibility() != i) {
            return true;
        }
        if (runnable != null) {
            xzw.a.post(runnable);
            return false;
        }
        return false;
    }

    public static Animator p(View view, int i) {
        return f(view, i, 150, null);
    }

    public final Rect g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    public final void h(View view, int i, int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.addUpdateListener(new qu(view, 13, null));
        ofObject.setDuration(150L).start();
    }

    public final void i(View view, enh enhVar, Runnable runnable) {
        view.addOnLayoutChangeListener(new aksg(view, enhVar, runnable, 1));
    }

    @Deprecated
    public final void j(View view, int i, long j) {
        xuj xujVar = new xuj(view, 2, i);
        xujVar.setInterpolator(b);
        if (j == -1) {
            j = a(view.getContext());
        }
        xujVar.setDuration(j);
        view.clearAnimation();
        view.startAnimation(xujVar);
    }

    @Deprecated
    public final void k(View view, int i, Runnable runnable) {
        float f;
        Interpolator interpolator = b;
        if (!o(view, i, runnable)) {
            return;
        }
        Context context = view.getContext();
        float f2 = brg.a;
        if (i == 0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (i == 0) {
            f2 = 1.0f;
        }
        l(view, i, -1L, interpolator, runnable, new xuh(context, f, f2));
    }

    public final void m(View view, float f) {
        view.clearAnimation();
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public final void n(View view, float f) {
        view.animate().scaleX(f).scaleY(f).setDuration(150L);
    }
}
