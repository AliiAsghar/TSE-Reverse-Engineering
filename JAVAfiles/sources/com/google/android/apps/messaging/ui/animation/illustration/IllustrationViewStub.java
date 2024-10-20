package com.google.android.apps.messaging.ui.animation.illustration;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.afzs;
import defpackage.xyl;
import defpackage.yah;
import defpackage.yar;
import defpackage.zgz;
import defpackage.zha;
import defpackage.zhb;
import defpackage.ztf;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IllustrationViewStub extends zgz {
    public int a;
    public float b;
    public ImageView.ScaleType c;
    public View d;
    public boolean e;
    private String f;
    private int g;
    private int h;
    private OptionalInt i;

    public IllustrationViewStub(Context context) {
        super(context);
        this.g = -1;
        this.a = -1;
        this.c = ImageView.ScaleType.MATRIX;
        this.h = -1;
        this.i = OptionalInt.empty();
    }

    private final void f(View view, ViewGroup viewGroup) {
        view.setId(getId());
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    public final View c() {
        boolean z;
        if (this.d == null) {
            if (getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            xyl.k(z);
            if (!this.e) {
                afzs afzsVar = new afzs(getContext());
                f(afzsVar, (ViewGroup) getParent());
                int i = this.a;
                if (i != -1) {
                    afzsVar.setImageResource(i);
                }
                this.i.ifPresent(new ztf(afzsVar, 1));
                afzsVar.addOnLayoutChangeListener(new yah(afzsVar, new yar(this, afzsVar, 14), 0));
                this.d = afzsVar;
            } else {
                zha zhaVar = new zha(getContext());
                if (this.h != -1) {
                    zhaVar.setBackground(getResources().getDrawable(this.h, getContext().getTheme()));
                }
                int i2 = this.g;
                if (i2 != -1) {
                    zhaVar.d(i2);
                } else {
                    String str = this.f;
                    if (str != null) {
                        zhaVar.e(str);
                    }
                }
                f(zhaVar, (ViewGroup) getParent());
                this.d = zhaVar;
            }
        }
        View view = this.d;
        view.getClass();
        return view;
    }

    public final void d(int i) {
        this.i = OptionalInt.of(i);
    }

    public final void e() {
        this.b = 1.0f;
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public IllustrationViewStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = -1;
        this.a = -1;
        this.c = ImageView.ScaleType.MATRIX;
        this.h = -1;
        this.i = OptionalInt.empty();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zhb.a);
        this.f = obtainStyledAttributes.getString(0);
        this.g = obtainStyledAttributes.getResourceId(1, -1);
        this.a = obtainStyledAttributes.getResourceId(3, -1);
        this.b = obtainStyledAttributes.getFloat(2, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
