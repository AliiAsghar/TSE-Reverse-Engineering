package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajlj extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ BaseTransientBottomBar b;

    public ajlj(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.a = i;
        this.b = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.o();
    }
}
