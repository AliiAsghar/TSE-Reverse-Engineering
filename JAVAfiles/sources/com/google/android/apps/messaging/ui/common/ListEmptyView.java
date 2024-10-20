package com.google.android.apps.messaging.ui.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ListEmptyView extends LinearLayout {
    public TextView a;
    private ImageView b;

    public ListEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i) {
        this.b.setVisibility(i);
    }

    public final void b(int i) {
        this.a.setText(getResources().getText(i));
    }

    public final void c(int i) {
        Drawable drawable = getContext().getDrawable(i);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        this.b.setImageDrawable(drawable);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ImageView) findViewById(R.id.empty_image_hint);
        this.a = (TextView) findViewById(R.id.empty_text_hint);
    }
}
