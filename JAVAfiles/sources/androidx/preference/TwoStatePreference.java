package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.gfx;
import defpackage.ggd;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ab(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (!this.a && !TextUtils.isEmpty(this.d)) {
                textView.setText(this.d);
            } else {
                CharSequence m = m();
                if (!TextUtils.isEmpty(m)) {
                    textView.setText(m);
                } else {
                    i = 8;
                }
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ac(gfx gfxVar) {
        ab(gfxVar.D(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        boolean z = !this.a;
        if (Q(Boolean.valueOf(z))) {
            k(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Parcelable e = super.e();
        if (this.v) {
            return e;
        }
        ggd ggdVar = new ggd(e);
        ggdVar.a = this.a;
        return ggdVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ggd.class)) {
            super.g(parcelable);
            return;
        }
        ggd ggdVar = (ggd) parcelable;
        super.g(ggdVar.getSuperState());
        k(ggdVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = false;
        }
        k(R(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        if (this.b) {
            if (this.a) {
                return true;
            }
        } else if (!this.a) {
            return true;
        }
        if (super.j()) {
            return true;
        }
        return false;
    }

    public final void k(boolean z) {
        boolean z2;
        if (this.a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.e) {
            this.a = z;
            this.e = true;
            if (V() && z != R(!z)) {
                SharedPreferences.Editor b = this.k.b();
                b.putBoolean(this.s, z);
                super.O(b);
            }
            if (z2) {
                z(j());
                d();
            }
        }
    }

    public final void l(CharSequence charSequence) {
        this.d = charSequence;
        if (!this.a) {
            d();
        }
    }

    public final void o(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
