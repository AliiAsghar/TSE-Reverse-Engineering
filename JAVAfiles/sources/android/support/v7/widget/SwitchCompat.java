package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.a;
import defpackage.brg;
import defpackage.eek;
import defpackage.efn;
import defpackage.efu;
import defpackage.ekt;
import defpackage.elp;
import defpackage.fvq;
import defpackage.gc;
import defpackage.gy;
import defpackage.ktk;
import defpackage.lg;
import defpackage.md;
import defpackage.pp;
import defpackage.pq;
import defpackage.pr;
import defpackage.qn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property c = new pp(Float.class);
    private static final int[] d = {R.attr.state_checked};
    private float A;
    private VelocityTracker B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final lg Q;
    private pq R;
    private final Rect S;
    private fvq T;
    public float a;
    ObjectAnimator b;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final int h() {
        float f;
        if (qn.a(this)) {
            f = 1.0f - this.a;
        } else {
            f = this.a;
        }
        return (int) ((f * i()) + 0.5f);
    }

    private final int i() {
        Rect rect;
        Drawable drawable = this.j;
        if (drawable != null) {
            Rect rect2 = this.S;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.e;
            if (drawable2 != null) {
                rect = md.a(drawable2);
            } else {
                rect = md.a;
            }
            return ((((this.D - this.F) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private final Layout j(CharSequence charSequence) {
        int i;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, this.L, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, brg.a, true);
    }

    private final CharSequence k(CharSequence charSequence) {
        Object obj = ((efu) n().b).a;
        TransformationMethod transformationMethod = this.P;
        if (!elp.g()) {
            transformationMethod = ((elp) obj).b.g(transformationMethod);
        }
        if (transformationMethod != null) {
            return transformationMethod.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private final void l() {
        if (this.R == null && ((elp) ((efu) this.T.b).a).b.c && ekt.g()) {
            ekt c2 = ekt.c();
            int b = c2.b();
            if (b == 3 || b == 0) {
                pq pqVar = new pq(this);
                this.R = pqVar;
                c2.k(pqVar);
            }
        }
    }

    private final boolean m() {
        if (this.a > 0.5f) {
            return true;
        }
        return false;
    }

    private final fvq n() {
        if (this.T == null) {
            this.T = new fvq((TextView) this, (byte[]) null);
        }
        return this.T;
    }

    public final void a() {
        f(this.s);
        e(this.u);
        requestLayout();
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.u;
            if (charSequence == null) {
                charSequence = getResources().getString(com.google.android.apps.messaging.R.string.abc_capital_off);
            }
            eek.q(this, charSequence);
        }
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.s;
            if (charSequence == null) {
                charSequence = getResources().getString(com.google.android.apps.messaging.R.string.abc_capital_on);
            }
            eek.q(this, charSequence);
        }
    }

    public final void d(Typeface typeface) {
        if ((this.L.getTypeface() != null && !this.L.getTypeface().equals(typeface)) || (this.L.getTypeface() == null && typeface != null)) {
            this.L.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3 = this.G;
        int i4 = this.H;
        int i5 = this.I;
        int i6 = this.J;
        int h = h() + i3;
        Drawable drawable = this.e;
        if (drawable != null) {
            rect = md.a(drawable);
        } else {
            rect = md.a;
        }
        Rect rect2 = this.S;
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            h += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                if (rect.top > rect2.top) {
                    i = (rect.top - rect2.top) + i4;
                } else {
                    i = i4;
                }
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.j.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = h - rect2.left;
            int i8 = h + this.F + rect2.right;
            this.e.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.e;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        this.u = charSequence;
        this.v = k(charSequence);
        this.O = null;
        if (this.w) {
            l();
        }
    }

    public final void f(CharSequence charSequence) {
        this.s = charSequence;
        this.t = k(charSequence);
        this.N = null;
        if (this.w) {
            l();
        }
    }

    public final void g(float f) {
        this.a = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!qn.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.D;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.q;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (qn.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.D;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.q;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return efn.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.b.end();
            this.b = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.j;
        Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.H;
        int i2 = this.J;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.e;
        if (drawable != null) {
            if (this.r && drawable2 != null) {
                Rect a = md.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (m()) {
            layout = this.N;
        } else {
            layout = this.O;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.s;
            } else {
                charSequence = this.u;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.e != null) {
            Rect rect = this.S;
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = md.a(this.e);
            i5 = Math.max(0, a.left - rect.left);
            i10 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (qn.a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.D + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.D) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i8 = getPaddingTop();
                i7 = this.E;
            } else {
                i9 = getHeight() - getPaddingBottom();
                i8 = i9 - this.E;
                this.G = i6;
                this.H = i8;
                this.J = i9;
                this.I = width;
            }
        } else {
            int paddingTop = (getPaddingTop() + getHeight()) - getPaddingBottom();
            i7 = this.E;
            i8 = (paddingTop / 2) - (i7 / 2);
        }
        i9 = i7 + i8;
        this.G = i6;
        this.H = i8;
        this.J = i9;
        this.I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.w) {
            if (this.N == null) {
                this.N = j(this.t);
            }
            if (this.O == null) {
                this.O = j(this.v);
            }
        }
        Rect rect = this.S;
        Drawable drawable = this.e;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.e.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.e.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.w) {
            int max = Math.max(this.N.getWidth(), this.O.getWidth());
            int i8 = this.o;
            i5 = max + i8 + i8;
        } else {
            i5 = 0;
        }
        this.F = Math.max(i5, i3);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            Rect a = md.a(drawable3);
            i9 = Math.max(i9, a.left);
            i10 = Math.max(i10, a.right);
        }
        if (this.K) {
            int i11 = this.p;
            int i12 = this.F;
            i6 = Math.max(i11, i12 + i12 + i9 + i10);
        } else {
            i6 = this.p;
        }
        int max2 = Math.max(i7, i4);
        this.D = i6;
        this.E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.s;
        } else {
            charSequence = this.u;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        n().E(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            c();
        } else {
            b();
        }
        if (true != isChecked) {
            f = brg.a;
        } else {
            f = 1.0f;
        }
        if (getWindowToken() != null && isLaidOut()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) c, f);
            this.b = ofFloat;
            ofFloat.setDuration(250L);
            this.b.setAutoCancel(true);
            this.b.start();
            return;
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        g(f);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(efn.c(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(n().F(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.e && drawable != this.j) {
            return false;
        }
        return true;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        Drawable drawable2;
        Typeface typeface;
        Typeface create;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        this.K = true;
        this.S = new Rect();
        pr.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        ktk A = ktk.A(context, attributeSet, gc.x, i, 0);
        eek.m(this, context, gc.x, attributeSet, (TypedArray) A.b, i, 0);
        Drawable p = A.p(2);
        this.e = p;
        if (p != null) {
            p.setCallback(this);
        }
        Drawable p2 = A.p(11);
        this.j = p2;
        if (p2 != null) {
            p2.setCallback(this);
        }
        f(A.r(0));
        e(A.r(1));
        this.w = A.u(3, true);
        this.o = A.j(8, 0);
        this.p = A.j(5, 0);
        this.q = A.j(6, 0);
        this.r = A.u(4, false);
        ColorStateList o = A.o(9);
        if (o != null) {
            this.f = o;
            this.h = true;
        }
        PorterDuff.Mode u = a.u(A.k(10, -1), null);
        if (this.g != u) {
            this.g = u;
            this.i = true;
        }
        boolean z = this.h;
        if ((z || this.i) && (drawable = this.e) != null && (z || this.i)) {
            Drawable mutate = drawable.mutate();
            this.e = mutate;
            if (this.h) {
                mutate.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(getDrawableState());
            }
        }
        ColorStateList o2 = A.o(12);
        if (o2 != null) {
            this.k = o2;
            this.m = true;
        }
        PorterDuff.Mode u2 = a.u(A.k(13, -1), null);
        if (this.l != u2) {
            this.l = u2;
            this.n = true;
        }
        boolean z2 = this.m;
        if ((z2 || this.n) && (drawable2 = this.j) != null && (z2 || this.n)) {
            Drawable mutate2 = drawable2.mutate();
            this.j = mutate2;
            if (this.m) {
                mutate2.setTintList(this.k);
            }
            if (this.n) {
                this.j.setTintMode(this.l);
            }
            if (this.j.isStateful()) {
                this.j.setState(getDrawableState());
            }
        }
        int n = A.n(7, 0);
        if (n != 0) {
            ktk y = ktk.y(context, n, gc.y);
            ColorStateList o3 = y.o(3);
            if (o3 != null) {
                this.M = o3;
            } else {
                this.M = getTextColors();
            }
            int j = y.j(0, 0);
            if (j != 0) {
                float f = j;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int k = y.k(1, -1);
            int k2 = y.k(2, -1);
            if (k == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (k != 2) {
                typeface = k != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f2 = brg.a;
            if (k2 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(k2);
                } else {
                    create = Typeface.create(typeface, k2);
                }
                d(create);
                int i2 = (~(create != null ? create.getStyle() : 0)) & k2;
                textPaint.setFakeBoldText(1 == (i2 & 1));
                textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(brg.a);
                d(typeface);
            }
            if (y.u(14, false)) {
                this.P = new gy(getContext());
            } else {
                this.P = null;
            }
            f(this.s);
            e(this.u);
            y.t();
        }
        lg lgVar = new lg(this);
        this.Q = lgVar;
        lgVar.h(attributeSet, i);
        A.t();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        n().D(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
