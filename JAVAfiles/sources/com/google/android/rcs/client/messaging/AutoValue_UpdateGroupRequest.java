package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_UpdateGroupRequest extends UpdateGroupRequest {
    private final PendingIntent a;
    private final com.google.android.rcs.client.messaging.data.Conversation b;
    private final Optional c;
    private final Optional d;

    public AutoValue_UpdateGroupRequest(PendingIntent pendingIntent, com.google.android.rcs.client.messaging.data.Conversation conversation, Optional optional, Optional optional2) {
        this.a = pendingIntent;
        this.b = conversation;
        this.c = optional;
        this.d = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.UpdateGroupRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.UpdateGroupRequest, defpackage.ajpe
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.UpdateGroupRequest
    public final Optional c() {
        return this.d;
    }

    @Override // com.google.android.rcs.client.messaging.UpdateGroupRequest
    public final Optional d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateGroupRequest) {
            UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) obj;
            if (this.a.equals(updateGroupRequest.a()) && this.b.equals(updateGroupRequest.b()) && this.c.equals(updateGroupRequest.d()) && this.d.equals(updateGroupRequest.c())) {
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
        Optional optional2 = this.c;
        com.google.android.rcs.client.messaging.data.Conversation conversation = this.b;
        return "UpdateGroupRequest{intent=" + this.a.toString() + ", conversation=" + conversation.toString() + ", updateSubject=" + String.valueOf(optional2) + ", opaqueData=" + String.valueOf(optional) + "}";
    }
}
