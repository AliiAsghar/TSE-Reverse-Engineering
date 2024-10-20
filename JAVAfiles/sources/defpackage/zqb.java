package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqb extends AnimatorListenerAdapter {
    final /* synthetic */ zqd a;

    public zqb(zqd zqdVar) {
        this.a = zqdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.start();
    }
}
