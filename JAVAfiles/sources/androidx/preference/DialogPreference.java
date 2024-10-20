package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dyv;
import defpackage.gfr;
import defpackage.gfy;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dyv.d(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        gfr gfrVar = this.k.d;
        if (gfrVar != null) {
            gfrVar.p(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gfy.c, i, 0);
        String i2 = dyv.i(obtainStyledAttributes, 9, 0);
        this.a = i2;
        if (i2 == null) {
            this.a = t();
        }
        this.b = dyv.i(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = dyv.i(obtainStyledAttributes, 11, 3);
        this.e = dyv.i(obtainStyledAttributes, 10, 4);
        this.f = dyv.f(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}
