package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsg {
    public AnimatorSet a;
    public View b;
    public final aabr c;
    private AnimatorSet d;
    private AnimatorSet e;
    private ObjectAnimator f;

    public zsg(aabr aabrVar) {
        this.c = aabrVar;
    }

    public final AnimatorSet a(View view, View view2, View view3) {
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            return animatorSet;
        }
        ObjectAnimator aE = aabr.aE(view2, view.getResources().getFraction(R.fraction.audio_button_animation_start_size, 1, 1), view.getResources().getFraction(R.fraction.audio_button_animation_end_size, 1, 1), view.getResources().getInteger(R.integer.audio_button_background_animation_duration_millis));
        aE.setRepeatMode(1);
        aE.setInterpolator(new zrn(view.getResources().getFraction(R.fraction.audio_button_background_zooming_animation_interplator_mid_point, 1, 1), 0));
        ObjectAnimator duration = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view.getResources().getFraction(R.fraction.audio_button_pressed_indicator_alpha, 1, 1), brg.a).setDuration(view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_duration_millis));
        duration.setRepeatCount(-1);
        duration.setStartDelay(view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_delay_millis));
        ObjectAnimator aE2 = aabr.aE(view3, view.getResources().getFraction(R.fraction.audio_button_pressed_indicator_animation_start_size, 1, 1), view.getResources().getFraction(R.fraction.audio_button_pressed_indicator_animation_end_size, 1, 1), view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_duration_millis));
        aE2.setRepeatMode(1);
        aE2.setStartDelay(view.getResources().getInteger(R.integer.audio_button_pressed_indicator_animation_delay_millis));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) zsc.a, 1.0f, view.getResources().getFraction(R.fraction.audio_button_animation_start_size, 1, 1)).setDuration(view.getResources().getInteger(R.integer.audio_button_background_transition_animation_duration_millis));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.play(aE).with(duration).with(aE2).after(duration2);
        return this.e;
    }

    public final AnimatorSet b(View view, View view2) {
        if (this.d == null) {
            ObjectAnimator aE = aabr.aE(view2, this.b.getResources().getFraction(R.fraction.audio_timer_dot_zooming_animation_min_scale, 1, 1), this.b.getResources().getFraction(R.fraction.audio_timer_dot_zooming_animation_max_scale, 1, 1), this.b.getResources().getInteger(R.integer.audio_timer_dot_zooming_animation_duration_millis));
            aE.setInterpolator(new zrn(this.b.getResources().getFraction(R.fraction.audio_timer_dot_zooming_animation_interplator_shift, 1, 1), 1));
            ObjectAnimator aD = aabr.aD(view, false, this.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            ObjectAnimator aD2 = aabr.aD(view2, false, this.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            AnimatorSet animatorSet = new AnimatorSet();
            this.d = animatorSet;
            animatorSet.addListener(new zse(view, view2));
            this.d.play(aD).with(aD2).before(aE);
        }
        return this.d;
    }

    public final ObjectAnimator c(View view) {
        if (this.f == null) {
            this.f = aabr.aD(view, false, this.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
        }
        return this.f;
    }
}
