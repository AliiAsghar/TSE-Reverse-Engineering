package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mj extends AnimatorListenerAdapter {
    final /* synthetic */ mk a;
    private boolean b = false;

    public mj(mk mkVar) {
        this.a = mkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        if (((Float) this.a.p.getAnimatedValue()).floatValue() == brg.a) {
            mk mkVar = this.a;
            mkVar.q = 0;
            mkVar.g(0);
        } else {
            mk mkVar2 = this.a;
            mkVar2.q = 2;
            mkVar2.f();
        }
    }
}
