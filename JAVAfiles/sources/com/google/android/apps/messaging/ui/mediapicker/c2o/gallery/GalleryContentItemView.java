package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import defpackage.aaqi;
import defpackage.aasq;
import defpackage.aatc;
import defpackage.aate;
import defpackage.aatf;
import defpackage.akms;
import defpackage.aksr;
import defpackage.akwb;
import defpackage.gh;
import defpackage.xwr;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GalleryContentItemView extends aasq implements aaqi {
    public aatc a;
    public boolean b;
    public aksr c;
    private ImageView o;
    private VideoOverlayView p;

    public GalleryContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, defpackage.aaqi
    public final int a() {
        return 1;
    }

    public final void d(akms akmsVar) {
        aatc aatcVar;
        int i;
        String str;
        if (this.o != null && this.p != null && (aatcVar = this.a) != null) {
            if (aatcVar instanceof aate) {
                akmsVar.h(((aate) aatcVar).d).t(this.o);
                Context context = getContext();
                aate aateVar = (aate) this.a;
                long j = aateVar.b;
                String str2 = aateVar.a;
                String str3 = xwr.a;
                if (gh.m(str2)) {
                    if (j > 0) {
                        i = R.string.mediapicker_gallery_image_item_description;
                    } else {
                        i = R.string.mediapicker_gallery_image_item_description_no_date;
                    }
                } else if (gh.z(str2)) {
                    if (j > 0) {
                        i = R.string.mediapicker_gallery_video_item_description;
                    } else {
                        i = R.string.mediapicker_gallery_video_item_description_no_date;
                    }
                } else if (gh.e(str2)) {
                    if (j > 0) {
                        i = R.string.mediapicker_gallery_audio_item_description;
                    } else {
                        i = R.string.mediapicker_gallery_audio_item_description_no_date;
                    }
                } else {
                    i = -1;
                }
                if (i > 0) {
                    str = context.getResources().getString(i, Long.valueOf(j * TimeUnit.SECONDS.toMillis(1L)));
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.o.setContentDescription(str);
                }
            }
            aatc aatcVar2 = this.a;
            if (aatcVar2 instanceof aatf) {
                this.p.e(((aatf) aatcVar2).g);
                this.p.setVisibility(0);
            } else {
                this.p.setVisibility(8);
            }
        }
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.o = (ImageView) findViewById(R.id.gallery_content_async_image);
        this.p = (VideoOverlayView) findViewById(R.id.gallery_content_video_overlay);
        String str = "GalleryContentItemView::onClick";
        setOnClickListener(new akwb(this.c, str, this.n, 1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (true != this.b) {
            i = i2;
        }
        super.onMeasure(i, i);
    }
}
