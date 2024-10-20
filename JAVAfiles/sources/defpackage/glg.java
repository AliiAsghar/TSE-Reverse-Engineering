package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glg extends AnimatorListenerAdapter {
    final /* synthetic */ tm a;
    final /* synthetic */ glm b;

    public glg(glm glmVar, tm tmVar) {
        this.b = glmVar;
        this.a = tmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.j.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.j.add(animator);
    }
}
