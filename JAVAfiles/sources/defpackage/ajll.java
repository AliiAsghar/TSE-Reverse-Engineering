package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajll extends AnimatorListenerAdapter {
    final /* synthetic */ BaseTransientBottomBar a;

    public ajll(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.t;
        snackbarContentLayout.a.setAlpha(brg.a);
        ViewPropertyAnimator alpha = snackbarContentLayout.a.animate().alpha(1.0f);
        int i = baseTransientBottomBar.c;
        long j = i;
        ViewPropertyAnimator interpolator = alpha.setDuration(j).setInterpolator(snackbarContentLayout.c);
        long j2 = baseTransientBottomBar.e - i;
        interpolator.setStartDelay(j2).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(brg.a);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(snackbarContentLayout.c).setStartDelay(j2).start();
        }
    }
}
