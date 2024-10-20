package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yae extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ Runnable c;

    public yae(int i, View view, Runnable runnable) {
        this.a = i;
        this.b = view;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
        int i = this.a;
        if (i != 0) {
            this.b.setVisibility(i);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a == 0) {
            this.b.setVisibility(0);
        }
    }
}
