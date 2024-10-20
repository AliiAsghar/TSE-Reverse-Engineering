package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajfq extends AppCompatCheckBox {
    private static final int a = 2132085275;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    ColorStateList c;
    public int[] d;
    public CompoundButton.OnCheckedChangeListener e;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private boolean m;
    private boolean n;
    private CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private final gmq w;
    private final gmm x;

    public ajfq(Context context) {
        this(context, null);
    }

    private final void c() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        gmq gmqVar;
        Animator.AnimatorListener animatorListener;
        this.p = ajgl.f(this.p, this.b, getButtonTintMode());
        this.q = ajgl.f(this.q, this.c, this.s);
        if (this.r) {
            gmq gmqVar2 = this.w;
            if (gmqVar2 != null) {
                gmm gmmVar = this.x;
                if (gmmVar != null) {
                    Drawable drawable = gmqVar2.e;
                    if (drawable != null) {
                        ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(gmmVar.a());
                    }
                    ArrayList arrayList = gmqVar2.c;
                    if (arrayList != null) {
                        arrayList.remove(gmmVar);
                        if (gmqVar2.c.size() == 0 && (animatorListener = gmqVar2.b) != null) {
                            gmqVar2.a.c.removeListener(animatorListener);
                            gmqVar2.b = null;
                        }
                    }
                }
                gmq gmqVar3 = this.w;
                gmm gmmVar2 = this.x;
                if (gmmVar2 != null) {
                    Drawable drawable2 = gmqVar3.e;
                    if (drawable2 != null) {
                        gmq.a((AnimatedVectorDrawable) drawable2, gmmVar2);
                    } else {
                        if (gmqVar3.c == null) {
                            gmqVar3.c = new ArrayList();
                        }
                        if (!gmqVar3.c.contains(gmmVar2)) {
                            gmqVar3.c.add(gmmVar2);
                            if (gmqVar3.b == null) {
                                gmqVar3.b = new gmn(gmqVar3);
                            }
                            gmqVar3.a.c.addListener(gmqVar3.b);
                        }
                    }
                }
            }
            Drawable drawable3 = this.p;
            if ((drawable3 instanceof AnimatedStateListDrawable) && (gmqVar = this.w) != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, gmqVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, this.w, false);
            }
        }
        Drawable drawable4 = this.p;
        if (drawable4 != null && (colorStateList2 = this.b) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.q;
        if (drawable5 != null && (colorStateList = this.c) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.p;
        Drawable drawable7 = this.q;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    private final void d() {
        String string;
        if (Build.VERSION.SDK_INT >= 30 && this.v == null) {
            int i2 = this.t;
            if (i2 == 1) {
                string = getResources().getString(R.string.mtrl_checkbox_state_description_checked);
            } else if (i2 == 0) {
                string = getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
            } else {
                string = getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
            }
            super.setStateDescription(string);
        }
    }

    public final void f(int i2) {
        boolean z;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            d();
            if (!this.u) {
                this.u = true;
                LinkedHashSet linkedHashSet = this.j;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((ajfo) it.next()).a();
                    }
                }
                if (this.t != 2 && (onCheckedChangeListener = this.e) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager m95m = bl$$ExternalSyntheticApiModelOutline0.m95m(getContext().getSystemService(bl$$ExternalSyntheticApiModelOutline0.m109m$1()));
                if (m95m != null) {
                    m95m.notifyValueChanged(this);
                }
                this.u = false;
            }
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int d = ahnz.d(this, R.attr.colorControlActivated);
                int d2 = ahnz.d(this, R.attr.colorError);
                int d3 = ahnz.d(this, R.attr.colorSurface);
                int d4 = ahnz.d(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{ahnz.g(d3, d2, 1.0f), ahnz.g(d3, d, 1.0f), ahnz.g(d3, d4, 0.54f), ahnz.g(d3, d4, 0.38f), ahnz.g(d3, d4, 0.38f)});
            }
            setButtonTintList(this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArr;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(onCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        int i3 = 0;
        while (true) {
            int length = onCreateDrawableState.length;
            if (i3 < length) {
                int i4 = onCreateDrawableState[i3];
                if (i4 == 16842912) {
                    iArr = onCreateDrawableState;
                    break;
                }
                if (i4 == 0) {
                    iArr = (int[]) onCreateDrawableState.clone();
                    iArr[i3] = 16842912;
                    break;
                }
                i3++;
            } else {
                int[] copyOf = Arrays.copyOf(onCreateDrawableState, length + 1);
                copyOf[length] = 16842912;
                iArr = copyOf;
                break;
            }
        }
        this.d = iArr;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.m && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int i2 = 1;
            if (true == ajgl.l(this)) {
                i2 = -1;
            }
            int width = getWidth() - buttonDrawable.getIntrinsicWidth();
            int save = canvas.save();
            int i3 = (width / 2) * i2;
            canvas.translate(i3, brg.a);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ajfp)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ajfp ajfpVar = (ajfp) parcelable;
        super.onRestoreInstanceState(ajfpVar.getSuperState());
        f(ajfpVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ajfp ajfpVar = new ajfp(super.onSaveInstanceState());
        ajfpVar.a = this.t;
        return ajfpVar;
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(d.f(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        a(mode);
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        f(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.e = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            d();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        f(!isChecked() ? 1 : 0);
    }

    public ajfq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ajfq(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = defpackage.ajfq.a
            android.content.Context r9 = defpackage.ajnr.a(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.j = r9
            android.content.Context r9 = r8.getContext()
            gmq r0 = new gmq
            r0.<init>(r9)
            android.content.res.Resources r1 = r9.getResources()
            android.content.res.Resources$Theme r9 = r9.getTheme()
            java.util.WeakHashMap r2 = defpackage.ean.a
            r2 = 2131231803(0x7f08043b, float:1.8079697E38)
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r2, r9)
            android.graphics.drawable.Drawable$Callback r1 = r0.d
            r9.setCallback(r1)
            gmp r1 = new gmp
            android.graphics.drawable.Drawable$ConstantState r2 = r9.getConstantState()
            r1.<init>(r2)
            r0.e = r9
            r8.w = r0
            ajfn r9 = new ajfn
            r9.<init>(r8)
            r8.x = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = r8.getButtonDrawable()
            r8.p = r0
            android.content.res.ColorStateList r0 = r8.b
            r6 = 0
            if (r0 != 0) goto L63
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            if (r0 == 0) goto L62
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            goto L63
        L62:
            r0 = r6
        L63:
            r8.b = r0
            r8.b()
            int[] r2 = defpackage.ajfr.a
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            ktk r10 = defpackage.ajig.d(r0, r1, r2, r3, r4, r5)
            r11 = 2
            android.graphics.drawable.Drawable r11 = r10.p(r11)
            r8.q = r11
            android.graphics.drawable.Drawable r11 = r8.p
            r0 = 1
            if (r11 == 0) goto Laf
            boolean r11 = defpackage.ajig.c(r9)
            if (r11 == 0) goto Laf
            int r11 = r10.n(r7, r7)
            int r1 = r10.n(r0, r7)
            int r2 = defpackage.ajfq.i
            if (r11 != r2) goto Laf
            if (r1 != 0) goto Laf
            super.setButtonDrawable(r6)
            r11 = 2131231802(0x7f08043a, float:1.8079695E38)
            android.graphics.drawable.Drawable r11 = defpackage.d.f(r9, r11)
            r8.p = r11
            r8.r = r0
            android.graphics.drawable.Drawable r11 = r8.q
            if (r11 != 0) goto Laf
            r11 = 2131231804(0x7f08043c, float:1.80797E38)
            android.graphics.drawable.Drawable r11 = defpackage.d.f(r9, r11)
            r8.q = r11
        Laf:
            r11 = 3
            android.content.res.ColorStateList r9 = defpackage.ajki.C(r9, r10, r11)
            r8.c = r9
            r9 = 4
            r11 = -1
            int r9 = r10.k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = defpackage.a.u(r9, r11)
            r8.s = r9
            r9 = 10
            boolean r9 = r10.u(r9, r7)
            r8.l = r9
            r9 = 6
            boolean r9 = r10.u(r9, r0)
            r8.m = r9
            r9 = 9
            boolean r9 = r10.u(r9, r7)
            r8.n = r9
            r9 = 8
            java.lang.CharSequence r9 = r10.r(r9)
            r8.o = r9
            r9 = 7
            boolean r11 = r10.v(r9)
            if (r11 == 0) goto Lf1
            int r9 = r10.k(r9, r7)
            r8.f(r9)
        Lf1:
            r10.t()
            r8.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfq.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
