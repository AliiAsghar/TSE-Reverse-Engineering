package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpz extends zqc {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ zqd b;

    public zpz(zqd zqdVar, ValueAnimator valueAnimator) {
        this.a = valueAnimator;
        this.b = zqdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c) {
            return;
        }
        zqd zqdVar = this.b;
        zqdVar.h = zqdVar.a();
        zqd zqdVar2 = this.b;
        int i = zqd.a[zqdVar2.h];
        zqdVar2.i = i;
        this.a.setObjectValues(Integer.valueOf(i), Integer.valueOf(zqd.a[this.b.a()]));
    }
}
