package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.apps.messaging.R;
import defpackage.bo;
import defpackage.eaq;
import defpackage.ede;
import defpackage.edf;
import defpackage.edg;
import defpackage.edx;
import defpackage.eek;
import defpackage.efd;
import defpackage.efe;
import defpackage.eff;
import defpackage.efg;
import defpackage.efo;
import defpackage.gb;
import defpackage.hv;
import defpackage.ij;
import defpackage.iu;
import defpackage.ji;
import defpackage.jj;
import defpackage.jk;
import defpackage.jl;
import defpackage.jq;
import defpackage.lu;
import defpackage.px;
import defpackage.qd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements lu, ede, edf {
    private static final efo l;
    private static final Rect m;
    private efo A;
    private efo B;
    private efo C;
    private OverScroller D;
    private final Runnable E;
    private final Runnable F;
    private final edg G;
    private final jl H;
    private qd I;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public jj h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int n;
    private ContentFrameLayout o;
    private Drawable p;
    private boolean q;
    private int r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private boolean x;
    private boolean y;
    private efo z;
    private static final Rect k = new Rect();
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    static {
        efg efdVar;
        if (Build.VERSION.SDK_INT >= 30) {
            efdVar = new eff();
        } else if (Build.VERSION.SDK_INT >= 29) {
            efdVar = new efe();
        } else {
            efdVar = new efd();
        }
        efdVar.c(eaq.d(0, 1, 0, 1));
        l = efdVar.a();
        m = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void w(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        boolean z = false;
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.p = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.D = new OverScroller(context);
    }

    private static final boolean x(View view, Rect rect, boolean z) {
        boolean z2;
        jk jkVar = (jk) view.getLayoutParams();
        if (jkVar.leftMargin != rect.left) {
            jkVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (jkVar.topMargin != rect.top) {
            jkVar.topMargin = rect.top;
            z2 = true;
        }
        if (jkVar.rightMargin != rect.right) {
            jkVar.rightMargin = rect.right;
            z2 = true;
        }
        if (z && jkVar.bottomMargin != rect.bottom) {
            jkVar.bottomMargin = rect.bottom;
            return true;
        }
        return z2;
    }

    private static final boolean y(View view, Rect rect) {
        if (view.getPaddingLeft() == rect.left && view.getPaddingTop() == rect.top && view.getPaddingRight() == rect.right) {
            return false;
        }
        view.setPadding(rect.left, rect.top, rect.right, view.getPaddingBottom());
        return true;
    }

    public final int a() {
        ActionBarContainer actionBarContainer = this.c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // defpackage.lu
    public final void b() {
        j();
        this.I.c();
    }

    public final void c() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jk;
    }

    @Override // defpackage.lu
    public final void d(int i) {
        j();
        if (i != 2) {
            if (i != 5) {
                if (i != 109) {
                    return;
                }
                this.d = true;
                return;
            }
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
            return;
        }
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.p != null) {
            if (this.c.getVisibility() == 0) {
                i = (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.p.setBounds(0, i, getWidth(), this.p.getIntrinsicHeight() + i);
            this.p.draw(canvas);
        }
    }

    @Override // defpackage.ede
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.edf
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        f(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new jk();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new jk(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.G.a();
    }

    @Override // defpackage.ede
    public final void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.ede
    public final void i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void j() {
        if (this.o == null) {
            this.o = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof Toolbar) {
                this.I = ((Toolbar) findViewById).B();
                return;
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(findViewById.getClass().getSimpleName())));
        }
    }

    public final void k(int i) {
        c();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void l(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (!z) {
                c();
                k(0);
            }
        }
    }

    @Override // defpackage.lu
    public final void m(Menu menu, iu iuVar) {
        j();
        qd qdVar = this.I;
        if (qdVar.g == null) {
            qdVar.g = new jq(qdVar.a.getContext());
        }
        jq jqVar = qdVar.g;
        jqVar.e = iuVar;
        Toolbar toolbar = qdVar.a;
        if (menu != null || toolbar.a != null) {
            toolbar.m();
            ij ijVar = toolbar.a.a;
            if (ijVar == menu) {
                return;
            }
            if (ijVar != null) {
                ijVar.m(toolbar.t);
                ijVar.m(toolbar.u);
            }
            if (toolbar.u == null) {
                toolbar.u = new px(toolbar);
            }
            jqVar.p();
            if (menu != null) {
                ij ijVar2 = (ij) menu;
                ijVar2.h(jqVar, toolbar.i);
                ijVar2.h(toolbar.u, toolbar.i);
            } else {
                jqVar.b(toolbar.i, null);
                toolbar.u.b(toolbar.i, null);
                jqVar.i();
                toolbar.u.i();
            }
            toolbar.a.g(toolbar.j);
            toolbar.a.h(jqVar);
            toolbar.t = jqVar;
            toolbar.x();
        }
    }

    @Override // defpackage.lu
    public final void n() {
        j();
        this.I.g();
    }

    @Override // defpackage.lu
    public final void o(Window.Callback callback) {
        j();
        this.I.e = callback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if (r4 != false) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.j()
            int r0 = r7.getWindowSystemUiVisibility()
            r1 = r0 & 256(0x100, float:3.59E-43)
            r0 = r0 & 1536(0x600, float:2.152E-42)
            jl r2 = r7.H
            efo r3 = android.support.v7.widget.ActionBarOverlayLayout.l
            android.graphics.Rect r4 = r7.w
            defpackage.edz.e(r2, r3, r4)
            android.graphics.Rect r2 = r7.w
            android.graphics.Rect r3 = android.support.v7.widget.ActionBarOverlayLayout.m
            boolean r2 = r2.equals(r3)
            r3 = r2 ^ 1
            r7.x = r3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L26
            r1 = r4
            goto L27
        L26:
            r1 = r3
        L27:
            if (r2 != 0) goto L30
            if (r1 == 0) goto L2e
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = r3
            goto L31
        L30:
            r0 = r4
        L31:
            r7.y = r0
            jj r2 = r7.h
            if (r2 == 0) goto L42
            if (r1 != 0) goto L3d
            if (r0 != 0) goto L3d
            r0 = r4
            goto L3e
        L3d:
            r0 = r3
        L3e:
            gb r2 = (defpackage.gb) r2
            r2.j = r0
        L42:
            efo r8 = defpackage.efo.p(r8, r7)
            android.graphics.Rect r0 = r7.v
            int r1 = r8.b()
            int r2 = r8.d()
            int r5 = r8.c()
            int r6 = r8.a()
            r0.set(r1, r2, r5, r6)
            android.support.v7.widget.ActionBarContainer r0 = r7.c
            android.graphics.Rect r1 = r7.v
            boolean r2 = r7.y
            if (r2 == 0) goto L6e
            android.graphics.Rect r2 = android.support.v7.widget.ActionBarOverlayLayout.k
            boolean r2 = x(r0, r2, r3)
            boolean r0 = y(r0, r1)
            goto L78
        L6e:
            android.graphics.Rect r2 = android.support.v7.widget.ActionBarOverlayLayout.k
            boolean r2 = y(r0, r2)
            boolean r0 = x(r0, r1, r3)
        L78:
            r0 = r0 | r2
            android.graphics.Rect r1 = r7.s
            defpackage.edz.e(r7, r8, r1)
            android.graphics.Rect r1 = r7.s
            int r2 = r1.left
            int r3 = r1.top
            int r5 = r1.right
            int r1 = r1.bottom
            efo r1 = r8.n(r2, r3, r5, r1)
            r7.z = r1
            efo r2 = r7.A
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L9b
            efo r0 = r7.z
            r7.A = r0
            goto L9c
        L9b:
            r4 = r0
        L9c:
            android.graphics.Rect r0 = r7.t
            android.graphics.Rect r1 = r7.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lae
            android.graphics.Rect r0 = r7.t
            android.graphics.Rect r1 = r7.s
            r0.set(r1)
            goto Lb0
        Lae:
            if (r4 == 0) goto Lb3
        Lb0:
            r7.requestLayout()
        Lb3:
            efo r8 = r8.k()
            efo r8 = r8.m()
            efo r8 = r8.l()
            android.view.WindowInsets r8 = r8.e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        edx.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                jk jkVar = (jk) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = jkVar.leftMargin + paddingLeft;
                int i7 = jkVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        eaq d;
        efg efdVar;
        j();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        jk jkVar = (jk) this.c.getLayoutParams();
        int max = Math.max(0, this.c.getMeasuredWidth() + jkVar.leftMargin + jkVar.rightMargin);
        int max2 = Math.max(0, this.c.getMeasuredHeight() + jkVar.topMargin + jkVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = eek.a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.n;
            if (this.y) {
                i3 += this.v.top;
            }
        } else if (this.c.getVisibility() != 8) {
            i3 = this.c.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        this.u.set(this.s);
        efo efoVar = this.z;
        this.B = efoVar;
        if (!this.d && !z && this.x) {
            if (this.y) {
                Rect rect = this.u;
                rect.top = Math.max(rect.top, i3);
                Rect rect2 = this.u;
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                this.u.top += i3;
                Rect rect3 = this.u;
                rect3.bottom = rect3.bottom;
            }
            this.B = this.B.n(0, i3, 0, 0);
        } else {
            if (this.y) {
                d = eaq.d(efoVar.b(), Math.max(this.B.d(), i3), this.B.c(), Math.max(this.B.a(), 0));
            } else {
                d = eaq.d(efoVar.b(), this.B.d() + i3, this.B.c(), this.B.a());
            }
            efo efoVar2 = this.B;
            if (Build.VERSION.SDK_INT >= 30) {
                efdVar = new eff(efoVar2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                efdVar = new efe(efoVar2);
            } else {
                efdVar = new efd(efoVar2);
            }
            efdVar.c(d);
            this.B = efdVar.a();
        }
        x(this.o, this.u, true);
        if (!this.C.equals(this.B)) {
            efo efoVar3 = this.B;
            this.C = efoVar3;
            eek.e(this.o, efoVar3);
        }
        measureChildWithMargins(this.o, i, 0, i2, 0);
        jk jkVar2 = (jk) this.o.getLayoutParams();
        int max3 = Math.max(max, this.o.getMeasuredWidth() + jkVar2.leftMargin + jkVar2.rightMargin);
        int max4 = Math.max(max2, this.o.getMeasuredHeight() + jkVar2.topMargin + jkVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.q && z) {
            this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.D.getFinalY() > this.c.getHeight()) {
                c();
                this.F.run();
            } else {
                c();
                this.E.run();
            }
            this.f = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.r + i2;
        this.r = i5;
        k(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        gb gbVar;
        hv hvVar;
        this.G.b(i, 0);
        this.r = a();
        c();
        jj jjVar = this.h;
        if (jjVar != null && (hvVar = (gbVar = (gb) jjVar).m) != null) {
            hvVar.a();
            gbVar.m = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.c.getVisibility() == 0) {
            return this.q;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.q && !this.f) {
            if (this.r <= this.c.getHeight()) {
                c();
                postDelayed(this.E, 600L);
            } else {
                c();
                postDelayed(this.F, 600L);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.g ^ i;
        this.g = i;
        jj jjVar = this.h;
        if (jjVar != null) {
            if ((i & 256) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = i & 4;
            gb gbVar = (gb) jjVar;
            gbVar.j = z2;
            if (i3 != 0 && z) {
                if (!gbVar.l) {
                    gbVar.l = true;
                    gbVar.c(true);
                }
            } else if (gbVar.l) {
                gbVar.l = false;
                gbVar.c(true);
            }
        }
        if ((i2 & 256) != 0 && this.h != null) {
            edx.c(this);
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        jj jjVar = this.h;
        if (jjVar != null) {
            ((gb) jjVar).i = i;
        }
    }

    @Override // defpackage.lu
    public final void p(CharSequence charSequence) {
        j();
        this.I.n(charSequence);
    }

    @Override // defpackage.lu
    public final boolean q() {
        ActionMenuView actionMenuView;
        j();
        Toolbar toolbar = this.I.a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lu
    public final boolean r() {
        j();
        return this.I.p();
    }

    @Override // defpackage.lu
    public final boolean s() {
        jq jqVar;
        j();
        ActionMenuView actionMenuView = this.I.a.a;
        if (actionMenuView == null || (jqVar = actionMenuView.c) == null) {
            return false;
        }
        if (jqVar.k == null && !jqVar.m()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.lu
    public final boolean t() {
        j();
        return this.I.q();
    }

    @Override // defpackage.ede
    public final boolean u(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lu
    public final boolean v() {
        j();
        return this.I.r();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = true;
        this.y = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.z = efo.a;
        efo efoVar = efo.a;
        this.A = efoVar;
        this.B = efoVar;
        this.C = efoVar;
        this.j = new ji(this);
        this.E = new bo(this, 11, null);
        this.F = new bo(this, 12, null);
        w(context);
        this.G = new edg();
        jl jlVar = new jl(context);
        this.H = jlVar;
        addView(jlVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new jk(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.ede
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }
}
