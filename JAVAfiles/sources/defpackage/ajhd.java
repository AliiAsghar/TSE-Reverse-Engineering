package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajhd extends AnimatorListenerAdapter {
    final /* synthetic */ ajhn a;
    private boolean b;

    public ajhd(ajhn ajhnVar) {
        this.a = ajhnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ajhn ajhnVar = this.a;
        ajhnVar.A = 0;
        ajhnVar.v = null;
        if (!this.b) {
            ajhnVar.B.g(4, false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.g(0, false);
        ajhn ajhnVar = this.a;
        ajhnVar.A = 1;
        ajhnVar.v = animator;
        this.b = false;
    }
}
