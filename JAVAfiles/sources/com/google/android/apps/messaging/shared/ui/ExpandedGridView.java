package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExpandedGridView extends GridView {
    public ExpandedGridView(Context context) {
        super(context);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public ExpandedGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
