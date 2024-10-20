package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_UpdateGroupResponse extends UpdateGroupResponse {
    private final MessagingResult a;

    public AutoValue_UpdateGroupResponse(MessagingResult messagingResult) {
        this.a = messagingResult;
    }

    @Override // com.google.android.rcs.client.messaging.UpdateGroupResponse
    public final MessagingResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateGroupResponse) {
            return this.a.equals(((UpdateGroupResponse) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "UpdateGroupResponse{result=" + this.a.toString() + "}";
    }
}
