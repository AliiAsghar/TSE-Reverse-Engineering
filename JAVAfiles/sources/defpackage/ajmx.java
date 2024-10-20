package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajmx extends AnimatorListenerAdapter {
    final /* synthetic */ ajmy a;

    public ajmx(ajmy ajmyVar) {
        this.a = ajmyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.x();
        this.a.d.start();
    }
}
