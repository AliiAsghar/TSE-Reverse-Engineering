package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.aabr;
import defpackage.albo;
import defpackage.rry;
import defpackage.xun;
import defpackage.zov;
import defpackage.zpt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MissingAttachmentView extends zov implements xun {
    private MessagePartCoreData a;
    private GradientDrawable b;
    private ImageView c;

    public MissingAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.layout.missing_attachment_view);
        inflate(context, R.layout.missing_attachment_view, this);
    }

    @Override // defpackage.xun
    public final void c() {
        this.a = null;
    }

    @Override // defpackage.xul
    public final void d(boolean z, rry rryVar, Drawable drawable, float[] fArr) {
        setSelected(z);
        ImageView imageView = this.c;
        if (imageView != null) {
            LayerDrawable layerDrawable = (LayerDrawable) imageView.getDrawable();
            albo.C(layerDrawable);
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.file_missing_icon_layer);
            if (findDrawableByLayerId != null) {
                findDrawableByLayerId.setTint(getContext().getColor(R.color.missing_file_icon_color));
            }
        }
        aabr.aH(this, this.a);
        if (this.b == null) {
            this.b = zpt.n(getContext());
        }
        this.b.setColor(zpt.c(getContext(), isSelected()));
        this.b.setCornerRadii(fArr);
        setBackground(this.b);
        aabr.aG(this, fArr);
    }

    @Override // defpackage.xun
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, int i) {
        this.a = messagePartCoreData;
        setContentDescription(getContext().getString(R.string.missing_file_or_media_description));
        aabr.aH(this, this.a);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.file_missing_icon_imageview);
    }
}
