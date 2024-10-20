package com.google.android.rcs.client.chatsession.message;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import defpackage.apwq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TextMessage extends ChatMessage {
    public TextMessage(String str) {
        super(ChatMessage.Type.TEXT, str.getBytes());
    }

    public TextMessage(String str, String str2, Long l) {
        super(ChatMessage.Type.TEXT, str.getBytes(), str2, l);
    }

    public TextMessage(String str, String str2, Long l, apwq apwqVar) {
        super(ChatMessage.Type.TEXT, str.getBytes(), str2, l, apwqVar);
    }
}
