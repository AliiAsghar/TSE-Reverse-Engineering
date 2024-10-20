package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajhm extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ ajhn b;
    private float c;
    private float d;

    public ajhm(ajhn ajhnVar) {
        this.b = ajhnVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.l((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float s;
        if (!this.a) {
            ajkm ajkmVar = this.b.m;
            if (ajkmVar == null) {
                s = brg.a;
            } else {
                s = ajkmVar.s();
            }
            this.c = s;
            this.d = a();
            this.a = true;
        }
        ajhn ajhnVar = this.b;
        float f = this.c;
        ajhnVar.l((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
