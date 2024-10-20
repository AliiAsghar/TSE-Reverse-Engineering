package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a;
import defpackage.ajdh;
import defpackage.ajgl;
import defpackage.ajgq;
import defpackage.ajhd;
import defpackage.ajhe;
import defpackage.ajhn;
import defpackage.ajho;
import defpackage.ajhp;
import defpackage.ajhr;
import defpackage.ajhv;
import defpackage.ajig;
import defpackage.ajik;
import defpackage.ajkb;
import defpackage.ajki;
import defpackage.ajkm;
import defpackage.ajkr;
import defpackage.ajlc;
import defpackage.ajlx;
import defpackage.ajlz;
import defpackage.ajnr;
import defpackage.asnn;
import defpackage.asqc;
import defpackage.brg;
import defpackage.dxs;
import defpackage.dxt;
import defpackage.dxv;
import defpackage.dye;
import defpackage.eek;
import defpackage.vl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FloatingActionButton extends ajik implements ajlc, dxs {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private ajhn m;
    private final ajlx n;
    private final asnn o;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class BaseBehavior<T extends FloatingActionButton> extends dxt<T> {
        private Rect a;
        private final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private static boolean L(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof dxv) {
                return ((dxv) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean M(View view, FloatingActionButton floatingActionButton) {
            dxv dxvVar = (dxv) floatingActionButton.getLayoutParams();
            if (!this.b || dxvVar.f != view.getId() || floatingActionButton.d != 0) {
                return false;
            }
            return true;
        }

        private final boolean N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!M(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ajhv.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        private final boolean O(View view, FloatingActionButton floatingActionButton) {
            if (!M(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((dxv) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // defpackage.dxt
        public final void a(dxv dxvVar) {
            if (dxvVar.h == 0) {
                dxvVar.h = 80;
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List a = coordinatorLayout.a(floatingActionButton);
            int size = a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) a.get(i4);
                if (view2 instanceof AppBarLayout) {
                    if (N(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(view2) && O(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                dxv dxvVar = (dxv) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dxvVar.rightMargin) {
                    i2 = rect.right;
                } else if (floatingActionButton.getLeft() <= dxvVar.leftMargin) {
                    i2 = -rect.left;
                } else {
                    i2 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dxvVar.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= dxvVar.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    int[] iArr = eek.a;
                    floatingActionButton.offsetTopAndBottom(i3);
                }
                if (i2 != 0) {
                    int[] iArr2 = eek.a;
                    floatingActionButton.offsetLeftAndRight(i2);
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                N(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (L(view2)) {
                O(view2, floatingActionButton);
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajhr.d);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(FloatingActionButton floatingActionButton, Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        }
        return h(0);
    }

    private final ajhn i() {
        if (this.m == null) {
            this.m = new ajhp(this, new asqc(this, null));
        }
        return this.m;
    }

    @Override // defpackage.dxs
    public final dxt a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        i();
        getDrawableState();
    }

    final void e() {
        AnimatorSet d;
        ajhn i = i();
        if (i.B.getVisibility() == 0) {
            if (i.A == 1) {
                return;
            }
        } else if (i.A != 2) {
            return;
        }
        Animator animator = i.v;
        if (animator != null) {
            animator.cancel();
        }
        if (i.n()) {
            ajdh ajdhVar = i.x;
            if (ajdhVar != null) {
                d = i.c(ajdhVar, brg.a, brg.a, brg.a);
            } else {
                d = i.d(brg.a, 0.4f, 0.4f, ajhn.d, ajhn.e);
            }
            d.addListener(new ajhd(i));
            d.start();
            return;
        }
        i.B.g(4, false);
    }

    final void f() {
        AnimatorSet d;
        ajhn i = i();
        if (i.B.getVisibility() != 0) {
            if (i.A == 2) {
                return;
            }
        } else if (i.A != 1) {
            return;
        }
        Animator animator = i.v;
        if (animator != null) {
            animator.cancel();
        }
        ajdh ajdhVar = i.w;
        if (i.n()) {
            if (i.B.getVisibility() != 0) {
                FloatingActionButton floatingActionButton = i.B;
                float f = brg.a;
                floatingActionButton.setAlpha(brg.a);
                FloatingActionButton floatingActionButton2 = i.B;
                if (ajdhVar == null) {
                    f = 0.4f;
                }
                floatingActionButton2.setScaleY(f);
                i.B.setScaleX(f);
                i.h(f);
            }
            ajdh ajdhVar2 = i.w;
            if (ajdhVar2 != null) {
                d = i.c(ajdhVar2, 1.0f, 1.0f, 1.0f);
            } else {
                d = i.d(1.0f, 1.0f, 1.0f, ajhn.b, ajhn.c);
            }
            d.addListener(new ajhe(i));
            d.start();
            return;
        }
        i.B.g(0, false);
        i.B.setAlpha(1.0f);
        i.B.setScaleY(1.0f);
        i.B.setScaleX(1.0f);
        i.h(1.0f);
    }

    @Override // defpackage.ajlc
    public final void fn(ajkr ajkrVar) {
        i().i(ajkrVar);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajhn i = i();
        ajkm ajkmVar = i.m;
        if (ajkmVar != null) {
            ajgl.r(i.B, ajkmVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ajhn i = i();
        i.B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = i.C;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int b = b();
        this.a = (b - this.k) / 2;
        i().k();
        int min = Math.min(View.resolveSize(b, i), View.resolveSize(b, i2));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ajlz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ajlz ajlzVar = (ajlz) parcelable;
        super.onRestoreInstanceState(ajlzVar.d);
        ajlx ajlxVar = this.n;
        Bundle bundle = (Bundle) ajlzVar.a.get("expandableWidgetHelper");
        dye.i(bundle);
        ajlxVar.b = bundle.getBoolean("expanded", false);
        ajlxVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (ajlxVar.b) {
            ViewParent parent = ((View) ajlxVar.c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b((View) ajlxVar.c);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ajlz ajlzVar = new ajlz(onSaveInstanceState);
        vl vlVar = ajlzVar.a;
        ajlx ajlxVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", ajlxVar.b);
        bundle.putInt("expandedComponentIdHint", ajlxVar.a);
        vlVar.put("expandableWidgetHelper", bundle);
        return ajlzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            rect.left += this.c.left;
            rect.top += this.c.top;
            rect.right -= this.c.right;
            rect.bottom -= this.c.bottom;
            int i = -this.m.b();
            rect.inset(i, i);
            if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            ajhn i = i();
            ajkm ajkmVar = i.m;
            if (ajkmVar != null) {
                ajkmVar.setTintList(colorStateList);
            }
            ajgq ajgqVar = i.o;
            if (ajgqVar != null) {
                ajgqVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            ajkm ajkmVar = i().m;
            if (ajkmVar != null) {
                ajkmVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        i().l(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().j();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.k(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        boolean z;
        Drawable drawable;
        Drawable drawable2;
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a = ajig.a(context2, attributeSet, ajhr.c, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = ajki.e(context2, a, 1);
        this.f = a.u(a.getInt(2, -1), null);
        this.g = ajki.e(context2, a, 12);
        this.i = a.getInt(7, -1);
        this.j = a.getDimensionPixelSize(6, 0);
        this.h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, brg.a);
        float dimension2 = a.getDimension(9, brg.a);
        float dimension3 = a.getDimension(11, brg.a);
        this.b = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = a.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        ajhn i2 = i();
        if (i2.z != dimensionPixelSize2) {
            i2.z = dimensionPixelSize2;
            i2.j();
        }
        ajdh b = ajdh.b(context2, a, 15);
        ajdh b2 = ajdh.b(context2, a, 8);
        ajkr ajkrVar = new ajkr(ajkr.g(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, ajkr.a));
        boolean z2 = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        asnn asnnVar = new asnn(this);
        this.o = asnnVar;
        asnnVar.i(attributeSet, i);
        this.n = new ajlx(this);
        i().i(ajkrVar);
        ajhn i3 = i();
        ColorStateList colorStateList = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList2 = this.g;
        int i4 = this.h;
        ajhp ajhpVar = (ajhp) i3;
        ajkr ajkrVar2 = ajhpVar.l;
        dye.i(ajkrVar2);
        ajhpVar.m = new ajho(ajkrVar2);
        ajhpVar.m.setTintList(colorStateList);
        if (mode != null) {
            ajhpVar.m.setTintMode(mode);
        }
        ajhpVar.m.G(ajhpVar.B.getContext());
        if (i4 > 0) {
            Context context3 = ajhpVar.B.getContext();
            ajkr ajkrVar3 = ajhpVar.l;
            dye.i(ajkrVar3);
            ajgq ajgqVar = new ajgq(ajkrVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            z = z2;
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            ajgqVar.c = color;
            ajgqVar.d = color2;
            ajgqVar.e = color3;
            ajgqVar.f = color4;
            float f = i4;
            if (ajgqVar.b != f) {
                ajgqVar.b = f;
                ajgqVar.a.setStrokeWidth(f * 1.3333f);
                ajgqVar.g = true;
                ajgqVar.invalidateSelf();
            }
            ajgqVar.b(colorStateList);
            ajhpVar.o = ajgqVar;
            ajgq ajgqVar2 = ajhpVar.o;
            dye.i(ajgqVar2);
            ajkm ajkmVar = ajhpVar.m;
            dye.i(ajkmVar);
            drawable2 = new LayerDrawable(new Drawable[]{ajgqVar2, ajkmVar});
            drawable = null;
        } else {
            z = z2;
            drawable = null;
            ajhpVar.o = null;
            drawable2 = ajhpVar.m;
        }
        ajhpVar.n = new RippleDrawable(ajkb.b(colorStateList2), drawable2, drawable);
        ajhpVar.p = ajhpVar.n;
        i().u = dimensionPixelSize;
        ajhn i5 = i();
        if (i5.r != dimension) {
            i5.r = dimension;
            i5.g(dimension, i5.s, i5.t);
        }
        ajhn i6 = i();
        if (i6.s != dimension2) {
            i6.s = dimension2;
            i6.g(i6.r, dimension2, i6.t);
        }
        ajhn i7 = i();
        if (i7.t != dimension3) {
            i7.t = dimension3;
            i7.g(i7.r, i7.s, dimension3);
        }
        i().w = b;
        i().x = b2;
        i().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
