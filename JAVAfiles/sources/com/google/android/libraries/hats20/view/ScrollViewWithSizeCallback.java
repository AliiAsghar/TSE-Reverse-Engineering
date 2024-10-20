package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import defpackage.ajay;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ScrollViewWithSizeCallback extends ScrollView {
    public ajay a;

    public ScrollViewWithSizeCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ajay ajayVar = this.a;
        if (ajayVar != null && i4 != i2 && i2 != 0) {
            ajayVar.a(i2);
        }
    }
}
