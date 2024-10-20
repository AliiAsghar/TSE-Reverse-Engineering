package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_JoinGroupRequest extends JoinGroupRequest {
    private final PendingIntent a;
    private final com.google.android.rcs.client.messaging.data.Conversation b;

    public AutoValue_JoinGroupRequest(PendingIntent pendingIntent, com.google.android.rcs.client.messaging.data.Conversation conversation) {
        this.a = pendingIntent;
        this.b = conversation;
    }

    @Override // com.google.android.rcs.client.messaging.JoinGroupRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.JoinGroupRequest
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JoinGroupRequest) {
            JoinGroupRequest joinGroupRequest = (JoinGroupRequest) obj;
            if (this.a.equals(joinGroupRequest.a()) && this.b.equals(joinGroupRequest.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        com.google.android.rcs.client.messaging.data.Conversation conversation = this.b;
        return "JoinGroupRequest{intent=" + this.a.toString() + ", conversation=" + conversation.toString() + "}";
    }
}
