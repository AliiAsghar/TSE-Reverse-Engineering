package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupOperationResult extends GroupOperationResult {
    private final MessagingResult a;
    private final com.google.android.rcs.client.messaging.data.Conversation b;

    public AutoValue_GroupOperationResult(MessagingResult messagingResult, com.google.android.rcs.client.messaging.data.Conversation conversation) {
        this.a = messagingResult;
        this.b = conversation;
    }

    @Override // com.google.android.rcs.client.messaging.GroupOperationResult
    public final MessagingResult a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GroupOperationResult
    public final com.google.android.rcs.client.messaging.data.Conversation b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupOperationResult) {
            GroupOperationResult groupOperationResult = (GroupOperationResult) obj;
            if (this.a.equals(groupOperationResult.a()) && this.b.equals(groupOperationResult.b())) {
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
        return "GroupOperationResult{result=" + this.a.toString() + ", conversation=" + conversation.toString() + "}";
    }
}
