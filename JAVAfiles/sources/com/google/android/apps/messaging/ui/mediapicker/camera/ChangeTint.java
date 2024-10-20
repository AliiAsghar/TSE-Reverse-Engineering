package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChangeTint extends Transition {
    public ChangeTint() {
    }

    private static void a(TransitionValues transitionValues) {
        ColorStateList imageTintList;
        View view = transitionValues.view;
        if ((view instanceof ImageView) && (imageTintList = ((ImageView) view).getImageTintList()) != null) {
            transitionValues.values.put("changeTint:color", Integer.valueOf(imageTintList.getDefaultColor()));
        }
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
        ImageView imageView = (ImageView) transitionValues.view;
        if (transitionValues.values.containsKey("changeTint:color") && transitionValues2.values.containsKey("changeTint:color")) {
            return ObjectAnimator.ofArgb(imageView, "colorFilter", ((Integer) transitionValues.values.get("changeTint:color")).intValue(), ((Integer) transitionValues2.values.get("changeTint:color")).intValue());
        }
        return null;
    }

    public ChangeTint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
