package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajix extends AnimatorListenerAdapter {
    final /* synthetic */ ajja a;

    public ajix(ajja ajjaVar) {
        this.a = ajjaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        ajja ajjaVar = this.a;
        gmm gmmVar = ajjaVar.i;
        if (gmmVar != null) {
            gmmVar.b(ajjaVar.j);
        }
    }
}
