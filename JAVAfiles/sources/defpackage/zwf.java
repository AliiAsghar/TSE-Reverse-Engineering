package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwf extends Transition {
    private static void a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        transitionValues.values.put("PopAndScale:scaleX", Float.valueOf(view.getScaleX()));
        transitionValues.values.put("PopAndScale:scaleY", Float.valueOf(view.getScaleY()));
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null && transitionValues.values.get("PopAndScale:scaleX") != null && transitionValues.values.get("PopAndScale:scaleY") != null && transitionValues2.values.get("PopAndScale:scaleX") != null && transitionValues2.values.get("PopAndScale:scaleY") != null) {
            View view = transitionValues2.view;
            float floatValue = ((Float) transitionValues.values.get("PopAndScale:scaleX")).floatValue();
            float floatValue2 = ((Float) transitionValues2.values.get("PopAndScale:scaleX")).floatValue();
            float floatValue3 = ((Float) transitionValues.values.get("PopAndScale:scaleY")).floatValue();
            float floatValue4 = ((Float) transitionValues2.values.get("PopAndScale:scaleY")).floatValue();
            if (floatValue != floatValue2 || floatValue3 != floatValue4) {
                view.setScaleX(floatValue);
                view.setScaleY(floatValue3);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.1f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(getDuration() / 2);
                animatorSet.setInterpolator(new OvershootInterpolator());
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", floatValue2);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", floatValue4);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat3, ofFloat4);
                animatorSet2.setDuration(getDuration() / 2);
                animatorSet2.setStartDelay(getDuration() / 2);
                animatorSet2.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(animatorSet, animatorSet2);
                return animatorSet3;
            }
            return null;
        }
        return null;
    }

    @Override // android.transition.Transition
    public final boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        return true;
    }
}
