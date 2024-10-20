package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsf extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public zsf(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
    }
}
