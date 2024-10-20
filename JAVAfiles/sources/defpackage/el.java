package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class el extends ViewGroup.MarginLayoutParams {
    public int a;

    public el(int i, int i2) {
        super(i, i2);
        this.a = 8388627;
    }

    public el(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gc.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public el(el elVar) {
        super((ViewGroup.MarginLayoutParams) elVar);
        this.a = 0;
        this.a = elVar.a;
    }

    public el(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
