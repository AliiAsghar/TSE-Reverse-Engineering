package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwe extends Transition {
    public static final /* synthetic */ int a = 0;

    private static void a(TransitionValues transitionValues) {
        if (!(transitionValues.view instanceof CardView)) {
            return;
        }
        transitionValues.values.put("RadiusTransition:radius", Float.valueOf(((CardView) transitionValues.view).fZ()));
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
        if (transitionValues != null && (transitionValues.view instanceof CardView) && transitionValues.values.get("RadiusTransition:radius") != null && transitionValues2 != null && (transitionValues2.view instanceof CardView) && transitionValues2.values.get("RadiusTransition:radius") != null) {
            CardView cardView = (CardView) transitionValues2.view;
            float floatValue = ((Float) transitionValues.values.get("RadiusTransition:radius")).floatValue();
            float floatValue2 = ((Float) transitionValues2.values.get("RadiusTransition:radius")).floatValue();
            if (floatValue != floatValue2) {
                cardView.gb(floatValue);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(cardView.fZ(), floatValue2);
                ofFloat.addUpdateListener(new ztg(cardView, 2));
                return ofFloat;
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
