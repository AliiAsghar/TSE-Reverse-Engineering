package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_TriggerGroupNotificationRequest extends TriggerGroupNotificationRequest {
    private final PendingIntent a;
    private final com.google.android.rcs.client.messaging.data.Conversation b;
    private final Optional c;

    public AutoValue_TriggerGroupNotificationRequest(PendingIntent pendingIntent, com.google.android.rcs.client.messaging.data.Conversation conversation, Optional optional) {
        this.a = pendingIntent;
        this.b = conversation;
        this.c = optional;
    }

    @Override // com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest, defpackage.ajpe
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest
    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TriggerGroupNotificationRequest) {
            TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) obj;
            if (this.a.equals(triggerGroupNotificationRequest.a()) && this.b.equals(triggerGroupNotificationRequest.b()) && this.c.equals(triggerGroupNotificationRequest.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        com.google.android.rcs.client.messaging.data.Conversation conversation = this.b;
        return "TriggerGroupNotificationRequest{intent=" + this.a.toString() + ", conversation=" + conversation.toString() + ", opaqueData=" + String.valueOf(optional) + "}";
    }
}
