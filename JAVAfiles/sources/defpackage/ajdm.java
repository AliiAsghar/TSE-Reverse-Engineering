package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajdm extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;
    public agrk c;

    public ajdm() {
        super(-1, -2);
        this.a = 1;
    }

    public ajdm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajdr.b);
        this.a = obtainStyledAttributes.getInt(1, 0);
        this.c = obtainStyledAttributes.getInt(0, 0) == 1 ? new agrk((byte[]) null, (byte[]) null) : null;
        if (obtainStyledAttributes.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public ajdm(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public ajdm(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public ajdm(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
