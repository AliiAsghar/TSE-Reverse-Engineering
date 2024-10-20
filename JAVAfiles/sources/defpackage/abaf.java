package defpackage;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abaf extends abad {
    public ykw a;
    private RcsSuccessView b;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.h("boew_promo_complete", true);
        View inflate = layoutInflater.inflate(R.layout.rcs_success_fragment, viewGroup, false);
        RcsSuccessView rcsSuccessView = (RcsSuccessView) inflate.findViewById(R.id.rcs_success);
        this.b = rcsSuccessView;
        rcsSuccessView.a.addListener(new abae(this));
        return inflate;
    }

    @Override // defpackage.cg
    public final void ad() {
        super.ad();
        this.b.a.pause();
    }

    @Override // defpackage.cg
    public final void af() {
        super.af();
        this.b.a.resume();
    }

    @Override // defpackage.cg
    public final void k() {
        super.k();
        AnimatorSet animatorSet = this.b.a;
        if (!animatorSet.isPaused()) {
            animatorSet.start();
        }
    }
}
