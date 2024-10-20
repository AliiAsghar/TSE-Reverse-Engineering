package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gle extends AnimatorListenerAdapter implements glj {
    private final View a;
    private boolean b = false;

    public gle(View view) {
        this.a = view;
    }

    @Override // defpackage.glj
    public final void c() {
        float f;
        if (this.a.getVisibility() == 0) {
            f = gma.a(this.a);
        } else {
            f = brg.a;
        }
        this.a.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // defpackage.glj
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.glj
    public final /* synthetic */ void f(glm glmVar) {
        gvf.aY(this, glmVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        gma.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        gma.c(this.a, 1.0f);
    }

    @Override // defpackage.glj
    public final void a(glm glmVar) {
    }

    @Override // defpackage.glj
    public final void b(glm glmVar) {
    }

    @Override // defpackage.glj
    public final void e(glm glmVar) {
    }

    @Override // defpackage.glj
    public final void g(glm glmVar) {
    }
}
