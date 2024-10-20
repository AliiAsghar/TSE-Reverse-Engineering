package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.messaging.R;
import defpackage.d;
import defpackage.edb;
import defpackage.eek;
import defpackage.el;
import defpackage.gc;
import defpackage.ht;
import defpackage.ih;
import defpackage.ij;
import defpackage.im;
import defpackage.iu;
import defpackage.jq;
import defpackage.ju;
import defpackage.kkc;
import defpackage.ko;
import defpackage.ktk;
import defpackage.ot;
import defpackage.ou;
import defpackage.pw;
import defpackage.px;
import defpackage.py;
import defpackage.pz;
import defpackage.qa;
import defpackage.qd;
import defpackage.qdq;
import defpackage.qn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements edb {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private qd O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final qdq S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public ot n;
    public CharSequence o;
    public CharSequence p;
    public final ArrayList q;
    public ArrayList r;
    public pz s;
    public jq t;
    public px u;
    public iu v;
    public ih w;
    public boolean x;
    public final kkc y;
    private ImageButton z;

    public Toolbar(Context context) {
        this(context, null);
    }

    protected static final py C(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof py) {
            return new py((py) layoutParams);
        }
        if (layoutParams instanceof el) {
            return new py((el) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new py((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new py(layoutParams);
    }

    private final int D(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    private final int E(View view, int i) {
        int i2;
        py pyVar = (py) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = pyVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i4 < pyVar.topMargin) {
                    i4 = pyVar.topMargin;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    if (i5 < pyVar.bottomMargin) {
                        i4 = Math.max(0, i4 - (pyVar.bottomMargin - i5));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - pyVar.bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    private final int F(View view, int i, int[] iArr, int i2) {
        py pyVar = (py) view.getLayoutParams();
        int i3 = pyVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int E = E(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, E, max + measuredWidth, view.getMeasuredHeight() + E);
        return max + measuredWidth + pyVar.rightMargin;
    }

    private final int G(View view, int i, int[] iArr, int i2) {
        py pyVar = (py) view.getLayoutParams();
        int i3 = pyVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int E = E(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, E, max, view.getMeasuredHeight() + E);
        return max - (measuredWidth + pyVar.leftMargin);
    }

    private final int H(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void I(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                py pyVar = (py) childAt.getLayoutParams();
                if (pyVar.b == 0 && N(childAt) && D(pyVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt2 = getChildAt(childCount);
                py pyVar2 = (py) childAt2.getLayoutParams();
                if (pyVar2.b == 0 && N(childAt2) && D(pyVar2.a) == absoluteGravity) {
                    list.add(childAt2);
                }
            } else {
                return;
            }
        }
    }

    private final void J(View view, boolean z) {
        py pyVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            pyVar = new py();
        } else if (!checkLayoutParams(layoutParams)) {
            pyVar = C(layoutParams);
        } else {
            pyVar = (py) layoutParams;
        }
        pyVar.b = 1;
        if (z && this.h != null) {
            view.setLayoutParams(pyVar);
            this.q.add(view);
        } else {
            addView(view, pyVar);
        }
    }

    private final void K() {
        if (this.d == null) {
            this.d = new AppCompatImageView(getContext());
        }
    }

    private final void L() {
        if (this.z == null) {
            this.z = new ko(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            py pyVar = new py();
            pyVar.a = (this.m & 112) | 8388611;
            this.z.setLayoutParams(pyVar);
        }
    }

    private final boolean M(View view) {
        if (view.getParent() != this && !this.q.contains(view)) {
            return false;
        }
        return true;
    }

    private final boolean N(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private static final int O(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int P(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void Q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean A() {
        jq jqVar;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null && (jqVar = actionMenuView.c) != null && jqVar.n()) {
            return true;
        }
        return false;
    }

    public final qd B() {
        if (this.O == null) {
            this.O = new qd(this, true);
        }
        return this.O;
    }

    public final int a() {
        ot otVar = this.n;
        if (otVar != null) {
            if (otVar.g) {
                return otVar.a;
            }
            return otVar.b;
        }
        return 0;
    }

    public final int b() {
        ot otVar = this.n;
        if (otVar != null) {
            if (otVar.g) {
                return otVar.b;
            }
            return otVar.a;
        }
        return 0;
    }

    public final int c() {
        ij ijVar;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null && (ijVar = actionMenuView.a) != null && ijVar.hasVisibleItems()) {
            return Math.max(a(), Math.max(this.G, 0));
        }
        return a();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof py)) {
            return true;
        }
        return false;
    }

    public final int d() {
        if (e() != null) {
            return Math.max(b(), Math.max(this.F, 0));
        }
        return b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        l();
        return this.a.d();
    }

    public final MenuInflater g() {
        return new ht(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new py();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new py(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu f = f();
        for (int i = 0; i < f.size(); i++) {
            arrayList.add(f.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        im imVar;
        px pxVar = this.u;
        if (pxVar == null) {
            imVar = null;
        } else {
            imVar = pxVar.b;
        }
        if (imVar != null) {
            imVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.n == null) {
            this.n = new ot();
        }
    }

    public final void l() {
        m();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu d = actionMenuView.d();
            if (this.u == null) {
                this.u = new px(this);
            }
            this.a.c.p();
            ((ij) d).h(this.u, this.i);
            x();
        }
    }

    public final void m() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.g(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.f(this.v, new ju(this, 2));
            py pyVar = new py();
            pyVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(pyVar);
            J(this.a, false);
        }
    }

    public void n(int i) {
        g().inflate(i, f());
    }

    public final void o(Drawable drawable) {
        if (drawable != null) {
            K();
            if (!M(this.d)) {
                J(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && M(imageView)) {
                removeView(this.d);
                this.q.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.L = false;
            actionMasked = 9;
        }
        if (!this.L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.L = true;
                }
                if (i != 10 || i == 3) {
                    this.L = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.L = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ba A[LOOP:0: B:45:0x02b8->B:46:0x02ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dc A[LOOP:1: B:49:0x02da->B:50:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0300 A[LOOP:2: B:53:0x02fe->B:54:0x0300, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0350 A[LOOP:3: B:62:0x034e->B:63:0x0350, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = qn.a(this);
        int i9 = !a ? 1 : 0;
        int i10 = 0;
        if (N(this.z)) {
            Q(this.z, i, 0, i2, this.A);
            i3 = this.z.getMeasuredWidth() + O(this.z);
            i4 = Math.max(0, this.z.getMeasuredHeight() + P(this.z));
            i5 = View.combineMeasuredStates(0, this.z.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (N(this.g)) {
            Q(this.g, i, 0, i2, this.A);
            i3 = this.g.getMeasuredWidth() + O(this.g);
            i4 = Math.max(i4, this.g.getMeasuredHeight() + P(this.g));
            i5 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
        }
        int[] iArr = this.N;
        int d = d();
        int max = Math.max(d, i3);
        iArr[a ? 1 : 0] = Math.max(0, d - i3);
        if (N(this.a)) {
            Q(this.a, i, max, i2, this.A);
            i6 = this.a.getMeasuredWidth() + O(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + P(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c = c();
        int max2 = max + Math.max(c, i6);
        iArr[i9] = Math.max(0, c - i6);
        if (N(this.h)) {
            max2 += H(this.h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.h.getMeasuredHeight() + P(this.h));
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        if (N(this.d)) {
            max2 += H(this.d, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + P(this.d));
            i5 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((py) childAt.getLayoutParams()).b == 0 && N(childAt)) {
                max2 += H(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + P(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.D + this.E;
        int i13 = this.B + this.C;
        if (N(this.b)) {
            H(this.b, i, max2 + i13, i2, i12, iArr);
            i10 = this.b.getMeasuredWidth() + O(this.b);
            int measuredHeight = this.b.getMeasuredHeight() + P(this.b);
            i7 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
            i8 = measuredHeight;
        } else {
            i7 = i5;
            i8 = 0;
        }
        if (N(this.c)) {
            i10 = Math.max(i10, H(this.c, i, max2 + i13, i2, i8 + i12, iArr));
            i8 += this.c.getMeasuredHeight() + P(this.c);
            i7 = View.combineMeasuredStates(i7, this.c.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        ij ijVar;
        MenuItem findItem;
        if (!(parcelable instanceof qa)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qa qaVar = (qa) parcelable;
        super.onRestoreInstanceState(qaVar.d);
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            ijVar = actionMenuView.a;
        } else {
            ijVar = null;
        }
        int i = qaVar.a;
        if (i != 0 && this.u != null && ijVar != null && (findItem = ijVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (qaVar.b) {
            removeCallbacks(this.R);
            post(this.R);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        ot otVar = this.n;
        boolean z = otVar.g;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        if (z2 == z) {
            return;
        }
        otVar.g = z2;
        if (otVar.h) {
            if (z2) {
                int i2 = otVar.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = otVar.e;
                }
                otVar.a = i2;
                int i3 = otVar.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = otVar.f;
                }
                otVar.b = i3;
                return;
            }
            int i4 = otVar.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = otVar.e;
            }
            otVar.a = i4;
            int i5 = otVar.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = otVar.f;
            }
            otVar.b = i5;
            return;
        }
        otVar.a = otVar.e;
        otVar.b = otVar.f;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        im imVar;
        qa qaVar = new qa(super.onSaveInstanceState());
        px pxVar = this.u;
        if (pxVar != null && (imVar = pxVar.b) != null) {
            qaVar.a = imVar.a;
        }
        qaVar.b = z();
        return qaVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public final void p(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            L();
        }
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.z.setTooltipText(charSequence);
        }
    }

    public final void q(int i) {
        r(d.f(getContext(), i));
    }

    public void r(Drawable drawable) {
        if (drawable != null) {
            L();
            if (!M(this.z)) {
                J(this.z, true);
            }
        } else {
            ImageButton imageButton = this.z;
            if (imageButton != null && M(imageButton)) {
                removeView(this.z);
                this.q.remove(this.z);
            }
        }
        ImageButton imageButton2 = this.z;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void s(View.OnClickListener onClickListener) {
        L();
        this.z.setOnClickListener(onClickListener);
    }

    public final void t(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void u(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!M(this.c)) {
                J(this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && M(textView)) {
                removeView(this.c);
                this.q.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.p = charSequence;
    }

    public final void v(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!M(this.b)) {
                J(this.b, true);
            }
        } else {
            TextView textView = this.b;
            if (textView != null && M(textView)) {
                removeView(this.b);
                this.q.remove(this.b);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final void w(ColorStateList colorStateList) {
        this.I = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void x() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            findOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            byte[] bArr = null;
            if (y() && findOnBackInvokedDispatcher != null && isAttachedToWindow() && this.x) {
                if (this.Q == null) {
                    if (this.P == null) {
                        this.P = new pw(new ou(this, 4, bArr), 0);
                    }
                    findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.P);
                    this.Q = findOnBackInvokedDispatcher;
                    return;
                }
                return;
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
            if (onBackInvokedDispatcher != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.P);
                this.Q = null;
            }
        }
    }

    public final boolean y() {
        px pxVar = this.u;
        if (pxVar != null && pxVar.b != null) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null && actionMenuView.j()) {
            return true;
        }
        return false;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return C(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.q = new ArrayList();
        this.N = new int[2];
        this.y = new kkc(new ou(this, 5, null));
        this.r = new ArrayList();
        this.S = new qdq(this, null);
        this.R = new ou(this, 6);
        ktk A = ktk.A(getContext(), attributeSet, gc.z, i, 0);
        eek.m(this, context, gc.z, attributeSet, (TypedArray) A.b, i, 0);
        this.k = A.n(28, 0);
        this.l = A.n(19, 0);
        this.H = A.l(0, this.H);
        this.m = A.l(2, 48);
        int i2 = A.i(22, 0);
        i2 = A.v(27) ? A.i(27, i2) : i2;
        this.E = i2;
        this.D = i2;
        this.C = i2;
        this.B = i2;
        int i3 = A.i(25, -1);
        if (i3 >= 0) {
            this.B = i3;
        }
        int i4 = A.i(24, -1);
        if (i4 >= 0) {
            this.C = i4;
        }
        int i5 = A.i(26, -1);
        if (i5 >= 0) {
            this.D = i5;
        }
        int i6 = A.i(23, -1);
        if (i6 >= 0) {
            this.E = i6;
        }
        this.A = A.j(13, -1);
        int i7 = A.i(9, Integer.MIN_VALUE);
        int i8 = A.i(5, Integer.MIN_VALUE);
        int j = A.j(7, 0);
        int j2 = A.j(8, 0);
        k();
        ot otVar = this.n;
        otVar.h = false;
        if (j != Integer.MIN_VALUE) {
            otVar.e = j;
            otVar.a = j;
        }
        if (j2 != Integer.MIN_VALUE) {
            otVar.f = j2;
            otVar.b = j2;
        }
        if (i7 != Integer.MIN_VALUE || i8 != Integer.MIN_VALUE) {
            otVar.a(i7, i8);
        }
        this.F = A.i(10, Integer.MIN_VALUE);
        this.G = A.i(6, Integer.MIN_VALUE);
        this.e = A.p(4);
        this.f = A.r(3);
        CharSequence r = A.r(21);
        if (!TextUtils.isEmpty(r)) {
            v(r);
        }
        CharSequence r2 = A.r(18);
        if (!TextUtils.isEmpty(r2)) {
            u(r2);
        }
        this.i = getContext();
        t(A.n(17, 0));
        Drawable p = A.p(16);
        if (p != null) {
            r(p);
        }
        CharSequence r3 = A.r(15);
        if (!TextUtils.isEmpty(r3)) {
            p(r3);
        }
        Drawable p2 = A.p(11);
        if (p2 != null) {
            o(p2);
        }
        CharSequence r4 = A.r(12);
        if (!TextUtils.isEmpty(r4)) {
            if (!TextUtils.isEmpty(r4)) {
                K();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(r4);
            }
        }
        if (A.v(29)) {
            w(A.o(29));
        }
        if (A.v(20)) {
            ColorStateList o = A.o(20);
            this.J = o;
            TextView textView = this.c;
            if (textView != null) {
                textView.setTextColor(o);
            }
        }
        if (A.v(14)) {
            n(A.n(14, 0));
        }
        A.t();
    }
}
