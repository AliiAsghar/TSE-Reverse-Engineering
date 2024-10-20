package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajhe extends AnimatorListenerAdapter {
    final /* synthetic */ ajhn a;

    public ajhe(ajhn ajhnVar) {
        this.a = ajhnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ajhn ajhnVar = this.a;
        ajhnVar.A = 0;
        ajhnVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.g(0, false);
        ajhn ajhnVar = this.a;
        ajhnVar.A = 2;
        ajhnVar.v = animator;
    }
}
