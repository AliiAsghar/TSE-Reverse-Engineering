package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajiq extends AnimatorListenerAdapter {
    final /* synthetic */ ajil a;

    public ajiq(ajil ajilVar) {
        this.a = ajilVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.setTranslationY(brg.a);
        this.a.b(brg.a);
    }
}
