package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {
    private View ac;
    private int ad;
    private final RectF ae;

    public StickyHeaderRecyclerView(Context context) {
        super(context);
        this.ad = 0;
        this.ae = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.ae.contains(motionEvent.getX(), motionEvent.getY())) {
            motionEvent.offsetLocation(-this.ae.left, -this.ae.top);
            return this.ab.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        View view;
        int i;
        super.draw(canvas);
        if (this.ac != null) {
            View view2 = this.ab;
            int save = canvas.save();
            if (view2 != null) {
                view = view2;
            } else {
                view = this.ac;
            }
            if (view2 != null) {
                i = this.ac.getTop();
            } else {
                i = 0;
            }
            if (view.getTop() + i >= this.ad && view.isShown()) {
                this.ae.setEmpty();
            } else {
                this.ae.set(brg.a, (-i) + this.ad, view.getWidth(), (view.getHeight() - i) + this.ad);
                canvas.translate(brg.a, this.ae.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.ad = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.ac == null && (view2 = this.ab) != null) {
            this.ac = view2.findViewWithTag("sticky");
        }
        if (this.ac != null && (view = this.ab) != null && view.getHeight() == 0) {
            view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ac != null) {
            measureChild(this.ab, i, i2);
        }
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = 0;
        this.ae = new RectF();
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = 0;
        this.ae = new RectF();
    }
}
