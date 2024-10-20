package com.google.android.apps.messaging.ui.maxheight;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ScrollView;
import defpackage.aaoz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaxHeightScrollView extends ScrollView {
    private final int a;

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aaoz.b, 0, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a != -1) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), this.a));
        }
    }
}
