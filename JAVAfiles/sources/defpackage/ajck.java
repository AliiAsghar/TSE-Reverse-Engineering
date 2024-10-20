package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajck implements ajci {
    private final /* synthetic */ int c;
    public static final ajck b = new ajck(1);
    public static final ajck a = new ajck(0);

    private ajck(int i) {
        this.c = i;
    }

    @Override // defpackage.ajci
    public final int a() {
        if (this.c != 0) {
            return R.raw.swatchie__ghost_loading_intro;
        }
        return R.raw.swatchie__ghost_loading_loop;
    }

    @Override // defpackage.ajci
    public final Collection b() {
        if (this.c != 0) {
            return a.aN();
        }
        return a.aN();
    }

    @Override // defpackage.ajci
    public final /* synthetic */ Set c() {
        if (this.c != 0) {
            return arnx.a;
        }
        return arnx.a;
    }

    @Override // defpackage.ajci
    public final /* synthetic */ ajcj d(Context context) {
        if (this.c != 0) {
            return ahnz.A(this, context);
        }
        return ahnz.A(this, context);
    }

    @Override // defpackage.ajci
    public final /* synthetic */ void e(LottieAnimationView lottieAnimationView) {
        if (this.c != 0) {
            ahnz.E(this, lottieAnimationView);
        } else {
            ahnz.E(this, lottieAnimationView);
        }
    }

    @Override // defpackage.ajci
    public final /* synthetic */ hbt f(LottieAnimationView lottieAnimationView, ajcj ajcjVar) {
        if (this.c != 0) {
            return ahnz.C(this, lottieAnimationView, ajcjVar);
        }
        return ahnz.C(this, lottieAnimationView, ajcjVar);
    }

    @Override // defpackage.ajci
    public final /* synthetic */ void g(LottieAnimationView lottieAnimationView, ajcj ajcjVar) {
        if (this.c != 0) {
            ahnz.D(this, lottieAnimationView, ajcjVar);
        } else {
            ahnz.D(this, lottieAnimationView, ajcjVar);
        }
    }
}
