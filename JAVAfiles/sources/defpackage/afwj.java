package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwj extends AnimatorListenerAdapter {
    final /* synthetic */ afwk a;

    public afwj(afwk afwkVar) {
        this.a = afwkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        super.onAnimationEnd(animator);
        afwk afwkVar = this.a;
        afwkVar.f = true;
        afwkVar.d.a();
    }
}
