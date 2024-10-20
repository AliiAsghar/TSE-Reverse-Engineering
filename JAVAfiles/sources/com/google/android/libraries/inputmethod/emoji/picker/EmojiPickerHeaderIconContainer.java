package com.google.android.libraries.inputmethod.emoji.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiPickerHeaderIconContainer extends FrameLayout {
    public EmojiPickerHeaderIconContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.EmojiPickerStyleHeaderIconContainer, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, new int[]{android.R.attr.layout_width, android.R.attr.layout_height});
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(0, Integer.MIN_VALUE);
        int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(1, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutDimension != Integer.MIN_VALUE && layoutDimension2 != Integer.MIN_VALUE) {
                layoutParams.width = layoutDimension;
                layoutParams.height = layoutDimension2;
                setLayoutParams(layoutParams);
                return;
            }
            throw new IllegalArgumentException("android:layout_width and android:layout_height must be provided on the EmojiPickerStyleHeaderIconContainer style");
        }
        throw new IllegalStateException("Layout params are missing");
    }
}
