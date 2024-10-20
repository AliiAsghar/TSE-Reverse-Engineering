package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajdy extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior a;

    public ajdy(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.W(5);
        WeakReference weakReference = this.a.A;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.a.A.get()).requestLayout();
        }
    }
}
