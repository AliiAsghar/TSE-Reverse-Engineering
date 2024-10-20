package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import defpackage.ajus;
import defpackage.ajuu;
import defpackage.ajvp;
import defpackage.brg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class IntrinsicSizeFrameLayout extends FrameLayout {
    private int a;
    private int b;
    private Object c;
    private final Rect d;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        this.d = new Rect();
        b(context, null, 0);
    }

    private final int a(int i, int i2) {
        if (i2 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(this.a, 1073741824);
            }
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), 1073741824);
            }
            return i;
        }
        return i;
    }

    private final void b(Context context, AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajvp.k, i, 0);
            this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            if (d.r()) {
                if (ajuu.h(context).r(ajus.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT)) {
                    this.a = (int) ajuu.h(context).a(context, ajus.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT);
                }
                if (ajuu.h(context).r(ajus.CONFIG_CARD_VIEW_INTRINSIC_WIDTH)) {
                    this.b = (int) ajuu.h(context).a(context, ajus.CONFIG_CARD_VIEW_INTRINSIC_WIDTH);
                }
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.c = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            requestApplyInsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int a;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (Build.VERSION.SDK_INT >= 31) {
            currentWindowMetrics = ((WindowManager) getContext().getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            Rect rect = this.d;
            bounds = currentWindowMetrics.getBounds();
            rect.set(bounds);
            Display display = getDisplay();
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                if (this.d.width() > 0 && this.d.width() < displayMetrics.widthPixels) {
                    getWindowVisibleDisplayFrame(this.d);
                    a = View.MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824);
                    super.onMeasure(a, a(i2, this.a));
                }
            }
        }
        a = a(i, this.b);
        super.onMeasure(a, a(i2, this.a));
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (d.r() && this.a == 0 && this.b == 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            setElevation(brg.a);
        }
        super.setLayoutParams(layoutParams);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        this.d = new Rect();
        b(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 0;
        this.d = new Rect();
        b(context, attributeSet, i);
    }
}
