package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.ahnz;
import defpackage.ajev;
import defpackage.ajew;
import defpackage.ajgl;
import defpackage.ajig;
import defpackage.ajki;
import defpackage.ajkr;
import defpackage.ajlc;
import defpackage.ajnr;
import defpackage.te;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, ajlc {
    private static final int[] g = {R.attr.state_checkable};
    private static final int[] h = {R.attr.state_checked};
    private boolean i;
    public final ajev s;
    public boolean t;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // androidx.cardview.widget.CardView
    public final float fZ() {
        return this.s.d.u();
    }

    @Override // defpackage.ajlc
    public final void fn(ajkr ajkrVar) {
        RectF rectF = new RectF();
        rectF.set(this.s.d.getBounds());
        setClipToOutline(ajkrVar.e(rectF));
        this.s.g(ajkrVar);
    }

    @Override // androidx.cardview.widget.CardView
    public final void ga(float f) {
        super.ga(f);
        this.s.j();
    }

    @Override // androidx.cardview.widget.CardView
    public final void gb(float f) {
        super.gb(f);
        ajev ajevVar = this.s;
        ajevVar.g(ajevVar.n.b(f));
        ajevVar.j.invalidateSelf();
        if (ajevVar.o() || ajevVar.n()) {
            ajevVar.i();
        }
        if (ajevVar.o()) {
            if (!ajevVar.r) {
                super.setBackgroundDrawable(ajevVar.d(ajevVar.d));
            }
            ajevVar.b.setForeground(ajevVar.d(ajevVar.j));
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.h();
        ajgl.r(this, this.s.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (q()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        if (this.t) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.t);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ajev ajevVar = this.s;
        if (ajevVar.q != null) {
            if (ajevVar.b.a) {
                float b = ajevVar.b();
                i3 = (int) Math.ceil(b + b);
                float a = ajevVar.a();
                i4 = (int) Math.ceil(a + a);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (ajevVar.m()) {
                i5 = ((measuredWidth - ajevVar.f) - ajevVar.g) - i4;
            } else {
                i5 = ajevVar.f;
            }
            if (ajevVar.l()) {
                i6 = ajevVar.f;
            } else {
                i6 = ((measuredHeight - ajevVar.f) - ajevVar.g) - i3;
            }
            int i11 = i6;
            if (ajevVar.m()) {
                i7 = ajevVar.f;
            } else {
                i7 = ((measuredWidth - ajevVar.f) - ajevVar.g) - i4;
            }
            if (ajevVar.l()) {
                i8 = ((measuredHeight - ajevVar.f) - ajevVar.g) - i3;
            } else {
                i8 = ajevVar.f;
            }
            int i12 = i8;
            int layoutDirection = ajevVar.b.getLayoutDirection();
            if (layoutDirection == 1) {
                i9 = i5;
            } else {
                i9 = i7;
            }
            if (layoutDirection != 1) {
                i10 = i5;
            } else {
                i10 = i7;
            }
            ajevVar.q.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    public final void p(int i) {
        this.s.e(ColorStateList.valueOf(i));
    }

    public final boolean q() {
        ajev ajevVar = this.s;
        if (ajevVar != null && ajevVar.s) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            if (!this.s.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.s.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.t != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        ajev ajevVar = this.s;
        if (ajevVar != null) {
            ajevVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ajev ajevVar;
        Drawable drawable;
        if (q() && isEnabled()) {
            this.t = !this.t;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26 && (drawable = (ajevVar = this.s).p) != null) {
                Rect bounds = drawable.getBounds();
                int i = bounds.bottom;
                ajevVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                ajevVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            this.s.f(this.t, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.t = false;
        this.i = true;
        TypedArray a = ajig.a(getContext(), attributeSet, ajew.b, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CardView, new int[0]);
        ajev ajevVar = new ajev(this, attributeSet, i);
        this.s = ajevVar;
        ajevVar.e(((te) this.e.a).e);
        ajevVar.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        ajevVar.i();
        ajevVar.o = ajki.e(ajevVar.b.getContext(), a, 11);
        if (ajevVar.o == null) {
            ajevVar.o = ColorStateList.valueOf(-1);
        }
        ajevVar.i = a.getDimensionPixelSize(12, 0);
        boolean z = a.getBoolean(0, false);
        ajevVar.s = z;
        ajevVar.b.setLongClickable(z);
        ajevVar.m = ajki.e(ajevVar.b.getContext(), a, 6);
        Drawable f = ajki.f(ajevVar.b.getContext(), a, 2);
        if (f != null) {
            ajevVar.k = f.mutate();
            ajevVar.k.setTintList(ajevVar.m);
            ajevVar.f(ajevVar.b.t, false);
        } else {
            ajevVar.k = ajev.a;
        }
        LayerDrawable layerDrawable = ajevVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.apps.messaging.R.id.mtrl_card_checked_layer_id, ajevVar.k);
        }
        ajevVar.g = a.getDimensionPixelSize(5, 0);
        ajevVar.f = a.getDimensionPixelSize(4, 0);
        ajevVar.h = a.getInteger(3, 8388661);
        ajevVar.l = ajki.e(ajevVar.b.getContext(), a, 7);
        if (ajevVar.l == null) {
            ajevVar.l = ColorStateList.valueOf(ahnz.d(ajevVar.b, com.google.android.apps.messaging.R.attr.colorControlHighlight));
        }
        ColorStateList e = ajki.e(ajevVar.b.getContext(), a, 1);
        ajevVar.e.J(e == null ? ColorStateList.valueOf(0) : e);
        Drawable drawable = ajevVar.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(ajevVar.l);
        }
        ajevVar.j();
        ajevVar.k();
        super.setBackgroundDrawable(ajevVar.d(ajevVar.d));
        ajevVar.j = ajevVar.p() ? ajevVar.c() : ajevVar.e;
        ajevVar.b.setForeground(ajevVar.d(ajevVar.j));
        a.recycle();
    }
}
