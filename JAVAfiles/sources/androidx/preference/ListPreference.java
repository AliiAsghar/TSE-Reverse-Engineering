package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.messaging.R;
import defpackage.dyv;
import defpackage.get;
import defpackage.geu;
import defpackage.gfd;
import defpackage.gfy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String D;
    private boolean E;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dyv.d(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Parcelable e = super.e();
        if (this.v) {
            return e;
        }
        get getVar = new get(e);
        getVar.a = this.i;
        return getVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(get.class)) {
            super.g(parcelable);
            return;
        }
        get getVar = (get) parcelable;
        super.g(getVar.getSuperState());
        o(getVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        o(u((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int k = k(this.i);
        if (k >= 0 && (charSequenceArr = this.g) != null) {
            return charSequenceArr[k];
        }
        return null;
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        gfd gfdVar = this.B;
        if (gfdVar != null) {
            return gfdVar.a(this);
        }
        CharSequence l = l();
        CharSequence m = super.m();
        String str = this.D;
        if (str != null) {
            if (l == null) {
                l = "";
            }
            String format = String.format(str, l);
            if (!TextUtils.equals(format, m)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return m;
    }

    @Override // androidx.preference.Preference
    public final void n(CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.D = null;
        } else {
            this.D = charSequence.toString();
        }
    }

    public final void o(String str) {
        boolean equals = TextUtils.equals(this.i, str);
        if (!equals || !this.E) {
            this.i = str;
            this.E = true;
            Y(str);
            if (!equals) {
                d();
            }
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gfy.e, i, 0);
        this.g = dyv.l(obtainStyledAttributes, 2, 0);
        this.h = dyv.l(obtainStyledAttributes, 3, 1);
        if (dyv.j(obtainStyledAttributes, 4, 4, false)) {
            if (geu.a == null) {
                geu.a = new geu(0);
            }
            K(geu.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, gfy.g, i, 0);
        this.D = dyv.i(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
