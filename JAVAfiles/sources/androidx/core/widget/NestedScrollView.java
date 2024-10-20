package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.a;
import defpackage.brg;
import defpackage.dyg;
import defpackage.ebg;
import defpackage.ecw;
import defpackage.edc;
import defpackage.edd;
import defpackage.edf;
import defpackage.edg;
import defpackage.eef;
import defpackage.eeg;
import defpackage.eek;
import defpackage.egq;
import defpackage.egr;
import defpackage.egs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements edf, edc {
    private static final float f = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final egq g = new egq();
    private static final int[] h = {R.attr.fillViewport};
    private int A;
    private egs B;
    private final edg C;
    private final edd D;
    private float E;
    public OverScroller a;
    public EdgeEffect b;
    public EdgeEffect c;
    final egr d;
    ecw e;
    private final float i;
    private long j;
    private final Rect k;
    private int l;
    private boolean m;
    private boolean n;
    private View o;
    private boolean p;
    private VelocityTracker q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private final int[] x;
    private final int[] y;
    private int z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private final void A() {
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
    }

    private final void B(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.D.g(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    private final void C(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.l = (int) motionEvent.getY(i);
            this.w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void D() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    private final void E(boolean z) {
        if (z) {
            p(2, 1);
        } else {
            j(1);
        }
        this.A = getScrollY();
        postInvalidateOnAnimation();
    }

    private final void F(View view) {
        view.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(view, this.k);
        int b = b(this.k);
        if (b != 0) {
            scrollBy(0, b);
        }
    }

    private final boolean G(View view) {
        if (I(view, 0, getHeight())) {
            return false;
        }
        return true;
    }

    private static boolean H(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && H((View) parent, view2)) {
            return true;
        }
        return false;
    }

    private final boolean I(View view, int i, int i2) {
        view.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(view, this.k);
        if (this.k.bottom + i >= getScrollY() && this.k.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
    
        if (r18 == 33) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        r2 = r20 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        r2 = r19 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0073, code lost:
    
        if (r18 == 33) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean J(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 2
            java.util.ArrayList r6 = r0.getFocusables(r6)
            int r7 = r6.size()
            r9 = 0
            r10 = 0
            r11 = 0
        L1d:
            r12 = 33
            r13 = 1
            if (r10 >= r7) goto L67
            java.lang.Object r14 = r6.get(r10)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r8 = r14.getBottom()
            if (r2 >= r8) goto L64
            if (r15 >= r3) goto L64
            if (r2 >= r15) goto L3b
            if (r8 >= r3) goto L3b
            r16 = r13
            goto L3d
        L3b:
            r16 = 0
        L3d:
            if (r9 != 0) goto L43
            r9 = r14
            r11 = r16
            goto L64
        L43:
            if (r1 != r12) goto L4c
            int r8 = r9.getTop()
            if (r15 < r8) goto L52
            goto L54
        L4c:
            int r12 = r9.getBottom()
            if (r8 <= r12) goto L54
        L52:
            r8 = r13
            goto L55
        L54:
            r8 = 0
        L55:
            if (r11 == 0) goto L5c
            if (r16 == 0) goto L64
            if (r8 == 0) goto L64
            goto L63
        L5c:
            if (r16 == 0) goto L61
            r11 = r13
        L5f:
            r9 = r14
            goto L64
        L61:
            if (r8 == 0) goto L64
        L63:
            goto L5f
        L64:
            int r10 = r10 + 1
            goto L1d
        L67:
            if (r9 != 0) goto L6a
            r9 = r0
        L6a:
            if (r2 < r5) goto L73
            if (r3 > r4) goto L70
            r8 = 0
            goto L7e
        L70:
            if (r1 != r12) goto L77
            goto L75
        L73:
            if (r1 != r12) goto L77
        L75:
            int r2 = r2 - r5
            goto L79
        L77:
            int r2 = r3 - r4
        L79:
            r3 = 0
            r0.x(r2, r3, r13, r13)
            r8 = r13
        L7e:
            android.view.View r2 = r17.findFocus()
            if (r9 == r2) goto L87
            r9.requestFocus(r1)
        L87:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.J(int, int, int):boolean");
    }

    private final boolean K(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float d = eef.d(edgeEffect) * getHeight();
        double log = Math.log((Math.abs(-i) * 0.35f) / (this.i * 0.015f));
        double d2 = f;
        if (((float) (this.i * 0.015f * Math.exp((d2 / ((-1.0d) + d2)) * log))) < d) {
            return true;
        }
        return false;
    }

    private final boolean L(MotionEvent motionEvent) {
        boolean z;
        if (eef.d(this.b) != brg.a) {
            eef.e(this.b, brg.a, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (eef.d(this.c) != brg.a) {
            eef.e(this.c, brg.a, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    private final void M(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.j > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.a.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            E(z);
        } else {
            if (!this.a.isFinished()) {
                y();
            }
            scrollBy(i, i2);
        }
        this.j = AnimationUtils.currentAnimationTimeMillis();
    }

    private static int w(int i, int i2, int i3) {
        if (i2 < i3 && i >= 0) {
            if (i2 + i > i3) {
                return i3 - i2;
            }
            return i;
        }
        return 0;
    }

    private final int x(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            p(2, 1);
        }
        if (l(0, i, this.y, this.x, i3)) {
            i4 = i - this.y[1];
            i5 = this.x[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int c = c();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && c() > 0)) && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (r(i4, 0, scrollY, c) && !o(i3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.y;
        iArr[1] = 0;
        q(scrollY2, i4 - scrollY2, this.x, i3, iArr);
        int i6 = i5 + this.x[1];
        int i7 = i4 - this.y[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z2) {
                eef.e(this.b, (-i7) / getHeight(), i2 / getWidth());
                if (!this.c.isFinished()) {
                    this.c.onRelease();
                }
            }
        } else if (i8 > c && z2) {
            eef.e(this.c, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.b.isFinished()) {
                this.b.onRelease();
            }
        }
        if (this.b.isFinished() && this.c.isFinished()) {
            if (z3 && i3 == 0 && (velocityTracker = this.q) != null) {
                velocityTracker.clear();
            }
        } else {
            postInvalidateOnAnimation();
        }
        if (i3 == 1) {
            j(1);
            this.b.onRelease();
            this.c.onRelease();
        }
        return i6;
    }

    private final void y() {
        this.a.abortAnimation();
        j(1);
    }

    private final void z() {
        this.w = -1;
        this.p = false;
        D();
        j(0);
        this.b.onRelease();
        this.c.onRelease();
    }

    public final float a() {
        float f2 = this.E;
        if (f2 == brg.a) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
                this.E = dimension;
                return dimension;
            }
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        return f2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    protected final int b(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || rect.bottom >= i) {
            return 0;
        }
        if (rect.height() > height) {
            i2 = -(i - rect.bottom);
        } else {
            i2 = -(scrollY - rect.top);
        }
        return Math.max(i2, -getScrollY());
    }

    public final int c() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY <= max) {
            return bottom;
        }
        return bottom + (scrollY - max);
    }

    public final void d(int i) {
        if (getChildCount() > 0) {
            this.a.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            E(true);
            if (ebg.b()) {
                eeg.d(this, Math.abs(this.a.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !m(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.D.c(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.D.d(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return l(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.D.f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.b.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.b.setSize(width, height);
            if (this.b.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (!this.c.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(c(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, brg.a);
            this.c.setSize(width2, height2);
            if (this.c.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.ede
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        l(i, i2, iArr, null, i3);
    }

    @Override // defpackage.ede
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        B(i4, i5, null);
    }

    @Override // defpackage.edf
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        B(i4, i5, iArr);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return brg.a;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.C.a();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return brg.a;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // defpackage.ede
    public final void h(View view, View view2, int i, int i2) {
        this.C.b(i, i2);
        p(2, i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return o(0);
    }

    @Override // defpackage.ede
    public final void i(View view, int i) {
        this.C.c(i);
        j(i);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.D.a;
    }

    public final void j(int i) {
        this.D.b(i);
    }

    public final boolean k(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus != null && I(findNextFocus, height, getHeight())) {
            findNextFocus.getDrawingRect(this.k);
            offsetDescendantRectToMyCoords(findNextFocus, this.k);
            x(b(this.k), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            x(height, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && G(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean l(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.D.e(i, i2, iArr, iArr2, i3);
    }

    public final boolean m(KeyEvent keyEvent) {
        this.k.setEmpty();
        int i = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode != 122) {
                                        if (keyCode != 123) {
                                            return false;
                                        }
                                        s(130);
                                        return false;
                                    }
                                    s(33);
                                    return false;
                                }
                                return n(130);
                            }
                            return n(33);
                        }
                        if (true == keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        s(i);
                        return false;
                    }
                    if (keyEvent.isAltPressed()) {
                        return n(130);
                    }
                    return k(130);
                }
                if (keyEvent.isAltPressed()) {
                    return n(33);
                }
                return k(33);
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(int i) {
        int childCount;
        Rect rect = this.k;
        int height = getHeight();
        rect.top = 0;
        this.k.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.k.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.k;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.k;
        return J(i, rect3.top, rect3.bottom);
    }

    public final boolean o(int i) {
        return this.D.h(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float f2;
        if (motionEvent.getAction() == 8 && !this.p) {
            if (dyg.e(motionEvent, 2)) {
                i = 9;
                f2 = motionEvent.getAxisValue(9);
                i2 = (int) motionEvent.getX();
            } else if (dyg.e(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i2 = getWidth() / 2;
                i = 26;
                f2 = axisValue;
            } else {
                i = 0;
                i2 = 0;
                f2 = 0.0f;
            }
            if (f2 != brg.a) {
                x(-((int) (f2 * a())), i2, 1, dyg.e(motionEvent, 8194));
                this.e.a(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.p) {
                return true;
            }
            action = 2;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            C(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.w;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", a.cb(i2, "Invalid pointerId=", " in onInterceptTouchEvent"));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.l) > this.t && (2 & getNestedScrollAxes()) == 0) {
                                this.p = true;
                                this.l = y;
                                A();
                                this.q.addMovement(motionEvent);
                                this.z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.p = false;
            this.w = -1;
            D();
            if (this.a.springBack(getScrollX(), getScrollY(), 0, 0, 0, c())) {
                postInvalidateOnAnimation();
            }
            j(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.l = y2;
                    this.w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.q;
                    if (velocityTracker == null) {
                        this.q = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.q.addMovement(motionEvent);
                    this.a.computeScrollOffset();
                    if (!L(motionEvent) && this.a.isFinished()) {
                        z = false;
                    }
                    this.p = z;
                    p(2, 0);
                }
            }
            if (!L(motionEvent) && this.a.isFinished()) {
                z = false;
            }
            this.p = z;
            D();
        }
        return this.p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.m = false;
        View view = this.o;
        if (view != null && H(view, this)) {
            F(this.o);
        }
        this.o = null;
        if (!this.n) {
            if (this.B != null) {
                scrollTo(getScrollX(), this.B.a);
                this.B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int w = w(scrollY, paddingTop, i5);
            if (w != scrollY) {
                scrollTo(getScrollX(), w);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!z) {
            dispatchNestedFling(brg.a, f3, true);
            d((int) f3);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        e(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        B(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        h(view, view2, i, 0);
    }

    @Override // android.view.View
    protected final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect != null && !G(findNextFocusFromRect)) {
            return findNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof egs)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        egs egsVar = (egs) parcelable;
        super.onRestoreInstanceState(egsVar.getSuperState());
        this.B = egsVar;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        egs egsVar = new egs(super.onSaveInstanceState());
        egsVar.a = getScrollY();
        return egsVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && I(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.k);
            offsetDescendantRectToMyCoords(findFocus, this.k);
            int b = b(this.k);
            if (b != 0) {
                if (this.s) {
                    t(b);
                } else {
                    scrollBy(0, b);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return u(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i, int i2) {
        return this.D.i(i, i2);
    }

    public final void q(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.D.g(0, i, 0, i2, iArr, i3, iArr2);
    }

    final boolean r(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        if (i2 > 0 || i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = i3 + i;
        if (i5 <= i4) {
            if (i5 < 0) {
                i4 = 0;
            } else {
                i4 = i5;
                z2 = false;
                if (z2 && !o(1)) {
                    this.a.springBack(0, i4, 0, 0, 0, c());
                }
                super.scrollTo(0, i4);
                if (z && !z2) {
                    return false;
                }
                return true;
            }
        }
        z2 = true;
        if (z2) {
            this.a.springBack(0, i4, 0, 0, 0, c());
        }
        super.scrollTo(0, i4);
        if (z) {
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m) {
            F(view2);
        } else {
            this.o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b = b(rect);
        if (b != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, b);
            } else {
                t(b);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            D();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    public final void s(int i) {
        int height = getHeight();
        if (i == 130) {
            this.k.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.k.top + height > bottom) {
                    this.k.top = bottom - height;
                }
            }
        } else {
            this.k.top = getScrollY() - height;
            if (this.k.top < 0) {
                this.k.top = 0;
            }
        }
        Rect rect = this.k;
        rect.bottom = rect.top + height;
        Rect rect2 = this.k;
        J(i, rect2.top, rect2.bottom);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int w = w(i, width, width2);
            int w2 = w(i2, height, height2);
            if (w != getScrollX() || w2 != getScrollY()) {
                super.scrollTo(w, w2);
            }
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.D.a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return p(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        j(0);
    }

    public final void t(int i) {
        M(0, i, false);
    }

    @Override // defpackage.ede
    public final boolean u(View view, View view2, int i, int i2) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void v(int i) {
        M(-getScrollX(), i - getScrollY(), true);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Rect();
        this.m = true;
        this.n = false;
        this.o = null;
        this.p = false;
        this.s = true;
        this.w = -1;
        this.x = new int[2];
        this.y = new int[2];
        egr egrVar = new egr(this, 0);
        this.d = egrVar;
        this.e = new ecw(getContext(), egrVar);
        this.b = eef.f(context, attributeSet);
        this.c = eef.f(context, attributeSet);
        this.i = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.t = viewConfiguration.getScaledTouchSlop();
        this.u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.r) {
            this.r = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.C = new edg();
        this.D = new edd(this);
        setNestedScrollingEnabled(true);
        eek.n(this, g);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
