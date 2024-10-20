package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import defpackage.ajgl;
import defpackage.ajlk;
import defpackage.ajmd;
import defpackage.ajme;
import defpackage.ajmf;
import defpackage.ajmh;
import defpackage.ajmj;
import defpackage.ajmk;
import defpackage.ajml;
import defpackage.ajmm;
import defpackage.ajmn;
import defpackage.brg;
import defpackage.ecf;
import defpackage.ech;
import defpackage.efu;
import defpackage.efx;
import defpackage.gnd;
import defpackage.gnf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@gnf
/* loaded from: classes4.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int H = 2132084690;
    private static final ecf I = new ech(16);
    int A;
    public boolean B;
    public final TimeInterpolator C;
    public final ArrayList D;
    public ViewPager E;
    public int F;
    public ajgl G;
    private ajmk J;
    private int K;
    private final int L;
    private final int M;
    private final int N;
    private int O;
    private ajmf P;
    private ValueAnimator Q;
    private gnd R;
    private DataSetObserver S;
    private ajml T;
    private ajme U;
    private boolean V;
    private final ecf W;
    public int a;
    public final ArrayList b;
    final ajmj c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public final int i;
    public int j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public PorterDuff.Mode o;
    public float p;
    public float q;
    public float r;
    public final int s;
    public int t;
    public int u;
    int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final void A(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            ajmj ajmjVar = this.c;
            int childCount = ajmjVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (ajmjVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int x = x(i, brg.a);
            if (scrollX != x) {
                if (this.Q == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.Q = valueAnimator;
                    valueAnimator.setInterpolator(this.C);
                    this.Q.setDuration(this.v);
                    this.Q.addUpdateListener(new ajlk(this, 5));
                }
                this.Q.setIntValues(scrollX, x);
                this.Q.start();
            }
            ajmj ajmjVar2 = this.c;
            int i3 = this.v;
            ValueAnimator valueAnimator2 = ajmjVar2.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && ajmjVar2.b.a != i) {
                ajmjVar2.a.cancel();
            }
            ajmjVar2.d(true, i, i3);
            return;
        }
        v(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void B() {
        /*
            r4 = this;
            int r0 = r4.x
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.O
            int r3 = r4.d
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            ajmj r3 = r4.c
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.x
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 == r3) goto L25
            if (r0 == r1) goto L25
            goto L50
        L25:
            int r0 = r4.u
            if (r0 != r1) goto L2e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L2e:
            ajmj r0 = r4.c
            r0.setGravity(r3)
            goto L50
        L34:
            int r0 = r4.u
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3d
            if (r0 == r1) goto L48
            goto L50
        L3d:
            ajmj r0 = r4.c
            r0.setGravity(r3)
            goto L50
        L43:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L48:
            ajmj r0 = r4.c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L50:
            r4.u(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.B():void");
    }

    private final void C(int i) {
        boolean z;
        int childCount = this.c.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                ajmj ajmjVar = this.c;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                View childAt = ajmjVar.getChildAt(i2);
                if ((i2 == i && !childAt.isSelected()) || (i2 != i && childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof ajmm) {
                        ((ajmm) childAt).c();
                    }
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                }
            }
        }
    }

    private final void D(LinearLayout.LayoutParams layoutParams) {
        if (this.x == 1 && this.u == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = brg.a;
        }
    }

    private final boolean E() {
        int i = this.x;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    private final void F(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.E;
        if (viewPager2 != null) {
            ajml ajmlVar = this.T;
            if (ajmlVar != null && (list2 = viewPager2.h) != null) {
                list2.remove(ajmlVar);
            }
            ajme ajmeVar = this.U;
            if (ajmeVar != null && (list = this.E.i) != null) {
                list.remove(ajmeVar);
            }
        }
        ajmf ajmfVar = this.P;
        if (ajmfVar != null) {
            k(ajmfVar);
            this.P = null;
        }
        if (viewPager != null) {
            this.E = viewPager;
            if (this.T == null) {
                this.T = new ajml(this);
            }
            ajml ajmlVar2 = this.T;
            ajmlVar2.b = 0;
            ajmlVar2.a = 0;
            viewPager.d(ajmlVar2);
            ajmn ajmnVar = new ajmn(viewPager);
            this.P = ajmnVar;
            f(ajmnVar);
            gnd gndVar = viewPager.b;
            if (gndVar != null) {
                n(gndVar, true);
            }
            if (this.U == null) {
                this.U = new ajme(this);
            }
            ajme ajmeVar2 = this.U;
            ajmeVar2.a = true;
            if (viewPager.i == null) {
                viewPager.i = new ArrayList();
            }
            viewPager.i.add(ajmeVar2);
            v(viewPager.c);
        } else {
            this.E = null;
            n(null, false);
        }
        this.V = z;
    }

    public static ColorStateList c(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final int x(int i, float f) {
        View childAt;
        View view;
        int i2 = this.x;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.c.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.c.getChildCount()) {
            view = this.c.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + i3) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i5;
        }
        return left - i5;
    }

    private final int y() {
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int i2 = this.x;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.N;
    }

    private final void z(View view) {
        if (view instanceof ajmd) {
            ajmd ajmdVar = (ajmd) view;
            ajmk e = e();
            CharSequence charSequence = ajmdVar.a;
            Drawable drawable = ajmdVar.b;
            int i = ajmdVar.c;
            if (!TextUtils.isEmpty(ajmdVar.getContentDescription())) {
                e.d(ajmdVar.getContentDescription());
            }
            g(e);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final int a() {
        ajmk ajmkVar = this.J;
        if (ajmkVar != null) {
            return ajmkVar.d;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        z(view);
    }

    public final int b() {
        return this.b.size();
    }

    public final ajmk d(int i) {
        if (i >= 0 && i < b()) {
            return (ajmk) this.b.get(i);
        }
        return null;
    }

    public final ajmk e() {
        ajmm ajmmVar;
        ajmk ajmkVar = (ajmk) I.a();
        if (ajmkVar == null) {
            ajmkVar = new ajmk();
        }
        ajmkVar.g = this;
        ecf ecfVar = this.W;
        if (ecfVar != null) {
            ajmmVar = (ajmm) ecfVar.a();
        } else {
            ajmmVar = null;
        }
        if (ajmmVar == null) {
            ajmmVar = new ajmm(this, getContext());
        }
        ajmmVar.a(ajmkVar);
        ajmmVar.setFocusable(true);
        ajmmVar.setMinimumWidth(y());
        if (TextUtils.isEmpty(ajmkVar.c)) {
            ajmmVar.setContentDescription(ajmkVar.b);
        } else {
            ajmmVar.setContentDescription(ajmkVar.c);
        }
        ajmkVar.h = ajmmVar;
        if (ajmkVar.i != -1) {
            ajmkVar.h.setId(0);
        }
        return ajmkVar;
    }

    @Deprecated
    public final void f(ajmf ajmfVar) {
        if (!this.D.contains(ajmfVar)) {
            this.D.add(ajmfVar);
        }
    }

    public final void g(ajmk ajmkVar) {
        h(ajmkVar, this.b.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h(ajmk ajmkVar, boolean z) {
        i(ajmkVar, this.b.size(), z);
    }

    public final void i(ajmk ajmkVar, int i, boolean z) {
        if (ajmkVar.g == this) {
            ajmkVar.d = i;
            this.b.add(i, ajmkVar);
            int size = this.b.size();
            int i2 = -1;
            for (int i3 = i + 1; i3 < size; i3++) {
                if (((ajmk) this.b.get(i3)).d == this.a) {
                    i2 = i3;
                }
                ((ajmk) this.b.get(i3)).d = i3;
            }
            this.a = i2;
            ajmm ajmmVar = ajmkVar.h;
            ajmmVar.setSelected(false);
            ajmmVar.setActivated(false);
            ajmj ajmjVar = this.c;
            int i4 = ajmkVar.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            D(layoutParams);
            ajmjVar.addView(ajmmVar, i4, layoutParams);
            if (z) {
                ajmkVar.b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void j() {
        int i;
        for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
            ajmm ajmmVar = (ajmm) this.c.getChildAt(childCount);
            this.c.removeViewAt(childCount);
            if (ajmmVar != null) {
                ajmmVar.a(null);
                ajmmVar.setSelected(false);
                this.W.b(ajmmVar);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ajmk ajmkVar = (ajmk) it.next();
            it.remove();
            ajmkVar.g = null;
            ajmkVar.h = null;
            ajmkVar.a = null;
            ajmkVar.i = -1;
            ajmkVar.b = null;
            ajmkVar.c = null;
            ajmkVar.d = -1;
            ajmkVar.e = null;
            I.b(ajmkVar);
        }
        this.J = null;
        gnd gndVar = this.R;
        if (gndVar != null) {
            int j = gndVar.j();
            for (int i2 = 0; i2 < j; i2++) {
                ajmk e = e();
                e.f(this.R.k(i2));
                h(e, false);
            }
            ViewPager viewPager = this.E;
            if (viewPager != null && j > 0 && (i = viewPager.c) != a() && i < b()) {
                l(d(i));
            }
        }
    }

    @Deprecated
    public final void k(ajmf ajmfVar) {
        this.D.remove(ajmfVar);
    }

    public final void l(ajmk ajmkVar) {
        m(ajmkVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r0.d == (-1)) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.ajmk r4, boolean r5) {
        /*
            r3 = this;
            ajmk r0 = r3.J
            r1 = -1
            if (r0 != r4) goto L24
            if (r0 == 0) goto L7a
            java.util.ArrayList r5 = r3.D
            int r5 = r5.size()
            int r5 = r5 + r1
        Le:
            if (r5 < 0) goto L1e
            java.util.ArrayList r0 = r3.D
            java.lang.Object r0 = r0.get(r5)
            ajmf r0 = (defpackage.ajmf) r0
            r0.a(r4)
            int r5 = r5 + (-1)
            goto Le
        L1e:
            int r4 = r4.d
            r3.A(r4)
            return
        L24:
            if (r4 == 0) goto L29
            int r2 = r4.d
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r5 == 0) goto L42
            if (r0 == 0) goto L33
            int r5 = r0.d
            if (r5 != r1) goto L3a
            goto L34
        L33:
            r0 = 0
        L34:
            if (r2 == r1) goto L3a
            r3.v(r2)
            goto L3d
        L3a:
            r3.A(r2)
        L3d:
            if (r2 == r1) goto L42
            r3.C(r2)
        L42:
            r3.J = r4
            if (r0 == 0) goto L61
            com.google.android.material.tabs.TabLayout r5 = r0.g
            if (r5 == 0) goto L61
            java.util.ArrayList r5 = r3.D
            int r5 = r5.size()
            int r5 = r5 + r1
        L51:
            if (r5 < 0) goto L61
            java.util.ArrayList r2 = r3.D
            java.lang.Object r2 = r2.get(r5)
            ajmf r2 = (defpackage.ajmf) r2
            r2.c(r0)
            int r5 = r5 + (-1)
            goto L51
        L61:
            if (r4 == 0) goto L7a
            java.util.ArrayList r5 = r3.D
            int r5 = r5.size()
            int r5 = r5 + r1
        L6a:
            if (r5 < 0) goto L7a
            java.util.ArrayList r0 = r3.D
            java.lang.Object r0 = r0.get(r5)
            ajmf r0 = (defpackage.ajmf) r0
            r0.b(r4)
            int r5 = r5 + (-1)
            goto L6a
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m(ajmk, boolean):void");
    }

    public final void n(gnd gndVar, boolean z) {
        DataSetObserver dataSetObserver;
        gnd gndVar2 = this.R;
        if (gndVar2 != null && (dataSetObserver = this.S) != null) {
            gndVar2.f.unregisterObserver(dataSetObserver);
        }
        this.R = gndVar;
        if (z && gndVar != null) {
            if (this.S == null) {
                this.S = new ajmh(this);
            }
            gndVar.f.registerObserver(this.S);
        }
        j();
    }

    public final void o(int i, float f, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0 && round < this.c.getChildCount()) {
            if (z2) {
                ajmj ajmjVar = this.c;
                ajmjVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = ajmjVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    ajmjVar.a.cancel();
                }
                ajmjVar.c(ajmjVar.getChildAt(i), ajmjVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Q.cancel();
            }
            int x = x(i, f);
            int scrollX = getScrollX();
            if ((i < a() && x >= scrollX) || ((i > a() && x <= scrollX) || i == a())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (getLayoutDirection() == 1) {
                if ((i < a() && x <= scrollX) || ((i > a() && x >= scrollX) || i == a())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4 || this.F == 1 || z3) {
                if (i < 0) {
                    x = 0;
                }
                scrollTo(x, 0);
            }
            if (z) {
                C(round);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajgl.q(this);
        if (this.E == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                F((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            s(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        ajmm ajmmVar;
        Drawable drawable;
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            if ((childAt instanceof ajmm) && (drawable = (ajmmVar = (ajmm) childAt).c) != null) {
                drawable.setBounds(ajmmVar.getLeft(), ajmmVar.getTop(), ajmmVar.getRight(), ajmmVar.getBottom());
                ajmmVar.c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new efx(accessibilityNodeInfo).s(efu.j(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (E() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        Context context = getContext();
        int size = this.b.size();
        int i4 = 0;
        while (true) {
            i3 = 48;
            if (i4 >= size) {
                break;
            }
            ajmk ajmkVar = (ajmk) this.b.get(i4);
            if (ajmkVar != null && ajmkVar.a != null && !TextUtils.isEmpty(ajmkVar.b)) {
                if (!this.y) {
                    i3 = 72;
                }
            } else {
                i4++;
            }
        }
        int round = Math.round(ajgl.i(context, i3));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i5 = this.M;
            if (i5 <= 0) {
                i5 = (int) (size2 - ajgl.i(getContext(), 56));
            }
            this.t = i5;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.x;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !E()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(int i) {
        this.K = i;
        ajgl.h(this.n, i);
        u(false);
    }

    public final void q(int i) {
        if (i != this.x) {
            this.x = i;
            B();
        }
    }

    public final void r(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            t();
        }
    }

    public final void s(ViewPager viewPager) {
        F(viewPager, false);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ajgl.p(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) <= 0) {
            return false;
        }
        return true;
    }

    public final void t() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((ajmk) this.b.get(i)).c();
        }
    }

    public final void u(boolean z) {
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            childAt.setMinimumWidth(y());
            D((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void v(int i) {
        o(i, brg.a, true, true, true);
    }

    public final void w() {
        if (this.u != 0) {
            this.u = 0;
            B();
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        z(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        z(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        z(view);
    }
}
