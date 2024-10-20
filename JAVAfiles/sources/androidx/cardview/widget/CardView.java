package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a;
import defpackage.brg;
import defpackage.eek;
import defpackage.ejf;
import defpackage.td;
import defpackage.te;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final ejf e;
    private static final int[] g = {R.attr.colorBackground};
    public static final a f = new a();

    public CardView(Context context) {
        this(context, null);
    }

    public float fZ() {
        return a.bQ(this.e);
    }

    public void ga(float f2) {
        ((View) this.e.b).setElevation(f2);
    }

    public void gb(float f2) {
        te teVar = (te) this.e.a;
        if (f2 == teVar.a) {
            return;
        }
        teVar.a = f2;
        teVar.a(null);
        teVar.invalidateSelf();
    }

    public final float gc() {
        return a.bP(this.e);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        ejf ejfVar = new ejf(this);
        this.e = ejfVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, td.a, i, com.google.android.apps.messaging.R.style.CardView);
        eek.m(this, context, td.a, attributeSet, obtainStyledAttributes, i, com.google.android.apps.messaging.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.android.apps.messaging.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.android.apps.messaging.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, brg.a);
        float dimension2 = obtainStyledAttributes.getDimension(4, brg.a);
        float dimension3 = obtainStyledAttributes.getDimension(5, brg.a);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        te teVar = new te(valueOf, dimension);
        ejfVar.a = teVar;
        ((CardView) ejfVar.b).setBackgroundDrawable(teVar);
        View view = (View) ejfVar.b;
        view.setClipToOutline(true);
        view.setElevation(dimension2);
        Object obj = ejfVar.a;
        boolean c = ejfVar.c();
        boolean b = ejfVar.b();
        te teVar2 = (te) obj;
        if (dimension3 != teVar2.b || teVar2.c != c || teVar2.d != b) {
            teVar2.b = dimension3;
            teVar2.c = c;
            teVar2.d = b;
            teVar2.a(null);
            teVar2.invalidateSelf();
        }
        a.bR(ejfVar);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
