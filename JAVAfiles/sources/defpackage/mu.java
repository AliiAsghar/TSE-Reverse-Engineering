package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mu extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.support.v7.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public mu(Context context) {
        this(context, null);
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                mt mtVar = (mt) virtualChildAt.getLayoutParams();
                if (mtVar.height == -1) {
                    int i4 = mtVar.width;
                    mtVar.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    mtVar.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                mt mtVar = (mt) virtualChildAt.getLayoutParams();
                if (mtVar.width == -1) {
                    int i4 = mtVar.height;
                    mtVar.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    mtVar.height = i4;
                }
            }
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mt;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean a = qn.a(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                mt mtVar = (mt) virtualChildAt.getLayoutParams();
                if (a) {
                    left2 = virtualChildAt.getRight() + mtVar.rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - mtVar.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                if (a) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.mDividerWidth;
                    right = left - i;
                }
            } else {
                mt mtVar2 = (mt) virtualChildAt2.getLayoutParams();
                if (a) {
                    left = virtualChildAt2.getLeft() - mtVar2.leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + mtVar2.rightMargin;
                }
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((mt) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((mt) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public mt generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new mt(-2);
        }
        if (i == 1) {
            return new mt(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public mt generateLayoutParams(AttributeSet attributeSet) {
        return new mt(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.mBaselineAlignedChildIndex == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.mBaselineChildTop;
            if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                }
            }
            return i3 + ((mt) childAt.getLayoutParams()).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            if ((this.mShowDividers & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i == getChildCount()) {
            if ((this.mShowDividers & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        do {
            i--;
            if (i < 0) {
                return false;
            }
        } while (getChildAt(i).getVisibility() == 8);
        return true;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutHorizontal(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu.layoutHorizontal(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutVertical(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r0 = r20 - r18
            int r7 = r17.getPaddingLeft()
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.mGravity
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.getVirtualChildAt(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.measureNullChild(r12)
            int r0 = r0 + r1
            goto Lc7
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc7
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            mt r5 = (defpackage.mt) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = r17.getLayoutDirection()
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.hasDividerBeforeChildAt(r12)
            if (r1 == 0) goto La2
            int r1 = r6.mDividerHeight
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.getLocationOffset(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.getNextLocationOffset(r13)
            int r15 = r15 + r0
            int r0 = r6.getChildrenSkipCount(r13, r12)
            int r12 = r12 + r0
            int r16 = r16 + r15
            r0 = r16
            r1 = 1
            goto Lc8
        Lc7:
            r1 = r14
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu.layoutVertical(int, int, int, int):void");
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureHorizontal(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu.measureHorizontal(int, int):void");
    }

    public int measureNullChild(int i) {
        return 0;
    }

    public void measureVertical(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        char c;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        boolean z3;
        int i20;
        boolean z4;
        boolean z5;
        int i21;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i22 = this.mBaselineAlignedChildIndex;
        boolean z6 = this.mUseLargestChild;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z7 = false;
        int i28 = 0;
        boolean z8 = false;
        float f = 0.0f;
        boolean z9 = true;
        while (i27 < virtualChildCount) {
            int i29 = i26;
            View virtualChildAt = getVirtualChildAt(i27);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i27);
            } else if (virtualChildAt.getVisibility() == 8) {
                i27 += getChildrenSkipCount(virtualChildAt, i27);
            } else {
                if (hasDividerBeforeChildAt(i27)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                mt mtVar = (mt) virtualChildAt.getLayoutParams();
                float f2 = f + mtVar.weight;
                if (mode2 == 1073741824 && mtVar.height == 0 && mtVar.weight > brg.a) {
                    int i30 = this.mTotalLength;
                    this.mTotalLength = Math.max(i30, mtVar.topMargin + i30 + mtVar.bottomMargin);
                    i15 = i25;
                    view = virtualChildAt;
                    i18 = i27;
                    i19 = virtualChildCount;
                    i14 = i23;
                    z3 = true;
                    i16 = mode2;
                    i17 = i29;
                } else {
                    int i31 = i23;
                    if (mtVar.height == 0 && mtVar.weight > brg.a) {
                        mtVar.height = -2;
                        c = 0;
                    } else {
                        c = 0;
                    }
                    if (f2 == brg.a) {
                        i13 = this.mTotalLength;
                    } else {
                        i13 = 0;
                    }
                    i14 = i31;
                    int i32 = i24;
                    i15 = i25;
                    i16 = mode2;
                    i17 = i29;
                    i18 = i27;
                    i19 = virtualChildCount;
                    char c2 = c;
                    measureChildBeforeLayout(virtualChildAt, i27, i, 0, i2, i13);
                    if (c2 != 0) {
                        mtVar.height = 0;
                    }
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    int i33 = this.mTotalLength;
                    view = virtualChildAt;
                    this.mTotalLength = Math.max(i33, i33 + measuredHeight + mtVar.topMargin + mtVar.bottomMargin + getNextLocationOffset(view));
                    if (z6) {
                        i24 = Math.max(measuredHeight, i32);
                    } else {
                        i24 = i32;
                    }
                    z3 = z7;
                }
                if (i22 >= 0) {
                    i20 = i18;
                    if (i22 == i20 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                } else {
                    i20 = i18;
                }
                if (i20 < i22 && mtVar.weight > brg.a) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode != 1073741824 && mtVar.width == -1) {
                    z4 = true;
                    z8 = true;
                } else {
                    z4 = false;
                }
                int i34 = mtVar.leftMargin + mtVar.rightMargin;
                int measuredWidth = view.getMeasuredWidth() + i34;
                int max = Math.max(i14, measuredWidth);
                z7 = z3;
                i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                if (z9 && mtVar.width == -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (true != z4) {
                    i34 = measuredWidth;
                }
                if (mtVar.weight > brg.a) {
                    i21 = Math.max(i15, i34);
                    i26 = i17;
                } else {
                    i26 = Math.max(i17, i34);
                    i21 = i15;
                }
                i27 = i20 + getChildrenSkipCount(view, i20);
                i25 = i21;
                z9 = z5;
                i23 = max;
                f = f2;
                i27++;
                mode2 = i16;
                virtualChildCount = i19;
            }
            i19 = virtualChildCount;
            i16 = mode2;
            i26 = i29;
            i27++;
            mode2 = i16;
            virtualChildCount = i19;
        }
        int i35 = i23;
        int i36 = i24;
        int i37 = i25;
        int i38 = 8;
        int i39 = virtualChildCount;
        int i40 = mode2;
        int i41 = i28;
        int i42 = i26;
        if (this.mTotalLength > 0) {
            i3 = i39;
            if (hasDividerBeforeChildAt(i3)) {
                this.mTotalLength += this.mDividerHeight;
            }
        } else {
            i3 = i39;
        }
        if (z6) {
            i4 = i40;
            if (i4 != Integer.MIN_VALUE) {
                if (i4 == 0) {
                    i4 = 0;
                } else {
                    z = true;
                }
            }
            this.mTotalLength = 0;
            int i43 = 0;
            while (i43 < i3) {
                View virtualChildAt2 = getVirtualChildAt(i43);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(i43);
                } else if (virtualChildAt2.getVisibility() == i38) {
                    i43 += getChildrenSkipCount(virtualChildAt2, i43);
                } else {
                    mt mtVar2 = (mt) virtualChildAt2.getLayoutParams();
                    int i44 = this.mTotalLength;
                    this.mTotalLength = Math.max(i44, i44 + i36 + mtVar2.topMargin + mtVar2.bottomMargin + getNextLocationOffset(virtualChildAt2));
                }
                i43++;
                i38 = 8;
            }
            z = true;
        } else {
            i4 = i40;
            z = false;
        }
        int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
        this.mTotalLength = paddingTop;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
        int i45 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (!z7 && (i45 == 0 || f <= brg.a)) {
            i7 = Math.max(i42, i37);
            if (z && i4 != 1073741824) {
                for (int i46 = 0; i46 < i3; i46++) {
                    View virtualChildAt3 = getVirtualChildAt(i46);
                    if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((mt) virtualChildAt3.getLayoutParams()).weight > brg.a) {
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                    }
                }
            }
            i5 = i;
            i6 = i35;
        } else {
            float f3 = this.mWeightSum;
            if (f3 > brg.a) {
                f = f3;
            }
            this.mTotalLength = 0;
            int i47 = i41;
            float f4 = f;
            int i48 = 0;
            while (i48 < i3) {
                View virtualChildAt4 = getVirtualChildAt(i48);
                if (virtualChildAt4.getVisibility() != 8) {
                    mt mtVar3 = (mt) virtualChildAt4.getLayoutParams();
                    float f5 = mtVar3.weight;
                    if (f5 > brg.a) {
                        float f6 = (i45 * f5) / f4;
                        float f7 = f4 - f5;
                        int i49 = (int) f6;
                        int i50 = i45 - i49;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + mtVar3.leftMargin + mtVar3.rightMargin, mtVar3.width);
                        if (mtVar3.height == 0) {
                            i12 = 1073741824;
                            if (i4 == 1073741824) {
                                if (i49 <= 0) {
                                    i49 = 0;
                                }
                                virtualChildAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                                i47 = View.combineMeasuredStates(i47, virtualChildAt4.getMeasuredState() & (-256));
                                f4 = f7;
                                i9 = i50;
                            }
                        } else {
                            i12 = 1073741824;
                        }
                        int measuredHeight2 = virtualChildAt4.getMeasuredHeight() + i49;
                        if (measuredHeight2 < 0) {
                            measuredHeight2 = 0;
                        }
                        virtualChildAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i12));
                        i47 = View.combineMeasuredStates(i47, virtualChildAt4.getMeasuredState() & (-256));
                        f4 = f7;
                        i9 = i50;
                    } else {
                        i9 = i45;
                    }
                    int i51 = i9;
                    int i52 = mtVar3.leftMargin + mtVar3.rightMargin;
                    int measuredWidth2 = virtualChildAt4.getMeasuredWidth() + i52;
                    i35 = Math.max(i35, measuredWidth2);
                    if (mode != 1073741824) {
                        i10 = -1;
                        if (mtVar3.width == -1) {
                            i11 = i52;
                            int max2 = Math.max(i42, i11);
                            if (!z9 && mtVar3.width == i10) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i53 = this.mTotalLength;
                            this.mTotalLength = Math.max(i53, i53 + virtualChildAt4.getMeasuredHeight() + mtVar3.topMargin + mtVar3.bottomMargin + getNextLocationOffset(virtualChildAt4));
                            z9 = z2;
                            i8 = i51;
                            i42 = max2;
                        }
                    } else {
                        i10 = -1;
                    }
                    i11 = measuredWidth2;
                    int max22 = Math.max(i42, i11);
                    if (!z9) {
                    }
                    z2 = false;
                    int i532 = this.mTotalLength;
                    this.mTotalLength = Math.max(i532, i532 + virtualChildAt4.getMeasuredHeight() + mtVar3.topMargin + mtVar3.bottomMargin + getNextLocationOffset(virtualChildAt4));
                    z9 = z2;
                    i8 = i51;
                    i42 = max22;
                } else {
                    i8 = i45;
                }
                i48++;
                i45 = i8;
            }
            i5 = i;
            this.mTotalLength += getPaddingTop() + getPaddingBottom();
            i6 = i35;
            i41 = i47;
            i7 = i42;
        }
        if (z9 || mode == 1073741824) {
            i7 = i6;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i5, i41), resolveSizeAndState);
        if (z8) {
            forceUniformWidth(i3, i2);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        boolean z = false;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = this.mGravity;
        int i3 = i & 8388615;
        if ((i2 & 8388615) != i3) {
            this.mGravity = i3 | (i2 & (-8388616));
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = this.mGravity;
        int i3 = i & 112;
        if ((i2 & 112) != i3) {
            this.mGravity = i3 | (i2 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(brg.a, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public mu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        ktk A = ktk.A(context, attributeSet, gc.o, i, 0);
        eek.m(this, context, gc.o, attributeSet, (TypedArray) A.b, i, 0);
        int k = A.k(1, -1);
        if (k >= 0) {
            setOrientation(k);
        }
        int k2 = A.k(0, -1);
        if (k2 >= 0) {
            setGravity(k2);
        }
        if (!A.u(2, true)) {
            setBaselineAligned(false);
        }
        this.mWeightSum = ((TypedArray) A.b).getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = A.k(3, -1);
        this.mUseLargestChild = A.u(7, false);
        setDividerDrawable(A.p(5));
        this.mShowDividers = A.k(8, 0);
        this.mDividerPadding = A.j(6, 0);
        A.t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public mt generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof mt) {
            return new mt((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new mt((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new mt(layoutParams);
    }
}
