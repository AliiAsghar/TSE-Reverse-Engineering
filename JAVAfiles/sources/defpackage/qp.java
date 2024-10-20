package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qp extends qv {
    final /* synthetic */ int a;
    final /* synthetic */ oo b;
    final /* synthetic */ qx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(qx qxVar, oo ooVar, int i, float f, float f2, float f3, float f4, int i2, oo ooVar2) {
        super(ooVar, i, f, f2, f3, f4);
        this.c = qxVar;
        this.a = i2;
        this.b = ooVar2;
    }

    @Override // defpackage.qv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.n) {
            if (this.a <= 0) {
                qx qxVar = this.c;
                qxVar.j.l(this.b);
            } else {
                this.c.a.add(this.b.a);
                this.k = true;
                int i = this.a;
                if (i > 0) {
                    qx qxVar2 = this.c;
                    qxVar2.m.post(new qq(qxVar2, this, i, 0));
                }
            }
            qx qxVar3 = this.c;
            oo ooVar = this.b;
            View view = qxVar3.p;
            View view2 = ooVar.a;
            if (view == view2) {
                qxVar3.ab(view2);
            }
        }
    }
}
