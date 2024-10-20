package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajmo extends AnimatorListenerAdapter {
    final /* synthetic */ ajmq a;

    public ajmo(ajmq ajmqVar) {
        this.a = ajmqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.l(true);
    }
}
