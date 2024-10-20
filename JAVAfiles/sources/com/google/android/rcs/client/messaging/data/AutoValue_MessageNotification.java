package com.google.android.rcs.client.messaging.data;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_MessageNotification extends MessageNotification {
    private final Conversation a;
    private final Message b;
    private final TraceId c;
    private final Optional d;

    public AutoValue_MessageNotification(Conversation conversation, Message message, TraceId traceId, Optional optional) {
        this.a = conversation;
        this.b = message;
        this.c = traceId;
        this.d = optional;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageNotification
    public final Conversation a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageNotification
    public final Message b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageNotification
    public final TraceId c() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageNotification
    public final Optional d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageNotification) {
            MessageNotification messageNotification = (MessageNotification) obj;
            if (this.a.equals(messageNotification.a()) && this.b.equals(messageNotification.b()) && this.c.equals(messageNotification.c()) && this.d.equals(messageNotification.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        TraceId traceId = this.c;
        Message message = this.b;
        return "MessageNotification{conversation=" + this.a.toString() + ", message=" + message.toString() + ", traceId=" + traceId.toString() + ", enqueuingRealTime=" + String.valueOf(optional) + "}";
    }
}
