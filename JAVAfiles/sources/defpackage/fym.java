package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fym extends AnimatorListenerAdapter {
    final /* synthetic */ fyu a;

    public fym(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i;
        View view = this.a.b;
        if (view != null) {
            view.setVisibility(0);
        }
        ViewGroup viewGroup = this.a.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        fyu fyuVar = this.a;
        ViewGroup viewGroup2 = fyuVar.e;
        if (viewGroup2 != null) {
            if (true != fyuVar.t) {
                i = 4;
            } else {
                i = 0;
            }
            viewGroup2.setVisibility(i);
        }
        fyu fyuVar2 = this.a;
        View view2 = fyuVar2.j;
        if ((view2 instanceof fyb) && !fyuVar2.t) {
            fyb fybVar = (fyb) view2;
            if (fybVar.e.isStarted()) {
                fybVar.e.cancel();
            }
            fybVar.g = false;
            fybVar.e.setFloatValues(fybVar.f, 1.0f);
            fybVar.e.setDuration(250L);
            fybVar.e.start();
        }
    }
}
