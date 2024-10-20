package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import defpackage.aada;
import defpackage.armf;
import defpackage.rry;
import defpackage.zpt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessageAttachmentsView extends aada {
    public rry a;
    public ConversationMessageView b;
    public MessageAttachmentContainer c;
    public ConversationMessageTransferView d;
    public zpt e;
    public armf f;

    public MessageAttachmentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void c(rry rryVar) {
        this.a = rryVar;
        ConversationMessageView conversationMessageView = this.b;
        if (conversationMessageView != null) {
            ConversationMessageTransferView conversationMessageTransferView = this.d;
            conversationMessageTransferView.b = conversationMessageView;
            conversationMessageTransferView.a(rryVar);
        }
    }

    public final void d() {
        int childCount = this.c.getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < childCount) {
                if (this.c.getChildAt(i2).getVisibility() == 0) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i = 8;
                break;
            }
        }
        setVisibility(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (MessageAttachmentContainer) findViewById(R.id.message_attachments_container);
        this.d = (ConversationMessageTransferView) findViewById(R.id.transfer_state);
    }
}
