package com.google.android.apps.messaging.ui.conversation.suggestions.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.aafu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationSuggestionContainerView extends aafu {
    public ViewGroup a;
    public ConversationSuggestionStickerView b;

    public ConversationSuggestionContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.a.setClipToOutline(true);
    }

    public final void b(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = i;
        setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ConversationSuggestionStickerView) findViewById(R.id.suggestion_sticker);
    }
}
