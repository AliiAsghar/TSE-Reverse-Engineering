package com.google.android.apps.messaging.conversation.messagelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.aacv;
import defpackage.iri;
import defpackage.qya;
import defpackage.xvc;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationStartRowView extends iri implements aacv<ConversationStartRowView> {
    public static final xze a = xze.g("Bugle", "ConversationStartRowView");
    public qya b;
    public ConversationStartView c;
    public xvc d;

    public ConversationStartRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ConversationStartView) findViewById(R.id.conversation_start_view);
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.aacv
    public final void b() {
    }
}
