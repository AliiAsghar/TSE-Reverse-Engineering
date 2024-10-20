package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajjc extends AnimatorListenerAdapter {
    final /* synthetic */ ajjf a;

    public ajjc(ajjf ajjfVar) {
        this.a = ajjfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        ajjf ajjfVar = this.a;
        gmm gmmVar = ajjfVar.h;
        if (gmmVar != null) {
            gmmVar.b(ajjfVar.j);
        }
    }
}
