package com.google.android.rcs.client.messaging.data;

import com.google.android.rcs.client.messaging.data.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class AutoOneOf_Message_MessageContent$Parent_ extends Message.MessageContent {
    @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
    public ChatMessage b() {
        throw new UnsupportedOperationException(a().toString());
    }

    @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
    public FileTransferInformation c() {
        throw new UnsupportedOperationException(a().toString());
    }

    @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
    public IsComposingMessage d() {
        throw new UnsupportedOperationException(a().toString());
    }

    @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
    public LocationInformation e() {
        throw new UnsupportedOperationException(a().toString());
    }

    @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
    public MessageReceipt f() {
        throw new UnsupportedOperationException(a().toString());
    }
}
