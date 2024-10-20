package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyk extends AnimatorListenerAdapter {
    final /* synthetic */ kyl a;

    public kyk(kyl kylVar) {
        this.a = kylVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kyl kylVar = this.a;
        kylVar.s.setVisibility(8);
        kylVar.t.setVisibility(0);
        kylVar.t.i(-1);
        kylVar.t.c();
    }
}
