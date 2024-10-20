package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyl extends oo {
    public final LottieAnimationView s;
    public final LottieAnimationView t;

    private kyl(View view) {
        super(view);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.ghost_loading_intro);
        this.s = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view.findViewById(R.id.ghost_loading_loop);
        this.t = lottieAnimationView2;
        ajcj x = ahnz.x(view.getContext());
        ahnz.B(ajck.b, lottieAnimationView, x);
        ahnz.B(ajck.a, lottieAnimationView2, x);
        view.addOnAttachStateChangeListener(new ib(this, 4));
    }

    public static kyl D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new kyl(layoutInflater.inflate(R.layout.conversation_list_loading_item_lottie, viewGroup, false));
    }
}
