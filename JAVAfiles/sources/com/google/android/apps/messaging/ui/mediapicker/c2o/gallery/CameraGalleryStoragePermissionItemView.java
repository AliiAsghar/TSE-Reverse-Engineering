package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.aaqf;
import defpackage.aaqi;
import defpackage.aarv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CameraGalleryStoragePermissionItemView extends LinearLayout implements aaqi {
    public aaqf a;
    private final int b;

    public CameraGalleryStoragePermissionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = getResources().getDimensionPixelSize(R.dimen.camera_gallery_placeholder_start_margin) + getResources().getDimensionPixelSize(R.dimen.camera_gallery_placeholder_end_margin);
    }

    @Override // defpackage.aaqi
    public final int a() {
        return 2;
    }

    @Override // defpackage.aaqi
    public final void b(aaqf aaqfVar) {
        this.a = aaqfVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new aarv(this, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i2);
        float f2 = size;
        int size2 = View.MeasureSpec.getSize(i);
        if (getResources().getConfiguration().orientation == 1) {
            f = 1.3333334f;
        } else {
            f = 0.75f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((size2 - ((int) (f2 / f))) - this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }
}
