package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.yfo;
import defpackage.zpt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FileIconCompose extends FileIcon {
    public FileIconCompose(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.messaging.ui.attachment.FileIcon
    public final void a() {
        this.a.setBackground(zpt.i(getContext()));
        ImageView imageView = this.a;
        Context context = getContext();
        imageView.setImageDrawable(yfo.i(context, context.getResources().getDrawable(zpt.e(this.c)), context.getColor(R.color.file_icon_compose)));
    }
}
