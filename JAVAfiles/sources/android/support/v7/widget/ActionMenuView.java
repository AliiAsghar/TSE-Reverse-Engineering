package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.brg;
import defpackage.ih;
import defpackage.ii;
import defpackage.ij;
import defpackage.im;
import defpackage.iu;
import defpackage.ix;
import defpackage.jq;
import defpackage.jr;
import defpackage.js;
import defpackage.jt;
import defpackage.ju;
import defpackage.mt;
import defpackage.mu;
import defpackage.qdq;
import defpackage.qn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends mu implements ii, ix {
    public ij a;
    public boolean b;
    public jq c;
    public ih d;
    public qdq e;
    private Context f;
    private int g;
    private iu h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final jt k() {
        jt jtVar = new jt();
        jtVar.gravity = 16;
        return jtVar;
    }

    public static final jt l(ViewGroup.LayoutParams layoutParams) {
        jt jtVar;
        if (layoutParams != null) {
            if (layoutParams instanceof jt) {
                jtVar = new jt((jt) layoutParams);
            } else {
                jtVar = new jt(layoutParams);
            }
            if (jtVar.gravity <= 0) {
                jtVar.gravity = 16;
            }
            return jtVar;
        }
        return k();
    }

    @Override // defpackage.ix
    public final void a(ij ijVar) {
        this.a = ijVar;
    }

    @Override // defpackage.ii
    public final boolean b(im imVar) {
        return this.a.z(imVar, 0);
    }

    @Override // defpackage.mu, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jt generateLayoutParams(AttributeSet attributeSet) {
        return new jt(getContext(), attributeSet);
    }

    @Override // defpackage.mu, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jt;
    }

    public final Menu d() {
        if (this.a == null) {
            Context context = getContext();
            ij ijVar = new ij(context);
            this.a = ijVar;
            ijVar.p(new ju(this, 0));
            jq jqVar = new jq(context);
            this.c = jqVar;
            jqVar.q();
            jq jqVar2 = this.c;
            iu iuVar = this.h;
            if (iuVar == null) {
                iuVar = new js();
            }
            jqVar2.e = iuVar;
            this.a.h(this.c, this.f);
            this.c.k(this);
        }
        return this.a;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void e() {
        jq jqVar = this.c;
        if (jqVar != null) {
            jqVar.o();
        }
    }

    public final void f(iu iuVar, ih ihVar) {
        this.h = iuVar;
        this.d = ihVar;
    }

    public final void g(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mu, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ mt generateDefaultLayoutParams() {
        return k();
    }

    public final void h(jq jqVar) {
        this.c = jqVar;
        jqVar.k(this);
    }

    protected final boolean i(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof jr)) {
            z = ((jr) childAt).c();
        }
        if (i > 0 && (childAt2 instanceof jr)) {
            return ((jr) childAt2).d() | z;
        }
        return z;
    }

    public final boolean j() {
        jq jqVar = this.c;
        if (jqVar != null && jqVar.m()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jq jqVar = this.c;
        if (jqVar != null) {
            jqVar.i();
            if (this.c.m()) {
                this.c.l();
                this.c.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mu, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = i4 - i2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a = qn.a(this);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i5 = i8 / 2;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                jt jtVar = (jt) childAt.getLayoutParams();
                if (jtVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + jtVar.leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - jtVar.rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i5 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + jtVar.leftMargin) + jtVar.rightMargin;
                    i(i10);
                    i12++;
                }
            }
            i10++;
        }
        if (childCount == 1) {
            if (i11 != 0) {
                childCount = 1;
            } else {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i14 = i5 - (measuredHeight2 / 2);
                int i15 = (i9 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i15, i14, measuredWidth2 + i15, measuredHeight2 + i14);
                return;
            }
        }
        int i16 = i12 - (i11 ^ 1);
        if (i16 > 0) {
            i6 = paddingRight / i16;
        } else {
            i6 = 0;
        }
        int max = Math.max(0, i6);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                jt jtVar2 = (jt) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !jtVar2.a) {
                    int i18 = width2 - jtVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + jtVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            jt jtVar3 = (jt) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !jtVar3.a) {
                int i21 = paddingLeft + jtVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + jtVar3.rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v23 */
    @Override // defpackage.mu, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ?? r6;
        boolean z5;
        boolean z6;
        int i10;
        int i11;
        int i12;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i13;
        boolean z8;
        ij ijVar;
        boolean z9 = this.i;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        if (z9 != z) {
            this.j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.i && (ijVar = this.a) != null && size != this.j) {
            this.j = size;
            ijVar.l(true);
        }
        int childCount = getChildCount();
        if (this.i && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int i14 = size2 - paddingLeft;
            int i15 = this.k;
            int i16 = i14 / i15;
            int i17 = i14 % i15;
            if (i16 == 0) {
                setMeasuredDimension(i14, 0);
                return;
            }
            int i18 = i15 + (i17 / i16);
            int childCount2 = getChildCount();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z10 = false;
            int i22 = 0;
            int i23 = 0;
            long j = 0;
            while (i21 < childCount2) {
                View childAt = getChildAt(i21);
                if (childAt.getVisibility() == 8) {
                    i11 = i14;
                    i9 = size3;
                    i12 = paddingTop;
                } else {
                    boolean z11 = childAt instanceof ActionMenuItemView;
                    int i24 = i19 + 1;
                    if (z11) {
                        int i25 = this.l;
                        i9 = size3;
                        r6 = 0;
                        childAt.setPadding(i25, 0, i25, 0);
                        z5 = true;
                    } else {
                        i9 = size3;
                        r6 = 0;
                        z5 = false;
                    }
                    jt jtVar = (jt) childAt.getLayoutParams();
                    jtVar.f = r6;
                    jtVar.c = r6;
                    jtVar.b = r6;
                    jtVar.d = r6;
                    jtVar.leftMargin = r6;
                    jtVar.rightMargin = r6;
                    if (z5 && ((ActionMenuItemView) childAt).b()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    jtVar.e = z6;
                    if (true != jtVar.a) {
                        i10 = i16;
                    } else {
                        i10 = 1;
                    }
                    jt jtVar2 = (jt) childAt.getLayoutParams();
                    i11 = i14;
                    i12 = paddingTop;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z11) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.b()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i10 > 0 && (!z7 || i10 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i18, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i13 = measuredWidth / i18;
                        if (measuredWidth % i18 != 0) {
                            i13++;
                        }
                        if (z7 && i13 < 2) {
                            i13 = 2;
                        }
                    } else {
                        i13 = 0;
                    }
                    if (!jtVar2.a && z7) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    jtVar2.d = z8;
                    jtVar2.b = i13;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i18, 1073741824), makeMeasureSpec);
                    i22 = Math.max(i22, i13);
                    if (jtVar.d) {
                        i20++;
                    }
                    z10 |= jtVar.a;
                    i16 -= i13;
                    i23 = Math.max(i23, childAt.getMeasuredHeight());
                    if (i13 == 1) {
                        j |= 1 << i21;
                    }
                    i19 = i24;
                }
                i21++;
                size3 = i9;
                paddingTop = i12;
                i14 = i11;
            }
            int i26 = i14;
            int i27 = size3;
            int i28 = i22;
            int i29 = i23;
            if (z10 && i19 == 2) {
                z2 = true;
                i19 = 2;
            } else {
                z2 = false;
            }
            boolean z12 = false;
            while (i20 > 0 && i16 > 0) {
                int i30 = Integer.MAX_VALUE;
                int i31 = 0;
                int i32 = 0;
                long j2 = 0;
                while (i32 < childCount2) {
                    int i33 = i29;
                    jt jtVar3 = (jt) getChildAt(i32).getLayoutParams();
                    boolean z13 = z12;
                    if (jtVar3.d) {
                        int i34 = jtVar3.b;
                        if (i34 < i30) {
                            j2 = 1 << i32;
                            i31 = 1;
                            i30 = i34;
                        } else if (i34 == i30) {
                            j2 |= 1 << i32;
                            i31++;
                        }
                    }
                    i32++;
                    z12 = z13;
                    i29 = i33;
                }
                i3 = i29;
                z3 = z12;
                j |= j2;
                if (i31 > i16) {
                    break;
                }
                int i35 = i30 + 1;
                int i36 = 0;
                while (i36 < childCount2) {
                    View childAt2 = getChildAt(i36);
                    jt jtVar4 = (jt) childAt2.getLayoutParams();
                    int i37 = i20;
                    long j3 = 1 << i36;
                    if ((j2 & j3) == 0) {
                        if (jtVar4.b == i35) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && jtVar4.e && i16 == 1) {
                            int i38 = this.l;
                            childAt2.setPadding(i38 + i18, 0, i38, 0);
                            i16 = 1;
                        }
                        jtVar4.b++;
                        jtVar4.f = true;
                        i16--;
                    }
                    i36++;
                    i20 = i37;
                }
                z12 = true;
                i29 = i3;
                i20 = i20;
            }
            i3 = i29;
            z3 = z12;
            if (!z10 && i19 == 1) {
                z4 = true;
                i4 = 1;
            } else {
                i4 = i19;
                z4 = false;
            }
            if (i16 > 0 && j != 0 && (i16 < i4 - 1 || z4 || i28 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    int i39 = childCount2 - 1;
                    if ((j & 1) != 0 && !((jt) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                    if ((j & (1 << i39)) != 0 && !((jt) getChildAt(i39).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > brg.a) {
                    i7 = (int) ((i16 * i18) / bitCount);
                } else {
                    i7 = 0;
                }
                int i40 = 0;
                while (i40 < childCount2) {
                    if ((j & (1 << i40)) != 0) {
                        View childAt3 = getChildAt(i40);
                        jt jtVar5 = (jt) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            jtVar5.c = i7;
                            jtVar5.f = true;
                            if (i40 == 0) {
                                if (!jtVar5.e) {
                                    jtVar5.leftMargin = (-i7) / 2;
                                }
                                i40 = 0;
                            }
                        } else if (jtVar5.a) {
                            jtVar5.c = i7;
                            jtVar5.f = true;
                            jtVar5.rightMargin = (-i7) / 2;
                        } else {
                            int i41 = childCount2 - 1;
                            if (i40 != 0) {
                                jtVar5.leftMargin = i7 / 2;
                            }
                            if (i40 != i41) {
                                jtVar5.rightMargin = i7 / 2;
                            }
                        }
                        i8 = 1;
                        z3 = true;
                        i40 += i8;
                    }
                    i8 = 1;
                    i40 += i8;
                }
            }
            if (z3) {
                for (int i42 = 0; i42 < childCount2; i42++) {
                    View childAt4 = getChildAt(i42);
                    jt jtVar6 = (jt) childAt4.getLayoutParams();
                    if (jtVar6.f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((jtVar6.b * i18) + jtVar6.c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode == 1073741824) {
                i6 = i27;
                i5 = i26;
            } else {
                i5 = i26;
                i6 = i3;
            }
            setMeasuredDimension(i5, i6);
            return;
        }
        for (int i43 = 0; i43 < childCount; i43++) {
            jt jtVar7 = (jt) getChildAt(i43).getLayoutParams();
            jtVar7.rightMargin = 0;
            jtVar7.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f = context;
        this.g = 0;
    }

    @Override // defpackage.mu, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mu, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ mt generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    @Override // defpackage.mu, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }
}
