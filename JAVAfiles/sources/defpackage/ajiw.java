package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajiw extends AnimatorListenerAdapter {
    final /* synthetic */ ajja a;

    public ajiw(ajja ajjaVar) {
        this.a = ajjaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        ajja ajjaVar = this.a;
        ajjaVar.f = (ajjaVar.f + 4) % ajjaVar.e.c.length;
    }
}
