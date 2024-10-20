package com.google.android.rcs.client.messaging.data;

import defpackage.aozb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_ChatMessage extends ChatMessage {
    private final aozb a;
    private final ContentType b;

    public AutoValue_ChatMessage(aozb aozbVar, ContentType contentType) {
        this.a = aozbVar;
        this.b = contentType;
    }

    @Override // com.google.android.rcs.client.messaging.data.ChatMessage
    public final ContentType a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.ChatMessage
    public final aozb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChatMessage) {
            ChatMessage chatMessage = (ChatMessage) obj;
            if (this.a.equals(chatMessage.b()) && this.b.equals(chatMessage.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
