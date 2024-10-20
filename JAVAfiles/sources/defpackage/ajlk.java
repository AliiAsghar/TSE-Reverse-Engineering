package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ajlk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ((TextInputLayout) this.a).p.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                return;
                            } else {
                                ((TabLayout) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                                return;
                            }
                        }
                        ((BaseTransientBottomBar) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        return;
                    }
                    ((BaseTransientBottomBar) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((BaseTransientBottomBar) this.a).j.setScaleX(floatValue);
                ((BaseTransientBottomBar) this.a).j.setScaleY(floatValue);
                return;
            }
            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ajkm ajkmVar = ((BottomSheetBehavior) this.a).d;
            if (ajkmVar != null) {
                ajkmVar.K(floatValue2);
                return;
            }
            return;
        }
        ((BaseTransientBottomBar) this.a).j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
