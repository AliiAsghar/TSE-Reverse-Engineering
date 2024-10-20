package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ajdw;
import defpackage.asqc;
import defpackage.brg;
import defpackage.dxt;
import defpackage.eek;
import defpackage.efw;
import defpackage.ehj;
import defpackage.ehk;
import defpackage.gog;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends dxt<V> {
    public ehk a;
    public boolean b;
    public asqc f;
    private boolean g;
    public int c = 2;
    public float d = brg.a;
    public float e = 0.5f;
    private final ehj h = new ajdw(this);

    public static float M(float f) {
        return Math.min(Math.max(brg.a, f), 1.0f);
    }

    public boolean L(View view) {
        return true;
    }

    @Override // defpackage.dxt
    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g = false;
            }
        } else {
            z = coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        }
        if (z) {
            if (this.a == null) {
                this.a = ehk.b(coordinatorLayout, this.h);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dxt
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            eek.l(view, 1048576);
            if (L(view)) {
                eek.u(view, efw.h, new gog(this, 2));
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dxt
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (!this.b || motionEvent.getActionMasked() != 3) {
                this.a.e(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
