package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajwc implements ajvf {
    public final TemplateLayout a;
    public final boolean b;

    public ajwc(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        int i2;
        this.a = templateLayout;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, ajvp.m, i, 0);
            r0 = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getBoolean(0, false) : false;
            obtainStyledAttributes.recycle();
            ProgressBar a = a();
            if (a != null) {
                if (true != this.b) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                a.setVisibility(i2);
            }
        }
        this.b = r0;
    }

    public final ProgressBar a() {
        int i;
        if (true != this.b) {
            i = R.id.sud_layout_progress;
        } else {
            i = R.id.sud_glif_progress_bar;
        }
        return (ProgressBar) this.a.g(i);
    }
}
