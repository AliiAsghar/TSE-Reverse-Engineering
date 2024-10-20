package defpackage;

import android.animation.Animator;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqs implements Animator.AnimatorListener {
    final /* synthetic */ zqu a;

    public zqs(zqu zquVar) {
        this.a = zquVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView = this.a.e;
        imageView.setColorFilter(ahnz.d(imageView, R.attr.colorInactiveComposeIcon));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
