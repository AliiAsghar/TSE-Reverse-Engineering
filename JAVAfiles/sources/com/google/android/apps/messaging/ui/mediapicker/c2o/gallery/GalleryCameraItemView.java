package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.aaqf;
import defpackage.aaqi;
import defpackage.aarv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GalleryCameraItemView extends FrameLayout implements aaqi {
    public aaqf a;

    public GalleryCameraItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aaqi
    public final int a() {
        return 3;
    }

    @Override // defpackage.aaqi
    public final void b(aaqf aaqfVar) {
        this.a = aaqfVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new aarv(this, 3));
    }
}
