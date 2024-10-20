package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmg extends AnimatorListenerAdapter implements glj {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public gmg(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            gma.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (this.e && this.f != z && (viewGroup = this.d) != null) {
            this.f = z;
            glx.a(viewGroup, z);
        }
    }

    @Override // defpackage.glj
    public final void b(glm glmVar) {
        glmVar.C(this);
    }

    @Override // defpackage.glj
    public final void c() {
        i(false);
        if (!this.a) {
            gma.d(this.b, this.c);
        }
    }

    @Override // defpackage.glj
    public final void d() {
        i(true);
        if (!this.a) {
            gma.d(this.b, 0);
        }
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
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            gma.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.glj
    public final void a(glm glmVar) {
    }

    @Override // defpackage.glj
    public final void e(glm glmVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
