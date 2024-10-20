package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.agrk;
import defpackage.ahnz;
import defpackage.ajdd;
import defpackage.ajdk;
import defpackage.ajdl;
import defpackage.ajdm;
import defpackage.ajdp;
import defpackage.ajdq;
import defpackage.ajdr;
import defpackage.ajdt;
import defpackage.ajgk;
import defpackage.ajgl;
import defpackage.ajig;
import defpackage.ajjh;
import defpackage.ajki;
import defpackage.ajkm;
import defpackage.ajmi;
import defpackage.ajnr;
import defpackage.brg;
import defpackage.dxs;
import defpackage.dxt;
import defpackage.dxv;
import defpackage.dze;
import defpackage.edc;
import defpackage.edz;
import defpackage.eek;
import defpackage.efo;
import defpackage.ehg;
import defpackage.lbd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AppBarLayout extends LinearLayout implements dxs {
    public boolean a;
    public int b;
    public efo c;
    public boolean d;
    public boolean e;
    public final List f;
    public Drawable g;
    public Integer h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private WeakReference o;
    private final boolean p;
    private ValueAnimator q;
    private ValueAnimator.AnimatorUpdateListener r;
    private final long s;
    private final TimeInterpolator t;
    private int[] u;
    private final float v;
    private Behavior w;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends ajdp<T> {
        public int a;
        private int c;
        private ValueAnimator d;
        private ajdl e;
        private WeakReference f;

        public BaseBehavior() {
        }

        public static final View T(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((dxv) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (eek.a(coordinatorLayout) != null) {
                return;
            }
            eek.n(coordinatorLayout, new ajdk(this, appBarLayout, coordinatorLayout));
        }

        private final void aa(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int e = appBarLayout.e() + appBarLayout.getPaddingTop();
            int N = N() - e;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    View childAt = appBarLayout.getChildAt(i);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    ajdm ajdmVar = (ajdm) childAt.getLayoutParams();
                    if (ab(ajdmVar.a, 32)) {
                        top -= ajdmVar.topMargin;
                        bottom += ajdmVar.bottomMargin;
                    }
                    int i2 = -N;
                    if (top <= i2 && bottom >= i2) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ajdm ajdmVar2 = (ajdm) childAt2.getLayoutParams();
                int i3 = ajdmVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.e();
                    }
                    if (ab(i3, 2)) {
                        i5 += childAt2.getMinimumHeight();
                    } else if (ab(i3, 5)) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (N < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (ab(i3, 32)) {
                        i4 += ajdmVar2.topMargin;
                        i5 -= ajdmVar2.bottomMargin;
                    }
                    if (N < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    ac(coordinatorLayout, appBarLayout, dze.c(i4 + e, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean ab(int i, int i2) {
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        private final void ac(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            float abs = Math.abs(N() - i);
            float abs2 = Math.abs(brg.a);
            if (abs2 > brg.a) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int N = N();
            if (N == i) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.d.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.d = valueAnimator3;
                valueAnimator3.setInterpolator(ajdd.e);
                this.d.addUpdateListener(new ajmi(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration(Math.min(height, 600));
            this.d.setIntValues(N, i);
            this.d.start();
        }

        private static final View ad(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof edc) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void ae(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            List list;
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                list = null;
                if (i3 < childCount) {
                    view = appBarLayout.getChildAt(i3);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i4 = ((ajdm) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.e) {
                z2 = appBarLayout.l(ad(coordinatorLayout));
            }
            boolean n = appBarLayout.n(z2);
            if (!z) {
                if (n) {
                    ArrayList b = coordinatorLayout.h.b(appBarLayout);
                    if (b != null) {
                        list = new ArrayList(b);
                    }
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        dxt dxtVar = ((dxv) ((View) list.get(i5)).getLayoutParams()).a;
                        if (dxtVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) dxtVar).d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // defpackage.ajdp
        public final /* bridge */ /* synthetic */ int L(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.ajdp
        public final /* synthetic */ int M(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.ajdp
        public final int N() {
            return X() + this.a;
        }

        @Override // defpackage.ajdp
        public final /* bridge */ /* synthetic */ int O(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int N = N();
            int i6 = 0;
            if (i2 != 0 && N >= i2 && N <= i3) {
                int c = dze.c(i, i2, i3);
                if (N != c) {
                    if (appBarLayout.a) {
                        int abs = Math.abs(c);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            ajdm ajdmVar = (ajdm) childAt.getLayoutParams();
                            Interpolator interpolator = ajdmVar.b;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i8 = ajdmVar.a;
                                    if ((i8 & 1) != 0) {
                                        i5 = childAt.getHeight() + ajdmVar.topMargin + ajdmVar.bottomMargin;
                                        if ((i8 & 2) != 0) {
                                            i5 -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        i5 = 0;
                                    }
                                    if (childAt.getFitsSystemWindows()) {
                                        i5 -= appBarLayout.e();
                                    }
                                    if (i5 > 0) {
                                        float f = i5;
                                        i4 = Integer.signum(c) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                    }
                                }
                            } else {
                                i7++;
                            }
                        }
                    }
                    i4 = c;
                    boolean Y = Y(i4);
                    int i9 = N - c;
                    this.a = c - i4;
                    int i10 = 1;
                    if (Y) {
                        for (int i11 = 0; i11 < appBarLayout.getChildCount(); i11++) {
                            ajdm ajdmVar2 = (ajdm) appBarLayout.getChildAt(i11).getLayoutParams();
                            agrk agrkVar = ajdmVar2.c;
                            if (agrkVar != null && (ajdmVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                float X = X();
                                Rect rect = (Rect) agrkVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.e());
                                float abs2 = ((Rect) agrkVar.a).top - Math.abs(X);
                                if (abs2 <= brg.a) {
                                    float b = 1.0f - dze.b(Math.abs(abs2 / ((Rect) agrkVar.a).height()), brg.a, 1.0f);
                                    float height = (-abs2) - ((((Rect) agrkVar.a).height() * 0.3f) * (1.0f - (b * b)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect((Rect) agrkVar.b);
                                    ((Rect) agrkVar.b).offset(0, (int) (-height));
                                    if (height >= ((Rect) agrkVar.b).height()) {
                                        childAt2.setAlpha(brg.a);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds((Rect) agrkVar.b);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(brg.a);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.b(appBarLayout);
                    }
                    appBarLayout.h(X());
                    if (c < N) {
                        i10 = -1;
                    }
                    ae(coordinatorLayout, appBarLayout, c, i10, false);
                    i6 = i9;
                }
            } else {
                this.a = 0;
            }
            Z(coordinatorLayout, appBarLayout);
            return i6;
        }

        final ajdl P(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            int X = X();
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + X;
                if (childAt.getTop() + X <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = ehg.c;
                    }
                    ajdl ajdlVar = new ajdl(parcelable);
                    if (X == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ajdlVar.b = z;
                    if (!z && (-X) >= appBarLayout.f()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ajdlVar.a = z2;
                    ajdlVar.e = i;
                    if (bottom == childAt.getMinimumHeight() + appBarLayout.e()) {
                        z3 = true;
                    }
                    ajdlVar.g = z3;
                    ajdlVar.f = bottom / childAt.getHeight();
                    return ajdlVar;
                }
            }
            return null;
        }

        @Override // defpackage.ajdp
        public final /* synthetic */ void Q(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            aa(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.n(appBarLayout.l(ad(coordinatorLayout)));
            }
        }

        final void R(ajdl ajdlVar, boolean z) {
            if (this.e != null && !z) {
                return;
            }
            this.e = ajdlVar;
        }

        @Override // defpackage.ajdp
        public final /* bridge */ /* synthetic */ boolean S(View view) {
            WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            if (view2 != null && view2.isShown() && !view2.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        public final void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.f();
                    i3 = appBarLayout.b() + i2;
                } else {
                    i2 = -appBarLayout.f();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    iArr[1] = V(coordinatorLayout, appBarLayout, i, i4, i5);
                }
            }
            if (appBarLayout.e) {
                appBarLayout.n(appBarLayout.l(view));
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.c == 0 || i == 1) {
                aa(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.n(appBarLayout.l(view2));
                }
            }
            this.f = new WeakReference(view2);
        }

        @Override // defpackage.ajds, defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.e(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            ajdl ajdlVar = this.e;
            if (ajdlVar != null && (i2 & 8) == 0) {
                if (ajdlVar.a) {
                    W(coordinatorLayout, appBarLayout, -appBarLayout.f());
                } else if (ajdlVar.b) {
                    W(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(ajdlVar.e);
                    int i3 = -childAt.getBottom();
                    if (this.e.g) {
                        round = childAt.getMinimumHeight() + appBarLayout.e();
                    } else {
                        round = Math.round(childAt.getHeight() * this.e.f);
                    }
                    W(coordinatorLayout, appBarLayout, i3 + round);
                }
            } else if (i2 != 0) {
                int i4 = i2 & 4;
                if ((i2 & 2) != 0) {
                    int i5 = -appBarLayout.f();
                    if (i4 != 0) {
                        ac(coordinatorLayout, appBarLayout, i5);
                    } else {
                        W(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((i2 & 1) != 0) {
                    if (i4 != 0) {
                        ac(coordinatorLayout, appBarLayout, 0);
                    } else {
                        W(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.b = 0;
            this.e = null;
            Y(dze.c(X(), -appBarLayout.f(), 0));
            ae(coordinatorLayout, appBarLayout, X(), 0, true);
            appBarLayout.h(X());
            Z(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((dxv) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            U(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = V(coordinatorLayout, appBarLayout, i3, -appBarLayout.c(), 0);
            }
            if (i3 == 0) {
                Z(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ void p(View view, Parcelable parcelable) {
            if (parcelable instanceof ajdl) {
                R((ajdl) parcelable, true);
                Parcelable parcelable2 = this.e.d;
            } else {
                this.e = null;
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ Parcelable q(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            ajdl P = P(absSavedState, (AppBarLayout) view);
            if (P == null) {
                return absSavedState;
            }
            return P;
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.e || appBarLayout.d || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class ScrollingViewBehavior extends ajdq {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout O(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.ajdq
        public final float L(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int f = appBarLayout.f();
                int b = appBarLayout.b();
                dxt dxtVar = ((dxv) appBarLayout.getLayoutParams()).a;
                if (dxtVar instanceof BaseBehavior) {
                    i = ((BaseBehavior) dxtVar).N();
                } else {
                    i = 0;
                }
                if ((b == 0 || f + i > b) && (i2 = f - b) != 0) {
                    return (i / i2) + 1.0f;
                }
                return brg.a;
            }
            return brg.a;
        }

        @Override // defpackage.ajdq
        public final int M(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.ajdq
        public final /* bridge */ /* synthetic */ View N(List list) {
            return O(list);
        }

        @Override // defpackage.ajds, defpackage.dxt
        public /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.e(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.dxt
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout O = O(coordinatorLayout.a(view));
            if (O != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    O.j(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.dxt
        public final boolean h(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.dxt
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            dxt dxtVar = ((dxv) view2.getLayoutParams()).a;
            if (dxtVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) dxtVar).a) + this.c) - P(view2);
                int[] iArr = eek.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.e) {
                    appBarLayout.n(appBarLayout.l(view));
                }
            }
        }

        @Override // defpackage.dxt
        public final void j(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                eek.n(coordinatorLayout, null);
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            efo efoVar;
            int i5 = view.getLayoutParams().height;
            if (i5 != -1) {
                if (i5 != -2) {
                    return false;
                }
                i5 = -2;
            }
            View N = N(coordinatorLayout.a(view));
            if (N == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (N.getFitsSystemWindows() && (efoVar = coordinatorLayout.e) != null) {
                    size += efoVar.d() + efoVar.a();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int M = size + M(N);
            int measuredHeight = N.getMeasuredHeight();
            if (R()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(brg.a);
                M -= measuredHeight;
            }
            if (i5 == -1) {
                i4 = 1073741824;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(M, i4));
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajdr.d);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    protected static final ajdm m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new ajdm((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ajdm((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ajdm(layoutParams);
    }

    private final void o() {
        Behavior behavior = this.w;
        ajdl ajdlVar = null;
        if (behavior != null && this.j != -1 && this.b == 0) {
            ajdlVar = behavior.P(ehg.c, this);
        }
        this.j = -1;
        this.k = -1;
        this.l = -1;
        if (ajdlVar != null) {
            this.w.R(ajdlVar, false);
        }
    }

    private final void p(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (true != z) {
            i = 2;
        } else {
            i = 1;
        }
        int i3 = 0;
        if (true != z2) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        int i4 = i | i2;
        if (true == z3) {
            i3 = 8;
        }
        this.b = i4 | i3;
        requestLayout();
    }

    private final void q(float f, float f2) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.q = ofFloat;
        ofFloat.setDuration(this.s);
        this.q.setInterpolator(this.t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.r;
        if (animatorUpdateListener != null) {
            this.q.addUpdateListener(animatorUpdateListener);
        }
        this.q.start();
    }

    private final boolean r() {
        if (this.g != null && e() > 0) {
            return true;
        }
        return false;
    }

    private final boolean s() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dxs
    public final dxt a() {
        Behavior behavior = new Behavior();
        this.w = behavior;
        return behavior;
    }

    public final int b() {
        int i;
        int minimumHeight;
        int i2 = this.k;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                ajdm ajdmVar = (ajdm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ajdmVar.a;
                if ((i4 & 5) == 5) {
                    int i5 = ajdmVar.topMargin + ajdmVar.bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - e());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - e());
                    }
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.k = max;
        return max;
    }

    final int c() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ajdm ajdmVar = (ajdm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ajdmVar.topMargin + ajdmVar.bottomMargin;
                int i4 = ajdmVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.l = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ajdm;
    }

    public final int d() {
        int e = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount > 0) {
                minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return minimumHeight + minimumHeight + e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int save = canvas.save();
            canvas.translate(brg.a, -this.i);
            this.g.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.g;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        efo efoVar = this.c;
        if (efoVar != null) {
            return efoVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ajdm ajdmVar = (ajdm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ajdmVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ajdmVar.topMargin + ajdmVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        i3 -= e();
                    }
                    i2 = 0;
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.j = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ajdm generateLayoutParams(AttributeSet attributeSet) {
        return new ajdm(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ajdm();
    }

    final void h(int i) {
        this.i = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
    }

    public final void i(boolean z) {
        j(z, isLaidOut());
    }

    public final void j(boolean z, boolean z2) {
        p(z, z2, true);
    }

    public final void k() {
        setWillNotDraw(!r());
    }

    final boolean l(View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.o == null && (i = this.n) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (view2 != null) {
                this.o = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view == null) {
            return false;
        }
        if (!view.canScrollVertically(-1) && view.getScrollY() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean n(boolean z) {
        float f;
        float f2;
        if (this.d != z) {
            this.d = z;
            refreshDrawableState();
            if (getBackground() instanceof ajkm) {
                boolean z2 = this.p;
                float f3 = brg.a;
                if (z2) {
                    if (true != z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (true == z) {
                        f3 = 1.0f;
                    }
                    q(f2, f3);
                } else if (this.e) {
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = this.v;
                    }
                    if (z) {
                        f3 = this.v;
                    }
                    q(f, f3);
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajgl.q(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int i2;
        boolean z;
        int i3;
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.m;
        if (true != z2) {
            i2 = -2130970289;
        } else {
            i2 = R.attr.state_liftable;
        }
        boolean z3 = false;
        iArr[0] = i2;
        int i4 = -2130970290;
        if (z2) {
            if (this.d) {
                i4 = R.attr.state_lifted;
            }
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i4;
        if (true != z3) {
            i3 = R.attr.state_collapsible;
        } else {
            i3 = -2130970285;
        }
        iArr[2] = i3;
        int i5 = -2130970284;
        if (z && this.d) {
            i5 = R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            boolean r2 = r1.getFitsSystemWindows()
            if (r2 == 0) goto L25
            boolean r2 = r1.s()
            if (r2 == 0) goto L25
            int r2 = r1.e()
            int r3 = r1.getChildCount()
        L17:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L25
            android.view.View r4 = r1.getChildAt(r3)
            int[] r5 = defpackage.eek.a
            r4.offsetTopAndBottom(r2)
            goto L17
        L25:
            r1.o()
            r2 = 0
            r1.a = r2
            int r3 = r1.getChildCount()
            r4 = r2
        L30:
            r5 = 1
            if (r4 >= r3) goto L47
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            ajdm r6 = (defpackage.ajdm) r6
            android.view.animation.Interpolator r6 = r6.b
            if (r6 == 0) goto L44
            r1.a = r5
            goto L47
        L44:
            int r4 = r4 + 1
            goto L30
        L47:
            android.graphics.drawable.Drawable r3 = r1.g
            if (r3 == 0) goto L56
            int r4 = r1.getWidth()
            int r6 = r1.e()
            r3.setBounds(r2, r2, r4, r6)
        L56:
            boolean r3 = r1.e
            if (r3 != 0) goto L79
            int r3 = r1.getChildCount()
            r4 = r2
        L5f:
            if (r4 >= r3) goto L7a
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            ajdm r6 = (defpackage.ajdm) r6
            int r6 = r6.a
            r0 = r6 & 1
            if (r0 != r5) goto L76
            r6 = r6 & 10
            if (r6 == 0) goto L76
            goto L79
        L76:
            int r4 = r4 + 1
            goto L5f
        L79:
            r2 = r5
        L7a:
            boolean r3 = r1.m
            if (r3 == r2) goto L83
            r1.m = r2
            r1.refreshDrawableState()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += e();
                }
            } else {
                measuredHeight = dze.c(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ajgl.p(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        Drawable drawable = this.g;
        if (drawable != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.g) {
            return false;
        }
        return true;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new ajdm();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.b = 0;
        this.f = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = ajdt.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = ajdt.a;
        Context context3 = getContext();
        TypedArray a = ajig.a(context3, attributeSet, ajdt.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = ajig.a(context2, attributeSet, ajdr.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            setBackground(a2.getDrawable(0));
            final ColorStateList e = ajki.e(context2, a2, 6);
            this.p = e != null;
            final ColorStateList d = ajgl.d(getBackground());
            if (d != null) {
                final ajkm ajkmVar = new ajkm();
                ajkmVar.J(d);
                if (e != null) {
                    final Integer h = ahnz.h(getContext(), R.attr.colorSurface);
                    this.r = new ValueAnimator.AnimatorUpdateListener() { // from class: ajdj
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num;
                            int g = ahnz.g(d.getDefaultColor(), e.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                            ColorStateList valueOf = ColorStateList.valueOf(g);
                            ajkm ajkmVar2 = ajkmVar;
                            ajkmVar2.J(valueOf);
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            if (appBarLayout.g != null && (num = appBarLayout.h) != null && num.equals(h)) {
                                appBarLayout.g.setTint(g);
                            }
                            if (!appBarLayout.f.isEmpty()) {
                                for (ajdn ajdnVar : appBarLayout.f) {
                                    if (ajkmVar2.A() != null) {
                                        ajdnVar.a();
                                    }
                                }
                            }
                        }
                    };
                    setBackground(ajkmVar);
                } else {
                    ajkmVar.G(context2);
                    this.r = new ajjh(this, ajkmVar, 1);
                    setBackground(ajkmVar);
                }
            }
            this.s = ajgk.g(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.t = ajgk.l(context2, R.attr.motionEasingStandardInterpolator, ajdd.a);
            if (a2.hasValue(4)) {
                p(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                ajdt.a(this, a2.getDimensionPixelSize(3, 0));
            }
            if (a2.hasValue(2)) {
                setKeyboardNavigationCluster(a2.getBoolean(2, false));
            }
            if (a2.hasValue(1)) {
                setTouchscreenBlocksFocus(a2.getBoolean(1, false));
            }
            this.v = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.e = a2.getBoolean(5, false);
            this.n = a2.getResourceId(7, -1);
            Drawable drawable = a2.getDrawable(8);
            Drawable drawable2 = this.g;
            if (drawable2 != drawable) {
                Integer num = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                this.g = mutate;
                if (mutate instanceof ajkm) {
                    num = Integer.valueOf(((ajkm) mutate).u);
                } else {
                    ColorStateList d2 = ajgl.d(mutate);
                    if (d2 != null) {
                        num = Integer.valueOf(d2.getDefaultColor());
                    }
                }
                this.h = num;
                Drawable drawable3 = this.g;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.g.setState(getDrawableState());
                    }
                    this.g.setLayoutDirection(getLayoutDirection());
                    this.g.setVisible(getVisibility() == 0, false);
                    this.g.setCallback(this);
                }
                k();
                postInvalidateOnAnimation();
            }
            a2.recycle();
            edz.k(this, new lbd(this, 2));
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }
}
