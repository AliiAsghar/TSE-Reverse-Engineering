package com.google.android.setupcompat.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.ajuf;
import defpackage.ajuh;
import defpackage.ajuo;
import defpackage.ajvf;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TemplateLayout extends FrameLayout {
    private ViewGroup a;
    private final Map b;
    public float d;
    public ViewTreeObserver.OnPreDrawListener e;

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        this.b = new HashMap();
        d(i, i2, null, R.attr.sucLayoutTheme);
    }

    private final void d(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ajuf.g, i3, 0);
        if (i == 0) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = obtainStyledAttributes.getResourceId(1, 0);
        }
        c(attributeSet, i3);
        super.addView(a(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        ViewGroup b = b(i2);
        this.a = b;
        if (b != null) {
            j();
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }

    protected View a(LayoutInflater layoutInflater, int i) {
        return h(layoutInflater, 0, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.a.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewGroup b(int i) {
        return (ViewGroup) findViewById(i);
    }

    public View g(int i) {
        return findViewById(i);
    }

    public float getXFraction() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View h(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 != 0) {
            if (i != 0) {
                layoutInflater = LayoutInflater.from(new ajuh(layoutInflater.getContext(), i));
            }
            return layoutInflater.inflate(i2, (ViewGroup) this, false);
        }
        throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
    }

    public final ajvf i(Class cls) {
        return (ajvf) this.b.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(Class cls, ajvf ajvfVar) {
        this.b.put(cls, ajvfVar);
    }

    public void setXFraction(float f) {
        this.d = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(width * f);
        } else if (this.e == null) {
            this.e = new ajuo(this);
            getViewTreeObserver().addOnPreDrawListener(this.e);
        }
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new HashMap();
        d(0, 0, attributeSet, R.attr.sucLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new HashMap();
        d(0, 0, attributeSet, i);
    }

    protected void j() {
    }

    protected void c(AttributeSet attributeSet, int i) {
    }
}
