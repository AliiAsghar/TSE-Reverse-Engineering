package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajnb extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final ajna n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private AccessibilityManager.TouchExplorationStateChangeListener s;
    private final asqc t;

    public ajnb(TextInputLayout textInputLayout, ktk ktkVar) {
        super(textInputLayout.getContext());
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new ajmz(this);
        asqc asqcVar = new asqc(this, null);
        this.t = asqcVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton t = t(this, from, R.id.text_input_error_icon);
        this.b = t;
        CheckableImageButton t2 = t(frameLayout, from, R.id.text_input_end_icon);
        this.d = t2;
        this.n = new ajna(this, ktkVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = ajnj.a;
        if (ktkVar.v(38)) {
            this.c = ajki.C(getContext(), ktkVar, 38);
        }
        if (ktkVar.v(39)) {
            this.m = a.u(ktkVar.k(39, -1), null);
        }
        if (ktkVar.v(37)) {
            m(ktkVar.p(37));
        }
        t.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        t.setImportantForAccessibility(2);
        t.setClickable(false);
        t.c = false;
        t.a(false);
        t.setFocusable(false);
        if (!ktkVar.v(53)) {
            if (ktkVar.v(32)) {
                this.f = ajki.C(getContext(), ktkVar, 32);
            }
            if (ktkVar.v(33)) {
                this.g = a.u(ktkVar.k(33, -1), null);
            }
        }
        if (ktkVar.v(30)) {
            k(ktkVar.k(30, 0));
            if (ktkVar.v(27)) {
                j(ktkVar.r(27));
            }
            i(ktkVar.u(26, true));
        } else if (ktkVar.v(53)) {
            if (ktkVar.v(54)) {
                this.f = ajki.C(getContext(), ktkVar, 54);
            }
            if (ktkVar.v(55)) {
                this.g = a.u(ktkVar.k(55, -1), null);
            }
            k(ktkVar.u(53, false) ? 1 : 0);
            j(ktkVar.r(51));
        }
        int j = ktkVar.j(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (j >= 0) {
            if (j != this.p) {
                this.p = j;
                ajki.o(t2, j);
                ajki.o(t, j);
            }
            if (ktkVar.v(31)) {
                ImageView.ScaleType l = ajki.l(ktkVar.k(31, -1));
                t2.setScaleType(l);
                t.setScaleType(l);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(ktkVar.n(72, 0));
            if (ktkVar.v(73)) {
                appCompatTextView.setTextColor(ktkVar.o(73));
            }
            CharSequence r = ktkVar.r(71);
            this.h = true != TextUtils.isEmpty(r) ? r : null;
            appCompatTextView.setText(r);
            v();
            frameLayout.addView(t2);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(t);
            textInputLayout.m.add(asqcVar);
            if (textInputLayout.c != null) {
                asqcVar.i(textInputLayout);
            }
            addOnAttachStateChangeListener(new ib(this, 7));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    private final CheckableImageButton t(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ajki.g(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void u() {
        int i;
        boolean z;
        int i2 = 0;
        if (this.d.getVisibility() == 0 && !s()) {
            i = 0;
        } else {
            i = 8;
        }
        this.l.setVisibility(i);
        if (this.h != null && !this.q) {
            z = false;
        } else {
            z = 8;
        }
        if (!r() && !s() && z) {
            i2 = 8;
        }
        setVisibility(i2);
    }

    private final void v() {
        int visibility = this.i.getVisibility();
        boolean z = false;
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            ajnc c = c();
            if (i == 0) {
                z = true;
            }
            c.h(z);
        }
        u();
        this.i.setVisibility(i);
        this.a.D();
    }

    public final int a() {
        int marginStart;
        if (!r() && !s()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final ajnc c() {
        ajnc ajmrVar;
        int i = this.e;
        ajna ajnaVar = this.n;
        ajnc ajncVar = (ajnc) ((SparseArray) ajnaVar.c).get(i);
        if (ajncVar == null) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ajmrVar = new ajmy((ajnb) ajnaVar.d);
                            } else {
                                throw new IllegalArgumentException(a.bV(i, "Invalid end icon mode: "));
                            }
                        } else {
                            ajmrVar = new ajmq((ajnb) ajnaVar.d);
                        }
                    } else {
                        ajncVar = new ajni((ajnb) ajnaVar.d, ajnaVar.b);
                        ((SparseArray) ajnaVar.c).append(i, ajncVar);
                    }
                } else {
                    ajmrVar = new ajnc((ajnb) ajnaVar.d);
                }
            } else {
                ajmrVar = new ajmr((ajnb) ajnaVar.d);
            }
            ajncVar = ajmrVar;
            ((SparseArray) ajnaVar.c).append(i, ajncVar);
        }
        return ajncVar;
    }

    public final void d() {
        if (this.s != null && this.r != null && isAttachedToWindow()) {
            this.r.addTouchExplorationStateChangeListener(this.s);
        }
    }

    public final void e(boolean z) {
        this.q = z;
        v();
    }

    public final void f() {
        ajki.n(this.a, this.d, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        boolean isActivated;
        boolean z2;
        ajnc c = c();
        boolean z3 = false;
        boolean z4 = true;
        if (c.s() && (z2 = this.d.a) != c.t()) {
            this.d.setChecked(!z2);
            z3 = true;
        }
        if (c.q() && (isActivated = this.d.isActivated()) != c.r()) {
            this.d.setActivated(!isActivated);
        } else {
            z4 = z3;
        }
        if (!z && !z4) {
            return;
        }
        f();
    }

    public final void h() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener != null && (accessibilityManager = this.r) != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    final void i(boolean z) {
        this.d.a(z);
    }

    final void j(CharSequence charSequence) {
        if (this.d.getContentDescription() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    final void k(int i) {
        boolean z;
        Drawable drawable;
        if (this.e == i) {
            return;
        }
        ajnc c = c();
        h();
        CharSequence charSequence = null;
        this.s = null;
        c.j();
        this.e = i;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((ajnn) it.next()).a();
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        l(z);
        ajnc c2 = c();
        int i2 = this.n.a;
        if (i2 == 0) {
            i2 = c2.b();
        }
        if (i2 != 0) {
            drawable = d.f(getContext(), i2);
        } else {
            drawable = null;
        }
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            ajki.m(this.a, this.d, this.f, this.g);
            f();
        }
        int a = c2.a();
        if (a != 0) {
            charSequence = getResources().getText(a);
        }
        j(charSequence);
        i(c2.s());
        int i3 = this.a.l;
        if (c2.o(i3)) {
            c2.i();
            this.s = c2.A();
            d();
            ajki.p(this.d, c2.c());
            EditText editText = this.j;
            if (editText != null) {
                c2.g(editText);
                n(c2);
            }
            ajki.m(this.a, this.d, this.f, this.g);
            g(true);
            return;
        }
        throw new IllegalStateException(a.bU(i, i3, "The current box background mode ", " is not supported by the end icon mode "));
    }

    public final void l(boolean z) {
        int i;
        if (r() != z) {
            CheckableImageButton checkableImageButton = this.d;
            if (true != z) {
                i = 8;
            } else {
                i = 0;
            }
            checkableImageButton.setVisibility(i);
            u();
            p();
            this.a.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(Drawable drawable) {
        this.b.setImageDrawable(drawable);
        o();
        ajki.m(this.a, this.b, this.c, this.m);
    }

    public final void n(ajnc ajncVar) {
        EditText editText = this.j;
        if (editText != null) {
            if (ajncVar.d() != null) {
                editText.setOnFocusChangeListener(ajncVar.d());
            }
            if (ajncVar.e() != null) {
                this.d.setOnFocusChangeListener(ajncVar.e());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.b
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.material.textfield.TextInputLayout r0 = r4.a
            ajnf r3 = r0.d
            boolean r3 = r3.g
            if (r3 == 0) goto L1a
            boolean r0 = r0.C()
            if (r0 == 0) goto L1a
            r0 = r1
            goto L1b
        L1a:
            r0 = r2
        L1b:
            com.google.android.material.internal.CheckableImageButton r3 = r4.b
            if (r1 == r0) goto L21
            r2 = 8
        L21:
            r3.setVisibility(r2)
            r4.u()
            r4.p()
            boolean r0 = r4.q()
            if (r0 != 0) goto L35
            com.google.android.material.textfield.TextInputLayout r0 = r4.a
            r0.D()
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnb.o():void");
    }

    public final void p() {
        if (this.a.c == null) {
            return;
        }
        int i = 0;
        if (!r() && !s()) {
            i = this.a.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.a.c.getPaddingTop(), i, this.a.c.getPaddingBottom());
    }

    public final boolean q() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (this.l.getVisibility() == 0 && this.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.b.getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
