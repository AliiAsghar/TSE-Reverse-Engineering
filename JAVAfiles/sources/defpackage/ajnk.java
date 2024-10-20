package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajnk extends LinearLayout {
    public final TextView a;
    public CharSequence b;
    public final CheckableImageButton c;
    private final TextInputLayout d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private boolean h;

    public ajnk(TextInputLayout textInputLayout, ktk ktkVar) {
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.c = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.a = appCompatTextView;
        if (ajki.g(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        h();
        i();
        int[] iArr = ajnj.a;
        if (ktkVar.v(69)) {
            this.e = ajki.C(getContext(), ktkVar, 69);
        }
        if (ktkVar.v(70)) {
            this.f = a.u(ktkVar.k(70, -1), null);
        }
        if (ktkVar.v(66)) {
            Drawable p = ktkVar.p(66);
            checkableImageButton.setImageDrawable(p);
            if (p != null) {
                ajki.m(textInputLayout, checkableImageButton, this.e, this.f);
                e(true);
                c();
            } else {
                e(false);
                h();
                i();
                d(null);
            }
            if (ktkVar.v(65)) {
                d(ktkVar.r(65));
            }
            checkableImageButton.a(ktkVar.u(64, true));
        }
        int j = ktkVar.j(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (j >= 0) {
            if (j != this.g) {
                this.g = j;
                ajki.o(checkableImageButton, j);
            }
            if (ktkVar.v(68)) {
                checkableImageButton.setScaleType(ajki.l(ktkVar.k(68, -1)));
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(ktkVar.n(60, 0));
            if (ktkVar.v(61)) {
                appCompatTextView.setTextColor(ktkVar.o(61));
            }
            CharSequence r = ktkVar.r(59);
            this.b = true != TextUtils.isEmpty(r) ? r : null;
            appCompatTextView.setText(r);
            j();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    private final void j() {
        int i;
        int i2 = 0;
        if (this.b != null && !this.h) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.c.getVisibility() != 0 && i != 0) {
            i2 = 8;
        }
        setVisibility(i2);
        this.a.setVisibility(i);
        this.d.D();
    }

    public final int a() {
        int i;
        if (g()) {
            CheckableImageButton checkableImageButton = this.c;
            i = checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            i = 0;
        }
        return getPaddingStart() + this.a.getPaddingStart() + i;
    }

    public final void b(boolean z) {
        this.h = z;
        j();
    }

    public final void c() {
        ajki.n(this.d, this.c, this.e);
    }

    final void d(CharSequence charSequence) {
        if (this.c.getContentDescription() != charSequence) {
            this.c.setContentDescription(charSequence);
        }
    }

    final void e(boolean z) {
        int i;
        if (g() != z) {
            CheckableImageButton checkableImageButton = this.c;
            if (true != z) {
                i = 8;
            } else {
                i = 0;
            }
            checkableImageButton.setVisibility(i);
            f();
            j();
        }
    }

    final void f() {
        int paddingStart;
        EditText editText = this.d.c;
        if (editText == null) {
            return;
        }
        if (g()) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.a.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    final boolean g() {
        if (this.c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    final void h() {
        ajki.p(this.c, null);
    }

    final void i() {
        ajki.q(this.c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        f();
    }
}
