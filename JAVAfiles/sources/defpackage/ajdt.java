package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajdt {
    public static final int[] a = {R.attr.stateListAnimator};

    public static void a(View view, float f) {
        int integer = view.getResources().getInteger(com.google.android.apps.messaging.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.google.android.apps.messaging.R.attr.state_liftable, -2130970290}, ObjectAnimator.ofFloat(view, "elevation", brg.a).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", brg.a).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
