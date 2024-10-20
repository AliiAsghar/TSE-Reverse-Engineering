package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a;
import defpackage.ahnz;
import defpackage.ajdd;
import defpackage.ajgk;
import defpackage.ajgl;
import defpackage.ajhu;
import defpackage.ajhv;
import defpackage.ajir;
import defpackage.ajki;
import defpackage.ajkk;
import defpackage.ajkm;
import defpackage.ajkr;
import defpackage.ajlk;
import defpackage.ajms;
import defpackage.ajmt;
import defpackage.ajmu;
import defpackage.ajnb;
import defpackage.ajne;
import defpackage.ajnf;
import defpackage.ajnh;
import defpackage.ajnk;
import defpackage.ajnl;
import defpackage.ajnm;
import defpackage.ajno;
import defpackage.akct;
import defpackage.asqc;
import defpackage.brg;
import defpackage.eap;
import defpackage.ebz;
import defpackage.eek;
import defpackage.egl;
import defpackage.glf;
import defpackage.glq;
import defpackage.km;
import defpackage.md;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int r = 0;
    private static final int[][] s = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private TextView B;
    private ColorStateList C;
    private int D;
    private glf E;
    private glf F;
    private ColorStateList G;
    private ColorStateList H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private CharSequence L;
    private ajkm M;
    private ajkm N;
    private StateListDrawable O;
    private boolean P;
    private ajkm Q;
    private ajkm R;
    private ajkr S;
    private boolean T;
    private final int U;
    private int V;
    private int W;
    public final ajnk a;
    private boolean aA;
    private boolean aB;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private final Rect ae;
    private final Rect af;
    private final RectF ag;
    private Drawable ah;
    private int ai;
    private Drawable aj;
    private int ak;
    private Drawable al;
    private ColorStateList am;
    private ColorStateList an;
    private int ao;
    private int ap;
    private int aq;
    private ColorStateList ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private boolean ax;
    private boolean ay;
    private ValueAnimator az;
    public final ajnb b;
    public EditText c;
    public final ajnf d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public boolean k;
    public int l;
    public final LinkedHashSet m;
    public int n;
    public boolean o;
    public final ajhu p;
    public boolean q;
    private final FrameLayout t;
    private CharSequence u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private final int E() {
        float a;
        if (this.K) {
            int i = this.l;
            if (i != 0) {
                if (i != 2) {
                    return 0;
                }
                a = this.p.a() / 2.0f;
            } else {
                a = this.p.a();
            }
            return (int) a;
        }
        return 0;
    }

    private final int F(int i, boolean z) {
        int a;
        if (!z) {
            if (e() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingLeft();
        } else {
            if (f() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingLeft();
        }
        return i + a;
    }

    private final int G(int i, boolean z) {
        int a;
        if (!z) {
            if (f() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingRight();
        } else {
            if (e() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingRight();
        }
        return i - a;
    }

    private final Drawable H() {
        if (this.N == null) {
            this.N = J(true);
        }
        return this.N;
    }

    private final glf I() {
        glf glfVar = new glf();
        glfVar.b = ajgk.g(getContext(), com.google.android.apps.messaging.R.attr.motionDurationShort2, 87);
        glfVar.c = ajgk.l(getContext(), com.google.android.apps.messaging.R.attr.motionEasingLinearInterpolator, ajdd.a);
        return glfVar;
    }

    private final ajkm J(boolean z) {
        float dimensionPixelOffset;
        float f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        if (editText instanceof ajnh) {
            dimensionPixelOffset = ((ajnh) editText).b;
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        if (true != z) {
            f = brg.a;
        } else {
            f = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ColorStateList colorStateList = null;
        akct akctVar = new akct((char[]) null);
        akctVar.i(f);
        akctVar.j(f);
        akctVar.g(dimensionPixelOffset2);
        akctVar.h(dimensionPixelOffset2);
        ajkr ajkrVar = new ajkr(akctVar);
        EditText editText2 = this.c;
        if (editText2 instanceof ajnh) {
            colorStateList = ((ajnh) editText2).c;
        }
        Context context = getContext();
        int i = ajkm.y;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ahnz.f(context, com.google.android.apps.messaging.R.attr.colorSurface, ajkm.class.getSimpleName()));
        }
        ajkm ajkmVar = new ajkm();
        ajkmVar.G(context);
        ajkmVar.J(colorStateList);
        ajkmVar.I(dimensionPixelOffset);
        ajkmVar.fn(ajkrVar);
        ajkk ajkkVar = ajkmVar.o;
        if (ajkkVar.i == null) {
            ajkkVar.i = new Rect();
        }
        ajkmVar.o.i.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        ajkmVar.invalidateSelf();
        return ajkmVar;
    }

    private final void K() {
        ColorStateList valueOf;
        ajkm ajkmVar = this.M;
        if (ajkmVar == null) {
            return;
        }
        ajkr C = ajkmVar.C();
        ajkr ajkrVar = this.S;
        if (C != ajkrVar) {
            this.M.fn(ajkrVar);
        }
        if (this.l == 2 && Y()) {
            this.M.L(this.W, this.ac);
        }
        int i = this.ad;
        if (this.l == 1) {
            i = eap.g(this.ad, ahnz.e(getContext(), com.google.android.apps.messaging.R.attr.colorSurface, 0));
        }
        this.ad = i;
        this.M.J(ColorStateList.valueOf(i));
        ajkm ajkmVar2 = this.Q;
        if (ajkmVar2 != null && this.R != null) {
            if (Y()) {
                if (this.c.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.ao);
                } else {
                    valueOf = ColorStateList.valueOf(this.ac);
                }
                ajkmVar2.J(valueOf);
                this.R.J(ColorStateList.valueOf(this.ac));
            }
            invalidate();
        }
        x();
    }

    private final void L() {
        if (Z()) {
            ((ajmu) this.M).a(brg.a, brg.a, brg.a, brg.a);
        }
    }

    private final void M() {
        TextView textView = this.B;
        if (textView != null && this.j) {
            textView.setText((CharSequence) null);
            glq.b(this.t, this.F);
            this.B.setVisibility(4);
        }
    }

    private final void N() {
        int i = this.l;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.K && !(this.M instanceof ajmu)) {
                        ajkr ajkrVar = this.S;
                        if (ajkrVar == null) {
                            ajkrVar = new ajkr();
                        }
                        this.M = new ajmt(new ajms(ajkrVar, new RectF()));
                    } else {
                        this.M = new ajkm(this.S);
                    }
                    this.Q = null;
                    this.R = null;
                } else {
                    throw new IllegalArgumentException(a.cq(i, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.M = new ajkm(this.S);
                this.Q = new ajkm();
                this.R = new ajkm();
            }
        } else {
            this.M = null;
            this.Q = null;
            this.R = null;
        }
        x();
        A();
        if (this.l == 1) {
            if (ajki.h(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ajki.g(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.c != null && this.l == 1) {
            if (ajki.h(getContext())) {
                EditText editText = this.c;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ajki.g(getContext())) {
                EditText editText2 = this.c;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.l != 0) {
            U();
        }
        EditText editText3 = this.c;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.l;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(H());
                    return;
                }
                if (i2 == 1) {
                    if (this.O == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.O = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, H());
                        this.O.addState(new int[0], J(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.O);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void O() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.O():void");
    }

    private static void P(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                P((ViewGroup) childAt, z);
            }
        }
    }

    private final void Q(boolean z) {
        if (this.j == z) {
            return;
        }
        if (z) {
            TextView textView = this.B;
            if (textView != null) {
                this.t.addView(textView);
                this.B.setVisibility(0);
            }
        } else {
            TextView textView2 = this.B;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.B = null;
        }
        this.j = z;
    }

    private final void R() {
        Editable text;
        if (this.h != null) {
            EditText editText = this.c;
            if (editText == null) {
                text = null;
            } else {
                text = editText.getText();
            }
            v(text);
        }
    }

    private final void S() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            if (this.g) {
                i = this.z;
            } else {
                i = this.A;
            }
            t(textView, i);
            if (!this.g && (colorStateList2 = this.G) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (this.g && (colorStateList = this.H) != null) {
                this.h.setTextColor(colorStateList);
            }
        }
    }

    private final void T() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.I;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue h = ajgk.h(context, com.google.android.apps.messaging.R.attr.colorControlActivated);
            if (h != null) {
                if (h.resourceId != 0) {
                    colorStateList2 = egl.f(context, h.resourceId);
                } else if (h.data != 0) {
                    colorStateList2 = ColorStateList.valueOf(h.data);
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.c;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.c.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((C() || (this.h != null && this.g)) && (colorStateList = this.J) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    private final void U() {
        if (this.l != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.t.getLayoutParams();
            int E = E();
            if (E != layoutParams.topMargin) {
                layoutParams.topMargin = E;
                this.t.requestLayout();
            }
        }
    }

    private final void V(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        ColorStateList colorStateList2;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.c;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.c;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ColorStateList colorStateList3 = this.am;
        if (colorStateList3 != null) {
            this.p.f(colorStateList3);
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.am;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.aw);
            } else {
                i = this.aw;
            }
            this.p.f(ColorStateList.valueOf(i));
        } else if (C()) {
            ajhu ajhuVar = this.p;
            TextView textView2 = this.d.h;
            if (textView2 != null) {
                colorStateList2 = textView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            ajhuVar.f(colorStateList2);
        } else if (this.g && (textView = this.h) != null) {
            this.p.f(textView.getTextColors());
        } else if (z4 && (colorStateList = this.an) != null) {
            this.p.g(colorStateList);
        }
        if (!z3 && this.ax && (!isEnabled() || !z4)) {
            if (z2 || !this.o) {
                ValueAnimator valueAnimator = this.az;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.az.cancel();
                }
                if (z && this.ay) {
                    g(brg.a);
                } else {
                    this.p.k(brg.a);
                }
                if (Z() && !((ajmu) this.M).a.x.isEmpty()) {
                    L();
                }
                this.o = true;
                M();
                this.a.b(true);
                this.b.e(true);
                return;
            }
            return;
        }
        if (!z2 && !this.o) {
            return;
        }
        ValueAnimator valueAnimator2 = this.az;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.az.cancel();
        }
        if (z && this.ay) {
            g(1.0f);
        } else {
            this.p.k(1.0f);
        }
        this.o = false;
        if (Z()) {
            O();
        }
        W();
        this.a.b(false);
        this.b.e(false);
    }

    private final void W() {
        Editable text;
        EditText editText = this.c;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        z(text);
    }

    private final void X(boolean z, boolean z2) {
        int defaultColor = this.ar.getDefaultColor();
        int colorForState = this.ar.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.ar.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ac = defaultColor;
    }

    private final boolean Y() {
        if (this.W >= 0 && this.ac != 0) {
            return true;
        }
        return false;
    }

    private final boolean Z() {
        if (this.K && !TextUtils.isEmpty(this.L) && (this.M instanceof ajmu)) {
            return true;
        }
        return false;
    }

    private final boolean aa() {
        if (this.l == 1 && this.c.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A() {
        boolean z;
        int i;
        TextView textView;
        int i2;
        int i3;
        EditText editText;
        EditText editText2;
        if (this.M != null && this.l != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.c) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.c) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.ac = this.aw;
            } else if (C()) {
                if (this.ar != null) {
                    X(z, z2);
                } else {
                    this.ac = a();
                }
            } else {
                if (this.g && (textView = this.h) != null) {
                    if (this.ar != null) {
                        X(z, z2);
                    } else {
                        i = textView.getCurrentTextColor();
                    }
                } else if (z) {
                    i = this.aq;
                } else if (z2) {
                    i = this.ap;
                } else {
                    i = this.ao;
                }
                this.ac = i;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                T();
            }
            ajnb ajnbVar = this.b;
            ajnbVar.o();
            ajki.n(ajnbVar.a, ajnbVar.b, ajnbVar.c);
            ajnbVar.f();
            if (ajnbVar.c().u()) {
                if (ajnbVar.a.C() && ajnbVar.b() != null) {
                    Drawable mutate = ajnbVar.b().mutate();
                    mutate.setTint(ajnbVar.a.a());
                    ajnbVar.d.setImageDrawable(mutate);
                } else {
                    ajki.m(ajnbVar.a, ajnbVar.d, ajnbVar.f, ajnbVar.g);
                }
            }
            this.a.c();
            if (this.l == 2) {
                int i4 = this.W;
                if (z && isEnabled()) {
                    i3 = this.ab;
                    this.W = i3;
                } else {
                    i3 = this.aa;
                    this.W = i3;
                }
                if (i3 != i4 && Z() && !this.o) {
                    L();
                    O();
                }
            }
            if (this.l == 1) {
                if (!isEnabled()) {
                    this.ad = this.at;
                } else {
                    if (z2 && !z) {
                        i2 = this.av;
                    } else if (z) {
                        i2 = this.au;
                    } else {
                        i2 = this.as;
                    }
                    this.ad = i2;
                }
            }
            K();
        }
    }

    public final boolean B() {
        return this.d.n;
    }

    public final boolean C() {
        ajnf ajnfVar = this.d;
        if (ajnfVar.e == 1 && ajnfVar.h != null && !TextUtils.isEmpty(ajnfVar.f)) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        boolean z;
        if (this.c == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((this.a.c.getDrawable() != null || (e() != null && this.a.a.getVisibility() == 0)) && this.a.getMeasuredWidth() > 0) {
            int measuredWidth = this.a.getMeasuredWidth() - this.c.getPaddingLeft();
            if (this.ah == null || this.ai != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ah = colorDrawable;
                this.ai = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ah;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ah != null) {
                Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
                this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ah = null;
                z = true;
            }
            z = false;
        }
        if ((this.b.s() || ((this.b.q() && this.b.r()) || this.b.h != null)) && this.b.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.b.i.getMeasuredWidth() - this.c.getPaddingRight();
            ajnb ajnbVar = this.b;
            if (ajnbVar.s()) {
                checkableImageButton = ajnbVar.b;
            } else if (ajnbVar.q() && ajnbVar.r()) {
                checkableImageButton = ajnbVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.aj;
            if (drawable3 != null && this.ak != measuredWidth2) {
                this.ak = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.aj, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.aj = colorDrawable2;
                this.ak = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.aj;
            if (drawable4 != drawable5) {
                this.al = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.aj != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.aj) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.al, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.aj = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.t.addView(view, layoutParams2);
            this.t.setLayoutParams(layoutParams);
            U();
            EditText editText = (EditText) view;
            if (this.c == null) {
                if (this.b.e != 3 && !(editText instanceof TextInputEditText)) {
                    Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
                }
                this.c = editText;
                int i2 = this.v;
                if (i2 != -1) {
                    p(i2);
                } else {
                    q(this.x);
                }
                int i3 = this.w;
                if (i3 != -1) {
                    n(i3);
                } else {
                    o(this.y);
                }
                this.P = false;
                N();
                u(new ajnm(this));
                ajhu ajhuVar = this.p;
                Typeface typeface = this.c.getTypeface();
                boolean n = ajhuVar.n(typeface);
                if (ajhuVar.n != typeface) {
                    ajhuVar.n = typeface;
                    ajhuVar.m = ajki.b(ajhuVar.a.getContext().getResources().getConfiguration(), typeface);
                    Typeface typeface2 = ajhuVar.m;
                    if (typeface2 == null) {
                        typeface2 = ajhuVar.n;
                    }
                    ajhuVar.l = typeface2;
                    z = true;
                } else {
                    z = false;
                }
                if (n || z) {
                    ajhuVar.d();
                }
                this.p.j(this.c.getTextSize());
                ajhu ajhuVar2 = this.p;
                float letterSpacing = this.c.getLetterSpacing();
                if (ajhuVar2.F != letterSpacing) {
                    ajhuVar2.F = letterSpacing;
                    ajhuVar2.d();
                }
                int gravity = this.c.getGravity();
                this.p.h((gravity & (-113)) | 48);
                this.p.i(gravity);
                this.n = editText.getMinimumHeight();
                this.c.addTextChangedListener(new ajnl(this, editText));
                if (this.am == null) {
                    this.am = this.c.getHintTextColors();
                }
                if (this.K) {
                    if (TextUtils.isEmpty(this.L)) {
                        CharSequence hint = this.c.getHint();
                        this.u = hint;
                        m(hint);
                        this.c.setHint((CharSequence) null);
                    }
                    this.k = true;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    T();
                }
                if (this.h != null) {
                    v(this.c.getText());
                }
                w();
                this.d.b();
                this.a.bringToFront();
                this.b.bringToFront();
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((asqc) it.next()).i(this);
                }
                this.b.p();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                V(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    public final CharSequence c() {
        ajnf ajnfVar = this.d;
        if (ajnfVar.g) {
            return ajnfVar.f;
        }
        return null;
    }

    public final CharSequence d() {
        if (this.K) {
            return this.L;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        AutofillId autofillId;
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.u != null) {
            boolean z = this.k;
            this.k = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.k = z;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.t.getChildCount());
        for (int i2 = 0; i2 < this.t.getChildCount(); i2++) {
            View childAt = this.t.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.c) {
                newChild.setHint(d());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.q = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.q = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ajkm ajkmVar;
        super.draw(canvas);
        if (this.K) {
            ajhu ajhuVar = this.p;
            int save = canvas.save();
            if (ajhuVar.q != null && ajhuVar.e.width() > brg.a && ajhuVar.e.height() > brg.a) {
                ajhuVar.w.setTextSize(ajhuVar.t);
                float f = ajhuVar.j;
                float f2 = ajhuVar.k;
                float f3 = ajhuVar.s;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                canvas.translate(f, f2);
                ajhuVar.G.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.R != null && (ajkmVar = this.Q) != null) {
            ajkmVar.draw(canvas);
            if (this.c.isFocused()) {
                Rect bounds = this.R.getBounds();
                Rect bounds2 = this.Q.getBounds();
                float f4 = this.p.b;
                int centerX = bounds2.centerX();
                bounds.left = ajdd.b(centerX, bounds2.left, f4);
                bounds.right = ajdd.b(centerX, bounds2.right, f4);
                this.R.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.aA
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.aA = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            ajhu r2 = r4.p
            r3 = 0
            if (r2 == 0) goto L2f
            r2.u = r1
            android.content.res.ColorStateList r1 = r2.i
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r2.h
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r2.d()
            r1 = r0
            goto L30
        L2f:
            r1 = r3
        L30:
            android.widget.EditText r2 = r4.c
            if (r2 == 0) goto L45
            boolean r2 = r4.isLaidOut()
            if (r2 == 0) goto L41
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = r3
        L42:
            r4.y(r0)
        L45:
            r4.w()
            r4.A()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.aA = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final CharSequence e() {
        return this.a.b;
    }

    public final CharSequence f() {
        return this.b.h;
    }

    final void g(float f) {
        if (this.p.b == f) {
            return;
        }
        if (this.az == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.az = valueAnimator;
            valueAnimator.setInterpolator(ajgk.l(getContext(), com.google.android.apps.messaging.R.attr.motionEasingEmphasizedInterpolator, ajdd.b));
            this.az.setDuration(ajgk.g(getContext(), com.google.android.apps.messaging.R.attr.motionDurationMedium4, 167));
            this.az.addUpdateListener(new ajlk(this, 6));
        }
        this.az.setFloatValues(this.p.b, f);
        this.az.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + E();
        }
        return super.getBaseline();
    }

    public final void h(int i) {
        if (this.ad != i) {
            this.ad = i;
            this.as = i;
            this.au = i;
            this.av = i;
            K();
        }
    }

    public final void i(boolean z) {
        this.b.l(z);
    }

    public final void j(CharSequence charSequence) {
        if (!this.d.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                k(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            ajnf ajnfVar = this.d;
            ajnfVar.c();
            ajnfVar.f = charSequence;
            ajnfVar.h.setText(charSequence);
            int i = ajnfVar.d;
            if (i != 1) {
                ajnfVar.e = 1;
            }
            ajnfVar.l(i, ajnfVar.e, ajnfVar.m(ajnfVar.h, charSequence));
            return;
        }
        this.d.d();
    }

    public final void k(boolean z) {
        ajnf ajnfVar = this.d;
        if (ajnfVar.g == z) {
            return;
        }
        ajnfVar.c();
        if (z) {
            ajnfVar.h = new AppCompatTextView(ajnfVar.a);
            ajnfVar.h.setId(com.google.android.apps.messaging.R.id.textinput_error);
            ajnfVar.h.setTextAlignment(5);
            ajnfVar.h(ajnfVar.k);
            ajnfVar.i(ajnfVar.l);
            ajnfVar.g(ajnfVar.i);
            ajnfVar.f(ajnfVar.j);
            ajnfVar.h.setVisibility(4);
            ajnfVar.a(ajnfVar.h, 0);
        } else {
            ajnfVar.d();
            ajnfVar.e(ajnfVar.h, 0);
            ajnfVar.h = null;
            ajnfVar.b.w();
            ajnfVar.b.A();
        }
        ajnfVar.g = z;
    }

    public final void l(boolean z) {
        ajnf ajnfVar = this.d;
        if (ajnfVar.n == z) {
            return;
        }
        ajnfVar.c();
        if (z) {
            ajnfVar.o = new AppCompatTextView(ajnfVar.a);
            ajnfVar.o.setId(com.google.android.apps.messaging.R.id.textinput_helper_text);
            ajnfVar.o.setTextAlignment(5);
            ajnfVar.o.setVisibility(4);
            ajnfVar.o.setAccessibilityLiveRegion(1);
            ajnfVar.j(ajnfVar.p);
            ajnfVar.k(ajnfVar.q);
            ajnfVar.a(ajnfVar.o, 1);
            ajnfVar.o.setAccessibilityDelegate(new ajne(ajnfVar));
        } else {
            ajnfVar.c();
            int i = ajnfVar.d;
            if (i == 2) {
                ajnfVar.e = 0;
            }
            ajnfVar.l(i, ajnfVar.e, ajnfVar.m(ajnfVar.o, ""));
            ajnfVar.e(ajnfVar.o, 1);
            ajnfVar.o = null;
            ajnfVar.b.w();
            ajnfVar.b.A();
        }
        ajnfVar.n = z;
    }

    public final void m(CharSequence charSequence) {
        if (this.K) {
            if (!TextUtils.equals(charSequence, this.L)) {
                this.L = charSequence;
                ajhu ajhuVar = this.p;
                if (charSequence == null || !TextUtils.equals(ajhuVar.p, charSequence)) {
                    ajhuVar.p = charSequence;
                    ajhuVar.q = null;
                    ajhuVar.d();
                }
                if (!this.o) {
                    O();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void n(int i) {
        this.w = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public final void o(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.p.c(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aB = false;
        if (this.c != null) {
            int max = Math.max(this.b.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < max) {
                this.c.setMinimumHeight(max);
                z = true;
            }
        }
        boolean D = D();
        if (!z && !D) {
            return;
        }
        this.c.post(new ajir(this, 8, null));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.ae;
            ajhv.a(this, editText, rect);
            if (this.Q != null) {
                this.Q.setBounds(rect.left, rect.bottom - this.aa, rect.right, rect.bottom);
            }
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.K) {
                this.p.j(this.c.getTextSize());
                int gravity = this.c.getGravity();
                this.p.h((gravity & (-113)) | 48);
                this.p.i(gravity);
                ajhu ajhuVar = this.p;
                if (this.c != null) {
                    Rect rect2 = this.af;
                    boolean l = ajgl.l(this);
                    rect2.bottom = rect.bottom;
                    int i5 = this.l;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            rect2.left = F(rect.left, l);
                            rect2.top = getPaddingTop();
                            rect2.right = G(rect.right, l);
                        } else {
                            rect2.left = rect.left + this.c.getPaddingLeft();
                            rect2.top = rect.top - E();
                            rect2.right = rect.right - this.c.getPaddingRight();
                        }
                    } else {
                        rect2.left = F(rect.left, l);
                        rect2.top = rect.top + this.V;
                        rect2.right = G(rect.right, l);
                    }
                    int i6 = rect2.left;
                    int i7 = rect2.top;
                    int i8 = rect2.right;
                    int i9 = rect2.bottom;
                    if (!ajhu.m(ajhuVar.d, i6, i7, i8, i9)) {
                        ajhuVar.d.set(i6, i7, i8, i9);
                        ajhuVar.v = true;
                    }
                    ajhu ajhuVar2 = this.p;
                    if (this.c != null) {
                        Rect rect3 = this.af;
                        float f = ajhuVar2.f;
                        TextPaint textPaint = ajhuVar2.x;
                        textPaint.setTextSize(f);
                        textPaint.setTypeface(ajhuVar2.l);
                        textPaint.setLetterSpacing(ajhuVar2.F);
                        float f2 = -ajhuVar2.x.ascent();
                        rect3.left = rect.left + this.c.getCompoundPaddingLeft();
                        if (aa()) {
                            compoundPaddingTop = (int) (rect.centerY() - (f2 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.c.getCompoundPaddingTop();
                        }
                        rect3.top = compoundPaddingTop;
                        rect3.right = rect.right - this.c.getCompoundPaddingRight();
                        if (aa()) {
                            compoundPaddingBottom = (int) (rect3.top + f2);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.c.getCompoundPaddingBottom();
                        }
                        rect3.bottom = compoundPaddingBottom;
                        int i10 = rect3.left;
                        int i11 = rect3.top;
                        int i12 = rect3.right;
                        int i13 = rect3.bottom;
                        if (!ajhu.m(ajhuVar2.c, i10, i11, i12, i13)) {
                            ajhuVar2.c.set(i10, i11, i12, i13);
                            ajhuVar2.v = true;
                        }
                        this.p.d();
                        if (Z() && !this.o) {
                            O();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aB) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aB = true;
        }
        if (this.B != null && (editText = this.c) != null) {
            this.B.setGravity(editText.getGravity());
            this.B.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.p();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ajno)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ajno ajnoVar = (ajno) parcelable;
        super.onRestoreInstanceState(ajnoVar.d);
        j(ajnoVar.a);
        if (ajnoVar.b) {
            post(new ajir(this, 9));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.T) {
            float a = this.S.b.a(this.ag);
            float a2 = this.S.c.a(this.ag);
            float a3 = this.S.e.a(this.ag);
            float a4 = this.S.d.a(this.ag);
            ajkr ajkrVar = this.S;
            ajki ajkiVar = ajkrVar.j;
            ajki ajkiVar2 = ajkrVar.k;
            ajki ajkiVar3 = ajkrVar.m;
            ajki ajkiVar4 = ajkrVar.l;
            akct akctVar = new akct((char[]) null);
            akctVar.n(ajkiVar2);
            akctVar.o(ajkiVar);
            akctVar.l(ajkiVar4);
            akctVar.m(ajkiVar3);
            akctVar.i(a2);
            akctVar.j(a);
            akctVar.g(a4);
            akctVar.h(a3);
            ajkr ajkrVar2 = new ajkr(akctVar);
            this.T = z;
            ajkm ajkmVar = this.M;
            if (ajkmVar != null && ajkmVar.C() != ajkrVar2) {
                this.S = ajkrVar2;
                K();
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ajno ajnoVar = new ajno(super.onSaveInstanceState());
        if (C()) {
            ajnoVar.a = c();
        }
        ajnb ajnbVar = this.b;
        boolean z = false;
        if (ajnbVar.q() && ajnbVar.d.a) {
            z = true;
        }
        ajnoVar.b = z;
        return ajnoVar;
    }

    public final void p(int i) {
        this.v = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public final void q(int i) {
        this.x = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public final void r(int i) {
        this.D = i;
        TextView textView = this.B;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public final void s(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            TextView textView = this.B;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        P(this, z);
        super.setEnabled(z);
    }

    public final void t(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.google.android.apps.messaging.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(getContext().getColor(com.google.android.apps.messaging.R.color.design_error));
    }

    public final void u(ajnm ajnmVar) {
        EditText editText = this.c;
        if (editText != null) {
            eek.n(editText, ajnmVar);
        }
    }

    public final void v(Editable editable) {
        boolean z;
        int i;
        int b = b(editable);
        boolean z2 = this.g;
        int i2 = this.f;
        if (i2 == -1) {
            this.h.setText(String.valueOf(b));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            if (b > i2) {
                z = true;
            } else {
                z = false;
            }
            this.g = z;
            Context context = getContext();
            TextView textView = this.h;
            int i3 = this.f;
            if (true != this.g) {
                i = com.google.android.apps.messaging.R.string.character_counter_content_description;
            } else {
                i = com.google.android.apps.messaging.R.string.character_counter_overflowed_content_description;
            }
            Integer valueOf = Integer.valueOf(b);
            textView.setContentDescription(context.getString(i, valueOf, Integer.valueOf(i3)));
            if (z2 != this.g) {
                S();
            }
            this.h.setText(ebz.a().b(getContext().getString(com.google.android.apps.messaging.R.string.character_counter_pattern, valueOf, Integer.valueOf(this.f))));
        }
        if (this.c != null && z2 != this.g) {
            y(false);
            A();
            w();
        }
    }

    public final void w() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText != null && this.l == 0 && (background = editText.getBackground()) != null) {
            Rect rect = md.a;
            Drawable mutate = background.mutate();
            if (C()) {
                mutate.setColorFilter(km.b(a(), PorterDuff.Mode.SRC_IN));
            } else if (this.g && (textView = this.h) != null) {
                mutate.setColorFilter(km.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.c.refreshDrawableState();
            }
        }
    }

    public final void x() {
        Drawable drawable;
        EditText editText = this.c;
        if (editText != null && this.M != null) {
            if ((this.P || editText.getBackground() == null) && this.l != 0) {
                EditText editText2 = this.c;
                if ((editText2 instanceof AutoCompleteTextView) && !ajgl.m(editText2)) {
                    int d = ahnz.d(this.c, com.google.android.apps.messaging.R.attr.colorControlHighlight);
                    int i = this.l;
                    if (i == 2) {
                        Context context = getContext();
                        ajkm ajkmVar = this.M;
                        int[][] iArr = s;
                        int f = ahnz.f(context, com.google.android.apps.messaging.R.attr.colorSurface, "TextInputLayout");
                        ajkm ajkmVar2 = new ajkm(ajkmVar.C());
                        int g = ahnz.g(d, f, 0.1f);
                        ajkmVar2.J(new ColorStateList(iArr, new int[]{g, 0}));
                        ajkmVar2.setTint(f);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{g, f});
                        ajkm ajkmVar3 = new ajkm(ajkmVar.C());
                        ajkmVar3.setTint(-1);
                        drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ajkmVar2, ajkmVar3), ajkmVar});
                    } else if (i == 1) {
                        ajkm ajkmVar4 = this.M;
                        int i2 = this.ad;
                        drawable = new RippleDrawable(new ColorStateList(s, new int[]{ahnz.g(d, i2, 0.1f), i2}), ajkmVar4, ajkmVar4);
                    } else {
                        drawable = null;
                    }
                } else {
                    drawable = this.M;
                }
                this.c.setBackground(drawable);
                this.P = true;
            }
        }
    }

    public final void y(boolean z) {
        V(z, false);
    }

    public final void z(Editable editable) {
        if (b(editable) == 0 && !this.o) {
            if (this.B != null && this.j && !TextUtils.isEmpty(this.i)) {
                this.B.setText(this.i);
                glq.b(this.t, this.E);
                this.B.setVisibility(0);
                this.B.bringToFront();
                announceForAccessibility(this.i);
                return;
            }
            return;
        }
        M();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.textInputStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x041b  */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
