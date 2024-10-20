package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import defpackage.ajdd;
import defpackage.ajkq;
import defpackage.ajkr;
import defpackage.ajlc;
import defpackage.ajld;
import defpackage.ajlf;
import defpackage.ajlh;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MaskableFrameLayout extends FrameLayout implements ajlc {
    private float a;
    private final RectF b;
    private final Rect c;
    private ajkr d;
    private final ajld e;
    private Boolean f;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public final void a(RectF rectF) {
        this.b.set(rectF);
        ajld ajldVar = this.e;
        ajldVar.c = this.b;
        ajldVar.c();
        ajldVar.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        ajld ajldVar = this.e;
        if (ajldVar.d() && !ajldVar.d.isEmpty()) {
            canvas.save();
            canvas.clipPath(ajldVar.d);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // defpackage.ajlc
    public final void fn(ajkr ajkrVar) {
        ajkr c = ajkrVar.c(new ajkq() { // from class: ajfk
            @Override // defpackage.ajkq
            public final ajkg a(ajkg ajkgVar) {
                if (ajkgVar instanceof ajkd) {
                    return new ajkf(((ajkd) ajkgVar).a);
                }
                return ajkgVar;
            }
        });
        this.d = c;
        ajld ajldVar = this.e;
        ajldVar.b = c;
        ajldVar.c();
        ajldVar.a(this);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        rect.set((int) this.b.left, (int) this.b.top, (int) this.b.right, (int) this.b.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f;
        if (bool != null) {
            this.e.b(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f = Boolean.valueOf(this.e.a);
        this.e.b(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.c);
        if (getX() > brg.a) {
            this.c.left = (int) (r0.left + this.b.left);
        }
        if (getY() > brg.a) {
            this.c.top = (int) (r0.top + this.b.top);
        }
        Rect rect = this.c;
        rect.right = rect.left + Math.round(this.b.width());
        Rect rect2 = this.c;
        rect2.bottom = rect2.top + Math.round(this.b.height());
        accessibilityNodeInfo.setBoundsInScreen(this.c);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.a;
        if (f != -1.0f && f != -1.0f) {
            float a = ajdd.a(brg.a, getWidth() / 2.0f, brg.a, 1.0f, this.a);
            a(new RectF(a, brg.a, getWidth() - a, getHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ajld ajlfVar;
        this.a = -1.0f;
        this.b = new RectF();
        this.c = new Rect();
        if (Build.VERSION.SDK_INT >= 33) {
            ajlfVar = new ajlh(this);
        } else {
            ajlfVar = new ajlf(this);
        }
        this.e = ajlfVar;
        this.f = null;
        fn(new ajkr(ajkr.h(context, attributeSet, i, 0)));
    }
}
