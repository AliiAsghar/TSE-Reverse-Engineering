package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyl extends AnimatorListenerAdapter {
    final /* synthetic */ fyu a;

    public fyl(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a.b;
        if (view != null) {
            view.setVisibility(4);
        }
        ViewGroup viewGroup = this.a.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ViewGroup viewGroup2 = this.a.e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fyu fyuVar = this.a;
        View view = fyuVar.j;
        if ((view instanceof fyb) && !fyuVar.t) {
            fyb fybVar = (fyb) view;
            if (fybVar.e.isStarted()) {
                fybVar.e.cancel();
            }
            fybVar.e.setFloatValues(fybVar.f, brg.a);
            fybVar.e.setDuration(250L);
            fybVar.e.start();
        }
    }
}
