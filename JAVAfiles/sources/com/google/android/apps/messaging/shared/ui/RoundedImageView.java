package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.albo;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.brg;
import defpackage.xuf;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RoundedImageView extends ImageView {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/ui/RoundedImageView");
    protected final RectF A;
    protected final int B;
    protected final boolean C;
    public int u;
    public float[] v;
    protected final Path w;
    protected int x;
    protected int y;
    protected int z;

    public RoundedImageView(Context context) {
        super(context);
        this.A = new RectF();
        this.w = new Path();
        this.u = 0;
        this.z = 0;
        this.B = 0;
        this.C = false;
    }

    private static int b(View view) {
        int i;
        int b;
        int i2;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((!(layoutParams instanceof LinearLayout.LayoutParams) || ((LinearLayout.LayoutParams) layoutParams).weight == brg.a) && (i = layoutParams.width) > 0 && i < Integer.MAX_VALUE) {
            return i - paddingTop;
        }
        if (layoutParams.height != -1 || !(view.getParent() instanceof View) || (b = b((View) view.getParent())) <= 0 || b >= Integer.MAX_VALUE) {
            return -1;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i2 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        return (b - paddingTop) - i2;
    }

    private static int c(View view) {
        int i;
        int c;
        int i2;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((!(layoutParams instanceof LinearLayout.LayoutParams) || ((LinearLayout.LayoutParams) layoutParams).weight == brg.a) && (i = layoutParams.width) > 0 && i < Integer.MAX_VALUE) {
            return i - paddingLeft;
        }
        if (layoutParams.width != -1 || !(view.getParent() instanceof View) || (c = c((View) view.getParent())) <= 0 || c >= Integer.MAX_VALUE) {
            return -1;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i2 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        } else {
            i2 = 0;
        }
        return (c - paddingLeft) - i2;
    }

    private static int d(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    xyl.c("Unreachable");
                }
                return size;
            }
            return Math.min(i, i2);
        }
        return albo.ct(i, size, i2);
    }

    protected static final int s(int i, int i2) {
        return Math.min((int) Math.ceil(i2 * 1.7777778f), i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.u <= 0 && this.v == null) {
            try {
                super.onDraw(canvas);
                return;
            } catch (RuntimeException e) {
                alvw h = a.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", (char) 137, "RoundedImageView.java")).q("AsyncImageView: Got runtime exception ");
                alvw d = a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", 138, "RoundedImageView.java")).t("AsyncImageView: AsyncImageView.getParent() %s", getParent());
                return;
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.x != width || this.y != height) {
            this.A.set(getPaddingLeft(), getPaddingTop(), width - getPaddingRight(), height - getPaddingBottom());
            this.w.reset();
            float[] fArr = this.v;
            if (fArr != null) {
                this.w.addRoundRect(this.A, fArr, Path.Direction.CW);
            } else {
                Path path = this.w;
                RectF rectF = this.A;
                float f = this.u;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
            }
            this.x = width;
            this.y = height;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipPath(this.w);
        canvas.drawColor(this.z);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e2) {
            alvw h2 = a.h();
            h2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h2).g(e2)).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", '{', "RoundedImageView.java")).q("AsyncImageView: Got runtime exception ");
            alvw d2 = a.d();
            d2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/ui/RoundedImageView", "onDraw", 124, "RoundedImageView.java")).t("AsyncImageView: AsyncImageView.getParent() %s", getParent());
        }
        if (isSelected()) {
            canvas.drawColor(this.B);
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (getAdjustViewBounds()) {
                if (this.C) {
                    int s = s(measuredWidth, measuredHeight);
                    measuredHeight = s(measuredHeight, measuredWidth);
                    measuredWidth = s;
                } else if (measuredWidth < getMinimumWidth()) {
                    if (measuredHeight >= getMinimumHeight()) {
                    }
                }
                int mode = View.MeasureSpec.getMode(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                if (mode != 1073741824 || mode2 != 1073741824) {
                    int d = d(getMinimumWidth(), getMaxWidth(), i);
                    int d2 = d(getMinimumHeight(), getMaxHeight(), i2);
                    float f = measuredWidth / measuredHeight;
                    if (f != brg.a) {
                        if (measuredWidth < d) {
                            measuredHeight = d((int) (d / f), getMaxHeight(), i2);
                            measuredWidth = (int) (measuredHeight * f);
                        }
                        if (measuredHeight < d2) {
                            measuredWidth = d((int) (d2 * f), getMaxWidth(), i);
                            measuredHeight = (int) (measuredWidth / f);
                        }
                        setMeasuredDimension(measuredWidth, measuredHeight);
                    }
                }
            }
        } finally {
            a();
        }
    }

    public final int p() {
        int i;
        int b = b(this);
        int maxHeight = getMaxHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (maxHeight > 0 && maxHeight < Integer.MAX_VALUE && ((i = maxHeight - paddingTop) < b || b == -1)) {
            return i;
        }
        return b;
    }

    public final int q() {
        int i;
        int c = c(this);
        int maxWidth = getMaxWidth();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        if (maxWidth > 0 && maxWidth < Integer.MAX_VALUE && ((i = maxWidth - paddingLeft) < c || c == -1)) {
            return i;
        }
        return c;
    }

    public final void r(float[] fArr) {
        this.v = fArr;
        this.x = 0;
        this.y = 0;
        invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new RectF();
        this.w = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xuf.c, 0, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.z = obtainStyledAttributes.getColor(2, 0);
        this.B = obtainStyledAttributes.getColor(6, 0);
        this.C = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    protected void a() {
    }
}
