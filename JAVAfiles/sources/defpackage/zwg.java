package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwg extends Transition {
    private static void a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        transitionValues.values.put("Translate:x", Float.valueOf(view.getX()));
        transitionValues.values.put("Translate:y", Float.valueOf(view.getY()));
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
        if (transitionValues != null && transitionValues2 != null) {
            View view = transitionValues2.view;
            Optional ofNullable = Optional.ofNullable(transitionValues.values.get("Translate:x"));
            Float valueOf = Float.valueOf(brg.a);
            float floatValue = ((Float) ofNullable.orElse(valueOf)).floatValue();
            float floatValue2 = ((Float) Optional.ofNullable(transitionValues2.values.get("Translate:x")).orElse(valueOf)).floatValue();
            float floatValue3 = ((Float) Optional.ofNullable(transitionValues.values.get("Translate:y")).orElse(valueOf)).floatValue();
            float floatValue4 = ((Float) Optional.ofNullable(transitionValues2.values.get("Translate:y")).orElse(valueOf)).floatValue();
            if (floatValue != floatValue2 || floatValue3 != floatValue4) {
                view.setX(floatValue);
                view.setY(floatValue3);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "x", floatValue2);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "y", floatValue4);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                return animatorSet;
            }
            return null;
        }
        return null;
    }
}
