package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqa extends zqc {
    final /* synthetic */ zqd a;

    public zqa(zqd zqdVar) {
        this.a = zqdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        this.a.f = brg.a;
    }
}
