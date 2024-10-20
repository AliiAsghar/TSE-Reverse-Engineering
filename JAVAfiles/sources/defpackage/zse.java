package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zse extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public zse(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.setVisibility(0);
    }
}
