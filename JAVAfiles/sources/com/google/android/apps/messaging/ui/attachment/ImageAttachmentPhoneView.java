package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import defpackage.egl;
import defpackage.xus;
import defpackage.xyl;
import defpackage.yfo;
import defpackage.zox;
import defpackage.zoy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ImageAttachmentPhoneView extends xus {
    private zox k;

    public ImageAttachmentPhoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.image_attachment_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zoy.a);
        this.a = (RoundedImageView) findViewById(R.id.image_attachment_rounded_view);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.e = obtainStyledAttributes.getBoolean(2, false);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        ColorStateList f = egl.f(getContext(), R.color.message_image_selected_tint_selector);
        f.getClass();
        this.d = f.getDefaultColor();
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.xus
    protected final void h(RoundedImageView roundedImageView, MessagePartCoreData messagePartCoreData) {
        int c = messagePartCoreData.c();
        int b = messagePartCoreData.b();
        if (c > 0 && b > 0) {
            Resources resources = getResources();
            int q = roundedImageView.q();
            if (q == -1 || q == Integer.MAX_VALUE) {
                q = resources.getDimensionPixelSize(R.dimen.image_attachment_fallback_width);
            }
            int p = roundedImageView.p();
            if (p == -1 || p == Integer.MAX_VALUE) {
                p = resources.getDimensionPixelSize(R.dimen.image_attachment_fallback_height);
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.conversation_message_photo_min_height);
            Point point = new Point(c, b);
            yfo.j(point, q, p, dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.width = point.x;
            layoutParams.height = point.y;
            return;
        }
        boolean bk = messagePartCoreData.bk();
        xyl.k(bk);
        if (bk) {
            zox zoxVar = this.k;
            if (zoxVar != null) {
                zoxVar.cancel(true);
            }
            zox zoxVar2 = new zox(this, messagePartCoreData);
            this.k = zoxVar2;
            zoxVar2.e(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xus, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zox zoxVar = this.k;
        if (zoxVar != null) {
            zoxVar.cancel(true);
            this.k = null;
        }
    }
}
