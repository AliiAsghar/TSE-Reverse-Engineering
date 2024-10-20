package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.ajdh;
import defpackage.ajgr;
import defpackage.ajgs;
import defpackage.ajgt;
import defpackage.ajgu;
import defpackage.ajgv;
import defpackage.ajgw;
import defpackage.ajgx;
import defpackage.ajgy;
import defpackage.ajgz;
import defpackage.ajha;
import defpackage.ajhb;
import defpackage.ajhc;
import defpackage.ajhq;
import defpackage.ajhr;
import defpackage.ajhv;
import defpackage.ajig;
import defpackage.ajkr;
import defpackage.ajnr;
import defpackage.aodz;
import defpackage.dxs;
import defpackage.dxt;
import defpackage.dxv;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements dxs {
    public static final Property k = new ajgv(Float.class);
    public static final Property l = new ajgw(Float.class);
    public static final Property m = new ajgx(Float.class);
    public static final Property n = new ajgy(Float.class);
    public static final /* synthetic */ int w = 0;
    private final ajhq A;
    private final int B;
    private final dxt C;
    private final int D;
    private final aodz E;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public ColorStateList t;
    public int u;
    public int v;
    private final ajhq x;
    private final ajhq y;
    private final ajhq z;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends dxt<T> {
        private Rect a;
        private final boolean b;
        private final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        private static boolean N(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof dxv) {
                return ((dxv) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean O(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            dxv dxvVar = (dxv) extendedFloatingActionButton.getLayoutParams();
            if ((!this.b && !this.c) || dxvVar.f != view.getId()) {
                return false;
            }
            return true;
        }

        private final boolean P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!O(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ajhv.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                M(extendedFloatingActionButton);
                return true;
            }
            L(extendedFloatingActionButton);
            return true;
        }

        private final boolean Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!O(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((dxv) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                M(extendedFloatingActionButton);
                return true;
            }
            L(extendedFloatingActionButton);
            return true;
        }

        protected final void L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i;
            int i2 = ExtendedFloatingActionButton.w;
            if (true != this.c) {
                i = 0;
            } else {
                i = 3;
            }
            extendedFloatingActionButton.q(i);
        }

        protected final void M(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = ExtendedFloatingActionButton.w;
            int i2 = 1;
            if (true == this.c) {
                i2 = 2;
            }
            extendedFloatingActionButton.q(i2);
        }

        @Override // defpackage.dxt
        public final void a(dxv dxvVar) {
            if (dxvVar.h == 0) {
                dxvVar.h = 80;
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List a = coordinatorLayout.a(extendedFloatingActionButton);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) a.get(i2);
                if (view2 instanceof AppBarLayout) {
                    if (P(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (N(view2) && Q(view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(extendedFloatingActionButton, i);
            return true;
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else if (N(view2)) {
                Q(view2, extendedFloatingActionButton);
            }
        }

        @Override // defpackage.dxt
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            return false;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajhr.b);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    private final void r() {
        this.t = getTextColors();
    }

    @Override // defpackage.dxs
    public final dxt a() {
        return this.C;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    public final int k() {
        return (l() - this.e) / 2;
    }

    public final int l() {
        int i = this.B;
        if (i < 0) {
            int min = Math.min(getPaddingStart(), getPaddingEnd());
            return min + min + this.e;
        }
        return i;
    }

    public final void m() {
        q(1);
    }

    public final void n() {
        q(2);
    }

    public final void o(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r && TextUtils.isEmpty(getText()) && this.d != null) {
            this.r = false;
            this.x.i();
        }
    }

    public final boolean p() {
        if (getVisibility() != 0) {
            if (this.o != 2) {
                return false;
            }
            return true;
        }
        if (this.o == 1) {
            return false;
        }
        return true;
    }

    public final void q(int i) {
        ajhq ajhqVar;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ajhqVar = this.y;
                } else {
                    ajhqVar = this.x;
                }
            } else {
                ajhqVar = this.A;
            }
        } else {
            ajhqVar = this.z;
        }
        if (!ajhqVar.j()) {
            if (!isLaidOut()) {
                p();
            } else if (!isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.u = layoutParams.width;
                        this.v = layoutParams.height;
                    } else {
                        this.u = getWidth();
                        this.v = getHeight();
                    }
                }
                measure(0, 0);
                AnimatorSet a = ajhqVar.a();
                a.addListener(new ajgu(ajhqVar));
                Iterator it = ajhqVar.d().iterator();
                while (it.hasNext()) {
                    a.addListener((Animator.AnimatorListener) it.next());
                }
                a.start();
                return;
            }
            ajhqVar.i();
            ajhqVar.k();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.r && !this.s) {
            this.p = getPaddingStart();
            this.q = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.r && !this.s) {
            this.p = i;
            this.q = i3;
        }
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(i);
        r();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.o = 0;
        aodz aodzVar = new aodz((char[]) null);
        this.E = aodzVar;
        ajhb ajhbVar = new ajhb(this, aodzVar);
        this.z = ajhbVar;
        ajha ajhaVar = new ajha(this, aodzVar);
        this.A = ajhaVar;
        this.r = true;
        this.s = false;
        Context context2 = getContext();
        this.C = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray a = ajig.a(context2, attributeSet, ajhr.a, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        ajdh b = ajdh.b(context2, a, 5);
        ajdh b2 = ajdh.b(context2, a, 4);
        ajdh b3 = ajdh.b(context2, a, 2);
        ajdh b4 = ajdh.b(context2, a, 6);
        this.B = a.getDimensionPixelSize(0, -1);
        int i2 = a.getInt(3, 1);
        this.D = i2;
        this.p = getPaddingStart();
        this.q = getPaddingEnd();
        aodz aodzVar2 = new aodz((char[]) null);
        ajhc ajgrVar = new ajgr(this, 0);
        ajhc ajgsVar = new ajgs(this, ajgrVar);
        ajhc ajgtVar = new ajgt(this, ajgsVar, ajgrVar);
        ?? r7 = 1;
        if (i2 != 1) {
            ajgrVar = i2 != 2 ? ajgtVar : ajgsVar;
            r7 = 1;
        }
        ajgz ajgzVar = new ajgz(this, aodzVar2, ajgrVar, r7);
        this.y = ajgzVar;
        ajgz ajgzVar2 = new ajgz(this, aodzVar2, new ajgr(this, r7), false);
        this.x = ajgzVar2;
        ajhbVar.b = b;
        ajhaVar.b = b2;
        ajgzVar.b = b3;
        ajgzVar2.b = b4;
        a.recycle();
        fn(new ajkr(ajkr.g(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, ajkr.a)));
        r();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        r();
    }
}
