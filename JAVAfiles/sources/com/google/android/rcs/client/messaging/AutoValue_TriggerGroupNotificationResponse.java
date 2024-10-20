package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_TriggerGroupNotificationResponse extends TriggerGroupNotificationResponse {
    private final MessagingResult a;

    public AutoValue_TriggerGroupNotificationResponse(MessagingResult messagingResult) {
        this.a = messagingResult;
    }

    @Override // com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse
    public final MessagingResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TriggerGroupNotificationResponse) {
            return this.a.equals(((TriggerGroupNotificationResponse) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TriggerGroupNotificationResponse{result=" + this.a.toString() + "}";
    }
}
