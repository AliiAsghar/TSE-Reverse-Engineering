package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.apps.messaging.R;
import defpackage.dyv;
import defpackage.gfx;
import defpackage.gfy;
import defpackage.ggc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private CharSequence c;
    private CharSequence d;
    private final ggc e;

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.f(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.e(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        super.a(gfxVar);
        ad(gfxVar.D(R.id.switchWidget));
        ac(gfxVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        E();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ad(view.findViewById(R.id.switchWidget));
        ab(view.findViewById(android.R.id.summary));
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new ggc((TwoStatePreference) this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gfy.m, i, i2);
        o(dyv.i(obtainStyledAttributes, 7, 0));
        l(dyv.i(obtainStyledAttributes, 6, 1));
        this.c = dyv.i(obtainStyledAttributes, 9, 3);
        d();
        this.d = dyv.i(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = dyv.j(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
}
