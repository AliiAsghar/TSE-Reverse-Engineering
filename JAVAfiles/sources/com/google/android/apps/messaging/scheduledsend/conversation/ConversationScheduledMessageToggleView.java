package com.google.android.apps.messaging.scheduledsend.conversation;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aacv;
import defpackage.lye;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationScheduledMessageToggleView extends lye implements aacv<ConversationScheduledMessageToggleView> {
    private TextView a;
    private ImageView b;

    public ConversationScheduledMessageToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.toggle_text_view);
        ImageView imageView = (ImageView) findViewById(R.id.schedule_send_icon);
        this.b = imageView;
        imageView.getDrawable().setAutoMirrored(true);
        this.a.setTypeface(Typeface.create("sans-serif-medium", 0));
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.aacv
    public final void b() {
    }
}
