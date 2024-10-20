package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvv implements ajvf {
    public final TemplateLayout a;

    public ajvv(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a;
        TextView a2;
        this.a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, ajvp.c, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null && (a2 = a()) != null) {
            a2.setText(text);
            TextView a3 = a();
            if (a3 != null) {
                a3.setVisibility(0);
            }
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null && (a = a()) != null) {
            a.setTextColor(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    public final TextView a() {
        return (TextView) this.a.g(R.id.sud_layout_subtitle);
    }
}
