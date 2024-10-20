package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fys extends AnimatorListenerAdapter {
    final /* synthetic */ fyu a;

    public fys(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroup = this.a.h;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            this.a.h.setTranslationX(r3.getWidth());
            ViewGroup viewGroup2 = this.a.h;
            viewGroup2.scrollTo(viewGroup2.getWidth(), 0);
        }
    }
}
