package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glh extends AnimatorListenerAdapter {
    final /* synthetic */ glm a;

    public glh(glm glmVar) {
        this.a = glmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.q();
        animator.removeListener(this);
    }
}
