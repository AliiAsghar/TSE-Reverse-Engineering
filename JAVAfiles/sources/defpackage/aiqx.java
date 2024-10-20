package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqx extends AnimatorListenerAdapter {
    final /* synthetic */ aiqz a;

    public aiqx(aiqz aiqzVar) {
        this.a = aiqzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.d.clearAnimation();
        this.a.f.setVisibility(8);
        this.a.d.setTranslationY(brg.a);
    }
}
