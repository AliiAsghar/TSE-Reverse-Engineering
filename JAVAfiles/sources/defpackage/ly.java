package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ly extends AnimatorListenerAdapter {
    final /* synthetic */ ma a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ pg d;

    public ly(pg pgVar, ma maVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = pgVar;
        this.a = maVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(brg.a);
        this.c.setTranslationY(brg.a);
        this.d.e(this.a.a);
        this.d.l.remove(this.a.a);
        this.d.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        oo ooVar = this.a.a;
    }
}
