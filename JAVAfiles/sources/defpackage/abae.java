package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abae extends AnimatorListenerAdapter {
    final /* synthetic */ abaf a;

    public abae(abaf abafVar) {
        this.a = abafVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        cj fe = this.a.fe();
        if (fe != null && !fe.isFinishing()) {
            fe.finish();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cj fe = this.a.fe();
        if (fe != null && !fe.isFinishing()) {
            fe.finish();
        }
    }
}
