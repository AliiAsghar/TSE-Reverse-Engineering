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
public final class GalleryDeviceCameraItemView extends LinearLayout implements aaqi {
    public aaqf a;

    public GalleryDeviceCameraItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aaqi
    public final int a() {
        return 12;
    }

    @Override // defpackage.aaqi
    public final void b(aaqf aaqfVar) {
        this.a = aaqfVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.device_camera_picture_button);
        findViewById.setOnClickListener(new aarv(this, 4));
        View findViewById2 = findViewById(R.id.device_camera_video_button);
        findViewById2.setOnClickListener(new aarv(this, 5));
        findViewById.setClipToOutline(true);
        findViewById2.setClipToOutline(true);
    }
}
