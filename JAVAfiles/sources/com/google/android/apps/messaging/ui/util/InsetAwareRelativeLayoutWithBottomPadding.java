package com.google.android.apps.messaging.ui.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InsetAwareRelativeLayoutWithBottomPadding extends RelativeLayout {
    public InsetAwareRelativeLayoutWithBottomPadding(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }

    public InsetAwareRelativeLayoutWithBottomPadding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetAwareRelativeLayoutWithBottomPadding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
