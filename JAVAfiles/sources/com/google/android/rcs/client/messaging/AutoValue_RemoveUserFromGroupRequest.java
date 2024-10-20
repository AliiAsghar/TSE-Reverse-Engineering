package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_RemoveUserFromGroupRequest extends RemoveUserFromGroupRequest {
    private final PendingIntent a;
    private final com.google.android.rcs.client.messaging.data.Conversation b;
    private final RcsDestinationId c;
    private final Optional d;

    public AutoValue_RemoveUserFromGroupRequest(PendingIntent pendingIntent, com.google.android.rcs.client.messaging.data.Conversation conversation, RcsDestinationId rcsDestinationId, Optional optional) {
        this.a = pendingIntent;
        this.b = conversation;
        this.c = rcsDestinationId;
        this.d = optional;
    }

    @Override // com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest, defpackage.ajpe
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest
    public final RcsDestinationId c() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest
    public final Optional d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RemoveUserFromGroupRequest) {
            RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) obj;
            if (this.a.equals(removeUserFromGroupRequest.a()) && this.b.equals(removeUserFromGroupRequest.b()) && this.c.equals(removeUserFromGroupRequest.c()) && this.d.equals(removeUserFromGroupRequest.d())) {
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
        RcsDestinationId rcsDestinationId = this.c;
        com.google.android.rcs.client.messaging.data.Conversation conversation = this.b;
        return "RemoveUserFromGroupRequest{intent=" + this.a.toString() + ", conversation=" + conversation.toString() + ", user=" + rcsDestinationId.toString() + ", opaqueData=" + String.valueOf(optional) + "}";
    }
}
