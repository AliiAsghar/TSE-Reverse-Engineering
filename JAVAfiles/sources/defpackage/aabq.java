package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabq extends aabx {
    private Animator a;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.emoji_empty_fragment, viewGroup, false);
    }

    @Override // defpackage.cg
    public final void i() {
        super.i();
        Animator animator = this.a;
        if (animator != null) {
            animator.removeAllListeners();
            this.a.end();
            this.a = null;
        }
    }

    @Override // defpackage.cg
    public final Animator w(int i, boolean z, int i2) {
        if (z) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(fe(), android.R.animator.fade_in);
            this.a = loadAnimator;
            loadAnimator.setDuration(fe().getResources().getInteger(R.integer.emoji_gallery_animation_time_millis));
            this.a.addListener(new aach(this, 1));
        } else {
            this.a = null;
        }
        return this.a;
    }
}
