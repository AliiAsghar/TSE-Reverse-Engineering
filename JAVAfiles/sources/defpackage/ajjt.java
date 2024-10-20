package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjt extends ks {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public ajjt(Context context, AttributeSet attributeSet) {
        super(ajnr.a(context, attributeSet, com.google.android.apps.messaging.R.attr.radioButtonStyle, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, null);
        Context context2 = getContext();
        TypedArray a2 = ajig.a(context2, attributeSet, ajju.a, com.google.android.apps.messaging.R.attr.radioButtonStyle, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (a2.hasValue(0)) {
            setButtonTintList(ajki.e(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int d = ahnz.d(this, com.google.android.apps.messaging.R.attr.colorControlActivated);
                int d2 = ahnz.d(this, com.google.android.apps.messaging.R.attr.colorOnSurface);
                int d3 = ahnz.d(this, com.google.android.apps.messaging.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{ahnz.g(d3, d, 1.0f), ahnz.g(d3, d2, 0.54f), ahnz.g(d3, d2, 0.38f), ahnz.g(d3, d2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
