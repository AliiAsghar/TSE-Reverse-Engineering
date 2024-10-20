package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_RevokeMessageRequest extends RevokeMessageRequest {
    private final PendingIntent a;
    private final com.google.android.rcs.client.messaging.data.Conversation b;
    private final String c;
    private final Optional d;

    public AutoValue_RevokeMessageRequest(PendingIntent pendingIntent, com.google.android.rcs.client.messaging.data.Conversation conversation, String str, Optional optional) {
        this.a = pendingIntent;
        this.b = conversation;
        this.c = str;
        this.d = optional;
    }

    @Override // com.google.android.rcs.client.messaging.RevokeMessageRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.RevokeMessageRequest
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.RevokeMessageRequest
    public final Optional c() {
        return this.d;
    }

    @Override // com.google.android.rcs.client.messaging.RevokeMessageRequest
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RevokeMessageRequest) {
            RevokeMessageRequest revokeMessageRequest = (RevokeMessageRequest) obj;
            if (this.a.equals(revokeMessageRequest.a()) && this.b.equals(revokeMessageRequest.b()) && this.c.equals(revokeMessageRequest.d()) && this.d.equals(revokeMessageRequest.c())) {
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
        com.google.android.rcs.client.messaging.data.Conversation conversation = this.b;
        return "RevokeMessageRequest{intent=" + this.a.toString() + ", conversation=" + conversation.toString() + ", messageId=" + this.c + ", opaqueData=" + String.valueOf(optional) + "}";
    }
}
