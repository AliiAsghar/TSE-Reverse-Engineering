package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yag implements Animation.AnimationListener {
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ Runnable c;

    public yag(int i, View view, Runnable runnable) {
        this.a = i;
        this.b = view;
        this.c = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Runnable runnable = this.c;
        if (runnable != null) {
            xzw.a.post(runnable);
        }
        int i = this.a;
        if (i != 0) {
            this.b.setVisibility(i);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.a == 0) {
            this.b.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
