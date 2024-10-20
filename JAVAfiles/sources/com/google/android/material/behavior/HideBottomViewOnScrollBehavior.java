package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.ajdd;
import defpackage.ajdu;
import defpackage.ajdv;
import defpackage.ajgk;
import defpackage.dxt;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends dxt<V> {
    public ViewPropertyAnimator a;
    private final LinkedHashSet b;
    private int c;
    private int d;
    private TimeInterpolator e;
    private TimeInterpolator f;
    private int g;
    private int h;

    public HideBottomViewOnScrollBehavior() {
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }

    private final void L(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ajdu(this));
    }

    private final void M(int i) {
        this.h = i;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajdv) it.next()).a();
        }
    }

    @Override // defpackage.dxt
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.g = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.c = ajgk.g(view.getContext(), R.attr.motionDurationLong2, 225);
        this.d = ajgk.g(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.e = ajgk.l(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, ajdd.d);
        this.f = ajgk.l(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, ajdd.c);
        return false;
    }

    @Override // defpackage.dxt
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.h != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                M(1);
                L(view, this.g, this.d, this.f);
                return;
            }
            return;
        }
        if (i < 0 && this.h != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            M(2);
            L(view, 0, this.c, this.e);
        }
    }

    @Override // defpackage.dxt
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }
}
