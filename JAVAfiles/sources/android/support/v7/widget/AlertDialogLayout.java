package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.eek;
import defpackage.mt;
import defpackage.mu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AlertDialogLayout extends mu {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    private static int a(View view) {
        int[] iArr = eek.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // defpackage.mu, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r13 = r13 - r11
            int r10 = r9.getPaddingLeft()
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r3 + r14
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = r0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lae
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lab
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lab
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            mt r6 = (defpackage.mt) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8c
            r8 = 5
            if (r7 == r8) goto L87
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L97
        L87:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L96
        L8c:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L96:
            int r7 = r7 - r8
        L97:
            boolean r8 = r9.hasDividerBeforeChildAt(r0)
            if (r8 == 0) goto L9e
            int r12 = r12 + r14
        L9e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r12 = r12 + r5
        Lab:
            int r0 = r0 + 1
            goto L50
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mu, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        View view4 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view2 = childAt;
                } else if (id == R.id.buttonPanel) {
                    view3 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view4 == null) {
                    view4 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view2 != null) {
            view2.measure(i, 0);
            paddingTop += view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view2.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view3 != null) {
            view3.measure(i, 0);
            i4 = a(view3);
            i5 = view3.getMeasuredHeight() - i4;
            paddingTop += i4;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view4 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            }
            view4.measure(i, makeMeasureSpec);
            int measuredHeight = view4.getMeasuredHeight();
            paddingTop += measuredHeight;
            int combineMeasuredStates = View.combineMeasuredStates(i3, view4.getMeasuredState());
            i7 = measuredHeight;
            view = view4;
            i6 = combineMeasuredStates;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int i9 = size - paddingTop;
        if (view3 != null) {
            int i10 = paddingTop - i4;
            int min = Math.min(i9, i5);
            if (min > 0) {
                i9 -= min;
                i4 += min;
            }
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingTop = i10 + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        if (view != null && i9 > 0) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(i7 + i9, mode));
            paddingTop = (paddingTop - i7) + view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                i11 = Math.max(i11, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11 + getPaddingLeft() + getPaddingRight(), i, i6), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    mt mtVar = (mt) childAt3.getLayoutParams();
                    if (mtVar.width == -1) {
                        int i14 = mtVar.height;
                        mtVar.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i2, 0);
                        mtVar.height = i14;
                    }
                }
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
