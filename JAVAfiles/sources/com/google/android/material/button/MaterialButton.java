package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.a;
import defpackage.ajeo;
import defpackage.ajep;
import defpackage.ajer;
import defpackage.ajes;
import defpackage.ajet;
import defpackage.ajgl;
import defpackage.ajig;
import defpackage.ajkb;
import defpackage.ajki;
import defpackage.ajkm;
import defpackage.ajkr;
import defpackage.ajlc;
import defpackage.ajli;
import defpackage.ajnr;
import defpackage.aksr;
import defpackage.brg;
import defpackage.d;
import defpackage.ejs;
import defpackage.ki;
import defpackage.kj;
import defpackage.pu;
import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MaterialButton extends kj implements Checkable, ajlc {
    private static final int[] k = {R.attr.state_checkable};
    private static final int[] l = {R.attr.state_checked};
    public final ajer b;
    public ColorStateList c;
    public Drawable d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    int j;
    private final LinkedHashSet m;
    private PorterDuff.Mode n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int a() {
        int lineCount = getLineCount();
        float f = brg.a;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private final void k() {
        if (m()) {
            setCompoundDrawablesRelative(this.d, null, null, null);
        } else if (l()) {
            setCompoundDrawablesRelative(null, null, this.d, null);
        } else if (n()) {
            setCompoundDrawablesRelative(null, this.d, null, null);
        }
    }

    private final boolean l() {
        int i = this.f;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    private final boolean m() {
        int i = this.f;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    private final boolean n() {
        int i = this.f;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    final String b() {
        Class cls;
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (true != i()) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    public final void c(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = d.f(getContext(), i);
        } else {
            drawable = null;
        }
        if (this.d != drawable) {
            this.d = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (j()) {
            ajer ajerVar = this.b;
            if (ajerVar.k != colorStateList) {
                ajerVar.k = colorStateList;
                if (ajerVar.a() != null) {
                    ajerVar.a().setTintList(ajerVar.k);
                    return;
                }
                return;
            }
            return;
        }
        ki kiVar = this.a;
        if (kiVar != null) {
            if (kiVar.a == null) {
                kiVar.a = new pu();
            }
            pu puVar = kiVar.a;
            puVar.a = colorStateList;
            puVar.d = true;
            kiVar.a();
        }
    }

    public final void f(PorterDuff.Mode mode) {
        if (j()) {
            ajer ajerVar = this.b;
            if (ajerVar.j != mode) {
                ajerVar.j = mode;
                if (ajerVar.a() != null && ajerVar.j != null) {
                    ajerVar.a().setTintMode(ajerVar.j);
                    return;
                }
                return;
            }
            return;
        }
        ki kiVar = this.a;
        if (kiVar != null) {
            if (kiVar.a == null) {
                kiVar.a = new pu();
            }
            pu puVar = kiVar.a;
            puVar.b = mode;
            puVar.c = true;
            kiVar.a();
        }
    }

    @Override // defpackage.ajlc
    public final void fn(ajkr ajkrVar) {
        if (j()) {
            this.b.d(ajkrVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public final void g(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.d = mutate;
            mutate.setTintList(this.c);
            PorterDuff.Mode mode = this.n;
            if (mode != null) {
                this.d.setTintMode(mode);
            }
            int i = this.e;
            if (i == 0) {
                i = this.d.getIntrinsicWidth();
            }
            int i2 = this.e;
            if (i2 == 0) {
                i2 = this.d.getIntrinsicHeight();
            }
            Drawable drawable2 = this.d;
            int i3 = this.o;
            int i4 = this.p;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.d.setVisible(true, z);
        }
        if (z) {
            k();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((m() && drawable3 != this.d) || ((l() && drawable5 != this.d) || (n() && drawable4 != this.d))) {
            k();
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        pu puVar;
        if (j()) {
            return this.b.k;
        }
        ki kiVar = this.a;
        if (kiVar == null || (puVar = kiVar.a) == null) {
            return null;
        }
        return puVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        pu puVar;
        if (j()) {
            return this.b.j;
        }
        ki kiVar = this.a;
        if (kiVar == null || (puVar = kiVar.a) == null) {
            return null;
        }
        return puVar.b;
    }

    public final void h(int i, int i2) {
        Layout.Alignment alignment;
        boolean z;
        int min;
        if (this.d != null && getLayout() != null) {
            boolean z2 = true;
            if (!m() && !l()) {
                if (n()) {
                    this.o = 0;
                    if (this.f == 16) {
                        this.p = 0;
                        g(false);
                        return;
                    }
                    int i3 = this.e;
                    if (i3 == 0) {
                        i3 = this.d.getIntrinsicHeight();
                    }
                    if (getLineCount() > 1) {
                        min = getLayout().getHeight();
                    } else {
                        TextPaint paint = getPaint();
                        String charSequence = getText().toString();
                        if (getTransformationMethod() != null) {
                            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                        }
                        Rect rect = new Rect();
                        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                        min = Math.min(rect.height(), getLayout().getHeight());
                    }
                    int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i3) - this.q) - getPaddingBottom()) / 2);
                    if (this.p != max) {
                        this.p = max;
                        g(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.p = 0;
            int textAlignment = getTextAlignment();
            if (textAlignment != 1) {
                if (textAlignment != 6 && textAlignment != 3) {
                    if (textAlignment != 4) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                int gravity = getGravity() & 8388615;
                if (gravity != 1) {
                    if (gravity != 5 && gravity != 8388613) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            int i4 = this.f;
            if (i4 != 1 && i4 != 3 && ((i4 != 2 || alignment != Layout.Alignment.ALIGN_NORMAL) && (this.f != 4 || alignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i5 = this.e;
                if (i5 == 0) {
                    i5 = this.d.getIntrinsicWidth();
                }
                int a = ((((i - a()) - getPaddingEnd()) - i5) - this.q) - getPaddingStart();
                if (alignment == Layout.Alignment.ALIGN_CENTER) {
                    a /= 2;
                }
                if (getLayoutDirection() != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.f != 4) {
                    z2 = false;
                }
                if (z != z2) {
                    a = -a;
                }
                if (this.o != a) {
                    this.o = a;
                    g(false);
                    return;
                }
                return;
            }
            this.o = 0;
            g(false);
        }
    }

    public final boolean i() {
        ajer ajerVar = this.b;
        if (ajerVar != null && ajerVar.q) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.r;
    }

    public final boolean j() {
        ajer ajerVar = this.b;
        if (ajerVar != null && !ajerVar.o) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (j()) {
            ajgl.r(this, this.b.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (i()) {
            mergeDrawableStates(onCreateDrawableState, k);
        }
        if (this.r) {
            mergeDrawableStates(onCreateDrawableState, l);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.kj, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(b());
        accessibilityEvent.setChecked(this.r);
    }

    @Override // defpackage.kj, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(b());
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setChecked(this.r);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kj, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.g = -1.0f;
        }
        if (this.g == -1.0f) {
            this.g = i3 - i;
        }
        if (this.j == -1) {
            Drawable drawable = this.d;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.q;
                int i8 = this.e;
                if (i8 == 0) {
                    i8 = drawable.getIntrinsicWidth();
                }
                i5 = i7 + i8;
            }
            this.j = (getMeasuredWidth() - a()) - i5;
        }
        if (this.h == -1) {
            this.h = getPaddingStart();
        }
        if (this.i == -1) {
            this.i = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ajep)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ajep ajepVar = (ajep) parcelable;
        super.onRestoreInstanceState(ajepVar.d);
        setChecked(ajepVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ajep ajepVar = new ajep(super.onSaveInstanceState());
        ajepVar.a = this.r;
        return ajepVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kj, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.b.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.d != null) {
            if (this.d.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (j()) {
            ajer ajerVar = this.b;
            if (ajerVar.a() != null) {
                ajerVar.a().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.kj, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (j()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.b.c();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.kj, android.view.View
    public final void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = d.f(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        e(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        f(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (i() && isEnabled() && this.r != z) {
            this.r = z;
            refreshDrawableState();
            if (!(getParent() instanceof ajes)) {
                if (!this.s) {
                    this.s = true;
                    Iterator it = this.m.iterator();
                    while (it.hasNext()) {
                        ((ajeo) it.next()).a();
                    }
                    this.s = false;
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (j()) {
            this.b.a().I(f);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.g = -1.0f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.r);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        Object ajkrVar;
        this.m = new LinkedHashSet();
        this.r = false;
        this.s = false;
        this.t = -1;
        this.g = -1.0f;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        Context context2 = getContext();
        TypedArray a = ajig.a(context2, attributeSet, ajet.a, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.q = a.getDimensionPixelSize(12, 0);
        this.n = a.u(a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.c = ajki.e(getContext(), a, 14);
        this.d = ajki.f(getContext(), a, 10);
        this.f = a.getInteger(11, 1);
        this.e = a.getDimensionPixelSize(13, 0);
        int resourceId = a.getResourceId(17, 0);
        aksr aksrVar = null;
        if (resourceId != 0 && Objects.equals(context2.getResources().getResourceTypeName(resourceId), "xml")) {
            ajli ajliVar = new ajli(context2, resourceId);
            if (ajliVar.a != 0) {
                aksrVar = new aksr(ajliVar);
            }
        }
        if (aksrVar != null) {
            ajkrVar = aksrVar.c;
        } else {
            ajkrVar = new ajkr(ajkr.h(context2, attributeSet, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_Button));
        }
        ajer ajerVar = new ajer(this, (ajkr) ajkrVar);
        this.b = ajerVar;
        ajerVar.d = a.getDimensionPixelOffset(1, 0);
        ajerVar.e = a.getDimensionPixelOffset(2, 0);
        ajerVar.f = a.getDimensionPixelOffset(3, 0);
        ajerVar.g = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            int dimensionPixelSize = a.getDimensionPixelSize(8, -1);
            ajerVar.h = dimensionPixelSize;
            ajerVar.d(ajerVar.b.b(dimensionPixelSize));
            ajerVar.p = true;
        }
        ajerVar.i = a.getDimensionPixelSize(20, 0);
        ajerVar.j = a.u(a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        ajerVar.k = ajki.e(ajerVar.a.getContext(), a, 6);
        ajerVar.l = ajki.e(ajerVar.a.getContext(), a, 19);
        ajerVar.m = ajki.e(ajerVar.a.getContext(), a, 16);
        ajerVar.q = a.getBoolean(5, false);
        ajerVar.t = a.getDimensionPixelSize(9, 0);
        ajerVar.r = a.getBoolean(21, true);
        int paddingStart = ajerVar.a.getPaddingStart();
        int paddingTop = ajerVar.a.getPaddingTop();
        int paddingEnd = ajerVar.a.getPaddingEnd();
        int paddingBottom = ajerVar.a.getPaddingBottom();
        if (a.hasValue(0)) {
            ajerVar.c();
        } else {
            MaterialButton materialButton = ajerVar.a;
            ajkm ajkmVar = new ajkm(ajerVar.b);
            aksr aksrVar2 = ajerVar.u;
            if (aksrVar2 != null) {
                ajkmVar.S(aksrVar2);
            }
            ejs ejsVar = ajerVar.c;
            if (ejsVar != null) {
                ajkmVar.H(ejsVar);
            }
            ajkmVar.G(ajerVar.a.getContext());
            ajkmVar.setTintList(ajerVar.k);
            PorterDuff.Mode mode = ajerVar.j;
            if (mode != null) {
                ajkmVar.setTintMode(mode);
            }
            ajkmVar.M(ajerVar.i, ajerVar.l);
            ajkm ajkmVar2 = new ajkm(ajerVar.b);
            aksr aksrVar3 = ajerVar.u;
            if (aksrVar3 != null) {
                ajkmVar2.S(aksrVar3);
            }
            ejs ejsVar2 = ajerVar.c;
            if (ejsVar2 != null) {
                ajkmVar2.H(ejsVar2);
            }
            ajkmVar2.setTint(0);
            ajkmVar2.L(ajerVar.i, 0);
            ajerVar.n = new ajkm(ajerVar.b);
            aksr aksrVar4 = ajerVar.u;
            if (aksrVar4 != null) {
                ((ajkm) ajerVar.n).S(aksrVar4);
            }
            ejs ejsVar3 = ajerVar.c;
            if (ejsVar3 != null) {
                ((ajkm) ajerVar.n).H(ejsVar3);
            }
            ajerVar.n.setTint(-1);
            ajerVar.s = new RippleDrawable(ajkb.b(ajerVar.m), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{ajkmVar2, ajkmVar}), ajerVar.d, ajerVar.f, ajerVar.e, ajerVar.g), ajerVar.n);
            super.setBackgroundDrawable(ajerVar.s);
            ajkm a2 = ajerVar.a();
            if (a2 != null) {
                a2.I(ajerVar.t);
                a2.setState(ajerVar.a.getDrawableState());
            }
        }
        ajerVar.a.setPaddingRelative(paddingStart + ajerVar.d, paddingTop + ajerVar.f, paddingEnd + ajerVar.e, paddingBottom + ajerVar.g);
        if (aksrVar != null) {
            ejs ejsVar4 = new ejs();
            ejsVar4.c(0.6f);
            ejsVar4.e(800.0f);
            ajerVar.c = ejsVar4;
            if (ajerVar.u != null) {
                ajerVar.e();
            }
            ajerVar.u = aksrVar;
            ajerVar.e();
        }
        a.recycle();
        setCompoundDrawablePadding(this.q);
        g(this.d != null);
    }
}
