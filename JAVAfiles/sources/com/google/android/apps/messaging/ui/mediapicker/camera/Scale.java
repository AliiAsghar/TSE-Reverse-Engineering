package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aavq;

/* compiled from: PG */
/* loaded from: classes2.dex */
class Scale extends Transition {
    public Scale() {
    }

    private static void a(TransitionValues transitionValues) {
        transitionValues.values.put("android:scale", Float.valueOf(transitionValues.view.getScaleX()));
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
            Object obj = transitionValues.values.get("android:scale");
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            Object obj2 = transitionValues2.values.get("android:scale");
            obj2.getClass();
            float floatValue2 = ((Float) obj2).floatValue();
            if (floatValue != floatValue2) {
                View view = transitionValues.view;
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                return ObjectAnimator.ofFloat(view, new aavq(Float.class, view), floatValue, floatValue2);
            }
            return null;
        }
        return null;
    }

    public Scale(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
