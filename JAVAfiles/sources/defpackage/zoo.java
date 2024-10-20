package defpackage;

import android.animation.Animator;
import android.animation.LayoutTransition;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoo implements Animator.AnimatorListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ zop c;

    public zoo(zop zopVar, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = zopVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i;
        zxa zxaVar = this.c.f;
        if (zxaVar != null) {
            zxaVar.ay(false);
        }
        zop zopVar = this.c;
        if (zopVar.b.getHeight() == 0) {
            i = 5;
        } else {
            i = 3;
        }
        zopVar.y = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zxa zxaVar = this.c.f;
        if (zxaVar != null) {
            zxaVar.ay(false);
        }
        if (this.a == 0) {
            zop zopVar = this.c;
            zopVar.y = 5;
            zopVar.q.setVisibility(8);
        } else {
            zop zopVar2 = this.c;
            zopVar2.y = 3;
            zopVar2.b.setLayoutTransition(zopVar2.c);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zxa zxaVar = this.c.f;
        if (zxaVar != null) {
            zxaVar.ay(true);
            zop zopVar = this.c;
            int i = this.a;
            int i2 = this.b;
            ird irdVar = ((ixd) zopVar.f).bX.aq;
            irdVar.k(irdVar.e.d + (i - i2));
        }
        if (this.a > 0) {
            this.c.q.setVisibility(0);
        }
        LayoutTransition layoutTransition = this.c.b.getLayoutTransition();
        if (layoutTransition != null) {
            Animator animator2 = layoutTransition.getAnimator(0);
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = layoutTransition.getAnimator(1);
            if (animator3 != null) {
                animator3.cancel();
            }
            this.c.b.setLayoutTransition(null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
