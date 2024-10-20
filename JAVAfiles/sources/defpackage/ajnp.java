package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajnp extends AppCompatTextView {
    public ajnp(Context context, AttributeSet attributeSet) {
        super(ajnr.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (c(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, ajnq.b, R.attr.textViewStyle, 0);
            int a = a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, ajnq.b, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    b(theme, resourceId);
                }
            }
        }
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = ajki.c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private final void b(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, ajnq.a);
        int a = a(getContext(), obtainStyledAttributes, 2, 4);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            efn.f(this, a);
        }
    }

    private static boolean c(Context context) {
        return ajgk.j(context, com.google.android.apps.messaging.R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (c(context)) {
            b(context.getTheme(), i);
        }
    }
}
