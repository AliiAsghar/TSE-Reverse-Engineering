package com.google.android.rcs.client.chatsession.message;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RbmSuggestionResponseMessage extends ChatMessage {
    public RbmSuggestionResponseMessage(String str) {
        super(ChatMessage.Type.RBM_SUGGESTION_RESPONSE, str.getBytes());
    }

    public RbmSuggestionResponseMessage(String str, String str2, Long l) {
        super(ChatMessage.Type.RBM_SUGGESTION_RESPONSE, str.getBytes(), str2, l);
    }
}
