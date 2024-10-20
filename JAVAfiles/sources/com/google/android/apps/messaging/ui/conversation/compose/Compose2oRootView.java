package com.google.android.apps.messaging.ui.conversation.compose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Compose2oRootView extends FrameLayout {
    public View a;

    public Compose2oRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.emoji_gallery_container_for_c2o);
    }
}
