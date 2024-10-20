package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessView;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ztg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ztg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int f;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        switch (this.b) {
            case 0:
                alwo alwoVar = ztr.a;
                ((ztq) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                alwo alwoVar2 = ztr.a;
                ((ztq) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                int i5 = zwe.a;
                ((CardView) this.a).gb(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MiniCameraViewImpl miniCameraViewImpl = (MiniCameraViewImpl) this.a;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) miniCameraViewImpl.getLayoutParams();
                if (floatValue == brg.a) {
                    f = -1;
                } else {
                    f = MiniCameraViewImpl.f(miniCameraViewImpl.y, miniCameraViewImpl.s, floatValue);
                }
                layoutParams.height = f;
                miniCameraViewImpl.setLayoutParams(layoutParams);
                miniCameraViewImpl.r.setCornerRadius(MiniCameraViewImpl.f(miniCameraViewImpl.t, miniCameraViewImpl.s / 2, floatValue));
                ImageView imageView = miniCameraViewImpl.p;
                if (floatValue == brg.a) {
                    i4 = 4;
                }
                imageView.setVisibility(i4);
                miniCameraViewImpl.p.setAlpha(floatValue);
                miniCameraViewImpl.setTranslationZ(miniCameraViewImpl.v * floatValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MiniCameraViewImpl miniCameraViewImpl2 = (MiniCameraViewImpl) this.a;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) miniCameraViewImpl2.getLayoutParams();
                int i6 = miniCameraViewImpl2.x;
                int i7 = miniCameraViewImpl2.u;
                layoutParams2.width = MiniCameraViewImpl.f(i6 + i7 + i7, miniCameraViewImpl2.s, floatValue2);
                miniCameraViewImpl2.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) miniCameraViewImpl2.k.getLayoutParams();
                int i8 = -2;
                if (floatValue2 == brg.a) {
                    i = -2;
                } else {
                    i = miniCameraViewImpl2.x;
                }
                layoutParams3.width = i;
                if (floatValue2 != brg.a) {
                    i8 = (int) (miniCameraViewImpl2.x * miniCameraViewImpl2.gk());
                }
                layoutParams3.height = i8;
                miniCameraViewImpl2.k.setLayoutParams(layoutParams3);
                float min = Math.min(1.0f, floatValue2 / 0.625f);
                float f2 = 1.0f - min;
                if (min == 1.0f) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                if (miniCameraViewImpl2.z) {
                    miniCameraViewImpl2.l.setAlpha(f2);
                    miniCameraViewImpl2.l.setVisibility(i2);
                    miniCameraViewImpl2.m.setAlpha(f2);
                    View view = miniCameraViewImpl2.m;
                    if (miniCameraViewImpl2.A && i2 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 4;
                    }
                    view.setVisibility(i3);
                    miniCameraViewImpl2.n.setAlpha(f2);
                    miniCameraViewImpl2.n.setVisibility(i2);
                    miniCameraViewImpl2.o.setAlpha(0.8f * min);
                    View view2 = miniCameraViewImpl2.o;
                    if (min == brg.a) {
                        i4 = 4;
                    }
                    view2.setVisibility(i4);
                    return;
                }
                miniCameraViewImpl2.q.setAlpha(f2);
                miniCameraViewImpl2.q.setVisibility(i2);
                return;
            case 5:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RcsSuccessView rcsSuccessView = (RcsSuccessView) this.a;
                rcsSuccessView.c = intValue;
                rcsSuccessView.b = ((intValue * 90) / 360) + 180;
                rcsSuccessView.invalidate();
                return;
            case 6:
                abac abacVar = ((RcsSuccessView) this.a).d;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ((Path) abacVar.a).reset();
                ((PathMeasure) abacVar.b).getSegment(brg.a, ((PathMeasure) abacVar.b).getLength() * animatedFraction, (Path) abacVar.a, true);
                ((Path) abacVar.a).rLineTo(brg.a, brg.a);
                ((RcsSuccessView) this.a).invalidate();
                return;
            case 7:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                ((afpr) this.a).f(((Float) animatedValue).floatValue());
                return;
            case 8:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                ((afpr) this.a).f(((Float) animatedValue2).floatValue());
                return;
            case 9:
                valueAnimator.getClass();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                float floatValue3 = ((Float) animatedValue3).floatValue();
                ((afwk) this.a).c(floatValue3, (-floatValue3) * ((TabLayout) r2.b.i).getTop(), true);
                return;
            case 10:
                valueAnimator.getClass();
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                Integer num = (Integer) animatedValue4;
                num.intValue();
                agdu agduVar = (agdu) this.a;
                agduVar.e.b.a(num);
                agduVar.d.a();
                return;
            case 11:
                ((SurveyPromptActivity) this.a).s.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((SurveyPromptActivity) this.a).s.requestLayout();
                return;
            case 12:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ajev ajevVar = (ajev) this.a;
                ajevVar.k.setAlpha((int) (255.0f * floatValue4));
                ajevVar.t = floatValue4;
                return;
            case 13:
                ajjj ajjjVar = (ajjj) this.a;
                ajjjVar.b.e = ajjjVar.e.getInterpolation(ajjjVar.d.getAnimatedFraction());
                return;
            case 14:
                ((ajmq) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ajmq ajmqVar = (ajmq) this.a;
                ajmqVar.h.setScaleX(floatValue5);
                ajmqVar.h.setScaleY(floatValue5);
                return;
            default:
                ((ajmy) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public ztg(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
