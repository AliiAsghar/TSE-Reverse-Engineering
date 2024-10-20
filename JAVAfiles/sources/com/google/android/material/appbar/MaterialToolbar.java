package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.ajdr;
import defpackage.ajgl;
import defpackage.ajig;
import defpackage.ajih;
import defpackage.ajkm;
import defpackage.ajnr;
import defpackage.edz;
import defpackage.ij;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] z = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer A;
    private boolean B;
    private boolean C;
    private ImageView.ScaleType D;
    private Boolean E;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void D(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar
    public final void n(int i) {
        Menu f = f();
        boolean z2 = f instanceof ij;
        if (z2) {
            ((ij) f).s();
        }
        super.n(i);
        if (z2) {
            ((ij) f).r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajgl.q(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        Drawable drawable;
        ImageView imageView;
        Drawable drawable2;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.B || this.C) {
            List a = ajih.a(this, this.o);
            if (a.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(a, ajih.a);
            }
            List a2 = ajih.a(this, this.p);
            if (a2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(a2, ajih.a);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.B && textView != null) {
                    D(textView, pair);
                }
                if (this.C && textView2 != null) {
                    D(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.d;
        if (imageView3 != null) {
            drawable = imageView3.getDrawable();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.E;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.D;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void r(Drawable drawable) {
        if (drawable != null && this.A != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.A.intValue());
        }
        super.r(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ajgl.p(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        ColorStateList d;
        Context context2 = getContext();
        TypedArray a = ajig.a(context2, attributeSet, ajdr.c, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (a.hasValue(2)) {
            this.A = Integer.valueOf(a.getColor(2, -1));
            Drawable e = e();
            if (e != null) {
                r(e);
            }
        }
        this.B = a.getBoolean(4, false);
        this.C = a.getBoolean(3, false);
        int i2 = a.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.D = z[i2];
        }
        if (a.hasValue(0)) {
            this.E = Boolean.valueOf(a.getBoolean(0, false));
        }
        a.recycle();
        Drawable background = getBackground();
        if (background == null) {
            d = ColorStateList.valueOf(0);
        } else {
            d = ajgl.d(background);
        }
        if (d != null) {
            ajkm ajkmVar = new ajkm();
            ajkmVar.J(d);
            ajkmVar.G(context2);
            ajkmVar.I(edz.a(this));
            setBackground(ajkmVar);
        }
    }
}
