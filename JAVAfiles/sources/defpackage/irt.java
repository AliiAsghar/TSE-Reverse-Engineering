package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class irt extends AnimatorListenerAdapter {
    final /* synthetic */ oo a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ irw d;

    public irt(irw irwVar, oo ooVar, Runnable runnable, Runnable runnable2) {
        this.a = ooVar;
        this.b = runnable;
        this.c = runnable2;
        this.d = irwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.removeListener(this);
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.d.e(this.a);
        this.b.run();
        this.d.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
