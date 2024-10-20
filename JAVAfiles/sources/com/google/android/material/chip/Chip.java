package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.ajfv;
import defpackage.ajfw;
import defpackage.ajfx;
import defpackage.ajgl;
import defpackage.ajjz;
import defpackage.ajka;
import defpackage.ajkb;
import defpackage.ajkr;
import defpackage.ajlc;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements Checkable, ajfv, ajlc {
    private static final int f = 2132085265;
    public ajfw b;
    public CompoundButton.OnCheckedChangeListener c;
    public boolean d;
    public final Rect e;
    private InsetDrawable i;
    private RippleDrawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final RectF q;
    private final ajka r;
    public static final Rect a = new Rect();
    private static final int[] g = {R.attr.state_selected};
    private static final int[] h = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    private final void k() {
        float f2;
        if (this.i != null) {
            this.i = null;
            setMinWidth(0);
            ajfw ajfwVar = this.b;
            if (ajfwVar != null) {
                f2 = ajfwVar.a;
            } else {
                f2 = brg.a;
            }
            setMinHeight((int) f2);
            n();
        }
    }

    private final void l(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private final void m(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private final void n() {
        RippleDrawable rippleDrawable = new RippleDrawable(ajkb.b(this.b.b), e(), null);
        this.j = rippleDrawable;
        setBackground(rippleDrawable);
        o();
    }

    private final void o() {
        ajfw ajfwVar;
        if (!TextUtils.isEmpty(getText()) && (ajfwVar = this.b) != null) {
            float b = ajfwVar.j + ajfwVar.i + ajfwVar.b();
            int a2 = (int) (ajfwVar.g + ajfwVar.h + ajfwVar.a());
            int i = (int) b;
            if (this.i != null) {
                Rect rect = new Rect();
                this.i.getPadding(rect);
                a2 += rect.left;
                i += rect.right;
            }
            setPaddingRelative(a2, getPaddingTop(), i, getPaddingBottom());
        }
    }

    private final void p() {
        ajjz ajjzVar;
        TextPaint paint = getPaint();
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            paint.drawableState = ajfwVar.getState();
        }
        ajfw ajfwVar2 = this.b;
        if (ajfwVar2 != null) {
            ajjzVar = ajfwVar2.g();
        } else {
            ajjzVar = null;
        }
        if (ajjzVar != null) {
            ajjzVar.c(getContext(), paint, this.r);
        }
    }

    public final RectF c() {
        this.q.setEmpty();
        i();
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ajfw ajfwVar = this.b;
        if (ajfwVar != null && ajfw.q(ajfwVar.e)) {
            ajfw ajfwVar2 = this.b;
            ?? isEnabled = isEnabled();
            int i = isEnabled;
            if (this.d) {
                i = isEnabled + 1;
            }
            int i2 = i;
            if (this.m) {
                i2 = i + 1;
            }
            int i3 = i2;
            if (this.l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (isChecked()) {
                i4 = i3 + 1;
            }
            int[] iArr = new int[i4];
            int i5 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i5 = 1;
            }
            if (this.d) {
                iArr[i5] = 16842908;
                i5++;
            }
            if (this.m) {
                iArr[i5] = 16843623;
                i5++;
            }
            if (this.l) {
                iArr[i5] = 16842919;
                i5++;
            }
            if (isChecked()) {
                iArr[i5] = 16842913;
            }
            if (ajfwVar2.r(iArr)) {
                invalidate();
            }
        }
    }

    public final Drawable e() {
        InsetDrawable insetDrawable = this.i;
        if (insetDrawable == null) {
            return this.b;
        }
        return insetDrawable;
    }

    @Override // defpackage.ajfv
    public final void f() {
        h(this.p);
        requestLayout();
        invalidateOutline();
    }

    @Override // defpackage.ajlc
    public final void fn(ajkr ajkrVar) {
        this.b.fn(ajkrVar);
    }

    public final boolean g() {
        ajfw ajfwVar = this.b;
        if (ajfwVar != null && ajfwVar.f) {
            return true;
        }
        return false;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (g()) {
            ViewParent parent = getParent();
            if (parent instanceof ajfx) {
                throw null;
            }
            return "android.widget.Button";
        }
        if (!isClickable()) {
            return "android.view.View";
        }
        return "android.widget.Button";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            return ajfwVar.l;
        }
        return null;
    }

    public final void h(int i) {
        int i2;
        this.p = i;
        if (!this.n) {
            if (this.i != null) {
                k();
                return;
            } else {
                n();
                return;
            }
        }
        int i3 = 0;
        int max = Math.max(0, i - this.b.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.b.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.i != null) {
                k();
                return;
            } else {
                n();
                return;
            }
        }
        if (max2 > 0) {
            i2 = max2 >> 1;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max >> 1;
        }
        int i4 = i3;
        if (this.i != null) {
            Rect rect = new Rect();
            this.i.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i2 && rect.right == i2) {
                n();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.i = new InsetDrawable((Drawable) this.b, i2, i4, i2, i4);
        n();
    }

    public final void i() {
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            ajfwVar.e();
        }
    }

    public final void j() {
        playSoundEffect(0);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajgl.r(this, this.b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        if (g()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                l(false);
            }
        } else {
            l(c().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        if (!(getParent() instanceof ajfx)) {
            return;
        }
        throw null;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon systemIcon;
        if (c().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.c()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L2d
            r4 = 2
            if (r0 == r4) goto L23
            r1 = 3
            if (r0 == r1) goto L21
            goto L41
        L21:
            r0 = r2
            goto L35
        L23:
            boolean r0 = r5.l
            if (r0 == 0) goto L41
            if (r1 != 0) goto L47
            r5.m(r2)
            return r3
        L2d:
            boolean r0 = r5.l
            if (r0 == 0) goto L21
            r5.j()
            r0 = r3
        L35:
            r5.m(r2)
            if (r0 != 0) goto L47
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.m(r3)
            goto L47
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
        L47:
            return r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != e() && drawable != this.j) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != e() && drawable != this.j) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        ajfw ajfwVar = this.b;
        if (ajfwVar == null) {
            this.k = z;
        } else if (ajfwVar.f) {
            super.setChecked(z);
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(null, drawable2, null, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public final void setElevation(float f2) {
        super.setElevation(f2);
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            ajfwVar.I(f2);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.b != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                ajfw ajfwVar = this.b;
                if (ajfwVar != null) {
                    ajfwVar.l = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        if (this.b == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            ajfwVar.n = i;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.c = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(true);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (true != ajfwVar.m) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            ajfw ajfwVar2 = this.b;
            if (ajfwVar2 != null) {
                ajfwVar2.n(charSequence);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            ajfwVar.p(i);
        }
        p();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            ajjz g2 = ajfwVar.g();
            if (g2 != null) {
                g2.l = applyDimension;
                ajfwVar.k.a.setTextSize(applyDimension);
                ajfwVar.i();
            }
        }
        p();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ajfw ajfwVar = this.b;
        if (ajfwVar != null) {
            ajfwVar.p(i);
        }
        p();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }
}
