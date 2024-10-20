package com.google.android.apps.messaging.ui.toolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.ko;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleToolbar extends Toolbar {
    public BugleToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void r(Drawable drawable) {
        super.r(drawable);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ko) {
                ko koVar = (ko) childAt;
                ViewGroup.LayoutParams layoutParams = koVar.getLayoutParams();
                layoutParams.height = -1;
                koVar.setImageDrawable(drawable);
                if (koVar.getContentDescription() == null) {
                    koVar.setContentDescription(getContext().getString(R.string.abc_toolbar_collapse_description));
                }
                koVar.setLayoutParams(layoutParams);
            }
        }
    }

    public BugleToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
