package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eew extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ mka b;

    public eew(mka mkaVar, View view) {
        this.b = mkaVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.j(1.0f);
        eez.d(this.a, this.b);
    }
}
