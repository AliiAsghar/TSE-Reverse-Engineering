package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.agrg;
import defpackage.kj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ButtonWithMaxTextSize extends kj {
    public ButtonWithMaxTextSize(Context context) {
        super(context);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agrg.a);
        setTextSize(0, Math.min(getTextSize(), obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE)));
        obtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
