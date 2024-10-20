package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_RemoveUserFromGroupResponse extends RemoveUserFromGroupResponse {
    private final MessagingResult a;

    public AutoValue_RemoveUserFromGroupResponse(MessagingResult messagingResult) {
        this.a = messagingResult;
    }

    @Override // com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse
    public final MessagingResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RemoveUserFromGroupResponse) {
            return this.a.equals(((RemoveUserFromGroupResponse) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RemoveUserFromGroupResponse{result=" + this.a.toString() + "}";
    }
}
