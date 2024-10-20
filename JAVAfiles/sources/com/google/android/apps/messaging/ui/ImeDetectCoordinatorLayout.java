package com.google.android.apps.messaging.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import defpackage.aqws;
import defpackage.xze;
import defpackage.zgi;
import defpackage.zgl;
import defpackage.znj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ImeDetectCoordinatorLayout extends zgi {
    private static final xze k = xze.g("Bugle", "ImeDetectCoordinatorLayout");
    public znj i;
    public aqws j;
    private zgl l;
    private ViewTreeObserver m;

    public ImeDetectCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Window window = activity.getWindow();
            if (window == null) {
                k.m("Activity does not have a window");
                return;
            }
            View decorView = window.getDecorView();
            if (decorView == null) {
                k.m("Window does not have a decor view");
                return;
            }
            ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
            this.m = viewTreeObserver;
            if (viewTreeObserver == null) {
                k.m("Decor View does not have a ViewTreeObserver");
            }
            zgl a = this.i.a(activity, decorView, this.j.a);
            this.l = a;
            this.m.addOnGlobalLayoutListener(a);
            return;
        }
        k.m("has to be in an activity to listen IME height changes");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        zgl zglVar = this.l;
        if (zglVar != null && (viewTreeObserver = this.m) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(zglVar);
        } else {
            k.m("cannot remove OnGlobalLayoutListener");
        }
    }
}
