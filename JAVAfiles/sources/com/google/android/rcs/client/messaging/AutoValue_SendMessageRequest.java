package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import defpackage.ajqw;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_SendMessageRequest extends SendMessageRequest {
    private final PendingIntent a;
    private final com.google.android.rcs.client.messaging.data.Conversation b;
    private final Message c;
    private final MessageClass d;
    private final TraceId e;
    private final Optional f;
    private final ajqw g;

    public AutoValue_SendMessageRequest(PendingIntent pendingIntent, com.google.android.rcs.client.messaging.data.Conversation conversation, Message message, MessageClass messageClass, TraceId traceId, Optional optional, ajqw ajqwVar) {
        this.a = pendingIntent;
        this.b = conversation;
        this.c = message;
        this.d = messageClass;
        this.e = traceId;
        this.f = optional;
        this.g = ajqwVar;
    }

    @Override // com.google.android.rcs.client.messaging.SendMessageRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.SendMessageRequest, defpackage.ajpe
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.SendMessageRequest
    public final Message c() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.SendMessageRequest
    public final MessageClass d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendMessageRequest) {
            SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
            if (this.a.equals(sendMessageRequest.a()) && this.b.equals(sendMessageRequest.b()) && this.c.equals(sendMessageRequest.c()) && this.d.equals(sendMessageRequest.d()) && this.e.equals(sendMessageRequest.h()) && this.f.equals(sendMessageRequest.i()) && this.g.equals(sendMessageRequest.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.rcs.client.messaging.SendMessageRequest
    public final ajqw g() {
        return this.g;
    }

    @Override // com.google.android.rcs.client.messaging.SendMessageRequest
    public final TraceId h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @Override // com.google.android.rcs.client.messaging.SendMessageRequest
    public final Optional i() {
        return this.f;
    }

    public final String toString() {
        ajqw ajqwVar = this.g;
        Optional optional = this.f;
        TraceId traceId = this.e;
        MessageClass messageClass = this.d;
        Message message = this.c;
        com.google.android.rcs.client.messaging.data.Conversation conversation = this.b;
        return "SendMessageRequest{intent=" + this.a.toString() + ", conversation=" + conversation.toString() + ", message=" + message.toString() + ", messageClass=" + messageClass.toString() + ", traceId=" + traceId.toString() + ", opaqueData=" + String.valueOf(optional) + ", messagingMethod=" + ajqwVar.toString() + "}";
    }
}
