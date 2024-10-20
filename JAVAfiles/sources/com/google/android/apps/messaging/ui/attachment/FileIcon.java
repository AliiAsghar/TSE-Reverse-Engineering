package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.ahnz;
import defpackage.yfo;
import defpackage.zou;
import defpackage.zpt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FileIcon extends zou {
    ImageView a;
    boolean b;
    String c;
    int d;

    public FileIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = "*/*";
    }

    public void a() {
        this.a.setBackground(zpt.i(getContext()));
        ImageView imageView = this.a;
        Context context = getContext();
        imageView.setImageDrawable(yfo.i(context, context.getResources().getDrawable(zpt.e(this.c)), ahnz.f(context, R.attr.colorOnPrimaryBrandIcon, "ConversationDrawables")));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.file_image);
        a();
    }
}
