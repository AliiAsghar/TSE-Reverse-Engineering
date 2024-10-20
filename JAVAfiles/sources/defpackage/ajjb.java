package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajjb extends AnimatorListenerAdapter {
    final /* synthetic */ ajjf a;

    public ajjb(ajjf ajjfVar) {
        this.a = ajjfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        ajjf ajjfVar = this.a;
        int i = ajjfVar.e;
        int length = ajjf.a.length;
        ajjfVar.e = (i + 4) % ajjfVar.d.c.length;
    }
}
