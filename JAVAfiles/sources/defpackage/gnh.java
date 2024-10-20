package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnh extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public gnh() {
        super(-1, -1);
        this.c = brg.a;
    }

    public gnh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = brg.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
        this.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
