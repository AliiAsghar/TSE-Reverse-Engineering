package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmh extends AnimatorListenerAdapter implements glj {
    final /* synthetic */ gmj a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public gmh(gmj gmjVar, ViewGroup viewGroup, View view, View view2) {
        this.a = gmjVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.glj
    public final void a(glm glmVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.glj
    public final void b(glm glmVar) {
        glmVar.C(this);
    }

    @Override // defpackage.glj
    public final /* synthetic */ void f(glm glmVar) {
        gvf.aY(this, glmVar);
    }

    @Override // defpackage.glj
    public final /* synthetic */ void g(glm glmVar) {
        gvf.aZ(this, glmVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.c.getParent() == null) {
            ViewGroup viewGroup = this.b;
            viewGroup.getOverlay().add(this.c);
            return;
        }
        this.a.m();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            this.d.setTag(R.id.save_overlay_view, this.c);
            ViewGroup viewGroup = this.b;
            viewGroup.getOverlay().add(this.c);
            this.e = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.glj
    public final void c() {
    }

    @Override // defpackage.glj
    public final void d() {
    }

    @Override // defpackage.glj
    public final void e(glm glmVar) {
    }
}
