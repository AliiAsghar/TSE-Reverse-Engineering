package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.aaqf;
import defpackage.aaqi;
import defpackage.aarv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FullscreenGalleryItemView extends LinearLayout implements aaqi {
    public aaqf a;

    public FullscreenGalleryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aaqi
    public final int a() {
        return 8;
    }

    @Override // defpackage.aaqi
    public final void b(aaqf aaqfVar) {
        this.a = aaqfVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new aarv(this, 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i2, i2);
    }
}
