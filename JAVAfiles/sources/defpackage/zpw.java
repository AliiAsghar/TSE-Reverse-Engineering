package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpw extends zqc {
    final /* synthetic */ zqd a;

    public zpw(zqd zqdVar) {
        this.a = zqdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        this.a.c();
    }
}
