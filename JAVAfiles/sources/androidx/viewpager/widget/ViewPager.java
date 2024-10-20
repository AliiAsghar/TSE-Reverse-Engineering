package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import defpackage.ajme;
import defpackage.brg;
import defpackage.edz;
import defpackage.eef;
import defpackage.eek;
import defpackage.fyk;
import defpackage.gnd;
import defpackage.gne;
import defpackage.gnf;
import defpackage.gng;
import defpackage.gnh;
import defpackage.gni;
import defpackage.gnj;
import defpackage.gnk;
import defpackage.gnl;
import defpackage.gvf;
import defpackage.mm;
import defpackage.qr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private final boolean I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N;
    private VelocityTracker O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private int V;
    private ArrayList W;
    private final Runnable aa;
    private int ab;
    public gnd b;
    public int c;
    public int d;
    public int e;
    public EdgeEffect f;
    public EdgeEffect g;
    public List h;
    public List i;
    public int j;
    public int k;
    public gvf l;
    private int o;
    private final ArrayList p;
    private final gng q;
    private final Rect r;
    private int s;
    private Parcelable t;
    private ClassLoader u;
    private Scroller v;
    private boolean w;
    private gnk x;
    private float y;
    private float z;
    public static final int[] a = {R.attr.layout_gravity};
    private static final Comparator m = new mm(5);
    private static final Interpolator n = new qr(4);
    private static final mm ac = new mm(6);

    public ViewPager(Context context) {
        super(context);
        this.p = new ArrayList();
        this.q = new gng();
        this.r = new Rect();
        this.s = -1;
        this.t = null;
        this.u = null;
        this.y = -3.4028235E38f;
        this.z = Float.MAX_VALUE;
        this.e = 1;
        this.I = true;
        this.N = -1;
        this.T = true;
        this.aa = new fyk(this, 17, null);
        this.ab = 0;
        s(context);
    }

    private final void A(int i, boolean z, int i2, boolean z2) {
        int i3;
        int scrollX;
        int i4;
        int abs;
        gng c = c(i);
        if (c != null) {
            i3 = (int) (u() * Math.max(this.y, Math.min(c.e, this.z)));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                B(false);
            } else {
                Scroller scroller = this.v;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.w) {
                        scrollX = this.v.getCurrX();
                    } else {
                        scrollX = this.v.getStartX();
                    }
                    this.v.abortAnimation();
                    B(false);
                } else {
                    scrollX = getScrollX();
                }
                int i5 = scrollX;
                int scrollY = getScrollY();
                int i6 = i3 - i5;
                int i7 = -scrollY;
                if (i6 == 0) {
                    if (i7 == 0) {
                        x(false);
                        f();
                        n(0);
                    } else {
                        i4 = 0;
                    }
                } else {
                    i4 = i6;
                }
                B(true);
                n(2);
                int u = u();
                int i8 = u / 2;
                float f = u;
                float sin = (float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f);
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    float f2 = i8;
                    abs = Math.round(Math.abs((f2 + (sin * f2)) / abs2) * 1000.0f) * 4;
                } else {
                    abs = (int) (((Math.abs(i4) / (f + this.d)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.w = false;
                this.v.startScroll(i5, scrollY, i4, i7, min);
                postInvalidateOnAnimation();
            }
            if (z2) {
                y(i);
                return;
            }
            return;
        }
        if (z2) {
            y(i);
        }
        x(false);
        scrollTo(i3, 0);
        D(i3);
    }

    private final void B(boolean z) {
        if (this.B != z) {
            this.B = z;
        }
    }

    private final void C() {
        if (this.k != 0) {
            ArrayList arrayList = this.W;
            if (arrayList == null) {
                this.W = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.W.add(getChildAt(i));
            }
            Collections.sort(this.W, ac);
        }
    }

    private final boolean D(int i) {
        if (this.p.size() == 0) {
            if (this.T) {
                return false;
            }
            this.U = false;
            t(0, brg.a);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        gng w = w();
        int u = u();
        float f = this.d;
        float f2 = u;
        int i2 = w.b;
        float f3 = (i / f2) - w.e;
        float f4 = w.d + (f / f2);
        this.U = false;
        t(i2, f3 / f4);
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean E(float f, float f2) {
        float f3;
        boolean z;
        boolean z2;
        float f4 = this.J - f;
        this.J = f;
        float width = f4 / getWidth();
        float height = f2 / getHeight();
        if (eef.d(this.f) != brg.a) {
            f3 = -eef.e(this.f, -width, 1.0f - height);
        } else if (eef.d(this.g) != brg.a) {
            f3 = eef.e(this.g, width, height);
        } else {
            f3 = 0.0f;
        }
        float width2 = f3 * getWidth();
        float f5 = f4 - width2;
        boolean z3 = false;
        boolean z4 = true;
        if (width2 != brg.a) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f5) < 1.0E-4f) {
            return z;
        }
        float scrollX = getScrollX() + f5;
        float u = u();
        float f6 = this.y * u;
        float f7 = this.z * u;
        gng gngVar = (gng) this.p.get(0);
        gng gngVar2 = (gng) this.p.get(r8.size() - 1);
        if (gngVar.b != 0) {
            f6 = gngVar.e * u;
            z2 = false;
        } else {
            z2 = true;
        }
        if (gngVar2.b != this.b.j() - 1) {
            f7 = gngVar2.e * u;
        } else {
            z3 = true;
        }
        if (scrollX < f6) {
            if (z2) {
                eef.e(this.f, (f6 - scrollX) / u, 1.0f - (f2 / getHeight()));
            } else {
                z4 = z;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z3) {
                eef.e(this.g, (scrollX - f7) / u, f2 / getHeight());
            } else {
                z4 = z;
            }
            scrollX = f7;
        } else {
            z4 = z;
        }
        int i = (int) scrollX;
        this.J += scrollX - i;
        scrollTo(i, getScrollY());
        D(i);
        return z4;
    }

    private final boolean F() {
        this.N = -1;
        this.D = false;
        this.E = false;
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O = null;
        }
        this.f.onRelease();
        this.g.onRelease();
        if (this.f.isFinished() && this.g.isFinished()) {
            return false;
        }
        return true;
    }

    private final void G() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int u() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect v(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final gng w() {
        float f;
        float f2;
        int i;
        int u = u();
        float f3 = brg.a;
        if (u > 0) {
            f = getScrollX() / u;
        } else {
            f = 0.0f;
        }
        if (u > 0) {
            f2 = this.d / u;
        } else {
            f2 = 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        boolean z = true;
        gng gngVar = null;
        float f4 = 0.0f;
        while (i2 < this.p.size()) {
            gng gngVar2 = (gng) this.p.get(i2);
            if (!z && gngVar2.b != (i = i3 + 1)) {
                gngVar2 = this.q;
                gngVar2.e = f3 + f4 + f2;
                gngVar2.b = i;
                gngVar2.d = 1.0f;
                i2--;
            }
            gng gngVar3 = gngVar2;
            f3 = gngVar3.e;
            float f5 = gngVar3.d + f3 + f2;
            if (!z && f < f3) {
                return gngVar;
            }
            if (f >= f5 && i2 != this.p.size() - 1) {
                i3 = gngVar3.b;
                i2++;
                z = false;
                gngVar = gngVar3;
                f4 = gngVar3.d;
            } else {
                return gngVar3;
            }
        }
        return gngVar;
    }

    private final void x(boolean z) {
        boolean z2;
        if (this.ab == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            B(false);
            if (!this.v.isFinished()) {
                this.v.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.v.getCurrX();
                int currY = this.v.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        D(currX);
                    }
                }
            }
        }
        this.C = false;
        for (int i = 0; i < this.p.size(); i++) {
            gng gngVar = (gng) this.p.get(i);
            if (gngVar.c) {
                gngVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                Runnable runnable = this.aa;
                int[] iArr = eek.a;
                postOnAnimation(runnable);
                return;
            }
            this.aa.run();
        }
    }

    private final void y(int i) {
        List list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                gnj gnjVar = (gnj) this.h.get(i2);
                if (gnjVar != null) {
                    gnjVar.b(i);
                }
            }
        }
    }

    private final void z(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.J = motionEvent.getX(i);
            this.N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    final gng a(int i, int i2) {
        gng gngVar = new gng();
        gngVar.b = i;
        gngVar.a = this.b.c(this, i);
        gngVar.d = 1.0f;
        if (i2 >= 0 && i2 < this.p.size()) {
            this.p.add(i2, gngVar);
        } else {
            this.p.add(gngVar);
        }
        return gngVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        gng b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        gng b;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new gnh();
        }
        gnh gnhVar = (gnh) layoutParams;
        boolean z2 = gnhVar.a;
        if (view.getClass().getAnnotation(gnf.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        gnhVar.a = z3;
        if (this.A) {
            if (gnhVar != null && z3) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gnhVar.d = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    final gng b(View view) {
        for (int i = 0; i < this.p.size(); i++) {
            gng gngVar = (gng) this.p.get(i);
            if (this.b.g(view, gngVar.a)) {
                return gngVar;
            }
        }
        return null;
    }

    final gng c(int i) {
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            gng gngVar = (gng) this.p.get(i2);
            if (gngVar.b == i) {
                return gngVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.b == null) {
            return false;
        }
        int u = u();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (u * this.y))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollX >= ((int) (u * this.z))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof gnh) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.w = true;
        if (!this.v.isFinished() && this.v.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.v.getCurrX();
            int currY = this.v.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!D(currX)) {
                    this.v.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        x(true);
    }

    public final void d(gnj gnjVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(gnjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.o(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.o(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.r()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.o(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.q()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.o(r6)
            goto L5b
        L5a:
            r6 = r2
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        gng b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        gnd gndVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (gndVar = this.b) == null || gndVar.j() <= 1)) {
            this.f.finish();
            this.g.finish();
            return;
        }
        if (!this.f.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.y * width);
            this.f.setSize(height, width);
            z = this.f.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        if (!this.g.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.z + 1.0f)) * width2);
            this.g.setSize(height2, width2);
            z |= this.g.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void e() {
        boolean z;
        int j = this.b.j();
        this.o = j;
        int size = this.p.size();
        int i = this.e;
        if (size < i + i + 1 && this.p.size() < j) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            Object obj = ((gng) this.p.get(i3)).a;
        }
        Collections.sort(this.p, m);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                gnh gnhVar = (gnh) getChildAt(i4).getLayoutParams();
                if (!gnhVar.a) {
                    gnhVar.c = brg.a;
                }
            }
            l(i2, false, true);
            requestLayout();
        }
    }

    public final void f() {
        g(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 != r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void g(int r18) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(int):void");
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gnh();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gnh(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (this.k == 2) {
            i2 = (i - 1) - i2;
        }
        return ((gnh) ((View) this.W.get(i2)).getLayoutParams()).f;
    }

    public final void h(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.p.isEmpty()) {
            if (!this.v.isFinished()) {
                this.v.setFinalX(this.c * u());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        gng c = c(this.c);
        if (c != null) {
            f = Math.min(c.e, this.z);
        } else {
            f = brg.a;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            x(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final void i(gnd gndVar) {
        gnd gndVar2 = this.b;
        if (gndVar2 != null) {
            gndVar2.l(null);
            this.b.f(this);
            for (int i = 0; i < this.p.size(); i++) {
                gng gngVar = (gng) this.p.get(i);
                this.b.d(this, gngVar.b, gngVar.a);
            }
            this.b.h();
            this.p.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((gnh) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = gndVar;
        this.o = 0;
        if (gndVar != null) {
            if (this.x == null) {
                this.x = new gnk(this);
            }
            this.b.l(this.x);
            this.C = false;
            boolean z = this.T;
            this.T = true;
            this.o = this.b.j();
            if (this.s >= 0) {
                this.b.e(this.t, this.u);
                l(this.s, false, true);
                this.s = -1;
                this.t = null;
                this.u = null;
            } else if (!z) {
                f();
            } else {
                requestLayout();
            }
        }
        List list = this.i;
        if (list != null && !list.isEmpty()) {
            int size = this.i.size();
            for (int i3 = 0; i3 < size; i3++) {
                ajme ajmeVar = (ajme) this.i.get(i3);
                TabLayout tabLayout = ajmeVar.b;
                if (tabLayout.E == this) {
                    tabLayout.n(gndVar, ajmeVar.a);
                }
            }
        }
    }

    public final void j(int i) {
        this.C = false;
        l(i, !this.T, false);
    }

    public final void k(int i, boolean z) {
        this.C = false;
        l(i, z, false);
    }

    final void l(int i, boolean z, boolean z2) {
        m(i, z, z2, 0);
    }

    final void m(int i, boolean z, boolean z2, int i2) {
        gnd gndVar = this.b;
        boolean z3 = false;
        if (gndVar != null && gndVar.j() > 0) {
            if (!z2 && this.c == i && this.p.size() != 0) {
                B(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.b.j()) {
                i = this.b.j() - 1;
            }
            int i3 = this.e;
            int i4 = this.c;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.p.size(); i5++) {
                    ((gng) this.p.get(i5)).c = true;
                }
            }
            if (this.c != i) {
                z3 = true;
            }
            if (this.T) {
                this.c = i;
                if (z3) {
                    y(i);
                }
                requestLayout();
                return;
            }
            g(i);
            A(i, z, i2, z3);
            return;
        }
        B(false);
    }

    public final void n(int i) {
        int i2;
        if (this.ab != i) {
            this.ab = i;
            if (this.l != null) {
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (i != 0) {
                        i2 = this.j;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, null);
                }
            }
            List list = this.h;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    gnj gnjVar = (gnj) this.h.get(i4);
                    if (gnjVar != null) {
                        gnjVar.a(i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L58
        L9:
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L58
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L58:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 0
            r3 = 66
            r4 = 17
            if (r1 == 0) goto La9
            if (r1 == r0) goto La9
            if (r6 != r4) goto L89
            android.graphics.Rect r2 = r5.r
            android.graphics.Rect r2 = r5.v(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.r
            android.graphics.Rect r3 = r5.v(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L84
            if (r2 < r3) goto L84
            boolean r2 = r5.q()
            goto Lbd
        L84:
            boolean r2 = r1.requestFocus()
            goto Lbd
        L89:
            if (r6 != r3) goto Lbd
            android.graphics.Rect r2 = r5.r
            android.graphics.Rect r2 = r5.v(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.r
            android.graphics.Rect r3 = r5.v(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La4
            if (r2 > r3) goto La4
            boolean r2 = r5.r()
            goto Lbd
        La4:
            boolean r2 = r1.requestFocus()
            goto Lbd
        La9:
            if (r6 == r4) goto Lb9
            r0 = 1
            if (r6 != r0) goto Laf
            goto Lb9
        Laf:
            if (r6 == r3) goto Lb4
            r0 = 2
            if (r6 != r0) goto Lbd
        Lb4:
            boolean r2 = r5.r()
            goto Lbd
        Lb9:
            boolean r2 = r5.q()
        Lbd:
            if (r2 == 0) goto Lc6
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.o(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.aa);
        Scroller scroller = this.v;
        if (scroller != null && !scroller.isFinished()) {
            this.v.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.D) {
                    return true;
                }
                if (this.E) {
                    return false;
                }
                if (action != 2) {
                    if (action == 6) {
                        z(motionEvent);
                    }
                } else {
                    int i = this.N;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.J;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.M);
                        if (f2 != brg.a) {
                            float f3 = this.J;
                            if ((this.I || ((f3 >= this.G || f2 <= brg.a) && (f3 <= getWidth() - this.G || f2 >= brg.a))) && p(this, false, (int) f2, (int) x, (int) y)) {
                                this.J = x;
                                this.K = y;
                                this.E = true;
                                return false;
                            }
                        }
                        float f4 = this.H;
                        if (abs > f4 && abs * 0.5f > abs2) {
                            this.D = true;
                            G();
                            n(1);
                            if (f2 > brg.a) {
                                f = this.L + this.H;
                            } else {
                                f = this.L - this.H;
                            }
                            this.J = f;
                            this.K = y;
                            B(true);
                        } else if (abs2 > f4) {
                            this.E = true;
                        }
                        if (this.D && E(x, y)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.L = x2;
                this.J = x2;
                float y2 = motionEvent.getY();
                this.M = y2;
                this.K = y2;
                this.N = motionEvent.getPointerId(0);
                this.E = false;
                this.w = true;
                this.v.computeScrollOffset();
                if (this.ab == 2 && Math.abs(this.v.getFinalX() - this.v.getCurrX()) > this.S) {
                    this.v.abortAnimation();
                    this.C = false;
                    f();
                    this.D = true;
                    G();
                    n(1);
                } else if (eef.d(this.f) == brg.a && eef.d(this.g) == brg.a) {
                    x(false);
                    this.D = false;
                } else {
                    this.D = true;
                    n(1);
                    if (eef.d(this.f) != brg.a) {
                        eef.e(this.f, brg.a, 1.0f - (this.K / getHeight()));
                    }
                    if (eef.d(this.g) != brg.a) {
                        eef.e(this.g, brg.a, this.K / getHeight());
                    }
                }
            }
            if (this.O == null) {
                this.O = VelocityTracker.obtain();
            }
            this.O.addMovement(motionEvent);
            return this.D;
        }
        F();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        gnh gnhVar;
        gnh gnhVar2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2 = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.G = Math.min(measuredWidth / 10, this.F);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z3 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (gnhVar2 = (gnh) childAt.getLayoutParams()) != null && gnhVar2.a) {
                int i8 = gnhVar2.b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                if (i10 != 48 && i10 != 80) {
                    z = z2;
                } else {
                    z = true;
                }
                if (i9 != 3 && i9 != 5) {
                    z3 = z2;
                }
                int i11 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else if (z3) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (gnhVar2.width != -2) {
                    if (gnhVar2.width != -1) {
                        i4 = gnhVar2.width;
                    } else {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (gnhVar2.height != -2) {
                    if (gnhVar2.height != -1) {
                        i5 = gnhVar2.height;
                    } else {
                        i5 = measuredHeight;
                    }
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z2 = false;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.A = true;
        f();
        this.A = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((gnhVar = (gnh) childAt2.getLayoutParams()) == null || !gnhVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gnhVar.c), 1073741824), makeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        gng b;
        int i5 = i & 2;
        int childCount = getChildCount();
        if (i5 != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gnl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gnl gnlVar = (gnl) parcelable;
        super.onRestoreInstanceState(gnlVar.d);
        gnd gndVar = this.b;
        if (gndVar != null) {
            gndVar.e(gnlVar.b, gnlVar.e);
            l(gnlVar.a, false, true);
        } else {
            this.s = gnlVar.a;
            this.t = gnlVar.b;
            this.u = gnlVar.e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        gnl gnlVar = new gnl(super.onSaveInstanceState());
        gnlVar.a = this.c;
        gnd gndVar = this.b;
        if (gndVar != null) {
            gnlVar.b = gndVar.a();
        }
        return gnlVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.d;
            h(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    protected final boolean p(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && p(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    final boolean q() {
        int i = this.c;
        if (i > 0) {
            k(i - 1, true);
            return true;
        }
        return false;
    }

    final boolean r() {
        if (this.b != null && this.c < r0.j() - 1) {
            k(this.c + 1, true);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    final void s(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.v = new Scroller(context, n);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.H = viewConfiguration.getScaledPagingTouchSlop();
        this.P = (int) (400.0f * f);
        this.Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f = new EdgeEffect(context);
        this.g = new EdgeEffect(context);
        this.R = (int) (25.0f * f);
        this.S = (int) (f + f);
        this.F = (int) (f * 16.0f);
        eek.n(this, new gni(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        edz.k(this, new gne(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void t(int r13, float r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.t(int, float):void");
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != null) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new gnh();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new ArrayList();
        this.q = new gng();
        this.r = new Rect();
        this.s = -1;
        this.t = null;
        this.u = null;
        this.y = -3.4028235E38f;
        this.z = Float.MAX_VALUE;
        this.e = 1;
        this.I = true;
        this.N = -1;
        this.T = true;
        this.aa = new fyk(this, 17, null);
        this.ab = 0;
        s(context);
    }
}
