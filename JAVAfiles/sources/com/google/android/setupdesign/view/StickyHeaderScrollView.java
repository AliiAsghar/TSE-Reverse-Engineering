package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class StickyHeaderScrollView extends BottomScrollView {
    private View b;
    private View c;
    private int d;

    public StickyHeaderScrollView(Context context) {
        super(context);
        this.d = 0;
    }

    private final void b() {
        View view;
        int i;
        View view2 = this.b;
        if (view2 != null) {
            View view3 = this.c;
            if (view3 != null) {
                view = view3;
            } else {
                view = view2;
            }
            if (view3 != null) {
                i = view2.getTop();
            } else {
                i = 0;
            }
            if ((view.getTop() - getScrollY()) + i >= this.d && view.isShown()) {
                view.setTranslationY(brg.a);
            } else {
                view.setTranslationY(getScrollY() - i);
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.d = windowInsets.getSystemWindowInsetTop();
            return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupdesign.view.BottomScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b == null) {
            this.b = findViewWithTag("sticky");
            this.c = findViewWithTag("stickyContainer");
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupdesign.view.BottomScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        b();
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
    }
}
