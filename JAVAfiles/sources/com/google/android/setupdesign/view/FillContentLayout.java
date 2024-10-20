package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.ajus;
import defpackage.ajuu;
import defpackage.ajvp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FillContentLayout extends FrameLayout {
    private int a;
    private int b;

    public FillContentLayout(Context context) {
        this(context, null);
    }

    private static int a(int i, int i2, int i3) {
        int max = Math.max(0, i - i2);
        if (i3 >= 0) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (i3 == -1) {
            return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (i3 != -2) {
            return 0;
        }
        return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            childAt.measure(a(Math.min(this.a, measuredWidth), getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), a(Math.min(this.b, measuredHeight), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        }
    }

    public FillContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sudFillContentLayoutStyle);
    }

    public FillContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajvp.e, i, 0);
        if (ajuu.h(context).r(ajus.CONFIG_ILLUSTRATION_MAX_HEIGHT)) {
            this.b = (int) ajuu.h(context).a(context, ajus.CONFIG_ILLUSTRATION_MAX_HEIGHT);
        } else {
            this.b = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        if (ajuu.h(context).r(ajus.CONFIG_ILLUSTRATION_MAX_WIDTH)) {
            this.a = (int) ajuu.h(context).a(context, ajus.CONFIG_ILLUSTRATION_MAX_WIDTH);
        } else {
            this.a = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        obtainStyledAttributes.recycle();
    }
}
