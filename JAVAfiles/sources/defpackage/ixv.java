package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixv extends AnimatorListenerAdapter {
    final /* synthetic */ iyc a;
    private final arqg b;
    private final arqg c;

    public ixv(iyc iycVar, arqg arqgVar, arqg arqgVar2) {
        this.a = iycVar;
        this.b = arqgVar;
        this.c = arqgVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.h = null;
        this.c.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        Animator animator2 = this.a.h;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.a.h = animator;
        this.b.a();
    }
}
