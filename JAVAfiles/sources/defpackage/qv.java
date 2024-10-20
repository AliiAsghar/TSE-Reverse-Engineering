package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qv implements Animator.AnimatorListener {
    final float d;
    final float e;
    final float f;
    final float g;
    public final oo h;
    public final int i;
    final ValueAnimator j;
    boolean k;
    public float l;
    public float m;
    boolean n = false;
    boolean o = false;
    public float p;

    public qv(oo ooVar, int i, float f, float f2, float f3, float f4) {
        this.i = i;
        this.h = ooVar;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new qu(this, 0));
        ofFloat.setTarget(ooVar.a);
        ofFloat.addListener(this);
        this.p = brg.a;
    }

    public final void a() {
        this.j.cancel();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.p = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.o) {
            this.h.n(true);
        }
        this.o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
