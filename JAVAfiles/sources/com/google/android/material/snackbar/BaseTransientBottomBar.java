package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.ahnz;
import defpackage.ajdd;
import defpackage.ajgk;
import defpackage.ajgl;
import defpackage.ajig;
import defpackage.ajir;
import defpackage.ajlk;
import defpackage.ajln;
import defpackage.ajlo;
import defpackage.ajlp;
import defpackage.ajlr;
import defpackage.ajlt;
import defpackage.ajlx;
import defpackage.ajly;
import defpackage.aodz;
import defpackage.asqc;
import defpackage.dxv;
import defpackage.edz;
import defpackage.eek;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BaseTransientBottomBar {
    private ajlr A;
    private int C;
    private final AccessibilityManager D;
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final ajlt j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public List s;
    public final SnackbarContentLayout t;
    private final TimeInterpolator z;
    private static final TimeInterpolator v = ajdd.b;
    private static final TimeInterpolator w = ajdd.a;
    private static final TimeInterpolator x = ajdd.d;
    private static final int[] y = {R.attr.snackbarStyle};
    public static final String b = "BaseTransientBottomBar";
    public static final Handler a = new Handler(Looper.getMainLooper(), new ajln());
    public boolean l = false;
    private final Runnable B = new ajir(this, 3);
    public final asqc u = new asqc(this, null);

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final aodz g = new aodz((SwipeDismissBehavior) this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean L(View view) {
            return view instanceof ajlt;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.dxt
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            aodz aodzVar = this.g;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    ajly.a().f((asqc) aodzVar.a);
                }
            } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                ajly.a().e((asqc) aodzVar.a);
            }
            return super.d(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i;
        if (view != null) {
            if (snackbarContentLayout != null) {
                this.h = viewGroup;
                this.t = snackbarContentLayout;
                this.i = context;
                ajig.b(context);
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i = R.layout.mtrl_layout_snackbar;
                } else {
                    i = R.layout.design_layout_snackbar;
                }
                ajlt ajltVar = (ajlt) from.inflate(i, viewGroup, false);
                this.j = ajltVar;
                ajltVar.a = this;
                float f = ajltVar.d;
                if (f != 1.0f) {
                    SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                    snackbarContentLayout2.b.setTextColor(ahnz.g(ahnz.d(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
                }
                ((SnackbarContentLayout) view).d = ajltVar.e;
                ajltVar.addView(view);
                ajltVar.setAccessibilityLiveRegion(1);
                ajltVar.setImportantForAccessibility(1);
                ajltVar.setFitsSystemWindows(true);
                edz.k(ajltVar, new ajlo(this));
                eek.n(ajltVar, new ajlp(this));
                this.D = (AccessibilityManager) context.getSystemService("accessibility");
                this.e = ajgk.g(context, R.attr.motionDurationLong2, 250);
                this.c = ajgk.g(context, R.attr.motionDurationLong2, 150);
                this.d = ajgk.g(context, R.attr.motionDurationMedium1, 75);
                this.z = ajgk.l(context, R.attr.motionEasingEmphasizedInterpolator, w);
                this.g = ajgk.l(context, R.attr.motionEasingEmphasizedInterpolator, x);
                this.f = ajgk.l(context, R.attr.motionEasingEmphasizedInterpolator, v);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public int a() {
        throw null;
    }

    public final int b() {
        ajlt ajltVar = this.j;
        int height = ajltVar.getHeight();
        ViewGroup.LayoutParams layoutParams = ajltVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.z);
        ofFloat.addUpdateListener(new ajlk(this, 0));
        return ofFloat;
    }

    public final View d() {
        ajlr ajlrVar = this.A;
        if (ajlrVar == null) {
            return null;
        }
        return (View) ajlrVar.a.get();
    }

    public final void e() {
        f(3);
    }

    public final void f(int i) {
        ajly a2 = ajly.a();
        Object obj = a2.a;
        asqc asqcVar = this.u;
        synchronized (obj) {
            if (a2.g(asqcVar)) {
                a2.d(a2.c, i);
            } else if (a2.h(asqcVar)) {
                a2.d(a2.d, i);
            }
        }
    }

    public final void g() {
        ajly a2 = ajly.a();
        Object obj = a2.a;
        asqc asqcVar = this.u;
        synchronized (obj) {
            if (a2.g(asqcVar)) {
                a2.b(a2.c);
            }
        }
        List list = this.s;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((ajgl) this.s.get(size)).a(this);
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        int height;
        if (d() == null) {
            height = 0;
        } else {
            int[] iArr = new int[2];
            d().getLocationOnScreen(iArr);
            int i = iArr[1];
            int[] iArr2 = new int[2];
            this.h.getLocationOnScreen(iArr2);
            height = (iArr2[1] + this.h.getHeight()) - i;
        }
        this.C = height;
        k();
    }

    public final void i() {
        ajly a2 = ajly.a();
        Object obj = a2.a;
        int a3 = a();
        asqc asqcVar = this.u;
        synchronized (obj) {
            if (a2.g(asqcVar)) {
                ajlx ajlxVar = a2.c;
                ajlxVar.a = a3;
                a2.b.removeCallbacksAndMessages(ajlxVar);
                a2.b(a2.c);
                return;
            }
            if (a2.h(asqcVar)) {
                a2.d.a = a3;
            } else {
                a2.d = new ajlx(a3, asqcVar);
            }
            ajlx ajlxVar2 = a2.c;
            if (ajlxVar2 != null && a2.d(ajlxVar2, 4)) {
                return;
            }
            a2.c = null;
            a2.c();
        }
    }

    public final void j() {
        if (eek.g(this.j) == null) {
            eek.o(this.j, this.i.getString(R.string.snackbar_accessibility_pane_title));
        }
        if (l()) {
            this.j.post(new ajir(this, 5));
            return;
        }
        if (this.j.getParent() != null) {
            this.j.setVisibility(0);
        }
        g();
    }

    public final void k() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ajlt ajltVar = this.j;
        if (ajltVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (ajltVar.getParent() != null) {
            if (d() != null) {
                i = this.C;
            } else {
                i = this.m;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = this.j.f.bottom + i;
            int i3 = this.j.f.left + this.n;
            int i4 = this.j.f.right + this.o;
            int i5 = this.j.f.top;
            if (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) {
                if (this.q == this.p) {
                    return;
                }
            } else {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.topMargin = i5;
                this.j.requestLayout();
            }
            if (Build.VERSION.SDK_INT >= 29 && this.p > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.j.getLayoutParams();
                if ((layoutParams2 instanceof dxv) && (((dxv) layoutParams2).a instanceof SwipeDismissBehavior)) {
                    this.j.removeCallbacks(this.B);
                    this.j.post(this.B);
                }
            }
        }
    }

    public final boolean l() {
        AccessibilityManager accessibilityManager = this.D;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void m(View view) {
        ajlr ajlrVar;
        ajlr ajlrVar2 = this.A;
        if (ajlrVar2 != null) {
            ajlrVar2.a();
        }
        if (view == null) {
            ajlrVar = null;
        } else {
            ajlr ajlrVar3 = new ajlr(this, view);
            if (view.isAttachedToWindow()) {
                ajgl.j(view, ajlrVar3);
            }
            view.addOnAttachStateChangeListener(ajlrVar3);
            ajlrVar = ajlrVar3;
        }
        this.A = ajlrVar;
    }

    public final void n() {
        this.j.c = 0;
    }

    public final void o() {
        ajly a2 = ajly.a();
        Object obj = a2.a;
        asqc asqcVar = this.u;
        synchronized (obj) {
            if (a2.g(asqcVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.c();
                }
            }
        }
        List list = this.s;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ajgl) this.s.get(size)).b(this);
                }
            }
        }
        ViewParent parent = this.j.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.j);
        }
    }
}
