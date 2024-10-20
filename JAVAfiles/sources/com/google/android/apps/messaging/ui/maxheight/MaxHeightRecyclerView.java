package com.google.android.apps.messaging.ui.maxheight;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.aaoz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaxHeightRecyclerView extends RecyclerView {
    private final int ab;

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aaoz.a, 0, 0);
        this.ab = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ab != -1) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), this.ab));
        }
    }
}
